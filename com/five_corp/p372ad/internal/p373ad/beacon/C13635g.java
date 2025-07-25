package com.five_corp.p372ad.internal.p373ad.beacon;

/* renamed from: com.five_corp.ad.internal.ad.beacon.g */
/* loaded from: classes4.dex */
public final class C13635g {

    /* renamed from: a */
    public final String f25271a;

    /* renamed from: b */
    public final String f25272b;

    public C13635g(String str, String str2) {
        this.f25271a = str;
        this.f25272b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13635g)) {
            return false;
        }
        C13635g c13635g = (C13635g) obj;
        if (!this.f25271a.equals(c13635g.f25271a) || !this.f25272b.equals(c13635g.f25272b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f25272b.hashCode() + (this.f25271a.hashCode() * 31);
    }
}
