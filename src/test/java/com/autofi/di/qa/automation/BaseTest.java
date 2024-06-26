package com.autofi.di.qa.automation;

import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

import java.util.ArrayList;

public abstract class BaseTest {

    private ArrayList<WebDriver> testDrivers = new ArrayList<>();

    public enum TestBrowser {
        CHROME, CHROME_REMOTE_DEBUG, EDGE
    }

    public WebDriver startTestDriver(TestBrowser testBrowser) {
        switch (testBrowser) {
            case CHROME:
                return startTestDriverChrome();
            case CHROME_REMOTE_DEBUG:
                return startTestDriverChromeWithRemoteDebugger();
            case EDGE:
                return startTestDriverEdge();
            default:
                throw new InvalidArgumentException("Unknown test browser requested.");
        }
    }

    public WebDriver startTestDriverChrome() {
        WebDriver driver = new ChromeDriver();
        testDrivers.add(driver);
        return driver;
    }

    public WebDriver startTestDriverChromeWithRemoteDebugger() {
        ChromeOptions options = new ChromeOptions();
        // TODO: set remote debugger options
        WebDriver driver = new ChromeDriver(options);
        testDrivers.add(driver);
        return driver;
    }

    public WebDriver startTestDriverEdge() {
        WebDriver driver = new EdgeDriver();
        testDrivers.add(driver);
        return driver;
    }

    @AfterTest
    public void tearDown() {
        if (!testDrivers.isEmpty()) {
            for(WebDriver driver : testDrivers) {
                if (driver != null) {
                    driver.quit();
                }
            }
        }
    }
}
