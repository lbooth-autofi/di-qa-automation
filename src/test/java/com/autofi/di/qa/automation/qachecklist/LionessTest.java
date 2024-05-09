package com.autofi.di.qa.automation.qachecklist;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.autofi.di.qa.automation.BaseTest;
import com.autofi.di.qa.automation.pages.lioness.DealershipListPage;
import com.autofi.di.qa.automation.utils.WaitUtils;

public class LionessTest extends BaseTest {

    @Test
    public void lionessSampleTest() {
        WebDriver driver = setupTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();
        SoftAssert softAssert = new SoftAssert();

        DealershipListPage dealershipListPage = new DealershipListPage(driver);
        dealershipListPage.navToPage();

        WaitUtils.hardWaitForSeconds(3);
    }
}
