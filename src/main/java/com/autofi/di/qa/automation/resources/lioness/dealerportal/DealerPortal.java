package com.autofi.di.qa.automation.resources.lioness.dealerportal;

import com.autofi.di.qa.automation.resources.BasePageObject;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers.DealerListView;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers.DealerViewSections;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers.DealerView;
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

//    public DealerListView dealerListView = new DealerListView(getDriver());
//    public DealerView dealerView = new DealerView(getDriver());

    public DealerListView getDealerListView() {
        return new DealerListView(getDriver());
    }

    public DealerView getDealerView() {
        return new DealerView(getDriver());
    }

    public void navToPage(DealerPortalEnvironment environment, DealerPortalRoute route) {
        String url = DealerPortalRoute.toUrl(environment, route);
        getDriver().navigate().to(url);
    }

    public void navToDealerViewSection(
            DealerPortalEnvironment environment, DealerPortalRoute route,
            String dealerCode, DealerViewSections section) {

        navToPage(environment, route);

        // unless you use a browser with remote debugger
        // that you are already logged into for AutoFi
        // you will need to log in for the test to continue
        Assert.assertTrue(
                getDealerListView().isVisible(120),
                "Dealership list page is not visible"
        );

        getDealerListView().enterSearchBarText(dealerCode);
        getDealerListView().clickDealerLinkByDealerCode(dealerCode);

        getDealerView().getSideNav().waitUntilSideNavOptionsVisible();
        getDealerView().getPageHeader().waitUntilHeaderVisible(10);

        getDealerView().getSideNav().clickSideNav(section);
        getDealerView().scrollSectionIntoView(section);
        getDealerView().waitUntilSectionVisible(section);
    }
}
