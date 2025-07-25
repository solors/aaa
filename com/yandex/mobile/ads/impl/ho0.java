package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ho0<V extends ViewGroup> {

    /* renamed from: a */
    private final int f80133a;
    @NotNull

    /* renamed from: b */
    private final Class<V> f80134b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30890mz<V> f80135c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC30989nz f80136d;

    public ho0(@LayoutRes int i, @NotNull C31471tp designComponentBinder, @NotNull InterfaceC30989nz designConstraint) {
        Intrinsics.checkNotNullParameter(ExtendedNativeAdView.class, "layoutViewClass");
        Intrinsics.checkNotNullParameter(designComponentBinder, "designComponentBinder");
        Intrinsics.checkNotNullParameter(designConstraint, "designConstraint");
        this.f80133a = i;
        this.f80134b = ExtendedNativeAdView.class;
        this.f80135c = designComponentBinder;
        this.f80136d = designConstraint;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC30890mz<V> m33506a() {
        return this.f80135c;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC30989nz m33505b() {
        return this.f80136d;
    }

    /* renamed from: c */
    public final int m33504c() {
        return this.f80133a;
    }

    @NotNull
    /* renamed from: d */
    public final Class<V> m33503d() {
        return this.f80134b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho0)) {
            return false;
        }
        ho0 ho0Var = (ho0) obj;
        if (this.f80133a == ho0Var.f80133a && Intrinsics.m17075f(this.f80134b, ho0Var.f80134b) && Intrinsics.m17075f(this.f80135c, ho0Var.f80135c) && Intrinsics.m17075f(this.f80136d, ho0Var.f80136d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f80134b.hashCode();
        int hashCode2 = this.f80135c.hashCode();
        return this.f80136d.hashCode() + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f80133a) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        int i = this.f80133a;
        Class<V> cls = this.f80134b;
        InterfaceC30890mz<V> interfaceC30890mz = this.f80135c;
        InterfaceC30989nz interfaceC30989nz = this.f80136d;
        return "LayoutDesign(layoutId=" + i + ", layoutViewClass=" + cls + ", designComponentBinder=" + interfaceC30890mz + ", designConstraint=" + interfaceC30989nz + ")";
    }
}
