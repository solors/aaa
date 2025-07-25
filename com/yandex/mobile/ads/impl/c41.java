package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.r12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class c41 implements View.OnAttachStateChangeListener {

    /* renamed from: e */
    static final /* synthetic */ KProperty<Object>[] f77499e = {C30452ha.m33588a(c41.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    @NotNull

    /* renamed from: a */
    private final r12.InterfaceC31252a f77500a;
    @NotNull

    /* renamed from: b */
    private final y31 f77501b;
    @Nullable

    /* renamed from: c */
    private x31 f77502c;
    @NotNull

    /* renamed from: d */
    private final xj1 f77503d;

    public c41(@NotNull View view, @NotNull p51 trackingListener, @NotNull y31 globalLayoutListenerFactory) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        Intrinsics.checkNotNullParameter(globalLayoutListenerFactory, "globalLayoutListenerFactory");
        this.f77500a = trackingListener;
        this.f77501b = globalLayoutListenerFactory;
        this.f77503d = yj1.m26872a(view);
    }

    /* renamed from: a */
    public final void m35362a() {
        xj1 xj1Var = this.f77503d;
        KProperty<?>[] kPropertyArr = f77499e;
        View view = (View) xj1Var.getValue(this, kPropertyArr[0]);
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        View nativeAdView = (View) this.f77503d.getValue(this, kPropertyArr[0]);
        if (nativeAdView != null && nativeAdView.isAttachedToWindow()) {
            y31 y31Var = this.f77501b;
            r12.InterfaceC31252a trackingListener = this.f77500a;
            y31Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            x31 x31Var = new x31(nativeAdView, trackingListener);
            this.f77502c = x31Var;
            x31Var.m27674a();
        }
    }

    /* renamed from: b */
    public final void m35361b() {
        x31 x31Var = this.f77502c;
        if (x31Var != null) {
            x31Var.m27673b();
        }
        this.f77502c = null;
        View view = (View) this.f77503d.getValue(this, f77499e[0]);
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        this.f77500a.mo30170a();
        View nativeAdView = (View) this.f77503d.getValue(this, f77499e[0]);
        if (nativeAdView != null && nativeAdView.isAttachedToWindow()) {
            y31 y31Var = this.f77501b;
            r12.InterfaceC31252a trackingListener = this.f77500a;
            y31Var.getClass();
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
            x31 x31Var = new x31(nativeAdView, trackingListener);
            this.f77502c = x31Var;
            x31Var.m27674a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        x31 x31Var = this.f77502c;
        if (x31Var != null) {
            x31Var.m27673b();
        }
        this.f77502c = null;
        this.f77500a.mo30169b();
    }
}
