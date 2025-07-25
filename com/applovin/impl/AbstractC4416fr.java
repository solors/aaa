package com.applovin.impl;

import java.util.Arrays;

/* renamed from: com.applovin.impl.fr */
/* loaded from: classes2.dex */
public abstract class AbstractC4416fr {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.fr$a */
    /* loaded from: classes2.dex */
    public static final class C4417a {

        /* renamed from: a */
        public final int f6224a;

        /* renamed from: b */
        public final int f6225b;

        /* renamed from: c */
        public final long[] f6226c;

        /* renamed from: d */
        public final int f6227d;

        /* renamed from: e */
        public final boolean f6228e;

        public C4417a(int i, int i2, long[] jArr, int i3, boolean z) {
            this.f6224a = i;
            this.f6225b = i2;
            this.f6226c = jArr;
            this.f6227d = i3;
            this.f6228e = z;
        }
    }

    /* renamed from: com.applovin.impl.fr$b */
    /* loaded from: classes2.dex */
    public static final class C4418b {

        /* renamed from: a */
        public final String f6229a;

        /* renamed from: b */
        public final String[] f6230b;

        /* renamed from: c */
        public final int f6231c;

        public C4418b(String str, String[] strArr, int i) {
            this.f6229a = str;
            this.f6230b = strArr;
            this.f6231c = i;
        }
    }

    /* renamed from: com.applovin.impl.fr$c */
    /* loaded from: classes2.dex */
    public static final class C4419c {

        /* renamed from: a */
        public final boolean f6232a;

        /* renamed from: b */
        public final int f6233b;

        /* renamed from: c */
        public final int f6234c;

        /* renamed from: d */
        public final int f6235d;

        public C4419c(boolean z, int i, int i2, int i3) {
            this.f6232a = z;
            this.f6233b = i;
            this.f6234c = i2;
            this.f6235d = i3;
        }
    }

    /* renamed from: com.applovin.impl.fr$d */
    /* loaded from: classes2.dex */
    public static final class C4420d {

        /* renamed from: a */
        public final int f6236a;

        /* renamed from: b */
        public final int f6237b;

        /* renamed from: c */
        public final int f6238c;

        /* renamed from: d */
        public final int f6239d;

        /* renamed from: e */
        public final int f6240e;

        /* renamed from: f */
        public final int f6241f;

        /* renamed from: g */
        public final int f6242g;

        /* renamed from: h */
        public final int f6243h;

        /* renamed from: i */
        public final boolean f6244i;

        /* renamed from: j */
        public final byte[] f6245j;

        public C4420d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.f6236a = i;
            this.f6237b = i2;
            this.f6238c = i3;
            this.f6239d = i4;
            this.f6240e = i5;
            this.f6241f = i6;
            this.f6242g = i7;
            this.f6243h = i8;
            this.f6244i = z;
            this.f6245j = bArr;
        }
    }

    /* renamed from: a */
    public static int m99073a(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    /* renamed from: b */
    private static void m99064b(C4209cr c4209cr) {
        int m100055a = c4209cr.m100055a(6) + 1;
        for (int i = 0; i < m100055a; i++) {
            int m100055a2 = c4209cr.m100055a(16);
            if (m100055a2 == 0) {
                c4209cr.m100053b(8);
                c4209cr.m100053b(16);
                c4209cr.m100053b(16);
                c4209cr.m100053b(6);
                c4209cr.m100053b(8);
                int m100055a3 = c4209cr.m100055a(4) + 1;
                for (int i2 = 0; i2 < m100055a3; i2++) {
                    c4209cr.m100053b(8);
                }
            } else if (m100055a2 != 1) {
                throw C4187ch.m100188a("floor type greater than 1 not decodable: " + m100055a2, null);
            } else {
                int m100055a4 = c4209cr.m100055a(5);
                int[] iArr = new int[m100055a4];
                int i3 = -1;
                for (int i4 = 0; i4 < m100055a4; i4++) {
                    int m100055a5 = c4209cr.m100055a(4);
                    iArr[i4] = m100055a5;
                    if (m100055a5 > i3) {
                        i3 = m100055a5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = c4209cr.m100055a(3) + 1;
                    int m100055a6 = c4209cr.m100055a(2);
                    if (m100055a6 > 0) {
                        c4209cr.m100053b(8);
                    }
                    for (int i7 = 0; i7 < (1 << m100055a6); i7++) {
                        c4209cr.m100053b(8);
                    }
                }
                c4209cr.m100053b(2);
                int m100055a7 = c4209cr.m100055a(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < m100055a4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        c4209cr.m100053b(m100055a7);
                        i9++;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private static C4419c[] m99063c(C4209cr c4209cr) {
        int m100055a = c4209cr.m100055a(6) + 1;
        C4419c[] c4419cArr = new C4419c[m100055a];
        for (int i = 0; i < m100055a; i++) {
            c4419cArr[i] = new C4419c(c4209cr.m100052c(), c4209cr.m100055a(16), c4209cr.m100055a(16), c4209cr.m100055a(8));
        }
        return c4419cArr;
    }

    /* renamed from: d */
    private static void m99062d(C4209cr c4209cr) {
        int i;
        int m100055a = c4209cr.m100055a(6) + 1;
        for (int i2 = 0; i2 < m100055a; i2++) {
            if (c4209cr.m100055a(16) <= 2) {
                c4209cr.m100053b(24);
                c4209cr.m100053b(24);
                c4209cr.m100053b(24);
                int m100055a2 = c4209cr.m100055a(6) + 1;
                c4209cr.m100053b(8);
                int[] iArr = new int[m100055a2];
                for (int i3 = 0; i3 < m100055a2; i3++) {
                    int m100055a3 = c4209cr.m100055a(3);
                    if (c4209cr.m100052c()) {
                        i = c4209cr.m100055a(5);
                    } else {
                        i = 0;
                    }
                    iArr[i3] = (i * 8) + m100055a3;
                }
                for (int i4 = 0; i4 < m100055a2; i4++) {
                    for (int i5 = 0; i5 < 8; i5++) {
                        if ((iArr[i4] & (1 << i5)) != 0) {
                            c4209cr.m100053b(8);
                        }
                    }
                }
            } else {
                throw C4187ch.m100188a("residueType greater than 2 is not decodable", null);
            }
        }
    }

    /* renamed from: a */
    private static long m99070a(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* renamed from: a */
    private static C4417a m99066a(C4209cr c4209cr) {
        if (c4209cr.m100055a(24) == 5653314) {
            int m100055a = c4209cr.m100055a(16);
            int m100055a2 = c4209cr.m100055a(24);
            long[] jArr = new long[m100055a2];
            boolean m100052c = c4209cr.m100052c();
            long j = 0;
            if (!m100052c) {
                boolean m100052c2 = c4209cr.m100052c();
                for (int i = 0; i < m100055a2; i++) {
                    if (m100052c2) {
                        if (c4209cr.m100052c()) {
                            jArr[i] = c4209cr.m100055a(5) + 1;
                        } else {
                            jArr[i] = 0;
                        }
                    } else {
                        jArr[i] = c4209cr.m100055a(5) + 1;
                    }
                }
            } else {
                int m100055a3 = c4209cr.m100055a(5) + 1;
                int i2 = 0;
                while (i2 < m100055a2) {
                    int m100055a4 = c4209cr.m100055a(m99073a(m100055a2 - i2));
                    for (int i3 = 0; i3 < m100055a4 && i2 < m100055a2; i3++) {
                        jArr[i2] = m100055a3;
                        i2++;
                    }
                    m100055a3++;
                }
            }
            int m100055a5 = c4209cr.m100055a(4);
            if (m100055a5 <= 2) {
                if (m100055a5 == 1 || m100055a5 == 2) {
                    c4209cr.m100053b(32);
                    c4209cr.m100053b(32);
                    int m100055a6 = c4209cr.m100055a(4) + 1;
                    c4209cr.m100053b(1);
                    if (m100055a5 != 1) {
                        j = m100055a2 * m100055a;
                    } else if (m100055a != 0) {
                        j = m99070a(m100055a2, m100055a);
                    }
                    c4209cr.m100053b((int) (j * m100055a6));
                }
                return new C4417a(m100055a, m100055a2, jArr, m100055a5, m100052c);
            }
            throw C4187ch.m100188a("lookup type greater than 2 not decodable: " + m100055a5, null);
        }
        throw C4187ch.m100188a("expected code book to start with [0x56, 0x43, 0x42] at " + c4209cr.m100054b(), null);
    }

    /* renamed from: b */
    public static C4420d m99065b(C4066ah c4066ah) {
        m99072a(1, c4066ah, false);
        int m100768q = c4066ah.m100768q();
        int m100762w = c4066ah.m100762w();
        int m100768q2 = c4066ah.m100768q();
        int m100772m = c4066ah.m100772m();
        if (m100772m <= 0) {
            m100772m = -1;
        }
        int m100772m2 = c4066ah.m100772m();
        if (m100772m2 <= 0) {
            m100772m2 = -1;
        }
        int m100772m3 = c4066ah.m100772m();
        if (m100772m3 <= 0) {
            m100772m3 = -1;
        }
        int m100762w2 = c4066ah.m100762w();
        return new C4420d(m100768q, m100762w, m100768q2, m100772m, m100772m2, m100772m3, (int) Math.pow(2.0d, m100762w2 & 15), (int) Math.pow(2.0d, (m100762w2 & 240) >> 4), (c4066ah.m100762w() & 1) > 0, Arrays.copyOf(c4066ah.m100787c(), c4066ah.m100783e()));
    }

    /* renamed from: a */
    private static void m99071a(int i, C4209cr c4209cr) {
        int m100055a = c4209cr.m100055a(6) + 1;
        for (int i2 = 0; i2 < m100055a; i2++) {
            int m100055a2 = c4209cr.m100055a(16);
            if (m100055a2 != 0) {
                AbstractC5063oc.m96805b("VorbisUtil", "mapping type other than 0 not supported: " + m100055a2);
            } else {
                int m100055a3 = c4209cr.m100052c() ? c4209cr.m100055a(4) + 1 : 1;
                if (c4209cr.m100052c()) {
                    int m100055a4 = c4209cr.m100055a(8) + 1;
                    for (int i3 = 0; i3 < m100055a4; i3++) {
                        int i4 = i - 1;
                        c4209cr.m100053b(m99073a(i4));
                        c4209cr.m100053b(m99073a(i4));
                    }
                }
                if (c4209cr.m100055a(2) != 0) {
                    throw C4187ch.m100188a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (m100055a3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        c4209cr.m100053b(4);
                    }
                }
                for (int i6 = 0; i6 < m100055a3; i6++) {
                    c4209cr.m100053b(8);
                    c4209cr.m100053b(8);
                    c4209cr.m100053b(8);
                }
            }
        }
    }

    /* renamed from: a */
    public static C4418b m99069a(C4066ah c4066ah) {
        return m99067a(c4066ah, true, true);
    }

    /* renamed from: a */
    public static C4418b m99067a(C4066ah c4066ah, boolean z, boolean z2) {
        if (z) {
            m99072a(3, c4066ah, false);
        }
        String m100786c = c4066ah.m100786c((int) c4066ah.m100769p());
        int length = m100786c.length();
        long m100769p = c4066ah.m100769p();
        String[] strArr = new String[(int) m100769p];
        int i = length + 15;
        for (int i2 = 0; i2 < m100769p; i2++) {
            String m100786c2 = c4066ah.m100786c((int) c4066ah.m100769p());
            strArr[i2] = m100786c2;
            i = i + 4 + m100786c2.length();
        }
        if (z2 && (c4066ah.m100762w() & 1) == 0) {
            throw C4187ch.m100188a("framing bit expected to be set", null);
        }
        return new C4418b(m100786c, strArr, i + 1);
    }

    /* renamed from: a */
    public static C4419c[] m99068a(C4066ah c4066ah, int i) {
        m99072a(5, c4066ah, false);
        int m100762w = c4066ah.m100762w() + 1;
        C4209cr c4209cr = new C4209cr(c4066ah.m100787c());
        c4209cr.m100053b(c4066ah.m100785d() * 8);
        for (int i2 = 0; i2 < m100762w; i2++) {
            m99066a(c4209cr);
        }
        int m100055a = c4209cr.m100055a(6) + 1;
        for (int i3 = 0; i3 < m100055a; i3++) {
            if (c4209cr.m100055a(16) != 0) {
                throw C4187ch.m100188a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        m99064b(c4209cr);
        m99062d(c4209cr);
        m99071a(i, c4209cr);
        C4419c[] m99063c = m99063c(c4209cr);
        if (c4209cr.m100052c()) {
            return m99063c;
        }
        throw C4187ch.m100188a("framing bit after modes not set as expected", null);
    }

    /* renamed from: a */
    public static boolean m99072a(int i, C4066ah c4066ah, boolean z) {
        if (c4066ah.m100797a() < 7) {
            if (z) {
                return false;
            }
            throw C4187ch.m100188a("too short header: " + c4066ah.m100797a(), null);
        } else if (c4066ah.m100762w() != i) {
            if (z) {
                return false;
            }
            throw C4187ch.m100188a("expected header type " + Integer.toHexString(i), null);
        } else if (c4066ah.m100762w() == 118 && c4066ah.m100762w() == 111 && c4066ah.m100762w() == 114 && c4066ah.m100762w() == 98 && c4066ah.m100762w() == 105 && c4066ah.m100762w() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw C4187ch.m100188a("expected characters 'vorbis'", null);
        }
    }
}
