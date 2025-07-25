package com.yandex.mobile.ads.common;

import com.ironsource.mediationsdk.C20410l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import td.C44401b;
import td.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata
/* loaded from: classes8.dex */
public final class AdType {
    public static final AdType APP_OPEN_AD;
    public static final AdType BANNER;
    public static final AdType INTERSTITIAL;
    public static final AdType NATIVE;
    public static final AdType REWARDED;
    public static final AdType UNKNOWN;

    /* renamed from: b */
    private static final /* synthetic */ AdType[] f76563b;

    /* renamed from: c */
    private static final /* synthetic */ EnumEntries f76564c;

    static {
        AdType adType = new AdType(0, "UNKNOWN");
        UNKNOWN = adType;
        AdType adType2 = new AdType(1, C20410l.f51629a);
        BANNER = adType2;
        AdType adType3 = new AdType(2, "INTERSTITIAL");
        INTERSTITIAL = adType3;
        AdType adType4 = new AdType(3, "REWARDED");
        REWARDED = adType4;
        AdType adType5 = new AdType(4, "NATIVE");
        NATIVE = adType5;
        AdType adType6 = new AdType(5, "APP_OPEN_AD");
        APP_OPEN_AD = adType6;
        AdType[] adTypeArr = {adType, adType2, adType3, adType4, adType5, adType6};
        f76563b = adTypeArr;
        f76564c = C44401b.m3113a(adTypeArr);
    }

    private AdType(int i, String str) {
    }

    @NotNull
    public static EnumEntries<AdType> getEntries() {
        return f76564c;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) f76563b.clone();
    }
}
