package com.autofi.di.qa.automation.qachecklist;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.autofi.di.qa.automation.BaseTest;
import com.autofi.di.qa.automation.pages.lioness.DealershipListPage;

import java.time.Duration;

public class LionessSampleTests extends BaseTest {

    @Test
    public void testUsingDealershipList() {
        WebDriver driver = startTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();
        SoftAssert softAssert = new SoftAssert();

        DealershipListPage dealershipListPage = new DealershipListPage(driver);
        dealershipListPage.navToPage();

        // unless you use a browser with remote debugger
        // that you are already logged into for AutoFi
        // you will need to login for the test to continue
        WebElement dealershipListHeaderTitle;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            dealershipListHeaderTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(dealershipListPage.byHeaderTitle));
        } catch (TimeoutException e) {
            throw new TimeoutException("unable to display Dealership List page within 60 seconds.");
        }

        if(dealershipListHeaderTitle.isDisplayed()) {
            System.out.println("Dealership List page displayed.");
        }
    }
}
