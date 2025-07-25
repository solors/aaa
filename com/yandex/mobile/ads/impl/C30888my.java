package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.jt0;

/* renamed from: com.yandex.mobile.ads.impl.my */
/* loaded from: classes8.dex */
public final class C30888my implements dp0 {

    /* renamed from: a */
    private final long f82472a;

    /* renamed from: b */
    private final long f82473b;

    /* renamed from: c */
    private final float f82474c;

    /* renamed from: d */
    private long f82475d;

    /* renamed from: e */
    private long f82476e;

    /* renamed from: f */
    private long f82477f;

    /* renamed from: g */
    private long f82478g;

    /* renamed from: h */
    private long f82479h;

    /* renamed from: i */
    private long f82480i;

    /* renamed from: j */
    private float f82481j;

    /* renamed from: k */
    private float f82482k;

    /* renamed from: l */
    private float f82483l;

    /* renamed from: m */
    private long f82484m;

    /* renamed from: n */
    private long f82485n;

    /* renamed from: o */
    private long f82486o;

    /* renamed from: com.yandex.mobile.ads.impl.my$a */
    /* loaded from: classes8.dex */
    public static final class C30889a {

        /* renamed from: a */
        private long f82487a = y32.m27089a(20L);

        /* renamed from: b */
        private long f82488b = y32.m27089a(500L);

        /* renamed from: c */
        private float f82489c = 0.999f;

        /* renamed from: a */
        public final C30888my m31743a() {
            return new C30888my(this.f82487a, this.f82488b, this.f82489c);
        }
    }

    /* renamed from: b */
    private void m31745b() {
        long j = this.f82475d;
        if (j != -9223372036854775807L) {
            long j2 = this.f82476e;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f82478g;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.f82479h;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f82477f == j) {
            return;
        }
        this.f82477f = j;
        this.f82480i = j;
        this.f82485n = -9223372036854775807L;
        this.f82486o = -9223372036854775807L;
        this.f82484m = -9223372036854775807L;
    }

    /* renamed from: a */
    public final float m31747a(long j, long j2) {
        if (this.f82475d == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.f82485n;
        if (j4 == -9223372036854775807L) {
            this.f82485n = j3;
            this.f82486o = 0L;
        } else {
            float f = this.f82474c;
            long max = Math.max(j3, ((1.0f - f) * ((float) j3)) + (((float) j4) * f));
            this.f82485n = max;
            long abs = Math.abs(j3 - max);
            long j5 = this.f82486o;
            float f2 = this.f82474c;
            this.f82486o = ((1.0f - f2) * ((float) abs)) + (((float) j5) * f2);
        }
        if (this.f82484m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f82484m < 1000) {
            return this.f82483l;
        }
        this.f82484m = SystemClock.elapsedRealtime();
        long j6 = (this.f82486o * 3) + this.f82485n;
        if (this.f82480i > j6) {
            float m27089a = (float) y32.m27089a(1000L);
            long j7 = ((this.f82483l - 1.0f) * m27089a) + ((this.f82481j - 1.0f) * m27089a);
            long j8 = this.f82477f;
            long j9 = this.f82480i - j7;
            long[] jArr = {j6, j8, j9};
            for (int i = 1; i < 3; i++) {
                long j10 = jArr[i];
                if (j10 > j6) {
                    j6 = j10;
                }
            }
            this.f82480i = j6;
        } else {
            long j11 = this.f82480i;
            int i2 = y32.f88010a;
            long max2 = Math.max(j11, Math.min(j - (Math.max(0.0f, this.f82483l - 1.0f) / 1.0E-7f), j6));
            this.f82480i = max2;
            long j12 = this.f82479h;
            if (j12 != -9223372036854775807L && max2 > j12) {
                this.f82480i = j12;
            }
        }
        long j13 = j - this.f82480i;
        if (Math.abs(j13) < this.f82472a) {
            this.f82483l = 1.0f;
        } else {
            float f3 = this.f82482k;
            float f4 = this.f82481j;
            int i3 = y32.f88010a;
            this.f82483l = Math.max(f3, Math.min((((float) j13) * 1.0E-7f) + 1.0f, f4));
        }
        return this.f82483l;
    }

    /* renamed from: c */
    public final void m31744c() {
        long j = this.f82480i;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f82473b;
        this.f82480i = j2;
        long j3 = this.f82479h;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.f82480i = j3;
        }
        this.f82484m = -9223372036854775807L;
    }

    private C30888my(long j, long j2, float f) {
        this.f82472a = j;
        this.f82473b = j2;
        this.f82474c = f;
        this.f82475d = -9223372036854775807L;
        this.f82476e = -9223372036854775807L;
        this.f82478g = -9223372036854775807L;
        this.f82479h = -9223372036854775807L;
        this.f82482k = 0.97f;
        this.f82481j = 1.03f;
        this.f82483l = 1.0f;
        this.f82484m = -9223372036854775807L;
        this.f82477f = -9223372036854775807L;
        this.f82480i = -9223372036854775807L;
        this.f82485n = -9223372036854775807L;
        this.f82486o = -9223372036854775807L;
    }

    /* renamed from: a */
    public final long m31749a() {
        return this.f82480i;
    }

    /* renamed from: a */
    public final void m31746a(jt0.C30663e c30663e) {
        this.f82475d = y32.m27089a(c30663e.f81120b);
        this.f82478g = y32.m27089a(c30663e.f81121c);
        this.f82479h = y32.m27089a(c30663e.f81122d);
        float f = c30663e.f81123e;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.f82482k = f;
        float f2 = c30663e.f81124f;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.f82481j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.f82475d = -9223372036854775807L;
        }
        m31745b();
    }

    /* renamed from: a */
    public final void m31748a(long j) {
        this.f82476e = j;
        m31745b();
    }
}
