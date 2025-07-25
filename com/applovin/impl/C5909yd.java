package com.applovin.impl;

import com.applovin.impl.InterfaceC4058ae;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.yd */
/* loaded from: classes2.dex */
final class C5909yd {

    /* renamed from: a */
    public final InterfaceC4058ae.C4059a f12312a;

    /* renamed from: b */
    public final long f12313b;

    /* renamed from: c */
    public final long f12314c;

    /* renamed from: d */
    public final long f12315d;

    /* renamed from: e */
    public final long f12316e;

    /* renamed from: f */
    public final boolean f12317f;

    /* renamed from: g */
    public final boolean f12318g;

    /* renamed from: h */
    public final boolean f12319h;

    /* renamed from: i */
    public final boolean f12320i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5909yd(InterfaceC4058ae.C4059a c4059a, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        boolean z7 = false;
        if (z4 && !z2) {
            z5 = false;
        } else {
            z5 = true;
        }
        AbstractC4100b1.m100580a(z5);
        if (z3 && !z2) {
            z6 = false;
        } else {
            z6 = true;
        }
        AbstractC4100b1.m100580a(z6);
        if (!z || (!z2 && !z3 && !z4)) {
            z7 = true;
        }
        AbstractC4100b1.m100580a(z7);
        this.f12312a = c4059a;
        this.f12313b = j;
        this.f12314c = j2;
        this.f12315d = j3;
        this.f12316e = j4;
        this.f12317f = z;
        this.f12318g = z2;
        this.f12319h = z3;
        this.f12320i = z4;
    }

    /* renamed from: a */
    public C5909yd m92761a(long j) {
        if (j == this.f12314c) {
            return this;
        }
        return new C5909yd(this.f12312a, this.f12313b, j, this.f12315d, this.f12316e, this.f12317f, this.f12318g, this.f12319h, this.f12320i);
    }

    /* renamed from: b */
    public C5909yd m92760b(long j) {
        if (j == this.f12313b) {
            return this;
        }
        return new C5909yd(this.f12312a, j, this.f12314c, this.f12315d, this.f12316e, this.f12317f, this.f12318g, this.f12319h, this.f12320i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5909yd.class != obj.getClass()) {
            return false;
        }
        C5909yd c5909yd = (C5909yd) obj;
        if (this.f12313b == c5909yd.f12313b && this.f12314c == c5909yd.f12314c && this.f12315d == c5909yd.f12315d && this.f12316e == c5909yd.f12316e && this.f12317f == c5909yd.f12317f && this.f12318g == c5909yd.f12318g && this.f12319h == c5909yd.f12319h && this.f12320i == c5909yd.f12320i && AbstractC5863xp.m93016a(this.f12312a, c5909yd.f12312a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((this.f12312a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f12313b)) * 31) + ((int) this.f12314c)) * 31) + ((int) this.f12315d)) * 31) + ((int) this.f12316e)) * 31) + (this.f12317f ? 1 : 0)) * 31) + (this.f12318g ? 1 : 0)) * 31) + (this.f12319h ? 1 : 0)) * 31) + (this.f12320i ? 1 : 0);
    }
}
