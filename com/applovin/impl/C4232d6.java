package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.C5319sd;

/* renamed from: com.applovin.impl.d6 */
/* loaded from: classes2.dex */
public final class C4232d6 implements InterfaceC4646jc {

    /* renamed from: a */
    private final float f5475a;

    /* renamed from: b */
    private final float f5476b;

    /* renamed from: c */
    private final long f5477c;

    /* renamed from: d */
    private final float f5478d;

    /* renamed from: e */
    private final long f5479e;

    /* renamed from: f */
    private final long f5480f;

    /* renamed from: g */
    private final float f5481g;

    /* renamed from: h */
    private long f5482h;

    /* renamed from: i */
    private long f5483i;

    /* renamed from: j */
    private long f5484j;

    /* renamed from: k */
    private long f5485k;

    /* renamed from: l */
    private long f5486l;

    /* renamed from: m */
    private long f5487m;

    /* renamed from: n */
    private float f5488n;

    /* renamed from: o */
    private float f5489o;

    /* renamed from: p */
    private float f5490p;

    /* renamed from: q */
    private long f5491q;

    /* renamed from: r */
    private long f5492r;

    /* renamed from: s */
    private long f5493s;

    /* renamed from: com.applovin.impl.d6$b */
    /* loaded from: classes2.dex */
    public static final class C4234b {

        /* renamed from: a */
        private float f5494a = 0.97f;

        /* renamed from: b */
        private float f5495b = 1.03f;

        /* renamed from: c */
        private long f5496c = 1000;

        /* renamed from: d */
        private float f5497d = 1.0E-7f;

        /* renamed from: e */
        private long f5498e = AbstractC5538t2.m94555a(20L);

        /* renamed from: f */
        private long f5499f = AbstractC5538t2.m94555a(500L);

        /* renamed from: g */
        private float f5500g = 0.999f;

        /* renamed from: a */
        public C4232d6 m99985a() {
            return new C4232d6(this.f5494a, this.f5495b, this.f5496c, this.f5497d, this.f5498e, this.f5499f, this.f5500g);
        }
    }

    private C4232d6(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f5475a = f;
        this.f5476b = f2;
        this.f5477c = j;
        this.f5478d = f3;
        this.f5479e = j2;
        this.f5480f = j3;
        this.f5481g = f4;
        this.f5482h = -9223372036854775807L;
        this.f5483i = -9223372036854775807L;
        this.f5485k = -9223372036854775807L;
        this.f5486l = -9223372036854775807L;
        this.f5489o = f;
        this.f5488n = f2;
        this.f5490p = 1.0f;
        this.f5491q = -9223372036854775807L;
        this.f5484j = -9223372036854775807L;
        this.f5487m = -9223372036854775807L;
        this.f5492r = -9223372036854775807L;
        this.f5493s = -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m99989a(long j, long j2, float f) {
        return (((float) j) * f) + ((1.0f - f) * ((float) j2));
    }

    /* renamed from: b */
    private void m99988b(long j) {
        long j2 = this.f5492r + (this.f5493s * 3);
        if (this.f5487m > j2) {
            float m94555a = (float) AbstractC5538t2.m94555a(this.f5477c);
            this.f5487m = AbstractC5261rc.m95909a(j2, this.f5484j, this.f5487m - (((this.f5490p - 1.0f) * m94555a) + ((this.f5488n - 1.0f) * m94555a)));
            return;
        }
        long m92990b = AbstractC5863xp.m92990b(j - (Math.max(0.0f, this.f5490p - 1.0f) / this.f5478d), this.f5487m, j2);
        this.f5487m = m92990b;
        long j3 = this.f5486l;
        if (j3 == -9223372036854775807L || m92990b <= j3) {
            return;
        }
        this.f5487m = j3;
    }

    /* renamed from: c */
    private void m99986c() {
        long j = this.f5482h;
        if (j != -9223372036854775807L) {
            long j2 = this.f5483i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f5485k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f5486l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f5484j == j) {
            return;
        }
        this.f5484j = j;
        this.f5487m = j;
        this.f5492r = -9223372036854775807L;
        this.f5493s = -9223372036854775807L;
        this.f5491q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.InterfaceC4646jc
    /* renamed from: a */
    public float mo98260a(long j, long j2) {
        if (this.f5482h == -9223372036854775807L) {
            return 1.0f;
        }
        m99987b(j, j2);
        if (this.f5491q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f5491q < this.f5477c) {
            return this.f5490p;
        }
        this.f5491q = SystemClock.elapsedRealtime();
        m99988b(j);
        long j3 = j - this.f5487m;
        if (Math.abs(j3) < this.f5479e) {
            this.f5490p = 1.0f;
        } else {
            this.f5490p = AbstractC5863xp.m93042a((this.f5478d * ((float) j3)) + 1.0f, this.f5489o, this.f5488n);
        }
        return this.f5490p;
    }

    @Override // com.applovin.impl.InterfaceC4646jc
    /* renamed from: b */
    public long mo98258b() {
        return this.f5487m;
    }

    /* renamed from: b */
    private void m99987b(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f5492r;
        if (j4 == -9223372036854775807L) {
            this.f5492r = j3;
            this.f5493s = 0L;
            return;
        }
        long max = Math.max(j3, m99989a(j4, j3, this.f5481g));
        this.f5492r = max;
        this.f5493s = m99989a(this.f5493s, Math.abs(j3 - max), this.f5481g);
    }

    @Override // com.applovin.impl.InterfaceC4646jc
    /* renamed from: a */
    public void mo98262a() {
        long j = this.f5487m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f5480f;
        this.f5487m = j2;
        long j3 = this.f5486l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f5487m = j3;
        }
        this.f5491q = -9223372036854775807L;
    }

    @Override // com.applovin.impl.InterfaceC4646jc
    /* renamed from: a */
    public void mo98259a(C5319sd.C5326f c5326f) {
        this.f5482h = AbstractC5538t2.m94555a(c5326f.f9685a);
        this.f5485k = AbstractC5538t2.m94555a(c5326f.f9686b);
        this.f5486l = AbstractC5538t2.m94555a(c5326f.f9687c);
        float f = c5326f.f9688d;
        if (f == -3.4028235E38f) {
            f = this.f5475a;
        }
        this.f5489o = f;
        float f2 = c5326f.f9689f;
        if (f2 == -3.4028235E38f) {
            f2 = this.f5476b;
        }
        this.f5488n = f2;
        m99986c();
    }

    @Override // com.applovin.impl.InterfaceC4646jc
    /* renamed from: a */
    public void mo98261a(long j) {
        this.f5483i = j;
        m99986c();
    }
}
