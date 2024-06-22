package com.autofi.di.qa.automation.qachecklist;

import com.autofi.di.qa.automation.BaseTest;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.DealerPortal;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.autofi.di.qa.automation.pages.lioness.dealerportal.DealerPortalEnvironment.PROD;
import static com.autofi.di.qa.automation.pages.lioness.dealerportal.DealerPortalRoute.DEALERS;
import static com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerViewSection.LENDERS;
import static org.assertj.core.api.Assertions.assertThat;

public class LionessSampleTests extends BaseTest {

    @Test
    public void testNavigatingToDealerViewSection() {
        // TODO: replace this with a call to a browser with an open port for debugging
        WebDriver driver = startTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();

        DealerPortal dealerPortal = new DealerPortal(driver);
        dealerPortal.navToPage(PROD, DEALERS);

        // unless you use a browser with remote debugger
        // that you are already logged into for AutoFi
        // you will need to log in for the test to continue
        Assert.assertTrue(
                dealerPortal.dealerListView.isVisible(120),
                "Dealership list page is not visible"
        );

        String dealerCode = "OK7Q";

        dealerPortal.dealerListView.enterSearchBarText(dealerCode);
        dealerPortal.dealerListView.clickDealerLinkByDealerCode(dealerCode);

        assertThat(dealerPortal.getPageUrl()).contains(dealerCode);
        dealerPortal.dealerView.sideNav.waitUntilSideNavOptionsVisible();

        Assert.assertTrue(
                dealerPortal.dealerView.pageHeader.isVisible(10),
                "Dealer view is not visible"
        );

        System.out.println("Dealer view header title: " + dealerPortal.dealerView.pageHeader.getHeaderTitle());

        dealerPortal.dealerView.sideNav.clickSideNav(LENDERS);

        dealerPortal.dealerView.scrollSectionIntoView(LENDERS);

        dealerPortal.dealerView.waitUntilSectionVisible(LENDERS);

        assertThat(dealerPortal.dealerView.isSectionVisible(LENDERS, 10)).isTrue();

        System.out.println("Dealer view header text: " +
                dealerPortal.dealerView.getSectionHeadingText(LENDERS)
        );
    }

    @Test
    public void testSelectingCaptiveAndNonCaptiveLenders() {
        // TODO: replace this with a call to a browser with an open port for debugging
        WebDriver driver = startTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();

        DealerPortal dealerPortal = new DealerPortal(driver);

        dealerPortal.navToDealerViewSection(PROD, DEALERS, "OK7Q", LENDERS);

        assertThat(dealerPortal.dealerView.isSectionVisible(LENDERS, 10)).isTrue();

        System.out.println("DealerPortal header title: " + dealerPortal.dealerView.pageHeader.getHeaderTitle());

        System.out.println("Page section header text: " +
                dealerPortal.dealerView.getSectionHeadingText(LENDERS)
        );

        // TODO: scroll to captive lenders and select each one in a loop
    }
}
