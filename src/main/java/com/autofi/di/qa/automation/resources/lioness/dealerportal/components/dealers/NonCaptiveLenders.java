package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

/*
    Non-Captive Lenders as of 26 June 2024:
    ======================================
    AutoFi Lender Network (ALN)
    ---------------------------
    Ally Bank (ALLY)
    American Credit Acceptance (ACA)
    Bank of America (BOFA)
    Cadillac Financial Lease (CADFL)
    Chase Auto (CHASE)
    DT TEST BALANCER (DT6)
    Driveway Finance Corporation (SCF)
    EXETER FINANCE (EXETER)
    First Investors Financial Services (FIFS)
    GM Financial (GMFL)
    GM Financial Lease Canada (GMFLCA)
    Global Lending Services (GLS)
    Lincoln Automotive Financial Services (LAFSNC)
    Regional Acceptance (RAC)
    Royal Bank of Canada (RBC)
    Santander Consumer Canada (SANTCA)
    Santander Consumer USA (SANT)
    Stellantis Financial Services Lease (SFSL)
    TD Auto Finance, a division of TD Bank N.A. (TDAUTO)
    The Huntington National Bank (HBAN)
    Tricor (TRICOR)
    Truist Bank (TRU)
    US Bank (USBANK)
    United Auto Credit (UAC)
    Vroom Financial Services (VROOM)
    Wells Fargo (WELLS)
    Westlake Financial Services (WEST)
    Westlake Financial Services (WESTEX)

    Dealer Lender Network (DLN)
    -----------------------------
    Advancial Credit Union (ADCU)
    Amarillo National Bank (AMR)
    America's First Credit Union (AFCU)
    Bank of Montreal (BMOCA)
    California Coast Credit Union (CCCU)
    Capital One (CAP1)
    Citizens Bank (CZN)
    Columbia Credit Union (COCU)
    First Commonwealth Bank (FCB)
    HAPO Community Credit Union (HCCU)
    Kemba Financial Credit Union (KEU)
    Kitsap Credit Union (KITCU)
    Landmark Credit Union (LDM)
    Langley Federal Credit Union (LFCU)
    Maine State Credit Union (MSCU)
    Mountain American Credit Union (MACU)
    Navigant Credit Union (NVG)
    New Dimensions Federal Credit Union (NDFCU)
    Northwest Bank (NWB)
    PNC Bank (PNC)
    San Diego County Credit Union (SDC)
    The Bank of Southside Virginia (BSV)
    Wright-Patt Credit Union (WPC)
 */

public enum NonCaptiveLenders {

    ALLY_ALLY_BANK,
    ACA_AMERICAN_CREDIT_ACCEPTANCE,
    BOFA_BANK_OF_AMERICA,
    CADFL_CADILLAC_FINANCIAL_LEASE,
    CHASE_CHASE_AUTO,
    DT6_DT_TEST_BALANCER,
    SCF_DRIVEWAY_FINANCE_CORPORATION,
    EXETER_EXETER_FINANCE,
    FIFS_FIRST_INVESTORS_FINANCIAL_SERVICES,
    GMFL_GM_FINANCIAL,
    GMFLCA_GM_FINANCIAL_LEASE_CANADA,
    GLS_GLOBAL_LENDING_SERVICES,
    LAFSNC_LINCOLN_AUTOMOTIVE_FINANCIAL_SERVICES,
    RAC_REGIONAL_ACCEPTANCE,
    RBC_ROYAL_BANK_OF_CANADA,
    SANTCA_SANTANDER_CONSUMER_CANADA,
    SANT_SANTANDER_CONSUMER_USA,
    SFSL_STELLANTIS_FINANCIAL_SERVICES_LEASE,
    TDAUTO_TD_AUTO_FINANCE,
    HBAN_THE_HUNTINGTON_NATIONAL_BANK,
    TRICOR_TRICOR,
    TRU_TRUIST_BANK,
    USBANK_US_BANK,
    UAC_UNITED_AUTO_CREDIT,
    VROOM_VROOM_FINANCIAL_SERVICES,
    WELLS_WELLS_FARGO,
    WEST_WESTLAKE_FINANCIAL_SERVICES,
    WESTEX_WESTLAKE_FINANCIAL_SERVICES,
    ADCU_ADVANCIAL_CREDIT_UNION,
    AMR_AMARILLO_NATIONAL_BANK,
    AFCU_AMERICAS_FIRST_CREDIT_UNION,
    BMOCA_BANK_OF_MONTREAL,
    CCCU_CALIFORNIA_COAST_CREDIT_UNION,
    CAP1_CAPITAL_ONE,
    CZN_CITIZENS_BANK,
    COCU_COLUMBIA_CREDIT_UNION,
    FCB_FIRST_COMMONWEALTH_BANK,
    HCCU_HAPO_COMMUNITY_CREDIT_UNION,
    KEU_KEMBA_FINANCIAL_CREDIT_UNION,
    KITCU_KITSAP_CREDIT_UNION,
    LDM_LANDMARK_CREDIT_UNION,
    LFCU_LANGLEY_FEDERAL_CREDIT_UNION,
    MSCU_MAINE_STATE_CREDIT_UNION,
    MACU_MOUNTAIN_AMERICAN_CREDIT_UNION,
    NVG_NAVIGANT_CREDIT_UNION,
    NDFCU_NEW_DIMENSIONS_FEDERAL_CREDIT_UNION,
    NWB_NORTHWEST_BANK,
    PNC_PNC_BANK,
    SDC_SAN_DIEGO_COUNTY_CREDIT_UNION,
    BSV_THE_BANK_OF_SOUTHSIDE_VIRGINIA,
    WPC_WRIGHT_PATT_CREDIT_UNION;

    public static String toLenderLabel(NonCaptiveLenders nonCaptiveLender) {
        return switch (nonCaptiveLender) {
            case ALLY_ALLY_BANK -> "Ally Bank (ALLY)";
            case ACA_AMERICAN_CREDIT_ACCEPTANCE -> "American Credit Acceptance (ACA)";
            case BOFA_BANK_OF_AMERICA -> "Bank of America (BOFA)";
            case CADFL_CADILLAC_FINANCIAL_LEASE -> "Cadillac Financial Lease (CADFL)";
            case CHASE_CHASE_AUTO -> "Chase Auto (CHASE)";
            case DT6_DT_TEST_BALANCER -> "DT TEST BALANCER (DT6)";
            case SCF_DRIVEWAY_FINANCE_CORPORATION -> "Driveway Finance Corporation (SCF)";
            case EXETER_EXETER_FINANCE -> "EXETER FINANCE (EXETER)";
            case FIFS_FIRST_INVESTORS_FINANCIAL_SERVICES -> "First Investors Financial Services (FIFS)";
            case GMFL_GM_FINANCIAL -> "GM Financial (GMFL)";
            case GMFLCA_GM_FINANCIAL_LEASE_CANADA -> "GM Financial Lease Canada (GMFLCA)";
            case GLS_GLOBAL_LENDING_SERVICES -> "Global Lending Services (GLS)";
            case LAFSNC_LINCOLN_AUTOMOTIVE_FINANCIAL_SERVICES -> "Lincoln Automotive Financial Services (LAFSNC)";
            case RAC_REGIONAL_ACCEPTANCE -> "Regional Acceptance (RAC)";
            case RBC_ROYAL_BANK_OF_CANADA -> "Royal Bank of Canada (RBC)";
            case SANTCA_SANTANDER_CONSUMER_CANADA -> "Santander Consumer Canada (SANTCA)";
            case SANT_SANTANDER_CONSUMER_USA -> "Santander Consumer USA (SANT)";
            case SFSL_STELLANTIS_FINANCIAL_SERVICES_LEASE -> "Stellantis Financial Services Lease (SFSL)";
            case TDAUTO_TD_AUTO_FINANCE -> "TD Auto Finance, a division of TD Bank N.A. (TDAUTO)";
            case HBAN_THE_HUNTINGTON_NATIONAL_BANK -> "The Huntington National Bank (HBAN)";
            case TRICOR_TRICOR -> "Tricor (TRICOR)";
            case TRU_TRUIST_BANK -> "Truist Bank (TRU)";
            case USBANK_US_BANK -> "US Bank (USBANK)";
            case UAC_UNITED_AUTO_CREDIT -> "United Auto Credit (UAC)";
            case VROOM_VROOM_FINANCIAL_SERVICES -> "Vroom Financial Services (VROOM)";
            case WELLS_WELLS_FARGO -> "Wells Fargo (WELLS)";
            case WEST_WESTLAKE_FINANCIAL_SERVICES -> "Westlake Financial Services (WEST)";
            case WESTEX_WESTLAKE_FINANCIAL_SERVICES -> "Westlake Financial Services (WESTEX)";
            case ADCU_ADVANCIAL_CREDIT_UNION -> "Advancial Credit Union (ADCU)";
            case AMR_AMARILLO_NATIONAL_BANK -> "Amarillo National Bank (AMR)";
            case AFCU_AMERICAS_FIRST_CREDIT_UNION -> "America's First Credit Union (AFCU)";
            case BMOCA_BANK_OF_MONTREAL -> "Bank of Montreal (BMOCA)";
            case CCCU_CALIFORNIA_COAST_CREDIT_UNION -> "California Coast Credit Union (CCCU)";
            case CAP1_CAPITAL_ONE -> "Capital One (CAP1)";
            case CZN_CITIZENS_BANK -> "Citizens Bank (CZN)";
            case COCU_COLUMBIA_CREDIT_UNION -> "Columbia Credit Union (COCU)";
            case FCB_FIRST_COMMONWEALTH_BANK -> "First Commonwealth Bank (FCB)";
            case HCCU_HAPO_COMMUNITY_CREDIT_UNION -> "HAPO Community Credit Union (HCCU)";
            case KEU_KEMBA_FINANCIAL_CREDIT_UNION -> "Kemba Financial Credit Union (KEU)";
            case KITCU_KITSAP_CREDIT_UNION -> "Kitsap Credit Union (KITCU)";
            case LDM_LANDMARK_CREDIT_UNION -> "Landmark Credit Union (LDM)";
            case LFCU_LANGLEY_FEDERAL_CREDIT_UNION -> "Langley Federal Credit Union (LFCU)";
            case MSCU_MAINE_STATE_CREDIT_UNION -> "Maine State Credit Union (MSCU)";
            case MACU_MOUNTAIN_AMERICAN_CREDIT_UNION -> "Mountain American Credit Union (MACU)";
            case NVG_NAVIGANT_CREDIT_UNION -> "Navigant Credit Union (NVG)";
            case NDFCU_NEW_DIMENSIONS_FEDERAL_CREDIT_UNION -> "New Dimensions Federal Credit Union (NDFCU)";
            case NWB_NORTHWEST_BANK -> "Northwest Bank (NWB)";
            case PNC_PNC_BANK -> "PNC Bank (PNC)";
            case SDC_SAN_DIEGO_COUNTY_CREDIT_UNION -> "San Diego County Credit Union (SDC)";
            case BSV_THE_BANK_OF_SOUTHSIDE_VIRGINIA -> "The Bank of Southside Virginia (BSV)";
            case WPC_WRIGHT_PATT_CREDIT_UNION -> "Wright-Patt Credit Union (WPC)";
        };
    }

    public static String toLenderLabel(String lenderAbbreviation) {
        return switch (lenderAbbreviation) {
            case "ALLY" -> "Ally Bank (ALLY)";
            case "ACA" -> "American Credit Acceptance (ACA)";
            case "BOFA" -> "Bank of America (BOFA)";
            case "CADFL" -> "Cadillac Financial Lease (CADFL)";
            case "CHASE" -> "Chase Auto (CHASE)";
            case "DT6" -> "DT TEST BALANCER (DT6)";
            case "SCF" -> "Driveway Finance Corporation (SCF)";
            case "EXETER" -> "EXETER FINANCE (EXETER)";
            case "FIFS" -> "First Investors Financial Services (FIFS)";
            case "GMFL" -> "GM Financial (GMFL)";
            case "GMFLCA" -> "GM Financial Lease Canada (GMFLCA)";
            case "GLS" -> "Global Lending Services (GLS)";
            case "LAFSNC" -> "Lincoln Automotive Financial Services (LAFSNC)";
            case "RAC" -> "Regional Acceptance (RAC)";
            case "RBC" -> "Royal Bank of Canada (RBC)";
            case "SANTCA" -> "Santander Consumer Canada (SANTCA)";
            case "SANT" -> "Santander Consumer USA (SANT)";
            case "SFSL" -> "Stellantis Financial Services Lease (SFSL)";
            case "TDAUTO" -> "TD Auto Finance, a division of TD Bank N.A. (TDAUTO)";
            case "HBAN" -> "The Huntington National Bank (HBAN)";
            case "TRICOR" -> "Tricor (TRICOR)";
            case "TRU" -> "Truist Bank (TRU)";
            case "USBANK" -> "US Bank (USBANK)";
            case "UAC" -> "United Auto Credit (UAC)";
            case "VROOM" -> "Vroom Financial Services (VROOM)";
            case "WELLS" -> "Wells Fargo (WELLS)";
            case "WEST" -> "Westlake Financial Services (WEST)";
            case "WESTEX" -> "Westlake Financial Services (WESTEX)";
            case "ADCU" -> "Advancial Credit Union (ADCU)";
            case "AMR" -> "Amarillo National Bank (AMR)";
            case "AFCU" -> "America's First Credit Union (AFCU)";
            case "BMOCA" -> "Bank of Montreal (BMOCA)";
            case "CCCU" -> "California Coast Credit Union (CCCU)";
            case "CAP1" -> "Capital One (CAP1)";
            case "CZN" -> "Citizens Bank (CZN)";
            case "COCU" -> "Columbia Credit Union (COCU)";
            case "FCB" -> "First Commonwealth Bank (FCB)";
            case "HCCU" -> "HAPO Community Credit Union (HCCU)";
            case "KEU" -> "Kemba Financial Credit Union (KEU)";
            case "KITCU" -> "Kitsap Credit Union (KITCU)";
            case "LDM" -> "Landmark Credit Union (LDM)";
            case "LFCU" -> "Langley Federal Credit Union (LFCU)";
            case "MSCU" -> "Maine State Credit Union (MSCU)";
            case "MACU" -> "Mountain American Credit Union (MACU)";
            case "NVG" -> "Navigant Credit Union (NVG)";
            case "NDFCU" -> "New Dimensions Federal Credit Union (NDFCU)";
            case "NWB" -> "Northwest Bank (NWB)";
            case "PNC" -> "PNC Bank (PNC)";
            case "SDC" -> "San Diego County Credit Union (SDC)";
            case "BSV" -> "The Bank of Southside Virginia (BSV)";
            case "WPC" -> "Wright-Patt Credit Union (WPC)";
            default -> throw new IllegalArgumentException("Unknown lender abbreviation: " + lenderAbbreviation);
        };
    }

    public static String toLenderAbbreviation(NonCaptiveLenders nonCaptiveLender) {
        return switch (nonCaptiveLender) {
            case ALLY_ALLY_BANK -> "ALLY";
            case ACA_AMERICAN_CREDIT_ACCEPTANCE -> "ACA";
            case BOFA_BANK_OF_AMERICA -> "BOFA";
            case CADFL_CADILLAC_FINANCIAL_LEASE -> "CADFL";
            case CHASE_CHASE_AUTO -> "CHASE";
            case DT6_DT_TEST_BALANCER -> "DT6";
            case SCF_DRIVEWAY_FINANCE_CORPORATION -> "SCF";
            case EXETER_EXETER_FINANCE -> "EXETER";
            case FIFS_FIRST_INVESTORS_FINANCIAL_SERVICES -> "FIFS";
            case GMFL_GM_FINANCIAL -> "GMFL";
            case GMFLCA_GM_FINANCIAL_LEASE_CANADA -> "GMFLCA";
            case GLS_GLOBAL_LENDING_SERVICES -> "GLS";
            case LAFSNC_LINCOLN_AUTOMOTIVE_FINANCIAL_SERVICES -> "LAFSNC";
            case RAC_REGIONAL_ACCEPTANCE -> "RAC";
            case RBC_ROYAL_BANK_OF_CANADA -> "RBC";
            case SANTCA_SANTANDER_CONSUMER_CANADA -> "SANTCA";
            case SANT_SANTANDER_CONSUMER_USA -> "SANT";
            case SFSL_STELLANTIS_FINANCIAL_SERVICES_LEASE -> "SFSL";
            case TDAUTO_TD_AUTO_FINANCE -> "TDAUTO";
            case HBAN_THE_HUNTINGTON_NATIONAL_BANK -> "HBAN";
            case TRICOR_TRICOR -> "TRICOR";
            case TRU_TRUIST_BANK -> "TRU";
            case USBANK_US_BANK -> "USBANK";
            case UAC_UNITED_AUTO_CREDIT -> "UAC";
            case VROOM_VROOM_FINANCIAL_SERVICES -> "VROOM";
            case WELLS_WELLS_FARGO -> "WELLS";
            case WEST_WESTLAKE_FINANCIAL_SERVICES -> "WEST";
            case WESTEX_WESTLAKE_FINANCIAL_SERVICES -> "WESTEX";
            case ADCU_ADVANCIAL_CREDIT_UNION -> "ADCU";
            case AMR_AMARILLO_NATIONAL_BANK -> "AMR";
            case AFCU_AMERICAS_FIRST_CREDIT_UNION -> "AFCU";
            case BMOCA_BANK_OF_MONTREAL -> "BMOCA";
            case CCCU_CALIFORNIA_COAST_CREDIT_UNION -> "CCCU";
            case CAP1_CAPITAL_ONE -> "CAP1";
            case CZN_CITIZENS_BANK -> "CZN";
            case COCU_COLUMBIA_CREDIT_UNION -> "COCU";
            case FCB_FIRST_COMMONWEALTH_BANK -> "FCB";
            case HCCU_HAPO_COMMUNITY_CREDIT_UNION -> "HCCU";
            case KEU_KEMBA_FINANCIAL_CREDIT_UNION -> "KEU";
            case KITCU_KITSAP_CREDIT_UNION -> "KITCU";
            case LDM_LANDMARK_CREDIT_UNION -> "LDM";
            case LFCU_LANGLEY_FEDERAL_CREDIT_UNION -> "LFCU";
            case MSCU_MAINE_STATE_CREDIT_UNION -> "MSCU";
            case MACU_MOUNTAIN_AMERICAN_CREDIT_UNION -> "MACU";
            case NVG_NAVIGANT_CREDIT_UNION -> "NVG";
            case NDFCU_NEW_DIMENSIONS_FEDERAL_CREDIT_UNION -> "NDFCU";
            case NWB_NORTHWEST_BANK -> "NWB";
            case PNC_PNC_BANK -> "PNC";
            case SDC_SAN_DIEGO_COUNTY_CREDIT_UNION -> "SDC";
            case BSV_THE_BANK_OF_SOUTHSIDE_VIRGINIA -> "BSV";
            case WPC_WRIGHT_PATT_CREDIT_UNION -> "WPC";
        };
    }

    public static NonCaptiveLenders toLenderEnum(String lenderAbbreviation) {
        return switch (lenderAbbreviation) {
            case "ALLY" -> ALLY_ALLY_BANK;
            case "ACA" -> ACA_AMERICAN_CREDIT_ACCEPTANCE;
            case "BOFA" -> BOFA_BANK_OF_AMERICA;
            case "CADFL" -> CADFL_CADILLAC_FINANCIAL_LEASE;
            case "CHASE" -> CHASE_CHASE_AUTO;
            case "DT6" -> DT6_DT_TEST_BALANCER;
            case "SCF" -> SCF_DRIVEWAY_FINANCE_CORPORATION;
            case "EXETER" -> EXETER_EXETER_FINANCE;
            case "FIFS" -> FIFS_FIRST_INVESTORS_FINANCIAL_SERVICES;
            case "GMFL" -> GMFL_GM_FINANCIAL;
            case "GMFLCA" -> GMFLCA_GM_FINANCIAL_LEASE_CANADA;
            case "GLS" -> GLS_GLOBAL_LENDING_SERVICES;
            case "LAFSNC" -> LAFSNC_LINCOLN_AUTOMOTIVE_FINANCIAL_SERVICES;
            case "RAC" -> RAC_REGIONAL_ACCEPTANCE;
            case "RBC" -> RBC_ROYAL_BANK_OF_CANADA;
            case "SANTCA" -> SANTCA_SANTANDER_CONSUMER_CANADA;
            case "SANT" -> SANT_SANTANDER_CONSUMER_USA;
            case "SFSL" -> SFSL_STELLANTIS_FINANCIAL_SERVICES_LEASE;
            case "TDAUTO" -> TDAUTO_TD_AUTO_FINANCE;
            case "HBAN" -> HBAN_THE_HUNTINGTON_NATIONAL_BANK;
            case "TRICOR" -> TRICOR_TRICOR;
            case "TRU" -> TRU_TRUIST_BANK;
            case "USBANK" -> USBANK_US_BANK;
            case "UAC" -> UAC_UNITED_AUTO_CREDIT;
            case "VROOM" -> VROOM_VROOM_FINANCIAL_SERVICES;
            case "WELLS" -> WELLS_WELLS_FARGO;
            case "WEST" -> WEST_WESTLAKE_FINANCIAL_SERVICES;
            case "WESTEX" -> WESTEX_WESTLAKE_FINANCIAL_SERVICES;
            case "ADCU" -> ADCU_ADVANCIAL_CREDIT_UNION;
            case "AMR" -> AMR_AMARILLO_NATIONAL_BANK;
            case "AFCU" -> AFCU_AMERICAS_FIRST_CREDIT_UNION;
            case "BMOCA" -> BMOCA_BANK_OF_MONTREAL;
            case "CCCU" -> CCCU_CALIFORNIA_COAST_CREDIT_UNION;
            case "CAP1" -> CAP1_CAPITAL_ONE;
            case "CZN" -> CZN_CITIZENS_BANK;
            case "COCU" -> COCU_COLUMBIA_CREDIT_UNION;
            case "FCB" -> FCB_FIRST_COMMONWEALTH_BANK;
            case "HCCU" -> HCCU_HAPO_COMMUNITY_CREDIT_UNION;
            case "KEU" -> KEU_KEMBA_FINANCIAL_CREDIT_UNION;
            case "KITCU" -> KITCU_KITSAP_CREDIT_UNION;
            case "LDM" -> LDM_LANDMARK_CREDIT_UNION;
            case "LFCU" -> LFCU_LANGLEY_FEDERAL_CREDIT_UNION;
            case "MSCU" -> MSCU_MAINE_STATE_CREDIT_UNION;
            case "MACU" -> MACU_MOUNTAIN_AMERICAN_CREDIT_UNION;
            case "NVG" -> NVG_NAVIGANT_CREDIT_UNION;
            case "NDFCU" -> NDFCU_NEW_DIMENSIONS_FEDERAL_CREDIT_UNION;
            case "NWB" -> NWB_NORTHWEST_BANK;
            case "PNC" -> PNC_PNC_BANK;
            case "SDC" -> SDC_SAN_DIEGO_COUNTY_CREDIT_UNION;
            case "BSV" -> BSV_THE_BANK_OF_SOUTHSIDE_VIRGINIA;
            case "WPC" -> WPC_WRIGHT_PATT_CREDIT_UNION;
            default -> throw new IllegalArgumentException("Unknown lender abbreviation: " + lenderAbbreviation);
        };
    }

}
