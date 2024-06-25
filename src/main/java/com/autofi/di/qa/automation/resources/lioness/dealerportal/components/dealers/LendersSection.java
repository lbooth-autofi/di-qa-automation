package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LendersSection extends BasePageObject {

    public String pageUrl = "";
    public String pageName = "Dealer Lenders section";

    public LendersSection(WebDriver driver) {
        super(driver);
        this.pageUrl = pageUrl;
        this.pageName = pageName;
    }

    private By middlemanDropdownBy = By.xpath("//select[@id='dealer.settings.middleman']");
    private By routeOneIdBy = By.xpath("//input[@id='dealer.settings.routeOne.r1DealerId']");
    private By dealerTrackUSIdBy = By.xpath("//input[@id='dealer.settings.dealertrack.dealerId']");
    private By dealerTrackCAIdBy = By.xpath("//input[@id='dealer.settings.dealertrackCanada.dealerId']");

    // locate the input to click and select it; chain to the following "p" sibling to get the input label
    private String templateForCaptiveLenderInput = "//input[contains(@aria-label,'(CAPTIVE_LENDER_ABBREVIATION)')]";
    private By selectedCaptiveLenderInputBy = By.xpath(
            "//h3[text()='Captive Lenders']/following-sibling::ul/" +
            "descendant::input[@checked]"
    );

    public By getCaptiveLenderBy(CaptiveLenders captiveLender) {
        String captiveLenderAbbreviation = CaptiveLenders.toLenderAbbreviation(captiveLender);
        return getByFromXPathTemplate(templateForCaptiveLenderInput, "CAPTIVE_LENDER_ABBREVIATION", captiveLenderAbbreviation, 10);
    }

    private String getCaptiveLenderLabel(By captiveLenderBy) {
        WebElement lenderElement = getDriver().findElement(captiveLenderBy);
        WebElement captiveLenderTextElement = lenderElement.findElement(By.xpath("following-sibling::p"));
        return captiveLenderTextElement.getText();
    }

    public String getCaptiveLenderLabel(CaptiveLenders captiveLender) {
        By captiveLenderBy = getCaptiveLenderBy(captiveLender);
        return getCaptiveLenderLabel(captiveLenderBy);
    }

    public String getCaptiveLenderAbbreviation(String captiveLenderLabel) {
        int openParensIndex = captiveLenderLabel.indexOf("(");
        int closeParensIndex = captiveLenderLabel.indexOf(")");
        return captiveLenderLabel.substring(openParensIndex + 1, closeParensIndex);
    }

    public CaptiveLenders getSelectedCaptiveLender() {
       String captiveLenderLabel = getCaptiveLenderLabel(selectedCaptiveLenderInputBy);
       String captiveLenderAbbrev = getCaptiveLenderAbbreviation(captiveLenderLabel);
       return CaptiveLenders.toCaptiveLenders(captiveLenderAbbrev);
    }

    public boolean isSelectedCaptiveLender(CaptiveLenders captiveLender) {
        return captiveLender == getSelectedCaptiveLender();
    }

    public void selectCaptiveLender(CaptiveLenders captiveLender) {
        getDriver().findElement(getCaptiveLenderBy(captiveLender)).click();
    }
}
