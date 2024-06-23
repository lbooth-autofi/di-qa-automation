package com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.DealerSideNav;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.PageHeader;
import com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.LendersSection;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

public class DealerView extends BasePageObject {

    // https://account.autofi.com/#/dealers/4I2A/dealership-settings
    String pageUrl = "";
    String pageName = "Dealer view";

    public DealerView(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    // PAGE SECTIONS
//    public PageHeader pageHeader = new PageHeader(getDriver());
//    public DealerSideNav sideNav = new DealerSideNav(getDriver());
//    public LendersSection lendersSection = new LendersSection(getDriver());

    public PageHeader getPageHeader() {
        return new PageHeader(getDriver());
    }

    public DealerSideNav getSideNav() {
        return new DealerSideNav(getDriver());
    }

    public LendersSection getLendersSection() {
        return new LendersSection(getDriver());
    }

    public String templateForContentSection = "//div[@id='HEADING_ID']" +
            "/descendant::div[contains(@class,'index__ContentSection')]" +
            "/h1[contains(@class,'index__heading')]";

    public By dealerViewBottomSection = By.xpath("//div[contains(@class,'index__bottomSection')]");

    public WebElement getBottomSectionElement() {
        return getDriver().findElement(dealerViewBottomSection);
    }

    public void waitUntilSectionVisible(DealerViewSections dealerViewSection) {
        waitUntilElementIsVisible(By.id(DealerViewSections.toHeadingId(dealerViewSection)), 10);
    }

    private By getSectionBy(DealerViewSections dealerViewSection, int timeoutInSeconds) {
        String headingId = DealerViewSections.toHeadingId(dealerViewSection);
        return getByFromXPathTemplate(templateForContentSection, "HEADING_ID",
                headingId, timeoutInSeconds);
    }

    private WebElement getSectionElement(DealerViewSections dealerViewSection, int timeoutInSeconds) {
        return getDriver().findElement(getSectionBy(dealerViewSection, timeoutInSeconds));
    }

    public boolean isSectionVisible(DealerViewSections dealerViewSection, int timeoutInSeconds) {
        return getSectionElement(dealerViewSection, timeoutInSeconds).isDisplayed();
    }

    public void scrollSectionIntoView(DealerViewSections dealerViewSection) {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(getSectionElement(dealerViewSection, 10)).perform();
    }

    public String getSectionHeadingText(DealerViewSections dealerViewSection) {
        return getSectionElement(dealerViewSection, 10).getText();
    }
}
