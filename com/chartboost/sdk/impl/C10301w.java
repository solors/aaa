package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.w */
/* loaded from: classes3.dex */
public final class C10301w {

    /* renamed from: a */
    public final ViewGroup f23399a;

    /* renamed from: b */
    public final int f23400b;

    /* renamed from: c */
    public final int f23401c;

    public C10301w(ViewGroup bannerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        this.f23399a = bannerView;
        this.f23400b = i;
        this.f23401c = i2;
    }

    /* renamed from: a */
    public final int m80226a() {
        return this.f23401c;
    }

    /* renamed from: b */
    public final ViewGroup m80225b() {
        return this.f23399a;
    }

    /* renamed from: c */
    public final int m80224c() {
        return this.f23400b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10301w)) {
            return false;
        }
        C10301w c10301w = (C10301w) obj;
        if (Intrinsics.m17075f(this.f23399a, c10301w.f23399a) && this.f23400b == c10301w.f23400b && this.f23401c == c10301w.f23401c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f23399a.hashCode() * 31) + Integer.hashCode(this.f23400b)) * 31) + Integer.hashCode(this.f23401c);
    }

    public String toString() {
        ViewGroup viewGroup = this.f23399a;
        int i = this.f23400b;
        int i2 = this.f23401c;
        return "AdUnitBannerData(bannerView=" + viewGroup + ", bannerWidth=" + i + ", bannerHeight=" + i2 + ")";
    }
}
