package com.applovin.impl;

/* renamed from: com.applovin.impl.jj */
/* loaded from: classes2.dex */
public final class C4657jj {

    /* renamed from: c */
    public static final C4657jj f7218c;

    /* renamed from: d */
    public static final C4657jj f7219d;

    /* renamed from: e */
    public static final C4657jj f7220e;

    /* renamed from: f */
    public static final C4657jj f7221f;

    /* renamed from: g */
    public static final C4657jj f7222g;

    /* renamed from: a */
    public final long f7223a;

    /* renamed from: b */
    public final long f7224b;

    static {
        C4657jj c4657jj = new C4657jj(0L, 0L);
        f7218c = c4657jj;
        f7219d = new C4657jj(Long.MAX_VALUE, Long.MAX_VALUE);
        f7220e = new C4657jj(Long.MAX_VALUE, 0L);
        f7221f = new C4657jj(0L, Long.MAX_VALUE);
        f7222g = c4657jj;
    }

    public C4657jj(long j, long j2) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        AbstractC4100b1.m100580a(j2 >= 0);
        this.f7223a = j;
        this.f7224b = j2;
    }

    /* renamed from: a */
    public long m98161a(long j, long j2, long j3) {
        boolean z;
        long j4 = this.f7223a;
        if (j4 == 0 && this.f7224b == 0) {
            return j;
        }
        long m92968d = AbstractC5863xp.m92968d(j, j4, Long.MIN_VALUE);
        long m93035a = AbstractC5863xp.m93035a(j, this.f7224b, Long.MAX_VALUE);
        boolean z2 = true;
        if (m92968d <= j2 && j2 <= m93035a) {
            z = true;
        } else {
            z = false;
        }
        if (m92968d > j3 || j3 > m93035a) {
            z2 = false;
        }
        if (z && z2) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        } else if (z) {
            return j2;
        } else {
            if (z2) {
                return j3;
            }
            return m92968d;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4657jj.class != obj.getClass()) {
            return false;
        }
        C4657jj c4657jj = (C4657jj) obj;
        if (this.f7223a == c4657jj.f7223a && this.f7224b == c4657jj.f7224b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f7223a) * 31) + ((int) this.f7224b);
    }
}
