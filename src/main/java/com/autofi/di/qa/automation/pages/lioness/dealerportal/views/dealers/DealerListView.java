package com.autofi.di.qa.automation.pages.lioness.dealerportal.views.dealers;

import org.openqa.selenium.*;

import com.autofi.di.qa.automation.pages.BasePageObject;

public class DealerListView extends BasePageObject {

    String pageUrl = "";
    String pageName = "Dealership List";

    public DealerListView(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    public By byHeaderTitle = By.xpath("//div[contains(@class,'bar-title')]");
    public By bySearchBar = By.xpath("//input[@placeholder='Dealership']");
    public By bySearchResultsTable = By.cssSelector("div[role='table']");
    public By bySearchResultsTableRow = By.cssSelector("div[class*='index__row-item'] a[href*='dealership-settings']");

    String templateForDealerLinkByDealerCode = "//a[contains(@href,'[DEALER_CODE]')]";
    String templateForDealerLinkByDealerName = "//a[contains(text(),'[DEALER_NAME]')]";
    String templateForDealerLinkByNameAndRow = "//div[@role='row'][descendant::a[contains(text(),'DEALER_NAME')]][ROW_NUMBER]";
    String templateForDealerTableHeaderCell = "//div[@role='columnheader'][COLUMN_NUMBER]";
    String templateForDealerTableCell = "//div[contains(@class,'row-item')][ROW_NUMBER]/descendant::div[@role='cell'][COLUMN_NUMBER]";

    public boolean isVisible(int timeoutInSeconds) {
        return isVisible(bySearchBar, timeoutInSeconds);
    }

    public void enterSearchBarText(String text) {
        getDriver().findElement(bySearchBar).click();
        getDriver().findElement(bySearchBar).sendKeys(text);
    }

    public String getSearchBarText() {
        return getDriver().findElement(bySearchBar).getText();
    }

    public void waitUntilSearchResultsTableIsVisible(int timeoutInSeconds) {
        waitUntilElementIsVisible(bySearchResultsTable, timeoutInSeconds);
        waitUntilAllElementsVisible(bySearchResultsTableRow, timeoutInSeconds);
    }

    public void clickDealerLinkByDealerCode(String dealerCode) {
        String dealerLinkByDealerCode = templateForDealerLinkByDealerCode.replace("[DEALER_CODE]", dealerCode);
        By byDealerLink = By.xpath(dealerLinkByDealerCode);
        waitUntilElementIsVisible(byDealerLink, 10);
        getDriver().findElement(byDealerLink).click();
    }
}
