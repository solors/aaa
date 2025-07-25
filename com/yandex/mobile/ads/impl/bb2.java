package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class bb2<V extends View, T> {

    /* renamed from: b */
    static final /* synthetic */ KProperty<Object>[] f77256b = {C30452ha.m33588a(bb2.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    @NotNull

    /* renamed from: a */
    private final xj1 f77257a;

    public bb2(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f77257a = yj1.m26872a(view);
    }

    /* renamed from: a */
    public void mo27597a() {
    }

    /* renamed from: a */
    public abstract boolean mo27595a(@NotNull V v, T t);

    @Nullable
    /* renamed from: b */
    public final V m35513b() {
        return (V) this.f77257a.getValue(this, f77256b[0]);
    }

    /* renamed from: b */
    public abstract void mo27593b(@NotNull V v, T t);

    /* renamed from: c */
    public final boolean m35512c() {
        V view = m35513b();
        if (view != null && !cc2.m35250d(view)) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view.getWidth() >= 1 && view.getHeight() >= 1) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    public void mo27596a(@NotNull V view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(8);
        view.setOnClickListener(null);
        view.setOnTouchListener(null);
        view.setSelected(false);
    }

    /* renamed from: a */
    public void mo27594a(@NotNull C31034of<?> asset, @NotNull eb2 viewConfigurator, @Nullable T t) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        V m35513b = m35513b();
        if (m35513b == null) {
            return;
        }
        viewConfigurator.mo27624a(m35513b, asset);
        viewConfigurator.mo27623a(asset, new db2(m35513b));
    }
}
