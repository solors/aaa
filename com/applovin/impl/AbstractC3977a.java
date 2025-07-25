package com.applovin.impl;

/* renamed from: com.applovin.impl.a */
/* loaded from: classes2.dex */
public abstract class AbstractC3977a {

    /* renamed from: a */
    private static final int[] f4451a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f4452b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.impl.a$b */
    /* loaded from: classes2.dex */
    public static final class C3979b {

        /* renamed from: a */
        public final int f4453a;

        /* renamed from: b */
        public final int f4454b;

        /* renamed from: c */
        public final String f4455c;

        private C3979b(int i, int i2, String str) {
            this.f4453a = i;
            this.f4454b = i2;
            this.f4455c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m101091a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* renamed from: b */
    private static int m101086b(C5971zg c5971zg) {
        int m92403a = c5971zg.m92403a(4);
        if (m92403a == 15) {
            return c5971zg.m92403a(24);
        }
        if (m92403a < 13) {
            return f4451a[m92403a];
        }
        throw C4187ch.m100188a(null, null);
    }

    /* renamed from: a */
    private static int m101090a(C5971zg c5971zg) {
        int m92403a = c5971zg.m92403a(5);
        return m92403a == 31 ? c5971zg.m92403a(6) + 32 : m92403a;
    }

    /* renamed from: a */
    public static C3979b m101088a(C5971zg c5971zg, boolean z) {
        int m101090a = m101090a(c5971zg);
        int m101086b = m101086b(c5971zg);
        int m92403a = c5971zg.m92403a(4);
        String str = "mp4a.40." + m101090a;
        if (m101090a == 5 || m101090a == 29) {
            m101086b = m101086b(c5971zg);
            m101090a = m101090a(c5971zg);
            if (m101090a == 22) {
                m92403a = c5971zg.m92403a(4);
            }
        }
        if (z) {
            if (m101090a != 6 && m101090a != 7 && m101090a != 17 && m101090a != 1 && m101090a != 2 && m101090a != 3 && m101090a != 4) {
                switch (m101090a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C4187ch.m100189a("Unsupported audio object type: " + m101090a);
                }
            }
            m101089a(c5971zg, m101090a, m92403a);
            switch (m101090a) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m92403a2 = c5971zg.m92403a(2);
                    if (m92403a2 == 2 || m92403a2 == 3) {
                        throw C4187ch.m100189a("Unsupported epConfig: " + m92403a2);
                    }
            }
        }
        int i = f4452b[m92403a];
        if (i != -1) {
            return new C3979b(m101086b, i, str);
        }
        throw C4187ch.m100188a(null, null);
    }

    /* renamed from: a */
    private static void m101089a(C5971zg c5971zg, int i, int i2) {
        if (c5971zg.m92387f()) {
            AbstractC5063oc.m96800d("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c5971zg.m92387f()) {
            c5971zg.m92390d(14);
        }
        boolean m92387f = c5971zg.m92387f();
        if (i2 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i == 6 || i == 20) {
            c5971zg.m92390d(3);
        }
        if (m92387f) {
            if (i == 22) {
                c5971zg.m92390d(16);
            }
            if (i == 17 || i == 19 || i == 20 || i == 23) {
                c5971zg.m92390d(3);
            }
            c5971zg.m92390d(1);
        }
    }

    /* renamed from: a */
    public static C3979b m101087a(byte[] bArr) {
        return m101088a(new C5971zg(bArr), false);
    }
}
