package com.autofi.di.qa.automation.resources.lioness.dealerportal.components.dealers;

/*
    Captive Lenders as of 21 June 2024:
    ====================
    Acura Finance Services (AFS)
    Audi Financial Services (AUDI)
    BMW Financial Services (BMW)
    Cadillac Financial (CADF)
    Chrysler Capital (CCAF)
    Ford Credit (FMCA)
    Ford Motor Credit Company (FMCC)
    Ford Motor Credit Company (FMCCCOX)
    GM Financial (GMF)
    GM Financial Canada (GMFCA)
    Genesis Finance (GFS)
    Honda Financial Services (HFS)
    Hyundai Motor Finance (HMF)
    Infiniti Financial Services (IFS)
    Jaguar Financial Group (JFG)
    Kia Motor Finance Canada (KMFC)
    Kia Motors Finance (KMF)
    Land Rover Financial Group (LRFG)
    Lexus National Financial Services (LFS)
    Lincoln Automotive Financial Services (LAFC)
    Lincoln Automotive Financial Services (LAFS)
    Maserati Capital USA (MAS)
    Mazda Financial Services (MAZ)
    Mercedes Benz Financial Services (MFS)
    Mini Financial Service (MINI)
    Mitsubishi Motors of North America (MMCA)
    Nissan Motor Acceptance Corporation (NMAC)
    Porsche Financial Services (PFS)
    Southeast Toyota Finance (SETF)
    Southeast Toyota Finance (SETFCOX)
    Stellantis Financial Services (SFS)
    Subaru Financial Services Canada (SFSC)
    Subaru Motors Finance (SMF)
    Toyota Financial Services (TFS)
    Volkswagen Credit of America (VCA)
    Volvo Car Financial Services (VCFS)
    None (NONE)
    */
public enum CaptiveLenders {
    ACURA_AFS, AUDI_AUDI, BMW_BMW, CADILLAC_CADF, CHRYSLER_CCAF,
    FORD_FMCA, FORD_FMCC, FORD_FMCCCOX, GM_GMF, GM_GMFCA, GENESIS_GFS,
    HONDA_HFS, HYUNDAI_HMF, INFINITI_IFS, JAGUAR_JFG, KIA_KMFC, KIA_KMF,
    LANDROVER_LRFG, LEXUS_LFS, LINCOLN_LAFC, LINCOLN_LAFS, MASERATI_MAS,
    MAZDA_MAZ, MERCEDESBENZ_MFS, MINI_MINI, MITSUBISHI_MMCA, NISSAN_NMAC,
    PORSCHE_PFS, TOYOTA_SETF, TOYOTA_SETFCOX, STELLANTIS_SFS,
    SUBARU_SFSC, SUBARU_SMF, TOYOTA_TFS, VOLKSWAGEN_VCA, VOLVO_VCFS, NONE;
    
    public static String toLenderName(CaptiveLenders captiveLender) {
        return switch(captiveLender) {
            case ACURA_AFS -> "Acura Finance Services";
            case AUDI_AUDI -> "Audi Financial Services";
            case BMW_BMW -> "BMW Financial Services";
            case CADILLAC_CADF -> "Cadillac Financial";
            case CHRYSLER_CCAF -> "Chrysler Capital";
            case FORD_FMCA -> "Ford Credit";
            case FORD_FMCC -> "Ford Motor Credit Company";
            case FORD_FMCCCOX -> "Ford Motor Credit Company";
            case GM_GMF -> "GM Financial";
            case GM_GMFCA -> "GM Financial Canada";
            case GENESIS_GFS -> "Genesis Finance";
            case HONDA_HFS -> "Honda Financial Services";
            case HYUNDAI_HMF -> "Hyundai Motor Finance";
            case INFINITI_IFS -> "Infiniti Financial Services";
            case JAGUAR_JFG -> "Jaguar Financial Group";
            case KIA_KMFC -> "Kia Motor Finance Canada";
            case KIA_KMF -> "Kia Motors Finance";
            case LANDROVER_LRFG -> "Land Rover Financial Group";
            case LEXUS_LFS -> "Lexus National Financial Services";
            case LINCOLN_LAFC -> "Lincoln Automotive Financial Services";
            case LINCOLN_LAFS -> "Lincoln Automotive Financial Services";
            case MASERATI_MAS -> "Maserati Capital USA";
            case MAZDA_MAZ -> "Mazda Financial Services";
            case MERCEDESBENZ_MFS -> "Mercedes Benz Financial Services";
            case MINI_MINI -> "Mini Financial Service";
            case MITSUBISHI_MMCA -> "Mitsubishi Motors of North America";
            case NISSAN_NMAC -> "Nissan Motor Acceptance Corporation";
            case PORSCHE_PFS -> "Porsche Financial Services";
            case TOYOTA_SETF -> "Southeast Toyota Finance";
            case TOYOTA_SETFCOX -> "Southeast Toyota Finance";
            case STELLANTIS_SFS -> "Stellantis Financial Services";
            case SUBARU_SFSC -> "Subaru Financial Services Canada";
            case SUBARU_SMF -> "Subaru Motors Finance";
            case TOYOTA_TFS -> "Toyota Financial Services";
            case VOLKSWAGEN_VCA -> "Volkswagen Credit of America";
            case VOLVO_VCFS -> "Volvo Car Financial Services";
            case NONE -> "None";
        };
    }

    public static String toLenderAbbreviation(CaptiveLenders captiveLender) {
        return switch (captiveLender) {
            case ACURA_AFS -> "AFS";
            case AUDI_AUDI -> "AUDI";
            case BMW_BMW -> "BMW";
            case CADILLAC_CADF -> "CADF";
            case CHRYSLER_CCAF -> "CCAF";
            case FORD_FMCA -> "FMCA";
            case FORD_FMCC -> "FMCC";
            case FORD_FMCCCOX -> "FMCCCOX";
            case GM_GMF -> "GMF";
            case GM_GMFCA -> "GMFCA";
            case GENESIS_GFS -> "GFS";
            case HONDA_HFS -> "HFS";
            case HYUNDAI_HMF -> "HMF";
            case INFINITI_IFS -> "IFS";
            case JAGUAR_JFG -> "JFG";
            case KIA_KMFC -> "KMFC";
            case KIA_KMF -> "KMF";
            case LANDROVER_LRFG -> "LRFG";
            case LEXUS_LFS -> "LFS";
            case LINCOLN_LAFC -> "LAFC";
            case LINCOLN_LAFS -> "LAFS";
            case MASERATI_MAS -> "MAS";
            case MAZDA_MAZ -> "MAZ";
            case MERCEDESBENZ_MFS -> "MFS";
            case MINI_MINI -> "MINI";
            case MITSUBISHI_MMCA -> "MMCA";
            case NISSAN_NMAC -> "NMAC";
            case PORSCHE_PFS -> "PFS";
            case TOYOTA_SETF -> "SETF";
            case TOYOTA_SETFCOX -> "SETFCOX";
            case STELLANTIS_SFS -> "SFS";
            case SUBARU_SFSC -> "SFSC";
            case SUBARU_SMF -> "SMF";
            case TOYOTA_TFS -> "TFS";
            case VOLKSWAGEN_VCA -> "VCA";
            case VOLVO_VCFS -> "VCFS";
            case NONE -> "NONE";
        };
    }
}
