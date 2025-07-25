package com.amazon.aps.ads.model;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum GOOGLE_AD_MANAGER uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class ApsAdNetwork {
    private static final /* synthetic */ ApsAdNetwork[] $VALUES;
    public static final ApsAdNetwork ADMOB;
    public static final ApsAdNetwork AD_GENERATION;
    public static final ApsAdNetwork CUSTOM_MEDIATION;
    public static final ApsAdNetwork GOOGLE_AD_MANAGER;
    public static final ApsAdNetwork MAX;
    public static final ApsAdNetwork NIMBUS;
    public static final ApsAdNetwork OTHER;
    public static final ApsAdNetwork UNITY_LEVELPLAY;
    ApsAdNetworkType networkType;

    static {
        ApsAdNetworkType apsAdNetworkType = ApsAdNetworkType.ADSERVER;
        ApsAdNetwork apsAdNetwork = new ApsAdNetwork("GOOGLE_AD_MANAGER", 0, apsAdNetworkType);
        GOOGLE_AD_MANAGER = apsAdNetwork;
        ApsAdNetworkType apsAdNetworkType2 = ApsAdNetworkType.MEDIATION;
        ApsAdNetwork apsAdNetwork2 = new ApsAdNetwork("ADMOB", 1, apsAdNetworkType2);
        ADMOB = apsAdNetwork2;
        ApsAdNetwork apsAdNetwork3 = new ApsAdNetwork("AD_GENERATION", 2, apsAdNetworkType);
        AD_GENERATION = apsAdNetwork3;
        ApsAdNetwork apsAdNetwork4 = new ApsAdNetwork("UNITY_LEVELPLAY", 3, apsAdNetworkType2);
        UNITY_LEVELPLAY = apsAdNetwork4;
        ApsAdNetwork apsAdNetwork5 = new ApsAdNetwork("MAX", 4, apsAdNetworkType2);
        MAX = apsAdNetwork5;
        ApsAdNetwork apsAdNetwork6 = new ApsAdNetwork("NIMBUS", 5, apsAdNetworkType);
        NIMBUS = apsAdNetwork6;
        ApsAdNetwork apsAdNetwork7 = new ApsAdNetwork("OTHER", 6, ApsAdNetworkType.OTHER);
        OTHER = apsAdNetwork7;
        ApsAdNetwork apsAdNetwork8 = new ApsAdNetwork("CUSTOM_MEDIATION", 7, apsAdNetworkType2);
        CUSTOM_MEDIATION = apsAdNetwork8;
        $VALUES = new ApsAdNetwork[]{apsAdNetwork, apsAdNetwork2, apsAdNetwork3, apsAdNetwork4, apsAdNetwork5, apsAdNetwork6, apsAdNetwork7, apsAdNetwork8};
    }

    private ApsAdNetwork(String str, int i, ApsAdNetworkType apsAdNetworkType) {
        this.networkType = apsAdNetworkType;
    }

    public static ApsAdNetwork valueOf(String str) {
        return (ApsAdNetwork) Enum.valueOf(ApsAdNetwork.class, str);
    }

    public static ApsAdNetwork[] values() {
        return (ApsAdNetwork[]) $VALUES.clone();
    }

    protected boolean isMediation() {
        return this.networkType.equals(ApsAdNetworkType.MEDIATION);
    }
}
