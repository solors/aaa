package com.five_corp.p372ad.internal.p373ad.beacon;

/* renamed from: com.five_corp.ad.internal.ad.beacon.a */
/* loaded from: classes4.dex */
public final class C13629a {

    /* renamed from: a */
    public final int f25248a;

    /* renamed from: b */
    public final int f25249b;

    /* renamed from: c */
    public final long f25250c;

    /* renamed from: d */
    public final C13638j f25251d;

    public C13629a(int i, int i2, long j, C13638j c13638j) {
        this.f25248a = i;
        this.f25249b = i2;
        this.f25250c = j;
        this.f25251d = c13638j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13629a)) {
            return false;
        }
        C13629a c13629a = (C13629a) obj;
        if (this.f25248a != c13629a.f25248a || this.f25249b != c13629a.f25249b || this.f25250c != c13629a.f25250c || !this.f25251d.equals(c13629a.f25251d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int m78468a = AbstractC13636h.m78468a(this.f25249b);
        return this.f25251d.hashCode() + ((((m78468a + ((AbstractC13631c.m78469a(this.f25248a) + 2969) * 2969)) * 2969) + ((int) this.f25250c)) * 2969);
    }
}
