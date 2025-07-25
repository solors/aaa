package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hm1 implements InterfaceC30890mz<ExtendedNativeAdView> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC30355g1 f80120a;

    /* renamed from: b */
    private final int f80121b;

    public hm1(@NotNull InterfaceC30355g1 adActivityListener, int i) {
        Intrinsics.checkNotNullParameter(adActivityListener, "adActivityListener");
        this.f80120a = adActivityListener;
        this.f80121b = i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        if (this.f80121b == 1) {
            this.f80120a.mo31194a(7);
        } else {
            this.f80120a.mo31194a(6);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
    }
}
