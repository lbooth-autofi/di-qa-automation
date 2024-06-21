package com.autofi.di.qa.automation.qachecklist;

import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerView;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.autofi.di.qa.automation.BaseTest;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerListView;

import static com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerView.PageSection.LENDERS;
import static org.assertj.core.api.Assertions.assertThat;

public class LionessSampleTests extends BaseTest {

    @Test
    public void testUsingDealershipList() {
        // TODO: replace this with a call to a browser with an open port for debugging
        WebDriver driver = startTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();
        SoftAssert softAssert = new SoftAssert();

        DealerListView dealerListView = new DealerListView(driver);

        // unless you use a browser with remote debugger
        // that you are already logged into for AutoFi
        // you will need to login for the test to continue
        dealerListView.navToPage();

        Assert.assertEquals(
                dealerListView.isVisible(120),
                true,
                "Dealership list page is not visible"
        );

        String dealerCode = "OK7Q";

        dealerListView.enterSearchBarText(dealerCode);
        dealerListView.clickDealerLinkByDealerCode(dealerCode);

        DealerView dealerView = new DealerView(driver);
        assertThat(dealerView.getPageUrl()).contains(dealerCode);
        dealerView.sideNav.waitUntilSideNavOptionsVisible();

        Assert.assertEquals(
                dealerView.pageHeader.isVisible(10),
                true,
                "Dealer view is not visible"
        );
        System.out.println("DealerView header title: " + dealerView.pageHeader.getHeaderTitle());

        dealerView.sideNav.clickSideNav(LENDERS);

        dealerView.scrollSectionIntoView(LENDERS);

        dealerView.waitUntilSectionVisible(LENDERS);

        assertThat(dealerView.isSectionVisible(LENDERS, 10)).isTrue();

        System.out.println("Page section header text: " +
                dealerView.getSectionHeadingText(LENDERS)
        );
    }
}
