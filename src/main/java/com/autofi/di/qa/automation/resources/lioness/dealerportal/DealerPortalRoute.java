package com.autofi.di.qa.automation.resources.lioness.dealerportal;

public enum DealerPortalRoute {
    DEALERS,
    PRODUCTS,
    USERS,
    VEHICLES,
    SETTINGS_LOGS,
    INVENTORY_FEED_PROVIDERS;

    // PAGE ROUTES:
    // https://account.autofi.com/#/dealers
    // https://account.autofi.com/#/products
    // https://account.autofi.com/#/users
    // https://account.autofi.com/#/vehicles
    // https://account.autofi.com/#/settings-logs
    // https://account.autofi.com/#/inventory-providers/providers
    public static String toUrl(DealerPortalEnvironment environment, DealerPortalRoute dealerPortalRoute) {
        String environmentUrl = DealerPortalEnvironment.toUrl(environment);
        return switch(dealerPortalRoute) {
            case DEALERS -> environmentUrl + "/#/dealers";
            case PRODUCTS -> environmentUrl + "/#/products";
            case USERS -> environmentUrl + "/#/users";
            case VEHICLES -> environmentUrl + "/#/vehicles";
            case SETTINGS_LOGS -> environmentUrl + "/#/settings-logs";
            case INVENTORY_FEED_PROVIDERS -> environmentUrl + "/#/inventory-providers/providers";
        };
    }
}
