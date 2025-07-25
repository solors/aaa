package com.five_corp.p372ad.internal.layouter;

/* renamed from: com.five_corp.ad.internal.layouter.i */
/* loaded from: classes4.dex */
public final class C13831i {

    /* renamed from: a */
    public final int f25822a;

    /* renamed from: b */
    public final int f25823b;

    /* renamed from: c */
    public final int f25824c;

    /* renamed from: d */
    public final float f25825d;

    /* renamed from: e */
    public final boolean f25826e;

    /* renamed from: f */
    public final boolean f25827f;

    /* renamed from: g */
    public final boolean f25828g;

    public C13831i(int i, int i2, int i3, float f, boolean z, boolean z2, boolean z3) {
        this.f25822a = i;
        this.f25824c = i2;
        this.f25823b = i3;
        this.f25825d = f;
        this.f25826e = z;
        this.f25827f = z2;
        this.f25828g = z3;
    }

    /* renamed from: a */
    public static C13831i m78276a(int i, int i2, boolean z, boolean z2, boolean z3) {
        int min;
        float f;
        int i3;
        float f2;
        if (z) {
            f2 = 1.0f;
            i3 = i2;
        } else {
            if (i2 <= 0) {
                min = 0;
                f = 0.0f;
            } else {
                min = Math.min(i, i2);
                f = min / i2;
            }
            i3 = min;
            f2 = f;
        }
        return new C13831i(i3, i2, i2 - i3, f2, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13831i)) {
            return false;
        }
        C13831i c13831i = (C13831i) obj;
        if (this.f25822a != c13831i.f25822a || this.f25824c != c13831i.f25824c || this.f25826e != c13831i.f25826e || this.f25827f != c13831i.f25827f || this.f25828g != c13831i.f25828g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f25826e);
        int hashCode2 = Boolean.hashCode(this.f25827f);
        return Boolean.hashCode(this.f25828g) + ((hashCode2 + ((hashCode + (((this.f25822a * 13) + this.f25824c) * 13)) * 13)) * 13);
    }
}
