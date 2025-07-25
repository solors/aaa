package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.y7 */
/* loaded from: classes9.dex */
public final class C35033y7 {

    /* renamed from: a */
    public final long f95643a;

    /* renamed from: b */
    public final int f95644b;

    public C35033y7(int i, long j) {
        this.f95643a = j;
        this.f95644b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35033y7)) {
            return false;
        }
        C35033y7 c35033y7 = (C35033y7) obj;
        if (this.f95643a == c35033y7.f95643a && this.f95644b == c35033y7.f95644b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f95644b) + (Long.hashCode(this.f95643a) * 31);
    }

    public final String toString() {
        return "DecimalProtoModel(mantissa=" + this.f95643a + ", exponent=" + this.f95644b + ')';
    }
}
