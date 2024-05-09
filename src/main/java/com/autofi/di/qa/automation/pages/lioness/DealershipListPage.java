package com.autofi.di.qa.automation.pages.lioness;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.autofi.di.qa.automation.pages.BasePage;

public class DealershipListPage extends BasePage {

    // TODO: change pageUrl based on the desired test environment
    String pageUrl = "https://account.autofi.com/#/dealers";
    String pageName = "Dealership List";

    public DealershipListPage(WebDriver driver) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    public DealershipListPage(WebDriver driver, String pageUrl, String pageName) {
        super(driver);
        this.setPageUrl(pageUrl);
        this.setPageName(pageName);
    }

    public By byHeaderTitle = By.xpath("//div[contains(@class,'bar-title')]");
    public By bySearchBar = By.xpath("//input[@placeholder='Dealership']");

    String templateForDealershipLinkByDealerCode = "//a[contains(@href,'[DEALER_CODE]')]";
    String templateForDealershipLinkByDealerName = "//a[contains(text(),'[DEALER_NAME]')]";

    String templateForDealershipLinkByNameAndRow = "//div[@role='row'][descendant::a[contains(text(),'DEALER_NAME')]][ROW_NUMBER]";

    String templateForDealershipTableHeaderCell = "//div[@role='columnheader'][COLUMN_NUMBER]";

    String templateForDealershipTableCell = "//div[contains(@class,'row-item')][ROW_NUMBER]/descendant::div[@role='cell'][COLUMN_NUMBER]";


}
