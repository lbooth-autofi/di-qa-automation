package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class DealerView extends BasePageObject {

    public enum SideNav {
        GENERAL, INTEGRATIONS, PRICING_CI, PATHWAYS,
        DEALMAKER, TRADE_IN, NOTIFICATIONS, FI_PRODUCTS,
        LENDERS, DEALER_PORTAL, PARTNERS_API, STATUS_BILLING, ADVANCED,
        USERS, VEHICLES, SETTINGS_LOGS;

        public static String toSideNavText(SideNav sideNav) {
            return switch (sideNav) {
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

        public static String toHeadingId(SideNav sideNav) {
            return switch (sideNav) {
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

    public boolean isVisible(int timeoutInSeconds) {
        return isVisible(byHeaderTitle, timeoutInSeconds);
    }

    public By byHeaderTitle = By.cssSelector("div[class*='index__bar-title']");

    public String getHeaderTitle() {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textMatches(byHeaderTitle, Pattern.compile("[\\w\\W]+")));
        String headerTitle = getDriver().findElement(byHeaderTitle).getText();
        return headerTitle;
    }

    public By bySideNavOptions = By.cssSelector("ul[class*=index__nav] li");
    public By bySideNavOptionSelected = By.cssSelector("ul[class*=index__nav] li[class*=active]");
    public String templateForSideNavOption = "//ul[contains(@class,'index__nav')]/li[text()='NAV_OPTION_NAME']";

    public void waitUntilSideNavOptionsVisible() {
        waitUntilAllElementsVisible(bySideNavOptions, 10);
    }


    private By getSideNavByLocator(SideNav sideNav, int timeoutInSeconds) {
        String sideNavText = SideNav.toSideNavText(sideNav);
        return getByFromXPathTemplate(templateForSideNavOption, "NAV_OPTION_NAME", sideNavText, timeoutInSeconds);
    }

    private WebElement getSideNavWebElement(SideNav sideNav, int timeoutInSeconds) {
        return getDriver().findElement(getSideNavByLocator(sideNav,timeoutInSeconds));
    }

    public void clickSideNav(SideNav sideNav) {
        WebElement sideNavElement = getSideNavWebElement(sideNav,10);
        sideNavElement.click();
    }

    public void waitUntilPageSectionVisible(SideNav sideNav) {
        waitUntilElementIsVisible(By.id(SideNav.toHeadingId(sideNav)), 10);
    }

    public boolean isPageSectionVisible(SideNav sideNav) {
        return getSideNavWebElement(sideNav, 10).isDisplayed();
    }

    public void scrollPageSectionIntoView(SideNav sideNav) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getSideNavWebElement(sideNav, 10)).perform();
    }

    public String getPageSectionHeadingText(SideNav sideNav) {
        return getSideNavWebElement(sideNav, 10).getText();
    }
}
