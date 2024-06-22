package com.autofi.di.qa.automation.pages.lioness.dealerportal;

public enum DealerPortalEnvironment {
    PROD, PRODUCTION, STAGE, UAT, QA;

    public static String toUrl(DealerPortalEnvironment environment) {
        return switch(environment) {
            case PROD, PRODUCTION -> "https://account.autofi.com";
            case STAGE -> "https://account-staging.autofi.com";
            case UAT -> "https://account-uat.autofi.com";
            case QA -> "https://auth-qa.autofi.com";
        };
    }
}
