package com.autofi.di.qa.automation.pages.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerViewSection;
import com.autofi.di.qa.automation.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealerSideNav extends BasePageObject {

    String pageUrl = "";
    String pageName = "side nav";

    public DealerSideNav(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    public By bySideNavOptions = By.cssSelector("ul[class*=index__nav] li");
    public By bySideNavOptionSelected = By.cssSelector("ul[class*=index__nav] li[class*=active]");
    public String templateForSideNavOption = "//ul[contains(@class,'index__nav')]/li[text()='NAV_OPTION_NAME']";

    public void waitUntilSideNavOptionsVisible() {
        waitUntilAllElementsVisible(bySideNavOptions, 10);
    }


    private By getSideNavLocator(DealerViewSection dealerViewSection, int timeoutInSeconds) {
        String sideNavText = DealerViewSection.toSideNavText(dealerViewSection);
        return getByFromXPathTemplate(templateForSideNavOption, "NAV_OPTION_NAME", sideNavText, timeoutInSeconds);
    }

    private WebElement getSideNavWebElement(DealerViewSection dealerViewSection, int timeoutInSeconds) {
        return getDriver().findElement(getSideNavLocator(dealerViewSection,timeoutInSeconds));
    }

    public void clickSideNav(DealerViewSection dealerViewSection) {
        WebElement sideNavElement = getSideNavWebElement(dealerViewSection,10);
        sideNavElement.click();

        // need to wait momentarily for Dealer view to catch up
        WaitUtils.hardWaitForSeconds(2);
    }

}
