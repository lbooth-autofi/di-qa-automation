package com.autofi.di.qa.automation.qachecklist;

import com.autofi.di.qa.automation.BaseTest;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.DealerPortal;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.CaptiveLenders;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.testSteps.dealers.DealerViewSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.autofi.di.qa.automation.resources.lioness.dealerportal.DealerPortalEnvironment.PROD;
import static com.autofi.di.qa.automation.resources.lioness.dealerportal.DealerPortalRoute.DEALERS;
import static com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers.DealerViewSections.LENDERS;
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
                dealerPortal.getDealerListView().isVisible(120),
                "Dealership list page is not visible"
        );

        String dealerCode = "OK7Q";

        dealerPortal.getDealerListView().enterSearchBarText(dealerCode);
        dealerPortal.getDealerListView().clickDealerLinkByDealerCode(dealerCode);

        assertThat(dealerPortal.getPageUrl()).contains(dealerCode);
        dealerPortal.getDealerView().getSideNav().waitUntilSideNavOptionsVisible();

        Assert.assertTrue(
                dealerPortal.getDealerView().getPageHeader().isVisible(10),
                "Dealer view is not visible"
        );

        System.out.println("Dealer view header title: " + dealerPortal.getDealerView().getPageHeader().getHeaderTitle());

        dealerPortal.getDealerView().getSideNav().clickSideNav(LENDERS);

        dealerPortal.getDealerView().scrollSectionIntoView(LENDERS);

        dealerPortal.getDealerView().waitUntilSectionVisible(LENDERS);

        assertThat(dealerPortal.getDealerView().isSectionVisible(LENDERS, 10)).isTrue();

        System.out.println("Dealer view header text: " +
                dealerPortal.getDealerView().getSectionHeadingText(LENDERS)
        );
    }

    @Test
    public void testSelectingCaptiveLenders() {
        // TODO: replace this with a call to a browser with an open port for debugging
        WebDriver driver = startTestDriver(TestBrowser.CHROME);
        driver.manage().window().maximize();

        DealerPortal dealerPortal = new DealerPortal(driver);

        dealerPortal.navToDealerViewSection(PROD, DEALERS, "OK7Q", LENDERS);

        assertThat(dealerPortal.getDealerView().isSectionVisible(LENDERS, 10)).isTrue();

        System.out.println("DealerPortal header title: " + dealerPortal.getDealerView().getPageHeader().getHeaderTitle());

        System.out.println("Page section header text: " +
                dealerPortal.getDealerView().getSectionHeadingText(LENDERS)
        );

        DealerViewSteps dealerViewSteps = new DealerViewSteps(driver);

        int lenderIndex = 0;



        System.out.println("captive lender selected: " + dealerPortal.getDealerView().getLendersSection().getSelectedCaptiveLender());


        for (CaptiveLenders lender : CaptiveLenders.values()) {

            dealerPortal.scrollToElement(
                    dealerPortal.getDealerView().getLendersSection().getCaptiveLenderBy(lender)
            );

            // for now, scroll past the bottom section only on the first attempt
            if (lenderIndex == 0) {
                dealerPortal.scrollByOffset(0, dealerViewSteps.getBottomSectionHeight());
            } else {
                By captiveLenderBy = dealerPortal.getDealerView().getLendersSection().
                        getCaptiveLenderBy(lender);

                WebElement captiveLenderElement = driver.findElement(captiveLenderBy);

                dealerPortal.scrollByOffset(
                        0,
                        captiveLenderElement.getRect().getHeight() + 10
                );
            }

            lenderIndex++;

            String lenderText = dealerPortal.getDealerView().getLendersSection().getCaptiveLenderLabel(lender);
            System.out.println(lenderText);

            dealerPortal.getDealerView().getLendersSection().selectCaptiveLender(lender);
        }

        dealerPortal.getDealerView().getLendersSection().selectCaptiveLender(CaptiveLenders.MAZDA_MAZ);
        System.out.println("is Mazda the selected captive lender? " + dealerPortal.getDealerView().getLendersSection().
                isSelectedCaptiveLender(CaptiveLenders.MAZDA_MAZ));
    }
}
