package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nb0 implements jb0 {
    @NotNull

    /* renamed from: a */
    private final mo0<ExtendedNativeAdView> f82656a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC31308rq f82657b;

    public nb0(@NotNull mo0<ExtendedNativeAdView> layoutDesignsController, @NotNull InterfaceC31308rq contentCloseListener) {
        Intrinsics.checkNotNullParameter(layoutDesignsController, "layoutDesignsController");
        Intrinsics.checkNotNullParameter(contentCloseListener, "contentCloseListener");
        this.f82656a = layoutDesignsController;
        this.f82657b = contentCloseListener;
    }

    @Override // com.yandex.mobile.ads.impl.jb0
    /* renamed from: c */
    public final void mo31623c() {
        if (!this.f82656a.m31889a()) {
            this.f82657b.mo27153f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.jb0
    public final void invalidate() {
        this.f82656a.m31888b();
    }
}
