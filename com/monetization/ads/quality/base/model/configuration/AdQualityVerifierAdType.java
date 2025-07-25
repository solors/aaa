package com.monetization.ads.quality.base.model.configuration;

import com.ironsource.mediationsdk.C20410l;
import kotlin.Metadata;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes7.dex */
public final class AdQualityVerifierAdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdQualityVerifierAdType[] $VALUES;
    public static final AdQualityVerifierAdType BANNER;
    public static final AdQualityVerifierAdType INTERSTITIAL;
    public static final AdQualityVerifierAdType NATIVE;
    public static final AdQualityVerifierAdType REWARDED;

    static {
        AdQualityVerifierAdType adQualityVerifierAdType = new AdQualityVerifierAdType(0, C20410l.f51629a);
        BANNER = adQualityVerifierAdType;
        AdQualityVerifierAdType adQualityVerifierAdType2 = new AdQualityVerifierAdType(1, "INTERSTITIAL");
        INTERSTITIAL = adQualityVerifierAdType2;
        AdQualityVerifierAdType adQualityVerifierAdType3 = new AdQualityVerifierAdType(2, "REWARDED");
        REWARDED = adQualityVerifierAdType3;
        AdQualityVerifierAdType adQualityVerifierAdType4 = new AdQualityVerifierAdType(3, "NATIVE");
        NATIVE = adQualityVerifierAdType4;
        AdQualityVerifierAdType[] adQualityVerifierAdTypeArr = {adQualityVerifierAdType, adQualityVerifierAdType2, adQualityVerifierAdType3, adQualityVerifierAdType4};
        $VALUES = adQualityVerifierAdTypeArr;
        $ENTRIES = C44401b.m3113a(adQualityVerifierAdTypeArr);
    }

    private AdQualityVerifierAdType(int i, String str) {
    }

    public static AdQualityVerifierAdType valueOf(String str) {
        return (AdQualityVerifierAdType) Enum.valueOf(AdQualityVerifierAdType.class, str);
    }

    public static AdQualityVerifierAdType[] values() {
        return (AdQualityVerifierAdType[]) $VALUES.clone();
    }
}
