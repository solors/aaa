package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewTreeObserver;
import com.yandex.mobile.ads.impl.r12;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class x31 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    static final /* synthetic */ KProperty<Object>[] f87533d = {C30452ha.m33588a(x31.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};
    @NotNull

    /* renamed from: a */
    private final r12.InterfaceC31252a f87534a;
    @NotNull

    /* renamed from: b */
    private final xj1 f87535b;
    @Nullable

    /* renamed from: c */
    private Integer f87536c;

    public x31(@NotNull View view, @NotNull r12.InterfaceC31252a trackingListener) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(trackingListener, "trackingListener");
        this.f87534a = trackingListener;
        this.f87535b = yj1.m26872a(view);
    }

    /* renamed from: a */
    public final void m27674a() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f87535b.getValue(this, f87533d[0]);
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: b */
    public final void m27673b() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f87535b.getValue(this, f87533d[0]);
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = (View) this.f87535b.getValue(this, f87533d[0]);
        if (view != null) {
            int visibility = view.getVisibility();
            Integer num = this.f87536c;
            if (num == null || visibility != num.intValue()) {
                this.f87536c = Integer.valueOf(visibility);
                if (visibility == 0) {
                    this.f87534a.mo30170a();
                } else {
                    this.f87534a.mo30169b();
                }
            }
        }
    }
}
