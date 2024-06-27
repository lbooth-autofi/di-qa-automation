package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    // CAPTIVE LENDERS
    private String templateForCaptiveLenderInput = "//input[contains(@aria-label,'(CAPTIVE_LENDER_ABBREVIATION)')]";
    private By selectedCaptiveLenderInputBy = By.xpath(
            "//h3[text()='Captive Lenders']" +
                    "/following-sibling::ul" +
                    "/descendant::input[@checked]"
    );
    private String templateForCaptiveLenderLabel = "following-sibling::p";

    // NON-CAPTIVE LENDERS
    private String templateForNonCaptiveLenderInput = "//input[following-sibling::div[contains(text(),'NON_CAPTIVE_LENDER_ABBREVIATION')]]";
    private By selectedNonCaptiveLenderInputBy = By.xpath(
            "//h3[text()='AutoFi Lender Network' or text()='Dealer Lender Network']" +
                    "/following-sibling::ul" +
                    "/descendant::input[@checked]"
    );
    private String templateForNonCaptiveLenderLabel = "following-sibling::div[contains(@class,'checkboxLabelText')]";

    public By getLenderBy(Lender lender) {
        String lenderAbbreviation = lender.getLenderAbbreviation();
        if (lender.getLenderType() == LenderType.CAPTIVE_LENDER) {
            return getByFromXPathTemplate(templateForCaptiveLenderInput, "CAPTIVE_LENDER_ABBREVIATION", lenderAbbreviation, 10);
        } else {
            return getByFromXPathTemplate(templateForNonCaptiveLenderInput, "NON_CAPTIVE_LENDER_ABBREVIATION", lenderAbbreviation, 10);
        }
    }

    public String getLenderLabel(Lender lender) {
        By lenderBy = getLenderBy(lender);
        WebElement lenderElement = getDriver().findElement(lenderBy);

        WebElement lenderTextElement = null;

        if (lender.getLenderType() == LenderType.CAPTIVE_LENDER) {
            lenderTextElement = lenderElement.findElement(By.xpath(templateForCaptiveLenderLabel));
        } else {
            lenderTextElement = lenderElement.findElement(By.xpath(templateForNonCaptiveLenderLabel));
        }

        return lenderTextElement.getText();
    }

    public String getLenderAbbreviation(Lender lender) {
        String lenderLabel = getLenderLabel(lender);
        return getLenderAbbreviation(lenderLabel);
    }

    public List<Lender> getSelectedLenders(LenderType lenderType) {
        List<Lender> lenders = new ArrayList<>();
        String lenderLabel = "";
        String lenderAbbreviation = "";
        List<WebElement> lenderElements = new ArrayList<>();

        if (lenderType == LenderType.CAPTIVE_LENDER) {
            lenderElements = getDriver().findElements(selectedCaptiveLenderInputBy);

            for (WebElement lenderElement : lenderElements) {
                lenderLabel = lenderElement.findElement(By.xpath(templateForCaptiveLenderLabel)).getText();
                lenderAbbreviation = getLenderAbbreviation(lenderLabel);
                lenders.add(new CaptiveLender(lenderAbbreviation));
            }

        } else {
            lenderElements = getDriver().findElements(selectedNonCaptiveLenderInputBy);

            for (WebElement lenderElement : lenderElements) {
                lenderLabel = lenderElement.findElement(By.xpath(templateForNonCaptiveLenderLabel)).getText();
                lenderAbbreviation = getLenderAbbreviation(lenderLabel);
                lenders.add(new NonCaptiveLender(lenderAbbreviation));
            }
        }

        return lenders;
    }

    public String getLenderAbbreviation(String lenderLabel) {
        int openParensIndex = lenderLabel.indexOf("(");
        int closeParensIndex = lenderLabel.indexOf(")");
        return lenderLabel.substring(openParensIndex + 1, closeParensIndex);
    }

    public By getCaptiveLenderBy(CaptiveLenders captiveLender) {
        String captiveLenderAbbreviation = CaptiveLenders.toLenderAbbreviation(captiveLender);
        return getByFromXPathTemplate(templateForCaptiveLenderInput, "CAPTIVE_LENDER_ABBREVIATION", captiveLenderAbbreviation, 10);
    }

    private String getCaptiveLenderLabel(By captiveLenderBy) {
        WebElement lenderElement = getDriver().findElement(captiveLenderBy);
        WebElement captiveLenderTextElement = lenderElement.findElement(By.xpath(templateForCaptiveLenderInput));
        return captiveLenderTextElement.getText();
    }

    public String getCaptiveLenderLabel(CaptiveLenders captiveLender) {
        By captiveLenderBy = getCaptiveLenderBy(captiveLender);
        return getCaptiveLenderLabel(captiveLenderBy);
    }

    public CaptiveLenders getSelectedCaptiveLender() {
       String captiveLenderLabel = getCaptiveLenderLabel(selectedCaptiveLenderInputBy);
       String captiveLenderAbbrev = getLenderAbbreviation(captiveLenderLabel);
       return CaptiveLenders.toLenderEnum(captiveLenderAbbrev);
    }

    public boolean isSelectedCaptiveLender(CaptiveLenders captiveLender) {
        return captiveLender == getSelectedCaptiveLender();
    }

    public void selectCaptiveLender(CaptiveLenders captiveLender) {
        getDriver().findElement(getCaptiveLenderBy(captiveLender)).click();
    }




}
