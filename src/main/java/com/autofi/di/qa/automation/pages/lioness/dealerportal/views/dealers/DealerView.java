package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.components.dealers.DealerSideNav;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.components.PageHeader;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DealerView extends BasePageObject {

    // https://account.autofi.com/#/dealers/4I2A/dealership-settings
    String pageUrl = "";
    String pageName = "Dealer view";

    public DealerView(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    // PAGE SECTIONS
    public PageHeader pageHeader = new PageHeader(getDriver());
    public DealerSideNav sideNav = new DealerSideNav(getDriver());

    /* --------- */
    // "//div[contains(@class,'index__ContentSection')]/h1[contains(@class,'index__heading')]"
    // "//div[@id='integrations']/descendant::div[contains(@class,'index__ContentSection')]/h1[contains(@class,'index__heading')]"

    public String templateForContentSection = "//div[@id='HEADING_ID']" +
            "/descendant::div[contains(@class,'index__ContentSection')]" +
            "/h1[contains(@class,'index__heading')]";

    public void waitUntilSectionVisible(DealerPageSection dealerPageSection) {
        waitUntilElementIsVisible(By.id(DealerPageSection.toHeadingId(dealerPageSection)), 10);
    }

    private By getSectionBy(DealerPageSection dealerPageSection, int timeoutInSeconds) {
        String headingId = DealerPageSection.toHeadingId(dealerPageSection);
        return getByFromXPathTemplate(templateForContentSection, "HEADING_ID",
                headingId, timeoutInSeconds);
    }

    private WebElement getSectionWebElement(DealerPageSection dealerPageSection, int timeoutInSeconds) {
        return getDriver().findElement(getSectionBy(dealerPageSection, timeoutInSeconds));
    }

    public boolean isSectionVisible(DealerPageSection dealerPageSection, int timeoutInSeconds) {
        return getSectionWebElement(dealerPageSection, timeoutInSeconds).isDisplayed();
    }

    public void scrollSectionIntoView(DealerPageSection dealerPageSection) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getSectionWebElement(dealerPageSection, 10)).perform();
    }

    public String getSectionHeadingText(DealerPageSection dealerPageSection) {
        return getSectionWebElement(dealerPageSection, 10).getText();
    }
}
