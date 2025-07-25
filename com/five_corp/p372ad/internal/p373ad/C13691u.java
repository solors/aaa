package com.five_corp.p372ad.internal.p373ad;

import java.util.Objects;

/* renamed from: com.five_corp.ad.internal.ad.u */
/* loaded from: classes4.dex */
public final class C13691u {

    /* renamed from: a */
    public final String f25401a;

    /* renamed from: b */
    public final String f25402b;

    /* renamed from: c */
    public final boolean f25403c;

    /* renamed from: d */
    public final int f25404d;

    /* renamed from: e */
    public final int f25405e;

    public C13691u(String str, String str2, int i, int i2) {
        boolean z;
        this.f25401a = str;
        this.f25402b = str2;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.f25403c = z;
        this.f25404d = i;
        this.f25405e = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13691u)) {
            return false;
        }
        C13691u c13691u = (C13691u) obj;
        if (!this.f25401a.equals(c13691u.f25401a) || !Objects.equals(this.f25402b, c13691u.f25402b) || this.f25403c != c13691u.f25403c || this.f25404d != c13691u.f25404d || this.f25405e != c13691u.f25405e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f25401a.hashCode() + 31) * 31;
        String str = this.f25402b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((hashCode2 + hashCode) * 31) + (this.f25403c ? 1 : 0)) * 31) + this.f25404d) * 31) + this.f25405e;
    }

    public final String toString() {
        return "Resource{, url='" + this.f25401a + "', isPermanent=" + this.f25403c + ", width=" + this.f25404d + ", height=" + this.f25405e + '}';
    }
}
