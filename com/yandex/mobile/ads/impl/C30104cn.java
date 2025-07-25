package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.cn */
/* loaded from: classes8.dex */
public final class C30104cn {
    /* renamed from: a */
    public static void m35217a(long j, cc1 cc1Var, x02[] x02VarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (cc1Var.m35299a() > 1) {
                int i3 = 0;
                while (true) {
                    if (cc1Var.m35299a() == 0) {
                        i = -1;
                        break;
                    }
                    int m35270t = cc1Var.m35270t();
                    i3 += m35270t;
                    if (m35270t != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (cc1Var.m35299a() == 0) {
                        i4 = -1;
                        break;
                    }
                    int m35270t2 = cc1Var.m35270t();
                    i4 += m35270t2;
                    if (m35270t2 != 255) {
                        break;
                    }
                }
                int m35289d = cc1Var.m35289d() + i4;
                if (i4 != -1 && i4 <= cc1Var.m35299a()) {
                    if (i == 4 && i4 >= 8) {
                        int m35270t3 = cc1Var.m35270t();
                        int m35264z = cc1Var.m35264z();
                        if (m35264z == 49) {
                            i2 = cc1Var.m35282h();
                        } else {
                            i2 = 0;
                        }
                        int m35270t4 = cc1Var.m35270t();
                        if (m35264z == 47) {
                            cc1Var.m35284f(1);
                        }
                        if (m35270t3 == 181 && ((m35264z == 49 || m35264z == 47) && m35270t4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (m35264z == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            m35216b(j, cc1Var, x02VarArr);
                        }
                    }
                } else {
                    gq0.m33792d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    m35289d = cc1Var.m35287e();
                }
                cc1Var.m35286e(m35289d);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m35216b(long j, cc1 cc1Var, x02[] x02VarArr) {
        int m35270t = cc1Var.m35270t();
        if ((m35270t & 64) != 0) {
            cc1Var.m35284f(1);
            int i = (m35270t & 31) * 3;
            int m35289d = cc1Var.m35289d();
            for (x02 x02Var : x02VarArr) {
                cc1Var.m35286e(m35289d);
                x02Var.m27709a(i, cc1Var);
                if (j != -9223372036854775807L) {
                    x02Var.mo26069a(j, 1, i, 0, null);
                }
            }
        }
    }
}
