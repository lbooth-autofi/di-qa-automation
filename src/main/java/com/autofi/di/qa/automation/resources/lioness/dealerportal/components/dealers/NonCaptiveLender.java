package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

public class NonCaptiveLender extends Lender {
    NonCaptiveLenders nonCaptiveLender;

    public NonCaptiveLender(NonCaptiveLenders nonCaptiveLender) {
        this.lenderType = LenderType.NON_CAPTIVE_LENDER;
        this.lenderLabel = NonCaptiveLenders.toLenderLabel(nonCaptiveLender);
        this.lenderAbbreviation = NonCaptiveLenders.toLenderAbbreviation(nonCaptiveLender);
        this.nonCaptiveLender = nonCaptiveLender;
    }

    public NonCaptiveLender(String lenderAbbreviation) {
        this.lenderType = LenderType.CAPTIVE_LENDER;
        this.nonCaptiveLender = NonCaptiveLenders.toLenderEnum(lenderAbbreviation);
        this.lenderLabel = NonCaptiveLenders.toLenderLabel(nonCaptiveLender);
        this.lenderAbbreviation = NonCaptiveLenders.toLenderAbbreviation(nonCaptiveLender);
    }

    public NonCaptiveLenders getLenderEnum() {
        return this.nonCaptiveLender;
    }
}
