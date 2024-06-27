package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

public class CaptiveLender extends Lender {
    CaptiveLenders captiveLender;

    public CaptiveLender(CaptiveLenders captiveLender) {
        this.lenderType = LenderType.CAPTIVE_LENDER;
        this.lenderLabel = CaptiveLenders.toLenderLabel(captiveLender);
        this.lenderAbbreviation = CaptiveLenders.toLenderAbbreviation(captiveLender);
        this.captiveLender = captiveLender;
    }

    public CaptiveLender(String lenderAbbreviation) {
        this.lenderType = LenderType.CAPTIVE_LENDER;
        this.captiveLender = CaptiveLenders.toLenderEnum(lenderAbbreviation);
        this.lenderLabel = CaptiveLenders.toLenderLabel(captiveLender);
        this.lenderAbbreviation = CaptiveLenders.toLenderAbbreviation(captiveLender);
    }

    public CaptiveLenders getLenderEnum() {
        return this.captiveLender;
    }
}
