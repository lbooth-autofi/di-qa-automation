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
    // Southeast Toyota Finance (SETF)
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
    AFS_ACURA,
    AUDI_AUDI,
    BMW_BMW,
    CADF_CADILLAC,
    CCAF_CHRYSLER,
    FMCA_FORD,
    FMCC_FORD,
    FMCCCOX_FORD,
    GMF_GM,
    GMFCA_GM,
    GFS_GENESIS,
    HFS_HONDA,
    HMF_HYUNDAI,
    IFS_INFINITI,
    JFG_JAGUAR,
    KMFC_KIA,
    KMF_KIA,
    LRFG_LANDROVER,
    LFS_LEXUS,
    LAFC_LINCOLN,
    LAFS_LINCOLN,
    MAS_MASERATI,
    MAZ_MAZDA,
    MFS_MERCEDESBENZ,
    MINI_MINI,
    MMCA_MITSUBISHI,
    NMAC_NISSAN,
    PFS_PORSCHE,
    // SETF_TOYOTA,
    SETFCOX_TOYOTA,
    SFS_STELLANTIS,
    SFSC_SUBARU,
    SMF_SUBARU,
    TFS_TOYOTA,
    VCA_VOLKSWAGEN,
    VCFS_VOLVO,
    NONE;
    
    public static String toLenderLabel(CaptiveLenders captiveLender) {
        return switch(captiveLender) {
            case AFS_ACURA -> "Acura Finance Services (AFS)";
            case AUDI_AUDI -> "Audi Financial Services (AUDI)";
            case BMW_BMW -> "BMW Financial Services (BMW)";
            case CADF_CADILLAC -> "Cadillac Financial (CADF)";
            case CCAF_CHRYSLER -> "Chrysler Capital (CCAF)";
            case FMCA_FORD -> "Ford Credit (FMCA)";
            case FMCC_FORD -> "Ford Motor Credit Company (FMCC)";
            case FMCCCOX_FORD -> "Ford Motor Credit Company (FMCCCOX)";
            case GMF_GM -> "GM Financial (GMF)";
            case GMFCA_GM -> "GM Financial Canada (GMFCA)";
            case GFS_GENESIS -> "Genesis Finance (GFS)";
            case HFS_HONDA -> "Honda Financial Services (HFS)";
            case HMF_HYUNDAI -> "Hyundai Motor Finance (HMF)";
            case IFS_INFINITI -> "Infiniti Financial Services (IFS)";
            case JFG_JAGUAR -> "Jaguar Financial Group (JFG)";
            case KMFC_KIA -> "Kia Motor Finance Canada (KMFC)";
            case KMF_KIA -> "Kia Motors Finance (KMF)";
            case LRFG_LANDROVER -> "Land Rover Financial Group (LRFG)";
            case LFS_LEXUS -> "Lexus National Financial Services (LFS)";
            case LAFC_LINCOLN -> "Lincoln Automotive Financial Services (LAFC)";
            case LAFS_LINCOLN -> "Lincoln Automotive Financial Services (LAFS)";
            case MAS_MASERATI -> "Maserati Capital USA (MAS)";
            case MAZ_MAZDA -> "Mazda Financial Services (MAZ)";
            case MFS_MERCEDESBENZ -> "Mercedes Benz Financial Services (MFS)";
            case MINI_MINI -> "Mini Financial Service (MINI)";
            case MMCA_MITSUBISHI -> "Mitsubishi Motors of North America (MMCA)";
            case NMAC_NISSAN -> "Nissan Motor Acceptance Corporation (NMAC)";
            case PFS_PORSCHE -> "Porsche Financial Services (PFS)";
            // case SETF_TOYOTA -> "Southeast Toyota Finance (SETF)";
            case SETFCOX_TOYOTA -> "Southeast Toyota Finance (SETFCOX)";
            case SFS_STELLANTIS -> "Stellantis Financial Services (SFS)";
            case SFSC_SUBARU -> "Subaru Financial Services Canada (SFSC)";
            case SMF_SUBARU -> "Subaru Motors Finance (SMF)";
            case TFS_TOYOTA -> "Toyota Financial Services (TFS)";
            case VCA_VOLKSWAGEN -> "Volkswagen Credit of America (VCA)";
            case VCFS_VOLVO -> "Volvo Car Financial Services (VCFS)";
            case NONE -> "None (NONE)";
        };
    }

    public static String toLenderLabel(String lenderAbbreviation) {
        return switch (lenderAbbreviation) {
            case "AFS" -> "Acura Finance Services (AFS)";
            case "AUDI" -> "Audi Financial Services (AUDI)";
            case "BMW" -> "BMW Financial Services (BMW)";
            case "CADF" -> "Cadillac Financial (CADF)";
            case "CCAF" -> "Chrysler Capital (CCAF)";
            case "FMCA" -> "Ford Credit (FMCA)";
            case "FMCC" -> "Ford Motor Credit Company (FMCC)";
            case "FMCCCOX" -> "Ford Motor Credit Company (FMCCCOX)";
            case "GMF" -> "GM Financial (GMF)";
            case "GMFCA" -> "GM Financial Canada (GMFCA)";
            case "GFS" -> "Genesis Finance (GFS)";
            case "HFS" -> "Honda Financial Services (HFS)";
            case "HMF" -> "Hyundai Motor Finance (HMF)";
            case "IFS" -> "Infiniti Financial Services (IFS)";
            case "JFG" -> "Jaguar Financial Group (JFG)";
            case "KMFC" -> "Kia Motor Finance Canada (KMFC)";
            case "KMF" -> "Kia Motors Finance (KMF)";
            case "LRFG" -> "Land Rover Financial Group (LRFG)";
            case "LFS" -> "Lexus National Financial Services (LFS)";
            case "LAFC" -> "Lincoln Automotive Financial Services (LAFC)";
            case "LAFS" -> "Lincoln Automotive Financial Services (LAFS)";
            case "MAS" -> "Maserati Capital USA (MAS)";
            case "MAZ" -> "Mazda Financial Services (MAZ)";
            case "MFS" -> "Mercedes Benz Financial Services (MFS)";
            case "MINI" -> "Mini Financial Service (MINI)";
            case "MMCA" -> "Mitsubishi Motors of North America (MMCA)";
            case "NMAC" -> "Nissan Motor Acceptance Corporation (NMAC)";
            case "PFS" -> "Porsche Financial Services (PFS)";
            // case "SETF" -> "Southeast Toyota Finance (SETF)";
            case "SETFCOX" -> "Southeast Toyota Finance (SETFCOX)";
            case "SFS" -> "Stellantis Financial Services (SFS)";
            case "SFSC" -> "Subaru Financial Services Canada (SFSC)";
            case "SMF" -> "Subaru Motors Finance (SMF)";
            case "TFS" -> "Toyota Financial Services (TFS)";
            case "VCA" -> "Volkswagen Credit of America (VCA)";
            case "VCFS" -> "Volvo Car Financial Services (VCFS)";
            case "NONE" -> "None (NONE)";
            default -> throw new IllegalArgumentException("Unknown lender abbreviation: " + lenderAbbreviation);
        };
    }

    public static String toLenderAbbreviation(CaptiveLenders captiveLender) {
        return switch (captiveLender) {
            case AFS_ACURA -> "AFS";
            case AUDI_AUDI -> "AUDI";
            case BMW_BMW -> "BMW";
            case CADF_CADILLAC -> "CADF";
            case CCAF_CHRYSLER -> "CCAF";
            case FMCA_FORD -> "FMCA";
            case FMCC_FORD -> "FMCC";
            case FMCCCOX_FORD -> "FMCCCOX";
            case GMF_GM -> "GMF";
            case GMFCA_GM -> "GMFCA";
            case GFS_GENESIS -> "GFS";
            case HFS_HONDA -> "HFS";
            case HMF_HYUNDAI -> "HMF";
            case IFS_INFINITI -> "IFS";
            case JFG_JAGUAR -> "JFG";
            case KMFC_KIA -> "KMFC";
            case KMF_KIA -> "KMF";
            case LRFG_LANDROVER -> "LRFG";
            case LFS_LEXUS -> "LFS";
            case LAFC_LINCOLN -> "LAFC";
            case LAFS_LINCOLN -> "LAFS";
            case MAS_MASERATI -> "MAS";
            case MAZ_MAZDA -> "MAZ";
            case MFS_MERCEDESBENZ -> "MFS";
            case MINI_MINI -> "MINI";
            case MMCA_MITSUBISHI -> "MMCA";
            case NMAC_NISSAN -> "NMAC";
            case PFS_PORSCHE -> "PFS";
            // case SETF_TOYOTA -> "SETF";
            case SETFCOX_TOYOTA -> "SETFCOX";
            case SFS_STELLANTIS -> "SFS";
            case SFSC_SUBARU -> "SFSC";
            case SMF_SUBARU -> "SMF";
            case TFS_TOYOTA -> "TFS";
            case VCA_VOLKSWAGEN -> "VCA";
            case VCFS_VOLVO -> "VCFS";
            case NONE -> "NONE";
        };
    }
    
    public static CaptiveLenders toLenderEnum(String lenderAbbreviation) {
        return switch (lenderAbbreviation.toUpperCase().trim()) {
            case "AFS" -> AFS_ACURA;
            case "AUDI" -> AUDI_AUDI;
            case "BMW" -> BMW_BMW;
            case "CADF" -> CADF_CADILLAC;
            case "CCAF" -> CCAF_CHRYSLER;
            case "FMCA" -> FMCA_FORD;
            case "FMCC" -> FMCC_FORD;
            case "FMCCCOX" -> FMCCCOX_FORD;
            case "GMF" -> GMF_GM;
            case "GMFCA" -> GMFCA_GM;
            case "GFS" -> GFS_GENESIS;
            case "HFS" -> HFS_HONDA;
            case "HMF" -> HMF_HYUNDAI;
            case "IFS" -> IFS_INFINITI;
            case "JFG" -> JFG_JAGUAR;
            case "KMFC" -> KMFC_KIA;
            case "KMF" -> KMF_KIA;
            case "LRFG" -> LRFG_LANDROVER;
            case "LFS" -> LFS_LEXUS;
            case "LAFC" -> LAFC_LINCOLN;
            case "LAFS" -> LAFS_LINCOLN;
            case "MAS" -> MAS_MASERATI;
            case "MAZ" -> MAZ_MAZDA;
            case "MFS" -> MFS_MERCEDESBENZ;
            case "MINI" -> MINI_MINI;
            case "MMCA" -> MMCA_MITSUBISHI;
            case "NMAC" -> NMAC_NISSAN;
            case "PFS" -> PFS_PORSCHE;
            // case "SETF" -> SETF_TOYOTA;
            case "SETFCOX" -> SETFCOX_TOYOTA;
            case "SFS" -> SFS_STELLANTIS;
            case "SFSC" -> SFSC_SUBARU;
            case "SMF" -> SMF_SUBARU;
            case "TFS" -> TFS_TOYOTA;
            case "VCA" -> VCA_VOLKSWAGEN;
            case "VCFS" -> VCFS_VOLVO;
            case "NONE" -> NONE;
            default -> throw new IllegalArgumentException("Unknown lender abbreviation: " + lenderAbbreviation);
        };
    }
}
