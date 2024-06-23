package com.autofi.di.qa.automation.resources.lioness.dealerportal.views.dealers;

public enum DealerViewSections {
    GENERAL, INTEGRATIONS, PRICING_CI, PATHWAYS,
    DEALMAKER, TRADE_IN, NOTIFICATIONS, FI_PRODUCTS,
    LENDERS, DEALER_PORTAL, PARTNERS_API, STATUS_BILLING, ADVANCED,
    USERS, VEHICLES, SETTINGS_LOGS;

    public static String toSideNavText(DealerViewSections dealerViewSection) {
        return switch (dealerViewSection) {
            case GENERAL -> "General";
            case INTEGRATIONS -> "Integrations";
            case PRICING_CI -> "Pricing C&I";
            case PATHWAYS -> "Pathways";
            case DEALMAKER -> "DealMaker";
            case TRADE_IN -> "Trade In";
            case NOTIFICATIONS -> "Notifications";
            case FI_PRODUCTS -> "F&I Products";
            case LENDERS -> "Lenders";
            case DEALER_PORTAL -> "Dealer Portal";
            case PARTNERS_API -> "Partners & API";
            case STATUS_BILLING -> "Status & Billing";
            case ADVANCED -> "Advanced";
            case USERS -> "Users";
            case VEHICLES -> "Vehicles";
            case SETTINGS_LOGS -> "Settings Logs";
        };
    }

    public static String toHeadingId(DealerViewSections dealerViewSection) {
        return switch (dealerViewSection) {
            case GENERAL -> "general";
            case INTEGRATIONS -> "integrations";
            case PRICING_CI -> "pricingandci";
            case PATHWAYS -> "pathways";
            case DEALMAKER -> "deal-maker";
            case TRADE_IN -> "trade-in";
            case NOTIFICATIONS -> "notifications";
            case FI_PRODUCTS -> "fandi-products";
            case LENDERS -> "lenders";
            case DEALER_PORTAL -> "dealer-portal";
            case PARTNERS_API -> "partners-and-api";
            case STATUS_BILLING -> "status-and-billing";
            case ADVANCED -> "advanced";
            case USERS -> "Users";
            case VEHICLES -> "Vehicles";
            case SETTINGS_LOGS -> "Settings Logs";
        };
    }

}
