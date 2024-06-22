package com.autofi.di.qa.automation.pages.lioness.dealerportal;

import com.autofi.di.qa.automation.pages.BasePageObject;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerListView;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerViewSection;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerView;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DealerPortal extends BasePageObject {

    String pageUrl = "";
    String pageName = "Dealer Portal";

    public DealerPortal(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    public DealerListView dealerListView = new DealerListView(getDriver());
    public DealerView dealerView = new DealerView(getDriver());

    public void navToPage(DealerPortalEnvironment environment, DealerPortalRoute route) {
        String url = DealerPortalRoute.toUrl(environment, route);
        getDriver().navigate().to(url);
    }

    public void navToDealerViewSection(
            DealerPortalEnvironment environment, DealerPortalRoute route,
            String dealerCode, DealerViewSection section) {

        navToPage(environment, route);

        // unless you use a browser with remote debugger
        // that you are already logged into for AutoFi
        // you will need to log in for the test to continue
        Assert.assertTrue(
                dealerListView.isVisible(120),
                "Dealership list page is not visible"
        );

        dealerListView.enterSearchBarText(dealerCode);
        dealerListView.clickDealerLinkByDealerCode(dealerCode);

        dealerView.sideNav.waitUntilSideNavOptionsVisible();
        dealerView.pageHeader.waitUntilHeaderVisible(10);

        dealerView.sideNav.clickSideNav(section);
        dealerView.scrollSectionIntoView(section);
        dealerView.waitUntilSectionVisible(section);
    }
}
