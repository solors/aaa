package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.ps1;
import com.yandex.mobile.ads.impl.yy0;

/* loaded from: classes8.dex */
final class df2 implements ss1 {

    /* renamed from: a */
    private final long f78113a;

    /* renamed from: b */
    private final int f78114b;

    /* renamed from: c */
    private final long f78115c;

    /* renamed from: d */
    private final long f78116d;

    /* renamed from: e */
    private final long f78117e;
    @Nullable

    /* renamed from: f */
    private final long[] f78118f;

    private df2(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.f78113a = j;
        this.f78114b = i;
        this.f78115c = j2;
        this.f78118f = jArr;
        this.f78116d = j3;
        this.f78117e = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    /* renamed from: a */
    public static df2 m34947a(long j, long j2, yy0.C31938a c31938a, cc1 cc1Var) {
        int m35266x;
        int i = c31938a.f88624g;
        int i2 = c31938a.f88621d;
        int m35282h = cc1Var.m35282h();
        if ((m35282h & 1) != 1 || (m35266x = cc1Var.m35266x()) == 0) {
            return null;
        }
        long m27088a = y32.m27088a(m35266x, i * 1000000, i2);
        if ((m35282h & 6) != 6) {
            return new df2(j2, c31938a.f88620c, m27088a, -1L, null);
        }
        long m35268v = cc1Var.m35268v();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            jArr[i3] = cc1Var.m35270t();
        }
        if (j != -1) {
            long j3 = j2 + m35268v;
            if (j != j3) {
                gq0.m33792d("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new df2(j2, c31938a.f88620c, m27088a, m35268v, jArr);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final ps1.C31150a mo28594b(long j) {
        if (!mo28595b()) {
            rs1 rs1Var = new rs1(0L, this.f78113a + this.f78114b);
            return new ps1.C31150a(rs1Var, rs1Var);
        }
        long j2 = this.f78115c;
        int i = y32.f88010a;
        long max = Math.max(0L, Math.min(j, j2));
        double d = (max * 100.0d) / this.f78115c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i2 = (int) d;
                long[] jArr = this.f78118f;
                if (jArr != null) {
                    double d3 = jArr[i2];
                    d2 = d3 + (((i2 == 99 ? 256.0d : jArr[i2 + 1]) - d3) * (d - i2));
                } else {
                    throw new IllegalStateException();
                }
            }
        }
        rs1 rs1Var2 = new rs1(max, this.f78113a + Math.max(this.f78114b, Math.min(Math.round((d2 / 256.0d) * this.f78116d), this.f78116d - 1)));
        return new ps1.C31150a(rs1Var2, rs1Var2);
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: c */
    public final long mo28592c() {
        return this.f78115c;
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28948a() {
        return this.f78117e;
    }

    @Override // com.yandex.mobile.ads.impl.ss1
    /* renamed from: a */
    public final long mo28947a(long j) {
        long j2 = j - this.f78113a;
        if (!mo28595b() || j2 <= this.f78114b) {
            return 0L;
        }
        long[] jArr = this.f78118f;
        if (jArr != null) {
            double d = (j2 * 256.0d) / this.f78116d;
            int m27056b = y32.m27056b(jArr, (long) d, true);
            long j3 = this.f78115c;
            long j4 = (m27056b * j3) / 100;
            long j5 = jArr[m27056b];
            int i = m27056b + 1;
            long j6 = (j3 * i) / 100;
            long j7 = m27056b == 99 ? 256L : jArr[i];
            return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.ps1
    /* renamed from: b */
    public final boolean mo28595b() {
        return this.f78118f != null;
    }
}
