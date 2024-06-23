package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

import com.autofi.di.qa.automation.resources.BasePageObject;
import org.openqa.selenium.WebDriver;

public abstract class Lender {

    public abstract LenderType getLenderType();
    public abstract String toLenderName();
    public abstract String toLenderAbbreviation();

}
