package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class t31 implements View.OnTouchListener, View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final View$OnTouchListenerC31142pn f85495a;
    @NotNull

    /* renamed from: b */
    private final n21 f85496b;

    public t31(@NotNull Context context, @NotNull View.OnClickListener onClickListener, @NotNull View$OnTouchListenerC31142pn clickAreaVerificationListener, @NotNull n21 nativeAdHighlightingController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        Intrinsics.checkNotNullParameter(clickAreaVerificationListener, "clickAreaVerificationListener");
        Intrinsics.checkNotNullParameter(nativeAdHighlightingController, "nativeAdHighlightingController");
        this.f85495a = clickAreaVerificationListener;
        this.f85496b = nativeAdHighlightingController;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@Nullable View view) {
        this.f85495a.onClick(view);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f85496b.m31694b(view, event);
        return this.f85495a.onTouch(view, event);
    }
}
