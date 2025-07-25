package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.appopenad.AppOpenAd;
import com.yandex.mobile.ads.appopenad.AppOpenAdEventListener;
import com.yandex.mobile.ads.common.AdInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rf2 implements AppOpenAd {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30878mr f84743a;
    @NotNull

    /* renamed from: b */
    private final lf2 f84744b;

    public rf2(@NotNull InterfaceC30878mr coreAppOpenAd, @NotNull lf2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreAppOpenAd, "coreAppOpenAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f84743a = coreAppOpenAd;
        this.f84744b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof rf2) && Intrinsics.m17075f(((rf2) obj).f84743a, this.f84743a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    @NotNull
    public final AdInfo getInfo() {
        lf2 lf2Var = this.f84744b;
        C30743kr info = this.f84743a.getInfo();
        lf2Var.getClass();
        return lf2.m32275a(info);
    }

    public final int hashCode() {
        return this.f84743a.hashCode();
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void setAdEventListener(@Nullable AppOpenAdEventListener appOpenAdEventListener) {
        this.f84743a.mo31869a(new sf2(appOpenAdEventListener));
    }

    @Override // com.yandex.mobile.ads.appopenad.AppOpenAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f84743a.show(activity);
    }
}
