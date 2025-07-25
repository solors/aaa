package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lb0 implements InterfaceC30890mz<ExtendedNativeAdView> {
    @NotNull

    /* renamed from: a */
    private InterfaceC30890mz<ExtendedNativeAdView> f81768a;

    public lb0(@NotNull f31 nativeAdPrivate, @NotNull InterfaceC31308rq contentCloseListener, @NotNull InterfaceC30655js nativeAdEventListener, @NotNull C31223qn clickConnector, @NotNull jl1 reporter, @NotNull InterfaceC30890mz<ExtendedNativeAdView> divKitAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        Intrinsics.checkNotNullParameter(nativeAdEventListener, "nativeAdEventListener");
        Intrinsics.checkNotNullParameter(clickConnector, "clickConnector");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(divKitAdBinder, "divKitAdBinder");
        this.f81768a = divKitAdBinder;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView fullscreenNativeAdView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(fullscreenNativeAdView, "fullscreenNativeAdView");
        this.f81768a.mo26077a(fullscreenNativeAdView);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        this.f81768a.mo26075c();
    }
}
