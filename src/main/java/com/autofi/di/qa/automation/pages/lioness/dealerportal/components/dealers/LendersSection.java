package com.autofi.di.qa.automation.pages.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    // pattern: find a captive lender using its acronym in parentheses
    // public By acuraFinSvcsBy = By.xpath("//input[contains(@aria-label,'(AFS)')]");
    private String templateForCaptiveLender = "//input[contains(@aria-label,'(CAPTIVE_LENDER_ABBREVIATION)')]";

    private By getCaptiveLenderLocator(CaptiveLender captiveLender) {
        String captiveLenderAbbreviation = CaptiveLender.toLenderAbbreviation(captiveLender);
        return getByFromXPathTemplate(templateForCaptiveLender, "CAPTIVE_LENDER_ABBREVIATION", captiveLenderAbbreviation, 10);
    }

}
