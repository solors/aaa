package com.five_corp.p372ad.internal.p373ad.beacon;

/* renamed from: com.five_corp.ad.internal.ad.beacon.j */
/* loaded from: classes4.dex */
public final class C13638j {

    /* renamed from: d */
    public static final C13638j f25273d = new C13638j(1, 0.5d);

    /* renamed from: a */
    public final int f25274a;

    /* renamed from: b */
    public final double f25275b;

    /* renamed from: c */
    public final int f25276c;

    public C13638j(int i, double d) {
        this.f25274a = i;
        this.f25275b = d;
        this.f25276c = (int) (d * 1000000.0d);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13638j)) {
            return false;
        }
        C13638j c13638j = (C13638j) obj;
        if (this.f25274a != c13638j.f25274a || this.f25276c != c13638j.f25276c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC13637i.m78467a(this.f25274a) + 2969) * 2969) + this.f25276c;
    }
}
