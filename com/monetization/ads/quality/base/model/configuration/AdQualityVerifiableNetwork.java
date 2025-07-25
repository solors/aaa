package com.monetization.ads.quality.base.model.configuration;

import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerifiableNetwork {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdQualityVerifiableNetwork[] $VALUES;
    public static final AdQualityVerifiableNetwork ADCOLONY;
    public static final AdQualityVerifiableNetwork ADMOB;
    public static final AdQualityVerifiableNetwork APPLOVIN;
    public static final AdQualityVerifiableNetwork APPLOVINMAX;
    public static final AdQualityVerifiableNetwork BIGOADS;
    public static final AdQualityVerifiableNetwork CHARTBOOST;
    public static final AdQualityVerifiableNetwork GOOGLE;
    public static final AdQualityVerifiableNetwork INMOBI;
    public static final AdQualityVerifiableNetwork IRONSOURCE;
    public static final AdQualityVerifiableNetwork MINTEGRAL;
    public static final AdQualityVerifiableNetwork MYTARGET;
    public static final AdQualityVerifiableNetwork PANGLE;
    public static final AdQualityVerifiableNetwork TAPJOY;
    public static final AdQualityVerifiableNetwork UNITYADS;
    public static final AdQualityVerifiableNetwork VUNGLE;
    public static final AdQualityVerifiableNetwork YANDEX;

    static {
        AdQualityVerifiableNetwork adQualityVerifiableNetwork = new AdQualityVerifiableNetwork(0, "ADCOLONY");
        ADCOLONY = adQualityVerifiableNetwork;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork2 = new AdQualityVerifiableNetwork(1, "APPLOVIN");
        APPLOVIN = adQualityVerifiableNetwork2;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork3 = new AdQualityVerifiableNetwork(2, "APPLOVINMAX");
        APPLOVINMAX = adQualityVerifiableNetwork3;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork4 = new AdQualityVerifiableNetwork(3, "BIGOADS");
        BIGOADS = adQualityVerifiableNetwork4;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork5 = new AdQualityVerifiableNetwork(4, "CHARTBOOST");
        CHARTBOOST = adQualityVerifiableNetwork5;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork6 = new AdQualityVerifiableNetwork(5, "GOOGLE");
        GOOGLE = adQualityVerifiableNetwork6;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork7 = new AdQualityVerifiableNetwork(6, "ADMOB");
        ADMOB = adQualityVerifiableNetwork7;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork8 = new AdQualityVerifiableNetwork(7, "INMOBI");
        INMOBI = adQualityVerifiableNetwork8;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork9 = new AdQualityVerifiableNetwork(8, "IRONSOURCE");
        IRONSOURCE = adQualityVerifiableNetwork9;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork10 = new AdQualityVerifiableNetwork(9, "MINTEGRAL");
        MINTEGRAL = adQualityVerifiableNetwork10;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork11 = new AdQualityVerifiableNetwork(10, "MYTARGET");
        MYTARGET = adQualityVerifiableNetwork11;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork12 = new AdQualityVerifiableNetwork(11, "PANGLE");
        PANGLE = adQualityVerifiableNetwork12;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork13 = new AdQualityVerifiableNetwork(12, "TAPJOY");
        TAPJOY = adQualityVerifiableNetwork13;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork14 = new AdQualityVerifiableNetwork(13, "UNITYADS");
        UNITYADS = adQualityVerifiableNetwork14;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork15 = new AdQualityVerifiableNetwork(14, "VUNGLE");
        VUNGLE = adQualityVerifiableNetwork15;
        AdQualityVerifiableNetwork adQualityVerifiableNetwork16 = new AdQualityVerifiableNetwork(15, "YANDEX");
        YANDEX = adQualityVerifiableNetwork16;
        AdQualityVerifiableNetwork[] adQualityVerifiableNetworkArr = {adQualityVerifiableNetwork, adQualityVerifiableNetwork2, adQualityVerifiableNetwork3, adQualityVerifiableNetwork4, adQualityVerifiableNetwork5, adQualityVerifiableNetwork6, adQualityVerifiableNetwork7, adQualityVerifiableNetwork8, adQualityVerifiableNetwork9, adQualityVerifiableNetwork10, adQualityVerifiableNetwork11, adQualityVerifiableNetwork12, adQualityVerifiableNetwork13, adQualityVerifiableNetwork14, adQualityVerifiableNetwork15, adQualityVerifiableNetwork16};
        $VALUES = adQualityVerifiableNetworkArr;
        $ENTRIES = C44401b.m3113a(adQualityVerifiableNetworkArr);
    }

    private AdQualityVerifiableNetwork(int i, String str) {
    }

    public static AdQualityVerifiableNetwork valueOf(String str) {
        return (AdQualityVerifiableNetwork) Enum.valueOf(AdQualityVerifiableNetwork.class, str);
    }

    public static AdQualityVerifiableNetwork[] values() {
        return (AdQualityVerifiableNetwork[]) $VALUES.clone();
    }
}
