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

    public By middlemanDropdownBy = By.xpath("//select[@id='dealer.settings.middleman']");
    public By routeOneIdBy = By.xpath("//input[@id='dealer.settings.routeOne.r1DealerId']");
    public By dealerTrackUSIdBy = By.xpath("//input[@id='dealer.settings.dealertrack.dealerId']");
    public By dealerTrackCAIdBy = By.xpath("//input[@id='dealer.settings.dealertrackCanada.dealerId']");

    private String templateForCaptiveLender = "//input[contains(@aria-label,'(CAPTIVE_LENDER_ABBREVIATION)')]/following-sibling::p";

    private By getCaptiveLenderLocator(CaptiveLenders captiveLender) {
        String captiveLenderAbbreviation = CaptiveLenders.toLenderAbbreviation(captiveLender);
        return getByFromXPathTemplate(templateForCaptiveLender, "CAPTIVE_LENDER_ABBREVIATION", captiveLenderAbbreviation, 10);
    }

    public WebElement getCaptiveLenderElement(CaptiveLenders captiveLender) {
        By captiveLenderLocator = getCaptiveLenderLocator(captiveLender);
        return getDriver().findElement(captiveLenderLocator);
    }

    public void scrollToCaptiveLender(CaptiveLenders captiveLender) {
        scrollToElement(getCaptiveLenderElement(captiveLender));
    }

    public String getCaptiveLenderText(CaptiveLenders captiveLender) {
        By captiveLenderLocator = getCaptiveLenderLocator(captiveLender);
        WebElement lenderElement = getDriver().findElement(captiveLenderLocator);
        return lenderElement.getText();
    }
}
