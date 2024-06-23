package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

import org.openqa.selenium.WebDriver;

import static com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers.LenderType.CAPTIVE_LENDER;

public class CaptiveLender extends Lender {
    LenderType lenderType;
    String lenderName;
    String lenderAbbreviation;
    CaptiveLenders captiveLender;

    public CaptiveLender(WebDriver driver, CaptiveLenders captiveLender) {
        this.lenderType = CAPTIVE_LENDER;
        this.captiveLender = captiveLender;
        this.lenderName = toLenderName();
        this.lenderAbbreviation = toLenderAbbreviation();
    }

    public String toLenderName() {
        return CaptiveLenders.toLenderName(captiveLender);
    }

    public String toLenderAbbreviation() {
        return CaptiveLenders.toLenderAbbreviation(captiveLender);
    }

    public LenderType getLenderType() {
        return lenderType;
    }

    public CaptiveLenders getCaptiveLender() {
        return captiveLender;
    }
}
