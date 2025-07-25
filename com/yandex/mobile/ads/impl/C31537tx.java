package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.tx */
/* loaded from: classes8.dex */
public class C31537tx<V extends View, T> implements InterfaceC31123pf<T> {
    @NotNull

    /* renamed from: a */
    private final bb2<V, T> f85982a;

    public C31537tx(@NotNull bb2<V, T> viewAdapter) {
        Intrinsics.checkNotNullParameter(viewAdapter, "viewAdapter");
        this.f85982a = viewAdapter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: a */
    public final void mo28957a() {
        V m35513b = this.f85982a.m35513b();
        if (m35513b == null) {
            return;
        }
        this.f85982a.mo27596a(m35513b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: b */
    public final boolean mo28954b() {
        return this.f85982a.m35513b() != null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    @Nullable
    /* renamed from: c */
    public final rb2 mo28952c() {
        V view = this.f85982a.m35513b();
        if (view != null) {
            Intrinsics.checkNotNullParameter(view, "view");
            return new rb2(view.getWidth(), view.getHeight());
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: d */
    public final boolean mo28950d() {
        return cc2.m35257a(this.f85982a.m35513b(), 100);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: e */
    public final boolean mo28949e() {
        return this.f85982a.m35512c();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: a */
    public final void mo28956a(@NotNull C31034of<T> asset, @NotNull eb2 viewConfigurator) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(viewConfigurator, "viewConfigurator");
        this.f85982a.mo27594a(asset, viewConfigurator, asset.m31041d());
    }

    /* renamed from: b */
    public void m28953b(T t) {
        mo28951c(t);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: c */
    public final void mo28951c(T t) {
        V m35513b = this.f85982a.m35513b();
        if (m35513b == null) {
            return;
        }
        this.f85982a.mo27593b(m35513b, t);
        m35513b.setVisibility(0);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    /* renamed from: a */
    public final boolean mo28955a(T t) {
        V m35513b = this.f85982a.m35513b();
        return m35513b != null && this.f85982a.mo27595a(m35513b, t);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31123pf
    public final void destroy() {
    }
}
