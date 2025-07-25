package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.nativeads.MediatedNativeAd;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class dw0 implements o81 {
    @NotNull

    /* renamed from: a */
    private final MediatedNativeAd f78260a;
    @NotNull

    /* renamed from: b */
    private final wv0 f78261b;
    @NotNull

    /* renamed from: c */
    private final o81 f78262c;

    public dw0(@NotNull MediatedNativeAd mediatedNativeAd, @NotNull wv0 mediatedNativeRenderingTracker, @NotNull o81 sdkAdFactory) {
        Intrinsics.checkNotNullParameter(mediatedNativeAd, "mediatedNativeAd");
        Intrinsics.checkNotNullParameter(mediatedNativeRenderingTracker, "mediatedNativeRenderingTracker");
        Intrinsics.checkNotNullParameter(sdkAdFactory, "sdkAdFactory");
        this.f78260a = mediatedNativeAd;
        this.f78261b = mediatedNativeRenderingTracker;
        this.f78262c = sdkAdFactory;
    }

    @Override // com.yandex.mobile.ads.impl.o81
    @NotNull
    /* renamed from: a */
    public final n81 mo31136a(@NotNull z01 nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        return new xv0(this.f78262c.mo31136a(nativeAd), this.f78260a, this.f78261b);
    }
}
