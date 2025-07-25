package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.xn */
/* loaded from: classes8.dex */
public final class C31830xn {
    @NotNull

    /* renamed from: a */
    private final C31034of<?> f87750a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC29988b3 f87751b;
    @NotNull

    /* renamed from: c */
    private final v31 f87752c;
    @NotNull

    /* renamed from: d */
    private final nk1 f87753d;
    @NotNull

    /* renamed from: e */
    private final t90 f87754e;

    public C31830xn(@NotNull C31034of<?> asset, @NotNull InterfaceC29988b3 adClickable, @NotNull v31 nativeAdViewAdapter, @NotNull nk1 renderedTimer, @NotNull t90 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f87750a = asset;
        this.f87751b = adClickable;
        this.f87752c = nativeAdViewAdapter;
        this.f87753d = renderedTimer;
        this.f87754e = forceImpressionTrackingListener;
    }

    @NotNull
    /* renamed from: a */
    public final View.OnClickListener m27454a(@NotNull xo0 link) {
        Intrinsics.checkNotNullParameter(link, "link");
        return this.f87752c.m28538f().mo26831a(this.f87750a, link, this.f87751b, this.f87752c, this.f87753d, this.f87754e);
    }
}
