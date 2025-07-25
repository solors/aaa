package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class og2 implements InterstitialAd {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30268es f83510a;
    @NotNull

    /* renamed from: b */
    private final lf2 f83511b;

    public og2(@NotNull InterfaceC30268es coreInterstitialAd, @NotNull lf2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreInterstitialAd, "coreInterstitialAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f83510a = coreInterstitialAd;
        this.f83511b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof og2) && Intrinsics.m17075f(((og2) obj).f83510a, this.f83510a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    @NotNull
    public final AdInfo getInfo() {
        lf2 lf2Var = this.f83511b;
        C30743kr info = this.f83510a.getInfo();
        lf2Var.getClass();
        return lf2.m32275a(info);
    }

    public final int hashCode() {
        return this.f83510a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(@Nullable InterstitialAdEventListener interstitialAdEventListener) {
        this.f83510a.mo34451a(new pg2(interstitialAdEventListener));
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f83510a.show(activity);
    }
}
