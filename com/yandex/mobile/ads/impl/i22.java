package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
final class i22 {

    /* renamed from: d */
    private boolean f80306d;

    /* renamed from: e */
    private boolean f80307e;

    /* renamed from: f */
    private boolean f80308f;

    /* renamed from: a */
    private final int f80303a = 112800;

    /* renamed from: b */
    private final n02 f80304b = new n02(0);

    /* renamed from: g */
    private long f80309g = -9223372036854775807L;

    /* renamed from: h */
    private long f80310h = -9223372036854775807L;

    /* renamed from: i */
    private long f80311i = -9223372036854775807L;

    /* renamed from: c */
    private final cc1 f80305c = new cc1();

    /* renamed from: a */
    public final long m33382a() {
        return this.f80311i;
    }

    /* renamed from: b */
    public final n02 m33380b() {
        return this.f80304b;
    }

    /* renamed from: c */
    public final boolean m33379c() {
        return this.f80306d;
    }

    /* renamed from: a */
    public final int m33381a(C30513hy c30513hy, of1 of1Var, int i) throws IOException {
        if (i <= 0) {
            this.f80305c.m35295a(y32.f88015f);
            this.f80306d = true;
            c30513hy.mo27614c();
            return 0;
        }
        long j = -9223372036854775807L;
        if (!this.f80308f) {
            long mo27618b = c30513hy.mo27618b();
            int min = (int) Math.min(this.f80303a, mo27618b);
            long j2 = mo27618b - min;
            if (c30513hy.mo27622a() != j2) {
                of1Var.f83478a = j2;
                return 1;
            }
            this.f80305c.m35290c(min);
            c30513hy.mo27614c();
            c30513hy.mo27615b(this.f80305c.m35291c(), 0, min, false);
            cc1 cc1Var = this.f80305c;
            int m35289d = cc1Var.m35289d();
            int m35287e = cc1Var.m35287e();
            int i2 = m35287e - 188;
            while (true) {
                if (i2 < m35289d) {
                    break;
                }
                byte[] m35291c = cc1Var.m35291c();
                int i3 = -4;
                int i4 = 0;
                while (true) {
                    if (i3 > 4) {
                        break;
                    }
                    int i5 = (i3 * 188) + i2;
                    if (i5 < m35289d || i5 >= m35287e || m35291c[i5] != 71) {
                        i4 = 0;
                    } else {
                        i4++;
                        if (i4 == 5) {
                            long m32362a = l22.m32362a(i2, i, cc1Var);
                            if (m32362a != -9223372036854775807L) {
                                j = m32362a;
                                break;
                            }
                        }
                    }
                    i3++;
                }
                i2--;
            }
            this.f80310h = j;
            this.f80308f = true;
            return 0;
        } else if (this.f80310h == -9223372036854775807L) {
            this.f80305c.m35295a(y32.f88015f);
            this.f80306d = true;
            c30513hy.mo27614c();
            return 0;
        } else if (!this.f80307e) {
            int min2 = (int) Math.min(this.f80303a, c30513hy.mo27618b());
            long j3 = 0;
            if (c30513hy.mo27622a() != j3) {
                of1Var.f83478a = j3;
                return 1;
            }
            this.f80305c.m35290c(min2);
            c30513hy.mo27614c();
            c30513hy.mo27615b(this.f80305c.m35291c(), 0, min2, false);
            cc1 cc1Var2 = this.f80305c;
            int m35289d2 = cc1Var2.m35289d();
            int m35287e2 = cc1Var2.m35287e();
            while (true) {
                if (m35289d2 >= m35287e2) {
                    break;
                }
                if (cc1Var2.m35291c()[m35289d2] == 71) {
                    long m32362a2 = l22.m32362a(m35289d2, i, cc1Var2);
                    if (m32362a2 != -9223372036854775807L) {
                        j = m32362a2;
                        break;
                    }
                }
                m35289d2++;
            }
            this.f80309g = j;
            this.f80307e = true;
            return 0;
        } else {
            long j4 = this.f80309g;
            if (j4 == -9223372036854775807L) {
                this.f80305c.m35295a(y32.f88015f);
                this.f80306d = true;
                c30513hy.mo27614c();
                return 0;
            }
            long m31718b = this.f80304b.m31718b(this.f80310h) - this.f80304b.m31718b(j4);
            this.f80311i = m31718b;
            if (m31718b < 0) {
                gq0.m33792d("TsDurationReader", "Invalid duration: " + this.f80311i + ". Using TIME_UNSET instead.");
                this.f80311i = -9223372036854775807L;
            }
            this.f80305c.m35295a(y32.f88015f);
            this.f80306d = true;
            c30513hy.mo27614c();
            return 0;
        }
    }
}
