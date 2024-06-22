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

    public void waitUntilSectionVisible(DealerViewSection dealerViewSection) {
        waitUntilElementIsVisible(By.id(DealerViewSection.toHeadingId(dealerViewSection)), 10);
    }

    private By getSectionBy(DealerViewSection dealerViewSection, int timeoutInSeconds) {
        String headingId = DealerViewSection.toHeadingId(dealerViewSection);
        return getByFromXPathTemplate(templateForContentSection, "HEADING_ID",
                headingId, timeoutInSeconds);
    }

    private WebElement getSectionWebElement(DealerViewSection dealerViewSection, int timeoutInSeconds) {
        return getDriver().findElement(getSectionBy(dealerViewSection, timeoutInSeconds));
    }

    public boolean isSectionVisible(DealerViewSection dealerViewSection, int timeoutInSeconds) {
        return getSectionWebElement(dealerViewSection, timeoutInSeconds).isDisplayed();
    }

    public void scrollSectionIntoView(DealerViewSection dealerViewSection) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getSectionWebElement(dealerViewSection, 10)).perform();
    }

    public String getSectionHeadingText(DealerViewSection dealerViewSection) {
        return getSectionWebElement(dealerViewSection, 10).getText();
    }
}
