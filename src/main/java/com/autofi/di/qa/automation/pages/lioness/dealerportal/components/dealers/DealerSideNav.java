package com.autofi.di.qa.automation.pages.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
import com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers.DealerPageSection;
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


    private By getSideNavByLocator(DealerPageSection dealerPageSection, int timeoutInSeconds) {
        String sideNavText = DealerPageSection.toSideNavText(dealerPageSection);
        return getByFromXPathTemplate(templateForSideNavOption, "NAV_OPTION_NAME", sideNavText, timeoutInSeconds);
    }

    private WebElement getSideNavWebElement(DealerPageSection dealerPageSection, int timeoutInSeconds) {
        return getDriver().findElement(getSideNavByLocator(dealerPageSection,timeoutInSeconds));
    }

    public void clickSideNav(DealerPageSection dealerPageSection) {
        WebElement sideNavElement = getSideNavWebElement(dealerPageSection,10);
        sideNavElement.click();
    }

}
