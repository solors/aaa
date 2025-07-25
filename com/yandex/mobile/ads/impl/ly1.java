package com.yandex.mobile.ads.impl;

import com.monetization.ads.common.AdImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ly1 implements InterfaceC30655js {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30655js f81970a;

    public ly1(@NotNull InterfaceC30655js nativeAdEventListener) {
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        this.f81970a = nativeAdEventListener;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void closeNativeAd() {
        this.f81970a.closeNativeAd();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onAdClicked() {
        this.f81970a.onAdClicked();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onLeftApplication() {
        this.f81970a.onLeftApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    public final void onReturnedToApplication() {
        this.f81970a.onReturnedToApplication();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30655js
    /* renamed from: a */
    public final void mo26241a(@Nullable AdImpressionData adImpressionData) {
    }
}
