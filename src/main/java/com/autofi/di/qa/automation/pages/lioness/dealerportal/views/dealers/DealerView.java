package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.PageHeader;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class DealerView extends BasePageObject {

    public enum PageSection {
        GENERAL, INTEGRATIONS, PRICING_CI, PATHWAYS,
        DEALMAKER, TRADE_IN, NOTIFICATIONS, FI_PRODUCTS,
        LENDERS, DEALER_PORTAL, PARTNERS_API, STATUS_BILLING, ADVANCED,
        USERS, VEHICLES, SETTINGS_LOGS;

        public static String toSideNavText(PageSection pageSection) {
            return switch (pageSection) {
                case GENERAL -> "General";
                case INTEGRATIONS -> "Integrations";
                case PRICING_CI -> "Pricing C&I";
                case PATHWAYS -> "Pathways";
                case DEALMAKER -> "DealMaker";
                case TRADE_IN -> "Trade In";
                case NOTIFICATIONS -> "Notifications";
                case FI_PRODUCTS -> "F&I Products";
                case LENDERS -> "Lenders";
                case DEALER_PORTAL -> "Dealer Portal";
                case PARTNERS_API -> "Partners & API";
                case STATUS_BILLING -> "Status & Billing";
                case ADVANCED -> "Advanced";
                case USERS -> "Users";
                case VEHICLES -> "Vehicles";
                case SETTINGS_LOGS -> "Settings Logs";
            };
        }

        public static String toHeadingId(PageSection pageSection) {
            return switch (pageSection) {
                case GENERAL -> "general";
                case INTEGRATIONS -> "integrations";
                case PRICING_CI -> "pricingandci";
                case PATHWAYS -> "pathways";
                case DEALMAKER -> "deal-maker";
                case TRADE_IN -> "trade-in";
                case NOTIFICATIONS -> "notifications";
                case FI_PRODUCTS -> "fandi-products";
                case LENDERS -> "lenders";
                case DEALER_PORTAL -> "dealer-portal";
                case PARTNERS_API -> "partners-and-api";
                case STATUS_BILLING -> "status-and-billing";
                case ADVANCED -> "advanced";
                case USERS -> "Users";
                case VEHICLES -> "Vehicles";
                case SETTINGS_LOGS -> "Settings Logs";
            };
        }
    }

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

    public void waitUntilSectionVisible(PageSection pageSection) {
        waitUntilElementIsVisible(By.id(PageSection.toHeadingId(pageSection)), 10);
    }

    private By getSectionBy(PageSection pageSection, int timeoutInSeconds) {
        String headingId = PageSection.toHeadingId(pageSection);
        return getByFromXPathTemplate(templateForContentSection, "HEADING_ID",
                headingId, timeoutInSeconds);
    }

    private WebElement getSectionWebElement(PageSection pageSection, int timeoutInSeconds) {
        return getDriver().findElement(getSectionBy(pageSection, timeoutInSeconds));
    }

    public boolean isSectionVisible(PageSection pageSection, int timeoutInSeconds) {
        return getSectionWebElement(pageSection, timeoutInSeconds).isDisplayed();
    }

    public void scrollSectionIntoView(PageSection pageSection) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getSectionWebElement(pageSection, 10)).perform();
    }

    public String getSectionHeadingText(PageSection pageSection) {
        return getSectionWebElement(pageSection, 10).getText();
    }
}
