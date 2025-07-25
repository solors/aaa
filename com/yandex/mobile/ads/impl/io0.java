package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class io0<V extends ViewGroup> {
    @Nullable

    /* renamed from: a */
    private InterfaceC30890mz<V> f80569a;

    /* renamed from: a */
    public final void m33159a(@NotNull ViewGroup container, @NotNull V designView, @NotNull ho0<V> layoutDesign) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designView, "designView");
        Intrinsics.checkNotNullParameter(layoutDesign, "layoutDesign");
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        container.removeAllViews();
        container.addView(designView, layoutParams);
        InterfaceC30890mz<V> m33506a = layoutDesign.m33506a();
        this.f80569a = m33506a;
        if (m33506a != null) {
            m33506a.mo26077a(designView);
        }
    }

    /* renamed from: a */
    public final void m33160a(@NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(container, "container");
        container.removeAllViews();
        InterfaceC30890mz<V> interfaceC30890mz = this.f80569a;
        if (interfaceC30890mz != null) {
            interfaceC30890mz.mo26075c();
        }
    }
}
