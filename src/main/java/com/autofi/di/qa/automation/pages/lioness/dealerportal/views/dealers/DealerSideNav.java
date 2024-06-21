package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.pages.BasePageObject;
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


    private By getSideNavByLocator(DealerView.PageSection pageSection, int timeoutInSeconds) {
        String sideNavText = DealerView.PageSection.toSideNavText(pageSection);
        return getByFromXPathTemplate(templateForSideNavOption, "NAV_OPTION_NAME", sideNavText, timeoutInSeconds);
    }

    private WebElement getSideNavWebElement(DealerView.PageSection pageSection, int timeoutInSeconds) {
        return getDriver().findElement(getSideNavByLocator(pageSection,timeoutInSeconds));
    }

    public void clickSideNav(DealerView.PageSection pageSection) {
        WebElement sideNavElement = getSideNavWebElement(pageSection,10);
        sideNavElement.click();
    }

}
