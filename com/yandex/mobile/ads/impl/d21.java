package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class d21 implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final C31034of<?> f77849a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC29988b3 f77850b;
    @NotNull

    /* renamed from: c */
    private final v31 f77851c;
    @NotNull

    /* renamed from: d */
    private final nk1 f77852d;
    @Nullable

    /* renamed from: e */
    private final xo0 f77853e;
    @NotNull

    /* renamed from: f */
    private final t90 f77854f;

    public d21(@NotNull C31034of asset, @Nullable xo0 xo0Var, @NotNull InterfaceC29988b3 adClickable, @NotNull v31 nativeAdViewAdapter, @NotNull nk1 renderedTimer, @NotNull t90 forceImpressionTrackingListener) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(adClickable, "adClickable");
        Intrinsics.checkNotNullParameter(nativeAdViewAdapter, "nativeAdViewAdapter");
        Intrinsics.checkNotNullParameter(renderedTimer, "renderedTimer");
        Intrinsics.checkNotNullParameter(forceImpressionTrackingListener, "forceImpressionTrackingListener");
        this.f77849a = asset;
        this.f77850b = adClickable;
        this.f77851c = nativeAdViewAdapter;
        this.f77852d = renderedTimer;
        this.f77853e = xo0Var;
        this.f77854f = forceImpressionTrackingListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        long mo30967b = this.f77852d.mo30967b();
        xo0 xo0Var = this.f77853e;
        if (xo0Var != null && mo30967b >= xo0Var.m27442b() && this.f77849a.m31040e()) {
            this.f77854f.mo28376a();
            this.f77850b.mo35668a(view, this.f77849a, this.f77853e, this.f77851c);
        }
    }
}
