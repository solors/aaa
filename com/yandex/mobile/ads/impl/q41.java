package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q41 implements InterfaceC30655js {
    @NotNull

    /* renamed from: a */
    private final C30249ei f84226a;

    public q41(@NotNull C30249ei adViewController) {
        Intrinsics.checkNotNullParameter(adViewController, "adViewController");
        this.f84226a = adViewController;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    /* renamed from: a */
    public final void mo26241a(@Nullable AdImpressionData adImpressionData) {
        this.f84226a.mo29602a(adImpressionData);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void closeNativeAd() {
        this.f84226a.m34572A();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onLeftApplication() {
        this.f84226a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onReturnedToApplication() {
        this.f84226a.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onAdClicked() {
    }
}
