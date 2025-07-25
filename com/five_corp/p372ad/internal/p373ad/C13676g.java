package com.five_corp.p372ad.internal.p373ad;

/* renamed from: com.five_corp.ad.internal.ad.g */
/* loaded from: classes4.dex */
public final class C13676g {

    /* renamed from: a */
    public final int f25388a;

    /* renamed from: b */
    public final int f25389b;

    /* renamed from: c */
    public final int f25390c;

    public C13676g(int i, int i2, int i3) {
        this.f25388a = i;
        this.f25389b = i2;
        this.f25390c = i3;
    }

    /* renamed from: a */
    public final String m78454a() {
        return this.f25388a + "-" + this.f25389b + "-" + this.f25390c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13676g.class != obj.getClass()) {
            return false;
        }
        C13676g c13676g = (C13676g) obj;
        if (this.f25388a == c13676g.f25388a && this.f25389b == c13676g.f25389b && this.f25390c == c13676g.f25390c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f25388a * 31) + this.f25389b) * 31) + this.f25390c;
    }

    public final String toString() {
        return "CcId{campaignId=" + this.f25388a + ", campaignVersion=" + this.f25389b + ", creativeId=" + this.f25390c + '}';
    }
}
