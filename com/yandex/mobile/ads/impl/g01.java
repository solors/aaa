package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class g01 implements View.OnAttachStateChangeListener {
    @NotNull

    /* renamed from: a */
    private final zz0 f79380a;

    /* renamed from: b */
    private final long f79381b;

    public g01(@NotNull zz0 multiBannerAutoSwipeController, long j) {
        Intrinsics.checkNotNullParameter(multiBannerAutoSwipeController, "multiBannerAutoSwipeController");
        this.f79380a = multiBannerAutoSwipeController;
        this.f79381b = j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f79380a.m25945a(this.f79381b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f79380a.m25944b();
    }
}
