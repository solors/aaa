package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.a7 */
/* loaded from: classes3.dex */
public final class C9673a7 {

    /* renamed from: a */
    public final C10372y0 f21555a;

    /* renamed from: b */
    public final boolean f21556b;

    /* renamed from: c */
    public final Integer f21557c;

    /* renamed from: d */
    public final Integer f21558d;

    /* renamed from: e */
    public final C9688b0 f21559e;

    public C9673a7(C10372y0 appRequest, boolean z, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f21555a = appRequest;
        this.f21556b = z;
        this.f21557c = num;
        this.f21558d = num2;
        this.f21559e = new C9688b0();
    }

    /* renamed from: a */
    public final C10372y0 m82127a() {
        return this.f21555a;
    }

    /* renamed from: b */
    public final Integer m82126b() {
        return this.f21557c;
    }

    /* renamed from: c */
    public final Integer m82125c() {
        return this.f21558d;
    }

    /* renamed from: d */
    public final C9688b0 m82124d() {
        return this.f21559e;
    }

    /* renamed from: e */
    public final boolean m82123e() {
        return this.f21556b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9673a7)) {
            return false;
        }
        C9673a7 c9673a7 = (C9673a7) obj;
        if (Intrinsics.m17075f(this.f21555a, c9673a7.f21555a) && this.f21556b == c9673a7.f21556b && Intrinsics.m17075f(this.f21557c, c9673a7.f21557c) && Intrinsics.m17075f(this.f21558d, c9673a7.f21558d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f21555a.hashCode() * 31) + Boolean.hashCode(this.f21556b)) * 31;
        Integer num = this.f21557c;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.f21558d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public String toString() {
        C10372y0 c10372y0 = this.f21555a;
        boolean z = this.f21556b;
        Integer num = this.f21557c;
        Integer num2 = this.f21558d;
        return "LoadParams(appRequest=" + c10372y0 + ", isCacheRequest=" + z + ", bannerHeight=" + num + ", bannerWidth=" + num2 + ")";
    }
}
