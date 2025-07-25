package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cb2<V extends View, T> {
    @NotNull

    /* renamed from: a */
    private final bb2<V, T> f77582a;

    public cb2(@NotNull bb2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f77582a = viewAdapter;
    }

    /* renamed from: a */
    public final void m35317a() {
        V m35513b = this.f77582a.m35513b();
        if (m35513b == null) {
            return;
        }
        this.f77582a.mo27596a(m35513b);
    }

    /* renamed from: b */
    public final void m35314b() {
        this.f77582a.mo27597a();
    }

    /* renamed from: b */
    public final void m35313b(T t) {
        V m35513b = this.f77582a.m35513b();
        if (m35513b == null) {
            return;
        }
        this.f77582a.mo27593b(m35513b, t);
        m35513b.setVisibility(0);
    }

    /* renamed from: a */
    public final void m35316a(@NotNull C31034of<?> asset, @NotNull eb2 viewConfigurator, @Nullable T t) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        if (this.f77582a.m35513b() == null) {
            return;
        }
        this.f77582a.mo27594a(asset, viewConfigurator, t);
    }

    /* renamed from: a */
    public final boolean m35315a(T t) {
        V m35513b = this.f77582a.m35513b();
        return m35513b != null && this.f77582a.mo27595a(m35513b, t);
    }
}
