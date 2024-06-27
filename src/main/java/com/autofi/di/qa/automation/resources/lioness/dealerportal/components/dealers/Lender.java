package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

public abstract class Lender {
    LenderType lenderType;
    String lenderLabel;
    String lenderAbbreviation;

    public LenderType getLenderType() {
        return this.lenderType;
    }

    public String getLenderLabel() {
        return this.lenderLabel;
    }

    public String getLenderAbbreviation() {
        return this.lenderAbbreviation;
    }
}
