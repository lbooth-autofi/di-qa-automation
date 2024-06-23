package com.autofi.di.qa.automation.resources;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePageObject {

    private WebDriver driver;
    private String pageUrl = null;
    private String pageName = null;

    public BasePageObject(WebDriver driver) {
        this.driver = driver;
    }

    public BasePageObject(WebDriver driver, String pageUrl, String pageName) {
        this.driver = driver;
        this.pageUrl = pageUrl;
        this.pageName = pageName;
    }

    protected void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    protected void setPageName(String pageName) {
        this.pageName = pageName;
    }

    protected WebDriver getDriver() {
        return this.driver;
    }

    public boolean isBrowserOnPage() {
        return driver.getCurrentUrl().contains(pageUrl);
    }

    public void navToPage() {
        driver.navigate().to(pageUrl);
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public String getPageName() {
        return this.pageName;
    }

    public void waitUntilAllElementsVisible(By bySelector, int timeoutInSeconds) {
        WebDriverWait waitForAllPageElements = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        waitForAllPageElements.until(ExpectedConditions.presenceOfAllElementsLocatedBy(bySelector));
    }

    public void waitUntilElementIsVisible(By bySelector, int timeoutInSeconds) {
        WebElement headerTitle;
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
            headerTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(bySelector));
        } catch (TimeoutException e) {
            throw new TimeoutException("unable to display element within " + timeoutInSeconds + " seconds.");
        }
    }

    public boolean isVisible(By bySelector, int timeoutInSeconds) {
        WebElement headerTitle;
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeoutInSeconds));
            headerTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(bySelector));
        } catch (TimeoutException e) {
            throw new TimeoutException("unable to display page within " + timeoutInSeconds + " seconds.");
        }

        try {
            return headerTitle.isDisplayed();
        } catch (InvalidElementStateException e) {
            return false;
        }
    }

    public By getByFromXPathTemplate(String xpathTemplate, String placeholder, String replacement, int timeoutInSeconds) {
        String selector = xpathTemplate.replace(placeholder, replacement);
        return By.xpath(selector);
    }

    public WebElement getWebElementFromCSSTemplate(String cssTemplate, String placeholder, String replacement, int timeoutInSeconds) {
        String selector = cssTemplate.replace(placeholder, replacement);
        By bySelector = By.xpath(selector);
        waitUntilElementIsVisible(bySelector, timeoutInSeconds);
        return getDriver().findElement(bySelector);
    }

    public void scrollToElement(By bySelector, int xOffset, int yOffset){
        WebElement element = getDriver().findElement(bySelector);
        scrollToElement(element);
    }

    public void scrollToElement(WebElement element) {
        Actions actions = new Actions(getDriver());
        actions.scrollToElement(element);
        actions.perform();
    }

    public WebElement getElement(By byLocator, int xOffset, int yOffset) {
        scrollToElement(byLocator, xOffset, yOffset);
        return getDriver().findElement(byLocator);
    }

    public void scrollByOffset(int xOffset, int yOffset) {
        Actions actions = new Actions(getDriver());
        actions.scrollByAmount(xOffset, yOffset);
        actions.perform();
    }

    public WebElement getElement(By byLocator, Rectangle viewArea) {
        // TODO
        // find element
        // if element is entirely inside view area, great
        // if part of element is outside view area:
            // determine offset(s) (how far outside of view area)
            // scrollByOffset to bring element entire within viewing area (if possible)

        boolean isAboveLowerXBound = true;
        boolean isBelowLowerXBound = true;
        boolean isBelowUpperYBound = true;
        boolean isAboveLowerYBound = false;
        boolean isInViewArea = false;

        WebElement element = getDriver().findElement(byLocator);

        isAboveLowerYBound = element.getRect().getY() < viewArea.getY();

        if (isAboveLowerXBound && isBelowLowerXBound && isBelowUpperYBound && isAboveLowerYBound) {
            isInViewArea = true;
        }

        if (isInViewArea) {
            return getDriver().findElement(byLocator);
        } else {
            // determine offset(s) (how far outside of view area)
            // scrollByOffset to bring element entire within viewing area (if possible)
        }


        return null;
    }

    public WebElement getElement(By byLocator) {
        // TODO
        // create rectangle for entire window (view area = entire window; no limit)
        // return getElement(byLocator, viewArea);
        return null;
    }
}
