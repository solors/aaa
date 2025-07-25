package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes8.dex */
final class si1 {

    /* renamed from: c */
    private boolean f85281c;

    /* renamed from: d */
    private boolean f85282d;

    /* renamed from: e */
    private boolean f85283e;

    /* renamed from: a */
    private final n02 f85279a = new n02(0);

    /* renamed from: f */
    private long f85284f = -9223372036854775807L;

    /* renamed from: g */
    private long f85285g = -9223372036854775807L;

    /* renamed from: h */
    private long f85286h = -9223372036854775807L;

    /* renamed from: b */
    private final cc1 f85280b = new cc1();

    /* renamed from: a */
    public final long m29601a() {
        return this.f85286h;
    }

    /* renamed from: b */
    public final n02 m29598b() {
        return this.f85279a;
    }

    /* renamed from: c */
    public final boolean m29597c() {
        return this.f85281c;
    }

    /* renamed from: a */
    public final int m29599a(C30513hy c30513hy, of1 of1Var) throws IOException {
        long j = -9223372036854775807L;
        if (!this.f85283e) {
            long mo27618b = c30513hy.mo27618b();
            int min = (int) Math.min(20000L, mo27618b);
            long j2 = mo27618b - min;
            if (c30513hy.mo27622a() != j2) {
                of1Var.f83478a = j2;
                return 1;
            }
            this.f85280b.m35290c(min);
            c30513hy.mo27614c();
            c30513hy.mo27615b(this.f85280b.m35291c(), 0, min, false);
            cc1 cc1Var = this.f85280b;
            int m35289d = cc1Var.m35289d();
            int m35287e = cc1Var.m35287e() - 4;
            while (true) {
                if (m35287e < m35289d) {
                    break;
                }
                byte[] m35291c = cc1Var.m35291c();
                if (((m35291c[m35287e + 3] & 255) | ((m35291c[m35287e] & 255) << 24) | ((m35291c[m35287e + 1] & 255) << 16) | ((m35291c[m35287e + 2] & 255) << 8)) == 442) {
                    cc1Var.m35286e(m35287e + 4);
                    long m29600a = m29600a(cc1Var);
                    if (m29600a != -9223372036854775807L) {
                        j = m29600a;
                        break;
                    }
                }
                m35287e--;
            }
            this.f85285g = j;
            this.f85283e = true;
            return 0;
        } else if (this.f85285g == -9223372036854775807L) {
            this.f85280b.m35295a(y32.f88015f);
            this.f85281c = true;
            c30513hy.mo27614c();
            return 0;
        } else if (!this.f85282d) {
            int min2 = (int) Math.min(20000L, c30513hy.mo27618b());
            long j3 = 0;
            if (c30513hy.mo27622a() != j3) {
                of1Var.f83478a = j3;
                return 1;
            }
            this.f85280b.m35290c(min2);
            c30513hy.mo27614c();
            c30513hy.mo27615b(this.f85280b.m35291c(), 0, min2, false);
            cc1 cc1Var2 = this.f85280b;
            int m35289d2 = cc1Var2.m35289d();
            int m35287e2 = cc1Var2.m35287e();
            while (true) {
                if (m35289d2 >= m35287e2 - 3) {
                    break;
                }
                byte[] m35291c2 = cc1Var2.m35291c();
                int i = m35289d2 + 1;
                if (((m35291c2[m35289d2 + 3] & 255) | ((m35291c2[m35289d2] & 255) << 24) | ((m35291c2[i] & 255) << 16) | ((m35291c2[m35289d2 + 2] & 255) << 8)) == 442) {
                    cc1Var2.m35286e(m35289d2 + 4);
                    long m29600a2 = m29600a(cc1Var2);
                    if (m29600a2 != -9223372036854775807L) {
                        j = m29600a2;
                        break;
                    }
                }
                m35289d2 = i;
            }
            this.f85284f = j;
            this.f85282d = true;
            return 0;
        } else {
            long j4 = this.f85284f;
            if (j4 == -9223372036854775807L) {
                this.f85280b.m35295a(y32.f88015f);
                this.f85281c = true;
                c30513hy.mo27614c();
                return 0;
            }
            long m31718b = this.f85279a.m31718b(this.f85285g) - this.f85279a.m31718b(j4);
            this.f85286h = m31718b;
            if (m31718b < 0) {
                gq0.m33792d("PsDurationReader", "Invalid duration: " + this.f85286h + ". Using TIME_UNSET instead.");
                this.f85286h = -9223372036854775807L;
            }
            this.f85280b.m35295a(y32.f88015f);
            this.f85281c = true;
            c30513hy.mo27614c();
            return 0;
        }
    }

    /* renamed from: a */
    public static long m29600a(cc1 cc1Var) {
        int m35289d = cc1Var.m35289d();
        if (cc1Var.m35299a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        cc1Var.m35294a(bArr, 0, 9);
        cc1Var.m35286e(m35289d);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }
}
