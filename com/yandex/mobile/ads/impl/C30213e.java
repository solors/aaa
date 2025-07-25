package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.e */
/* loaded from: classes8.dex */
public final class C30213e {

    /* renamed from: a */
    private static final int[] f78389a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f78390b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.yandex.mobile.ads.impl.e$a */
    /* loaded from: classes8.dex */
    public static final class C30214a {

        /* renamed from: a */
        public final int f78391a;

        /* renamed from: b */
        public final int f78392b;

        /* renamed from: c */
        public final String f78393c;

        private C30214a(int i, int i2, String str) {
            this.f78391a = i;
            this.f78392b = i2;
            this.f78393c = str;
        }
    }

    /* renamed from: a */
    public static C30214a m34737a(bc1 bc1Var, boolean z) throws gc1 {
        int i;
        int i2;
        int m35502b = bc1Var.m35502b(5);
        if (m35502b == 31) {
            m35502b = bc1Var.m35502b(6) + 32;
        }
        int m35502b2 = bc1Var.m35502b(4);
        if (m35502b2 == 15) {
            i = bc1Var.m35502b(24);
        } else if (m35502b2 < 13) {
            i = f78389a[m35502b2];
        } else {
            throw gc1.m33885a((String) null, (Exception) null);
        }
        int m35502b3 = bc1Var.m35502b(4);
        String m27978a = C31736wd.m27978a("mp4a.40.", m35502b);
        if (m35502b == 5 || m35502b == 29) {
            int m35502b4 = bc1Var.m35502b(4);
            if (m35502b4 == 15) {
                i2 = bc1Var.m35502b(24);
            } else if (m35502b4 < 13) {
                i2 = f78389a[m35502b4];
            } else {
                throw gc1.m33885a((String) null, (Exception) null);
            }
            i = i2;
            int m35502b5 = bc1Var.m35502b(5);
            if (m35502b5 == 31) {
                m35502b5 = bc1Var.m35502b(6) + 32;
            }
            m35502b = m35502b5;
            if (m35502b == 22) {
                m35502b3 = bc1Var.m35502b(4);
            }
        }
        if (z) {
            if (m35502b != 6 && m35502b != 7 && m35502b != 17 && m35502b != 1 && m35502b != 2 && m35502b != 3 && m35502b != 4) {
                switch (m35502b) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw gc1.m33886a("Unsupported audio object type: " + m35502b);
                }
            }
            if (bc1Var.m35494f()) {
                gq0.m33792d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (bc1Var.m35494f()) {
                bc1Var.m35497d(14);
            }
            boolean m35494f = bc1Var.m35494f();
            if (m35502b3 != 0) {
                if (m35502b == 6 || m35502b == 20) {
                    bc1Var.m35497d(3);
                }
                if (m35494f) {
                    if (m35502b == 22) {
                        bc1Var.m35497d(16);
                    }
                    if (m35502b == 17 || m35502b == 19 || m35502b == 20 || m35502b == 23) {
                        bc1Var.m35497d(3);
                    }
                    bc1Var.m35497d(1);
                }
                switch (m35502b) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int m35502b6 = bc1Var.m35502b(2);
                        if (m35502b6 == 2 || m35502b6 == 3) {
                            throw gc1.m33886a("Unsupported epConfig: " + m35502b6);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i3 = f78390b[m35502b3];
        if (i3 != -1) {
            return new C30214a(i, i3, m27978a);
        }
        throw gc1.m33885a((String) null, (Exception) null);
    }
}
