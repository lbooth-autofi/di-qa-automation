package com.autofi.di.qa.automation.pages.lioness.dealerportal.components;

import com.autofi.di.qa.automation.pages.BasePageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.regex.Pattern;

public class PageHeader extends BasePageObject {

    String pageUrl = "";
    String pageName = "Dealer view";

    public PageHeader(WebDriver driver) {
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

}
