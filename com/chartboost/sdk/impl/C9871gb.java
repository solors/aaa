package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.gb */
/* loaded from: classes3.dex */
public final class C9871gb {

    /* renamed from: a */
    public final String f22125a;

    /* renamed from: b */
    public final String f22126b;

    /* renamed from: c */
    public final String f22127c;

    public C9871gb(String url, String vendor, String params) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f22125a = url;
        this.f22126b = vendor;
        this.f22127c = params;
    }

    /* renamed from: a */
    public final String m81605a() {
        return this.f22127c;
    }

    /* renamed from: b */
    public final String m81604b() {
        return this.f22125a;
    }

    /* renamed from: c */
    public final String m81603c() {
        return this.f22126b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9871gb)) {
            return false;
        }
        C9871gb c9871gb = (C9871gb) obj;
        if (Intrinsics.m17075f(this.f22125a, c9871gb.f22125a) && Intrinsics.m17075f(this.f22126b, c9871gb.f22126b) && Intrinsics.m17075f(this.f22127c, c9871gb.f22127c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f22125a.hashCode() * 31) + this.f22126b.hashCode()) * 31) + this.f22127c.hashCode();
    }

    public String toString() {
        String str = this.f22125a;
        String str2 = this.f22126b;
        String str3 = this.f22127c;
        return "VerificationModel(url=" + str + ", vendor=" + str2 + ", params=" + str3 + ")";
    }
}
