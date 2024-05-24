package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DealerView extends BasePageObject {

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
        return getDriver().findElement(byHeaderTitle).getText();
    }


}
