package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.sg */
/* loaded from: classes8.dex */
public final class View$OnAttachStateChangeListenerC31355sg implements View.OnAttachStateChangeListener {
    @NotNull

    /* renamed from: a */
    private final ViewTreeObserver.OnGlobalLayoutListener f85231a;

    public View$OnAttachStateChangeListenerC31355sg(@NotNull ViewTreeObserver.OnGlobalLayoutListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f85231a = listener;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.getViewTreeObserver().addOnGlobalLayoutListener(this.f85231a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        v.getViewTreeObserver().removeOnGlobalLayoutListener(this.f85231a);
    }
}
