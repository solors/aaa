package com.yandex.mobile.ads.impl;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class dh2 implements RewardedAd {
    @NotNull

    /* renamed from: a */
    private final InterfaceC31838xs f78141a;
    @NotNull

    /* renamed from: b */
    private final lf2 f78142b;

    public dh2(@NotNull InterfaceC31838xs coreRewardedAd, @NotNull lf2 adInfoConverter) {
        Intrinsics.checkNotNullParameter(coreRewardedAd, "coreRewardedAd");
        Intrinsics.checkNotNullParameter(adInfoConverter, "adInfoConverter");
        this.f78141a = coreRewardedAd;
        this.f78142b = adInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof dh2) && Intrinsics.m17075f(((dh2) obj).f78141a, this.f78141a)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    @NotNull
    public final AdInfo getInfo() {
        lf2 lf2Var = this.f78142b;
        C30743kr info = this.f78141a.getInfo();
        lf2Var.getClass();
        return lf2.m32275a(info);
    }

    public final int hashCode() {
        return this.f78141a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(@Nullable RewardedAdEventListener rewardedAdEventListener) {
        this.f78141a.mo27414a(new eh2(rewardedAdEventListener));
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f78141a.show(activity);
    }
}
