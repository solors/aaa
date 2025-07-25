package com.applovin.impl;

import com.applovin.impl.C4310e9;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.k */
/* loaded from: classes2.dex */
public abstract class AbstractC4682k {

    /* renamed from: a */
    private static final int[] f7286a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f7287b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f7288c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f7289d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f7290e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f7291f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.applovin.impl.k$b */
    /* loaded from: classes2.dex */
    public static final class C4684b {

        /* renamed from: a */
        public final String f7292a;

        /* renamed from: b */
        public final int f7293b;

        /* renamed from: c */
        public final int f7294c;

        /* renamed from: d */
        public final int f7295d;

        /* renamed from: e */
        public final int f7296e;

        /* renamed from: f */
        public final int f7297f;

        private C4684b(String str, int i, int i2, int i3, int i4, int i5) {
            this.f7292a = str;
            this.f7293b = i;
            this.f7295d = i2;
            this.f7294c = i3;
            this.f7296e = i4;
            this.f7297f = i5;
        }
    }

    /* renamed from: a */
    public static int m98097a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((AbstractC5863xp.m93010a(byteBuffer, i + 4) & (-2)) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static int m98093b(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f7286a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: a */
    private static int m98100a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f7287b;
            if (i >= iArr.length || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f7291f;
            if (i3 >= iArr2.length) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return (iArr2[i3] + (i2 % 2)) * 2;
            }
            int i5 = f7290e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    /* renamed from: b */
    public static C4310e9 m98094b(C4066ah c4066ah, String str, String str2, C5829x6 c5829x6) {
        c4066ah.m100778g(2);
        int i = f7287b[(c4066ah.m100762w() & 192) >> 6];
        int m100762w = c4066ah.m100762w();
        int i2 = f7289d[(m100762w & 14) >> 1];
        if ((m100762w & 1) != 0) {
            i2++;
        }
        if (((c4066ah.m100762w() & 30) >> 1) > 0 && (2 & c4066ah.m100762w()) != 0) {
            i2 += 2;
        }
        return new C4310e9.C4312b().m99615c(str).m99606f((c4066ah.m100797a() <= 0 || (c4066ah.m100762w() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").m99617c(i2).m99591n(i).m99625a(c5829x6).m99609e(str2).m99632a();
    }

    /* renamed from: a */
    public static C4310e9 m98099a(C4066ah c4066ah, String str, String str2, C5829x6 c5829x6) {
        int i = f7287b[(c4066ah.m100762w() & 192) >> 6];
        int m100762w = c4066ah.m100762w();
        int i2 = f7289d[(m100762w & 56) >> 3];
        if ((m100762w & 4) != 0) {
            i2++;
        }
        return new C4310e9.C4312b().m99615c(str).m99606f("audio/ac3").m99617c(i2).m99591n(i).m99625a(c5829x6).m99609e(str2).m99632a();
    }

    /* renamed from: a */
    public static C4684b m98098a(C5971zg c5971zg) {
        int m98100a;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        int m92403a;
        int i5;
        int i6;
        int i7;
        int i8;
        int m92389e = c5971zg.m92389e();
        c5971zg.m92390d(40);
        boolean z = c5971zg.m92403a(5) > 10;
        c5971zg.m92392c(m92389e);
        int i9 = -1;
        if (z) {
            c5971zg.m92390d(16);
            int m92403a2 = c5971zg.m92403a(2);
            if (m92403a2 == 0) {
                i9 = 0;
            } else if (m92403a2 == 1) {
                i9 = 1;
            } else if (m92403a2 == 2) {
                i9 = 2;
            }
            c5971zg.m92390d(3);
            m98100a = (c5971zg.m92403a(11) + 1) * 2;
            int m92403a3 = c5971zg.m92403a(2);
            if (m92403a3 == 3) {
                i = f7288c[c5971zg.m92403a(2)];
                i5 = 6;
                m92403a = 3;
            } else {
                m92403a = c5971zg.m92403a(2);
                i5 = f7286a[m92403a];
                i = f7287b[m92403a3];
            }
            i3 = i5 * 256;
            int m92403a4 = c5971zg.m92403a(3);
            boolean m92387f = c5971zg.m92387f();
            i2 = f7289d[m92403a4] + (m92387f ? 1 : 0);
            c5971zg.m92390d(10);
            if (c5971zg.m92387f()) {
                c5971zg.m92390d(8);
            }
            if (m92403a4 == 0) {
                c5971zg.m92390d(5);
                if (c5971zg.m92387f()) {
                    c5971zg.m92390d(8);
                }
            }
            if (i9 == 1 && c5971zg.m92387f()) {
                c5971zg.m92390d(16);
            }
            if (c5971zg.m92387f()) {
                if (m92403a4 > 2) {
                    c5971zg.m92390d(2);
                }
                if ((m92403a4 & 1) == 0 || m92403a4 <= 2) {
                    i7 = 6;
                } else {
                    i7 = 6;
                    c5971zg.m92390d(6);
                }
                if ((m92403a4 & 4) != 0) {
                    c5971zg.m92390d(i7);
                }
                if (m92387f && c5971zg.m92387f()) {
                    c5971zg.m92390d(5);
                }
                if (i9 == 0) {
                    if (c5971zg.m92387f()) {
                        i8 = 6;
                        c5971zg.m92390d(6);
                    } else {
                        i8 = 6;
                    }
                    if (m92403a4 == 0 && c5971zg.m92387f()) {
                        c5971zg.m92390d(i8);
                    }
                    if (c5971zg.m92387f()) {
                        c5971zg.m92390d(i8);
                    }
                    int m92403a5 = c5971zg.m92403a(2);
                    if (m92403a5 == 1) {
                        c5971zg.m92390d(5);
                    } else if (m92403a5 == 2) {
                        c5971zg.m92390d(12);
                    } else if (m92403a5 == 3) {
                        int m92403a6 = c5971zg.m92403a(5);
                        if (c5971zg.m92387f()) {
                            c5971zg.m92390d(5);
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(4);
                            }
                            if (c5971zg.m92387f()) {
                                if (c5971zg.m92387f()) {
                                    c5971zg.m92390d(4);
                                }
                                if (c5971zg.m92387f()) {
                                    c5971zg.m92390d(4);
                                }
                            }
                        }
                        if (c5971zg.m92387f()) {
                            c5971zg.m92390d(5);
                            if (c5971zg.m92387f()) {
                                c5971zg.m92390d(7);
                                if (c5971zg.m92387f()) {
                                    c5971zg.m92390d(8);
                                }
                            }
                        }
                        c5971zg.m92390d((m92403a6 + 2) * 8);
                        c5971zg.m92393c();
                    }
                    if (m92403a4 < 2) {
                        if (c5971zg.m92387f()) {
                            c5971zg.m92390d(14);
                        }
                        if (m92403a4 == 0 && c5971zg.m92387f()) {
                            c5971zg.m92390d(14);
                        }
                    }
                    if (c5971zg.m92387f()) {
                        if (m92403a == 0) {
                            c5971zg.m92390d(5);
                        } else {
                            for (int i10 = 0; i10 < i5; i10++) {
                                if (c5971zg.m92387f()) {
                                    c5971zg.m92390d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (c5971zg.m92387f()) {
                c5971zg.m92390d(5);
                if (m92403a4 == 2) {
                    c5971zg.m92390d(4);
                }
                if (m92403a4 >= 6) {
                    c5971zg.m92390d(2);
                }
                if (c5971zg.m92387f()) {
                    c5971zg.m92390d(8);
                }
                if (m92403a4 == 0 && c5971zg.m92387f()) {
                    c5971zg.m92390d(8);
                }
                if (m92403a3 < 3) {
                    c5971zg.m92386g();
                }
            }
            if (i9 == 0 && m92403a != 3) {
                c5971zg.m92386g();
            }
            if (i9 == 2 && (m92403a == 3 || c5971zg.m92387f())) {
                i6 = 6;
                c5971zg.m92390d(6);
            } else {
                i6 = 6;
            }
            str = (c5971zg.m92387f() && c5971zg.m92403a(i6) == 1 && c5971zg.m92403a(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i4 = i9;
        } else {
            c5971zg.m92390d(32);
            int m92403a7 = c5971zg.m92403a(2);
            String str2 = m92403a7 == 3 ? null : "audio/ac3";
            m98100a = m98100a(m92403a7, c5971zg.m92403a(6));
            c5971zg.m92390d(8);
            int m92403a8 = c5971zg.m92403a(3);
            if ((m92403a8 & 1) != 0 && m92403a8 != 1) {
                c5971zg.m92390d(2);
            }
            if ((m92403a8 & 4) != 0) {
                c5971zg.m92390d(2);
            }
            if (m92403a8 == 2) {
                c5971zg.m92390d(2);
            }
            int[] iArr = f7287b;
            i = m92403a7 < iArr.length ? iArr[m92403a7] : -1;
            i2 = f7289d[m92403a8] + (c5971zg.m92387f() ? 1 : 0);
            i3 = 1536;
            i4 = -1;
            str = str2;
        }
        return new C4684b(str, i4, i2, i, m98100a, i3);
    }

    /* renamed from: b */
    public static int m98092b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) == 186) {
                return 40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static int m98095a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m98100a((b & 192) >> 6, b & 63);
    }

    /* renamed from: a */
    public static int m98096a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }
}
