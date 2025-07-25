package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j60 {

    /* renamed from: c */
    public static final j60 f80761c;

    /* renamed from: d */
    public static final j60 f80762d;

    /* renamed from: e */
    public static final j60 f80763e;

    /* renamed from: f */
    public static final j60 f80764f;

    /* renamed from: g */
    private static final /* synthetic */ j60[] f80765g;
    @NotNull

    /* renamed from: b */
    private final String f80766b;

    static {
        j60 j60Var = new j60(0, "AD_POD_SKIP", "AdPodSkipFeatureToggle");
        j60 j60Var2 = new j60(1, "INTERSTITIAL_PRELOADING", "InterstitialPreloading");
        j60 j60Var3 = new j60(2, "REWARDED_PRELOADING", "RewardedPreloading");
        j60 j60Var4 = new j60(3, "FIRST_VIDEO_PRELOADING_STRATEGY", "FirstVideoPreloadingStrategyFeatureToggle");
        f80761c = j60Var4;
        j60 j60Var5 = new j60(4, "TESTING_NEW_ADAPTER", "TestingNewAdapterFeatureToggle");
        f80762d = j60Var5;
        j60 j60Var6 = new j60(5, "FALLBACK_FOR_VIDEO", "FallbackForVideoFeatureToggle");
        f80763e = j60Var6;
        j60 j60Var7 = new j60(6, "AD_QUALITY_VERIFICATION", "AdQualityVerificationFeatureToggle");
        f80764f = j60Var7;
        j60[] j60VarArr = {j60Var, j60Var2, j60Var3, j60Var4, j60Var5, j60Var6, j60Var7};
        f80765g = j60VarArr;
        C44401b.m3113a(j60VarArr);
    }

    private j60(int i, String str, String str2) {
        this.f80766b = str2;
    }

    public static j60 valueOf(String str) {
        return (j60) Enum.valueOf(j60.class, str);
    }

    public static j60[] values() {
        return (j60[]) f80765g.clone();
    }

    @NotNull
    /* renamed from: a */
    public final String m33038a() {
        return this.f80766b;
    }
}
