package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.monetization.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.v90;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.t */
/* loaded from: classes8.dex */
public final class C31415t {

    /* renamed from: a */
    private static final int[] f85460a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f85461b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f85462c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f85463d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f85464e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f85465f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: com.yandex.mobile.ads.impl.t$a */
    /* loaded from: classes8.dex */
    public static final class C31416a {
        @Nullable

        /* renamed from: a */
        public final String f85466a;

        /* renamed from: b */
        public final int f85467b;

        /* renamed from: c */
        public final int f85468c;

        /* renamed from: d */
        public final int f85469d;

        /* renamed from: e */
        public final int f85470e;

        private C31416a(@Nullable String str, int i, int i2, int i3, int i4) {
            this.f85466a = str;
            this.f85468c = i;
            this.f85467b = i2;
            this.f85469d = i3;
            this.f85470e = i4;
        }
    }

    /* renamed from: a */
    private static int m29340a(int i, int i2) {
        int i3 = i2 / 2;
        if (i >= 0) {
            int[] iArr = f85461b;
            if (i >= 3 || i2 < 0) {
                return -1;
            }
            int[] iArr2 = f85465f;
            if (i3 >= 19) {
                return -1;
            }
            int i4 = iArr[i];
            if (i4 == 44100) {
                return ((i2 % 2) + iArr2[i3]) * 2;
            }
            int i5 = f85464e[i3];
            return i4 == 32000 ? i5 * 6 : i5 * 4;
        }
        return -1;
    }

    /* renamed from: b */
    public static v90 m29335b(cc1 cc1Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        String str3;
        cc1Var.m35284f(2);
        int i = f85461b[(cc1Var.m35270t() & 192) >> 6];
        int m35270t = cc1Var.m35270t();
        int i2 = f85463d[(m35270t & 14) >> 1];
        if ((m35270t & 1) != 0) {
            i2++;
        }
        if (((cc1Var.m35270t() & 30) >> 1) > 0 && (2 & cc1Var.m35270t()) != 0) {
            i2 += 2;
        }
        if (cc1Var.m35299a() > 0 && (cc1Var.m35270t() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        return new v90.C31640a().m28438b(str).m28426e(str3).m28436c(i2).m28409l(i).m28450a(drmInitData).m28430d(str2).m28454a();
    }

    /* renamed from: a */
    public static v90 m29338a(cc1 cc1Var, String str, String str2, @Nullable DrmInitData drmInitData) {
        int i = f85461b[(cc1Var.m35270t() & 192) >> 6];
        int m35270t = cc1Var.m35270t();
        int i2 = f85463d[(m35270t & 56) >> 3];
        if ((m35270t & 4) != 0) {
            i2++;
        }
        return new v90.C31640a().m28438b(str).m28426e("audio/ac3").m28436c(i2).m28409l(i).m28450a(drmInitData).m28430d(str2).m28454a();
    }

    /* renamed from: a */
    public static int m29337a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f85460a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    /* renamed from: a */
    public static C31416a m29339a(bc1 bc1Var) {
        int m29340a;
        int i;
        int i2;
        int i3;
        String str;
        int m35502b;
        int i4;
        int i5;
        int i6;
        int i7;
        int m35496e = bc1Var.m35496e();
        bc1Var.m35497d(40);
        boolean z = bc1Var.m35502b(5) > 10;
        bc1Var.m35499c(m35496e);
        if (z) {
            bc1Var.m35497d(16);
            int m35502b2 = bc1Var.m35502b(2);
            if (m35502b2 == 0) {
                r1 = 0;
            } else if (m35502b2 == 1) {
                r1 = 1;
            } else if (m35502b2 == 2) {
                r1 = 2;
            }
            bc1Var.m35497d(3);
            m29340a = (bc1Var.m35502b(11) + 1) * 2;
            int m35502b3 = bc1Var.m35502b(2);
            if (m35502b3 == 3) {
                i3 = f85462c[bc1Var.m35502b(2)];
                i4 = 6;
                m35502b = 3;
            } else {
                m35502b = bc1Var.m35502b(2);
                i4 = f85460a[m35502b];
                i3 = f85461b[m35502b3];
            }
            i2 = i4 * 256;
            int m35502b4 = bc1Var.m35502b(3);
            boolean m35494f = bc1Var.m35494f();
            i = f85463d[m35502b4] + (m35494f ? 1 : 0);
            bc1Var.m35497d(10);
            if (bc1Var.m35494f()) {
                bc1Var.m35497d(8);
            }
            if (m35502b4 == 0) {
                bc1Var.m35497d(5);
                if (bc1Var.m35494f()) {
                    bc1Var.m35497d(8);
                }
            }
            if (r1 == 1 && bc1Var.m35494f()) {
                bc1Var.m35497d(16);
            }
            if (bc1Var.m35494f()) {
                if (m35502b4 > 2) {
                    bc1Var.m35497d(2);
                }
                if ((m35502b4 & 1) == 0 || m35502b4 <= 2) {
                    i6 = 6;
                } else {
                    i6 = 6;
                    bc1Var.m35497d(6);
                }
                if ((m35502b4 & 4) != 0) {
                    bc1Var.m35497d(i6);
                }
                if (m35494f && bc1Var.m35494f()) {
                    bc1Var.m35497d(5);
                }
                if (r1 == 0) {
                    if (bc1Var.m35494f()) {
                        i7 = 6;
                        bc1Var.m35497d(6);
                    } else {
                        i7 = 6;
                    }
                    if (m35502b4 == 0 && bc1Var.m35494f()) {
                        bc1Var.m35497d(i7);
                    }
                    if (bc1Var.m35494f()) {
                        bc1Var.m35497d(i7);
                    }
                    int m35502b5 = bc1Var.m35502b(2);
                    if (m35502b5 == 1) {
                        bc1Var.m35497d(5);
                    } else if (m35502b5 == 2) {
                        bc1Var.m35497d(12);
                    } else if (m35502b5 == 3) {
                        int m35502b6 = bc1Var.m35502b(5);
                        if (bc1Var.m35494f()) {
                            bc1Var.m35497d(5);
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(4);
                            }
                            if (bc1Var.m35494f()) {
                                if (bc1Var.m35494f()) {
                                    bc1Var.m35497d(4);
                                }
                                if (bc1Var.m35494f()) {
                                    bc1Var.m35497d(4);
                                }
                            }
                        }
                        if (bc1Var.m35494f()) {
                            bc1Var.m35497d(5);
                            if (bc1Var.m35494f()) {
                                bc1Var.m35497d(7);
                                if (bc1Var.m35494f()) {
                                    bc1Var.m35497d(8);
                                }
                            }
                        }
                        bc1Var.m35497d((m35502b6 + 2) * 8);
                        bc1Var.m35500c();
                    }
                    if (m35502b4 < 2) {
                        if (bc1Var.m35494f()) {
                            bc1Var.m35497d(14);
                        }
                        if (m35502b4 == 0 && bc1Var.m35494f()) {
                            bc1Var.m35497d(14);
                        }
                    }
                    if (bc1Var.m35494f()) {
                        if (m35502b == 0) {
                            bc1Var.m35497d(5);
                        } else {
                            for (int i8 = 0; i8 < i4; i8++) {
                                if (bc1Var.m35494f()) {
                                    bc1Var.m35497d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (bc1Var.m35494f()) {
                bc1Var.m35497d(5);
                if (m35502b4 == 2) {
                    bc1Var.m35497d(4);
                }
                if (m35502b4 >= 6) {
                    bc1Var.m35497d(2);
                }
                if (bc1Var.m35494f()) {
                    bc1Var.m35497d(8);
                }
                if (m35502b4 == 0 && bc1Var.m35494f()) {
                    bc1Var.m35497d(8);
                }
                if (m35502b3 < 3) {
                    bc1Var.m35492h();
                }
            }
            if (r1 == 0 && m35502b != 3) {
                bc1Var.m35492h();
            }
            if (r1 == 2 && (m35502b == 3 || bc1Var.m35494f())) {
                i5 = 6;
                bc1Var.m35497d(6);
            } else {
                i5 = 6;
            }
            str = (bc1Var.m35494f() && bc1Var.m35502b(i5) == 1 && bc1Var.m35502b(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
        } else {
            bc1Var.m35497d(32);
            int m35502b7 = bc1Var.m35502b(2);
            String str2 = m35502b7 == 3 ? null : "audio/ac3";
            m29340a = m29340a(m35502b7, bc1Var.m35502b(6));
            bc1Var.m35497d(8);
            int m35502b8 = bc1Var.m35502b(3);
            if ((m35502b8 & 1) != 0 && m35502b8 != 1) {
                bc1Var.m35497d(2);
            }
            if ((m35502b8 & 4) != 0) {
                bc1Var.m35497d(2);
            }
            if (m35502b8 == 2) {
                bc1Var.m35497d(2);
            }
            r1 = m35502b7 < 3 ? f85461b[m35502b7] : -1;
            i = f85463d[m35502b8] + (bc1Var.m35494f() ? 1 : 0);
            i2 = 1536;
            i3 = r1;
            str = str2;
        }
        return new C31416a(str, i, i3, m29340a, i2);
    }

    /* renamed from: a */
    public static int m29336a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b = bArr[4];
        return m29340a((b & 192) >> 6, b & 63);
    }
}
