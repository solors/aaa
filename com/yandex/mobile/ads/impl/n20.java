package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.yandex.mobile.ads.impl.C31840xt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class n20 {

    /* renamed from: h */
    private static final byte[] f82529h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f82530i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f82531j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f82532a;

    /* renamed from: b */
    private final Paint f82533b;

    /* renamed from: c */
    private final Canvas f82534c;

    /* renamed from: d */
    private final C30900b f82535d;

    /* renamed from: e */
    private final C30899a f82536e;

    /* renamed from: f */
    private final C30906h f82537f;

    /* renamed from: g */
    private Bitmap f82538g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.n20$a */
    /* loaded from: classes8.dex */
    public static final class C30899a {

        /* renamed from: a */
        public final int f82539a;

        /* renamed from: b */
        public final int[] f82540b;

        /* renamed from: c */
        public final int[] f82541c;

        /* renamed from: d */
        public final int[] f82542d;

        public C30899a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f82539a = i;
            this.f82540b = iArr;
            this.f82541c = iArr2;
            this.f82542d = iArr3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$b */
    /* loaded from: classes8.dex */
    private static final class C30900b {

        /* renamed from: a */
        public final int f82543a;

        /* renamed from: b */
        public final int f82544b;

        /* renamed from: c */
        public final int f82545c;

        /* renamed from: d */
        public final int f82546d;

        /* renamed from: e */
        public final int f82547e;

        /* renamed from: f */
        public final int f82548f;

        public C30900b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f82543a = i;
            this.f82544b = i2;
            this.f82545c = i3;
            this.f82546d = i4;
            this.f82547e = i5;
            this.f82548f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.n20$c */
    /* loaded from: classes8.dex */
    public static final class C30901c {

        /* renamed from: a */
        public final int f82549a;

        /* renamed from: b */
        public final boolean f82550b;

        /* renamed from: c */
        public final byte[] f82551c;

        /* renamed from: d */
        public final byte[] f82552d;

        public C30901c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f82549a = i;
            this.f82550b = z;
            this.f82551c = bArr;
            this.f82552d = bArr2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$d */
    /* loaded from: classes8.dex */
    private static final class C30902d {

        /* renamed from: a */
        public final int f82553a;

        /* renamed from: b */
        public final int f82554b;

        /* renamed from: c */
        public final SparseArray<C30903e> f82555c;

        public C30902d(int i, int i2, SparseArray sparseArray) {
            this.f82553a = i;
            this.f82554b = i2;
            this.f82555c = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$e */
    /* loaded from: classes8.dex */
    private static final class C30903e {

        /* renamed from: a */
        public final int f82556a;

        /* renamed from: b */
        public final int f82557b;

        public C30903e(int i, int i2) {
            this.f82556a = i;
            this.f82557b = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$f */
    /* loaded from: classes8.dex */
    private static final class C30904f {

        /* renamed from: a */
        public final int f82558a;

        /* renamed from: b */
        public final boolean f82559b;

        /* renamed from: c */
        public final int f82560c;

        /* renamed from: d */
        public final int f82561d;

        /* renamed from: e */
        public final int f82562e;

        /* renamed from: f */
        public final int f82563f;

        /* renamed from: g */
        public final int f82564g;

        /* renamed from: h */
        public final int f82565h;

        /* renamed from: i */
        public final int f82566i;

        /* renamed from: j */
        public final SparseArray<C30905g> f82567j;

        public C30904f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SparseArray sparseArray) {
            this.f82558a = i;
            this.f82559b = z;
            this.f82560c = i2;
            this.f82561d = i3;
            this.f82562e = i4;
            this.f82563f = i5;
            this.f82564g = i6;
            this.f82565h = i7;
            this.f82566i = i8;
            this.f82567j = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$g */
    /* loaded from: classes8.dex */
    private static final class C30905g {

        /* renamed from: a */
        public final int f82568a;

        /* renamed from: b */
        public final int f82569b;

        public C30905g(int i, int i2) {
            this.f82568a = i;
            this.f82569b = i2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.n20$h */
    /* loaded from: classes8.dex */
    private static final class C30906h {

        /* renamed from: a */
        public final int f82570a;

        /* renamed from: b */
        public final int f82571b;

        /* renamed from: c */
        public final SparseArray<C30904f> f82572c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<C30899a> f82573d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<C30901c> f82574e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<C30899a> f82575f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<C30901c> f82576g = new SparseArray<>();
        @Nullable

        /* renamed from: h */
        public C30900b f82577h;
        @Nullable

        /* renamed from: i */
        public C30902d f82578i;

        public C30906h(int i, int i2) {
            this.f82570a = i;
            this.f82571b = i2;
        }
    }

    public n20(int i, int i2) {
        Paint paint = new Paint();
        this.f82532a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f82533b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f82534c = new Canvas();
        this.f82535d = new C30900b(719, 575, 0, 719, 0, 575);
        this.f82536e = new C30899a(0, m31708a(), m31702b(), m31701c());
        this.f82537f = new C30906h(i, i2);
    }

    /* renamed from: a */
    private static int m31707a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: b */
    private static int[] m31702b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i6 = 1; i6 < 16; i6++) {
            if (i6 < 8) {
                if ((i6 & 1) != 0) {
                    i3 = 255;
                } else {
                    i3 = 0;
                }
                if ((i6 & 2) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i6 & 4) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                iArr[i6] = m31707a(255, i3, i4, i5);
            } else {
                int i7 = 127;
                if ((i6 & 1) != 0) {
                    i = 127;
                } else {
                    i = 0;
                }
                if ((i6 & 2) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i6 & 4) == 0) {
                    i7 = 0;
                }
                iArr[i6] = m31707a(255, i, i2, i7);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int[] m31701c() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i19 = 0; i19 < 256; i19++) {
            int i20 = 255;
            if (i19 < 8) {
                if ((i19 & 1) != 0) {
                    i17 = 255;
                } else {
                    i17 = 0;
                }
                if ((i19 & 2) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i19 & 4) == 0) {
                    i20 = 0;
                }
                iArr[i19] = m31707a(63, i17, i18, i20);
            } else {
                int i21 = i19 & 136;
                int i22 = 170;
                int i23 = 85;
                if (i21 != 0) {
                    if (i21 != 8) {
                        int i24 = 43;
                        if (i21 != 128) {
                            if (i21 == 136) {
                                if ((i19 & 1) != 0) {
                                    i13 = 43;
                                } else {
                                    i13 = 0;
                                }
                                if ((i19 & 16) != 0) {
                                    i14 = 85;
                                } else {
                                    i14 = 0;
                                }
                                int i25 = i13 + i14;
                                if ((i19 & 2) != 0) {
                                    i15 = 43;
                                } else {
                                    i15 = 0;
                                }
                                if ((i19 & 32) != 0) {
                                    i16 = 85;
                                } else {
                                    i16 = 0;
                                }
                                int i26 = i15 + i16;
                                if ((i19 & 4) == 0) {
                                    i24 = 0;
                                }
                                if ((i19 & 64) == 0) {
                                    i23 = 0;
                                }
                                iArr[i19] = m31707a(255, i25, i26, i24 + i23);
                            }
                        } else {
                            if ((i19 & 1) != 0) {
                                i9 = 43;
                            } else {
                                i9 = 0;
                            }
                            int i27 = i9 + 127;
                            if ((i19 & 16) != 0) {
                                i10 = 85;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i27 + i10;
                            if ((i19 & 2) != 0) {
                                i11 = 43;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i11 + 127;
                            if ((i19 & 32) != 0) {
                                i12 = 85;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i29 + i12;
                            if ((i19 & 4) == 0) {
                                i24 = 0;
                            }
                            int i31 = i24 + 127;
                            if ((i19 & 64) == 0) {
                                i23 = 0;
                            }
                            iArr[i19] = m31707a(255, i28, i30, i31 + i23);
                        }
                    } else {
                        if ((i19 & 1) != 0) {
                            i5 = 85;
                        } else {
                            i5 = 0;
                        }
                        if ((i19 & 16) != 0) {
                            i6 = 170;
                        } else {
                            i6 = 0;
                        }
                        int i32 = i5 + i6;
                        if ((i19 & 2) != 0) {
                            i7 = 85;
                        } else {
                            i7 = 0;
                        }
                        if ((i19 & 32) != 0) {
                            i8 = 170;
                        } else {
                            i8 = 0;
                        }
                        int i33 = i7 + i8;
                        if ((i19 & 4) == 0) {
                            i23 = 0;
                        }
                        if ((i19 & 64) == 0) {
                            i22 = 0;
                        }
                        iArr[i19] = m31707a(127, i32, i33, i23 + i22);
                    }
                } else {
                    if ((i19 & 1) != 0) {
                        i = 85;
                    } else {
                        i = 0;
                    }
                    if ((i19 & 16) != 0) {
                        i2 = 170;
                    } else {
                        i2 = 0;
                    }
                    int i34 = i + i2;
                    if ((i19 & 2) != 0) {
                        i3 = 85;
                    } else {
                        i3 = 0;
                    }
                    if ((i19 & 32) != 0) {
                        i4 = 170;
                    } else {
                        i4 = 0;
                    }
                    int i35 = i3 + i4;
                    if ((i19 & 4) == 0) {
                        i23 = 0;
                    }
                    if ((i19 & 64) == 0) {
                        i22 = 0;
                    }
                    iArr[i19] = m31707a(255, i34, i35, i23 + i22);
                }
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public final void m31700d() {
        C30906h c30906h = this.f82537f;
        c30906h.f82572c.clear();
        c30906h.f82573d.clear();
        c30906h.f82574e.clear();
        c30906h.f82575f.clear();
        c30906h.f82576g.clear();
        c30906h.f82577h = null;
        c30906h.f82578i = null;
    }

    /* renamed from: a */
    private static int[] m31708a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248 A[LOOP:3: B:93:0x0194->B:122:0x0248, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a3  */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m31703a(byte[] r23, int[] r24, int r25, int r26, int r27, @androidx.annotation.Nullable android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.n20.m31703a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: a */
    private static C30899a m31704a(bc1 bc1Var, int i) {
        int m35502b;
        int i2;
        int m35502b2;
        int m35502b3;
        int i3;
        int i4 = 8;
        int m35502b4 = bc1Var.m35502b(8);
        bc1Var.m35497d(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] m31708a = m31708a();
        int[] m31702b = m31702b();
        int[] m31701c = m31701c();
        while (i6 > 0) {
            int m35502b5 = bc1Var.m35502b(i4);
            int m35502b6 = bc1Var.m35502b(i4);
            int[] iArr = (m35502b6 & 128) != 0 ? m31708a : (m35502b6 & 64) != 0 ? m31702b : m31701c;
            if ((m35502b6 & 1) != 0) {
                m35502b3 = bc1Var.m35502b(i4);
                i3 = bc1Var.m35502b(i4);
                m35502b = bc1Var.m35502b(i4);
                m35502b2 = bc1Var.m35502b(i4);
                i2 = i6 - 6;
            } else {
                int m35502b7 = bc1Var.m35502b(4) << 4;
                m35502b = bc1Var.m35502b(4) << 4;
                i2 = i6 - 4;
                m35502b2 = bc1Var.m35502b(i5) << 6;
                m35502b3 = bc1Var.m35502b(6) << i5;
                i3 = m35502b7;
            }
            if (m35502b3 == 0) {
                m35502b2 = 255;
                i3 = 0;
                m35502b = 0;
            }
            double d = m35502b3;
            double d2 = i3 - 128;
            double d3 = m35502b - 128;
            int i7 = y32.f88010a;
            iArr[m35502b5] = m31707a((byte) (255 - (m35502b2 & 255)), Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)), Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)), Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255)));
            i6 = i2;
            m35502b4 = m35502b4;
            i4 = 8;
            i5 = 2;
        }
        return new C30899a(m35502b4, m31708a, m31702b, m31701c);
    }

    /* renamed from: a */
    private static C30901c m31705a(bc1 bc1Var) {
        byte[] bArr;
        int m35502b = bc1Var.m35502b(16);
        bc1Var.m35497d(4);
        int m35502b2 = bc1Var.m35502b(2);
        boolean m35494f = bc1Var.m35494f();
        bc1Var.m35497d(1);
        byte[] bArr2 = y32.f88015f;
        if (m35502b2 == 1) {
            bc1Var.m35497d(bc1Var.m35502b(8) * 16);
        } else if (m35502b2 == 0) {
            int m35502b3 = bc1Var.m35502b(16);
            int m35502b4 = bc1Var.m35502b(16);
            if (m35502b3 > 0) {
                bArr2 = new byte[m35502b3];
                bc1Var.m35501b(bArr2, m35502b3);
            }
            if (m35502b4 > 0) {
                bArr = new byte[m35502b4];
                bc1Var.m35501b(bArr, m35502b4);
                return new C30901c(m35502b, m35494f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C30901c(m35502b, m35494f, bArr2, bArr);
    }

    /* renamed from: a */
    public final List m31706a(int i, byte[] bArr) {
        char c;
        int i2;
        SparseArray<C30903e> sparseArray;
        int i3;
        SparseArray<C30905g> sparseArray2;
        int[] iArr;
        C30904f c30904f;
        int i4;
        int i5;
        int i6;
        int i7;
        bc1 bc1Var = new bc1(i, bArr);
        while (bc1Var.m35503b() >= 48 && bc1Var.m35502b(8) == 15) {
            C30906h c30906h = this.f82537f;
            int m35502b = bc1Var.m35502b(8);
            int i8 = 16;
            int m35502b2 = bc1Var.m35502b(16);
            int m35502b3 = bc1Var.m35502b(16);
            int m35498d = bc1Var.m35498d() + m35502b3;
            if (m35502b3 * 8 > bc1Var.m35503b()) {
                gq0.m33792d("DvbParser", "Data field length exceeds limit");
                bc1Var.m35497d(bc1Var.m35503b());
            } else {
                switch (m35502b) {
                    case 16:
                        if (m35502b2 == c30906h.f82570a) {
                            C30902d c30902d = c30906h.f82578i;
                            bc1Var.m35502b(8);
                            int m35502b4 = bc1Var.m35502b(4);
                            int m35502b5 = bc1Var.m35502b(2);
                            bc1Var.m35497d(2);
                            int i9 = m35502b3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i9 > 0) {
                                int m35502b6 = bc1Var.m35502b(8);
                                bc1Var.m35497d(8);
                                i9 -= 6;
                                sparseArray3.put(m35502b6, new C30903e(bc1Var.m35502b(16), bc1Var.m35502b(16)));
                            }
                            C30902d c30902d2 = new C30902d(m35502b4, m35502b5, sparseArray3);
                            if (m35502b5 != 0) {
                                c30906h.f82578i = c30902d2;
                                c30906h.f82572c.clear();
                                c30906h.f82573d.clear();
                                c30906h.f82574e.clear();
                                break;
                            } else if (c30902d != null && c30902d.f82553a != m35502b4) {
                                c30906h.f82578i = c30902d2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        C30902d c30902d3 = c30906h.f82578i;
                        if (m35502b2 == c30906h.f82570a && c30902d3 != null) {
                            int m35502b7 = bc1Var.m35502b(8);
                            bc1Var.m35497d(4);
                            boolean m35494f = bc1Var.m35494f();
                            bc1Var.m35497d(3);
                            int m35502b8 = bc1Var.m35502b(16);
                            int m35502b9 = bc1Var.m35502b(16);
                            bc1Var.m35502b(3);
                            int m35502b10 = bc1Var.m35502b(3);
                            bc1Var.m35497d(2);
                            int m35502b11 = bc1Var.m35502b(8);
                            int m35502b12 = bc1Var.m35502b(8);
                            int m35502b13 = bc1Var.m35502b(4);
                            int m35502b14 = bc1Var.m35502b(2);
                            bc1Var.m35497d(2);
                            int i10 = m35502b3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i10 > 0) {
                                int m35502b15 = bc1Var.m35502b(i8);
                                int m35502b16 = bc1Var.m35502b(2);
                                bc1Var.m35502b(2);
                                int m35502b17 = bc1Var.m35502b(12);
                                bc1Var.m35497d(4);
                                int m35502b18 = bc1Var.m35502b(12);
                                int i11 = i10 - 6;
                                if (m35502b16 == 1 || m35502b16 == 2) {
                                    bc1Var.m35502b(8);
                                    bc1Var.m35502b(8);
                                    i10 -= 8;
                                } else {
                                    i10 = i11;
                                }
                                sparseArray4.put(m35502b15, new C30905g(m35502b17, m35502b18));
                                i8 = 16;
                            }
                            C30904f c30904f2 = new C30904f(m35502b7, m35494f, m35502b8, m35502b9, m35502b10, m35502b11, m35502b12, m35502b13, m35502b14, sparseArray4);
                            if (c30902d3.f82554b == 0 && (c30904f = c30906h.f82572c.get(m35502b7)) != null) {
                                SparseArray<C30905g> sparseArray5 = c30904f.f82567j;
                                for (int i12 = 0; i12 < sparseArray5.size(); i12++) {
                                    c30904f2.f82567j.put(sparseArray5.keyAt(i12), sparseArray5.valueAt(i12));
                                }
                            }
                            c30906h.f82572c.put(c30904f2.f82558a, c30904f2);
                            break;
                        }
                        break;
                    case 18:
                        if (m35502b2 == c30906h.f82570a) {
                            C30899a m31704a = m31704a(bc1Var, m35502b3);
                            c30906h.f82573d.put(m31704a.f82539a, m31704a);
                            break;
                        } else if (m35502b2 == c30906h.f82571b) {
                            C30899a m31704a2 = m31704a(bc1Var, m35502b3);
                            c30906h.f82575f.put(m31704a2.f82539a, m31704a2);
                            break;
                        }
                        break;
                    case 19:
                        if (m35502b2 == c30906h.f82570a) {
                            C30901c m31705a = m31705a(bc1Var);
                            c30906h.f82574e.put(m31705a.f82549a, m31705a);
                            break;
                        } else if (m35502b2 == c30906h.f82571b) {
                            C30901c m31705a2 = m31705a(bc1Var);
                            c30906h.f82576g.put(m31705a2.f82549a, m31705a2);
                            break;
                        }
                        break;
                    case 20:
                        if (m35502b2 == c30906h.f82570a) {
                            bc1Var.m35497d(4);
                            boolean m35494f2 = bc1Var.m35494f();
                            bc1Var.m35497d(3);
                            int m35502b19 = bc1Var.m35502b(16);
                            int m35502b20 = bc1Var.m35502b(16);
                            if (m35494f2) {
                                int m35502b21 = bc1Var.m35502b(16);
                                i4 = bc1Var.m35502b(16);
                                i7 = bc1Var.m35502b(16);
                                i6 = m35502b21;
                                i5 = bc1Var.m35502b(16);
                            } else {
                                i4 = m35502b19;
                                i5 = m35502b20;
                                i6 = 0;
                                i7 = 0;
                            }
                            c30906h.f82577h = new C30900b(m35502b19, m35502b20, i6, i4, i7, i5);
                            break;
                        }
                        break;
                }
                bc1Var.m35495e(m35498d - bc1Var.m35498d());
            }
        }
        C30906h c30906h2 = this.f82537f;
        C30902d c30902d4 = c30906h2.f82578i;
        if (c30902d4 == null) {
            return Collections.emptyList();
        }
        C30900b c30900b = c30906h2.f82577h;
        if (c30900b == null) {
            c30900b = this.f82535d;
        }
        Bitmap bitmap = this.f82538g;
        if (bitmap == null || c30900b.f82543a + 1 != bitmap.getWidth() || c30900b.f82544b + 1 != this.f82538g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c30900b.f82543a + 1, c30900b.f82544b + 1, Bitmap.Config.ARGB_8888);
            this.f82538g = createBitmap;
            this.f82534c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<C30903e> sparseArray6 = c30902d4.f82555c;
        int i13 = 0;
        while (i13 < sparseArray6.size()) {
            this.f82534c.save();
            C30903e valueAt = sparseArray6.valueAt(i13);
            C30904f c30904f3 = this.f82537f.f82572c.get(sparseArray6.keyAt(i13));
            int i14 = valueAt.f82556a + c30900b.f82545c;
            int i15 = valueAt.f82557b + c30900b.f82547e;
            this.f82534c.clipRect(i14, i15, Math.min(c30904f3.f82560c + i14, c30900b.f82546d), Math.min(c30904f3.f82561d + i15, c30900b.f82548f));
            C30899a c30899a = this.f82537f.f82573d.get(c30904f3.f82563f);
            if (c30899a == null && (c30899a = this.f82537f.f82575f.get(c30904f3.f82563f)) == null) {
                c30899a = this.f82536e;
            }
            SparseArray<C30905g> sparseArray7 = c30904f3.f82567j;
            int i16 = 0;
            while (i16 < sparseArray7.size()) {
                int keyAt = sparseArray7.keyAt(i16);
                C30905g valueAt2 = sparseArray7.valueAt(i16);
                C30901c c30901c = this.f82537f.f82574e.get(keyAt);
                if (c30901c == null) {
                    c30901c = this.f82537f.f82576g.get(keyAt);
                }
                if (c30901c != null) {
                    Paint paint = c30901c.f82550b ? null : this.f82532a;
                    int i17 = c30904f3.f82562e;
                    int i18 = valueAt2.f82568a + i14;
                    int i19 = valueAt2.f82569b + i15;
                    sparseArray = sparseArray6;
                    Canvas canvas = this.f82534c;
                    sparseArray2 = sparseArray7;
                    if (i17 == 3) {
                        iArr = c30899a.f82542d;
                    } else if (i17 == 2) {
                        iArr = c30899a.f82541c;
                    } else {
                        iArr = c30899a.f82540b;
                    }
                    i3 = i13;
                    int[] iArr2 = iArr;
                    Paint paint2 = paint;
                    m31703a(c30901c.f82551c, iArr2, i17, i18, i19, paint2, canvas);
                    m31703a(c30901c.f82552d, iArr2, i17, i18, i19 + 1, paint2, canvas);
                } else {
                    sparseArray = sparseArray6;
                    i3 = i13;
                    sparseArray2 = sparseArray7;
                }
                i16++;
                sparseArray6 = sparseArray;
                sparseArray7 = sparseArray2;
                i13 = i3;
            }
            SparseArray<C30903e> sparseArray8 = sparseArray6;
            int i20 = i13;
            if (c30904f3.f82559b) {
                int i21 = c30904f3.f82562e;
                if (i21 == 3) {
                    i2 = c30899a.f82542d[c30904f3.f82564g];
                    c = 2;
                } else {
                    c = 2;
                    if (i21 == 2) {
                        i2 = c30899a.f82541c[c30904f3.f82565h];
                    } else {
                        i2 = c30899a.f82540b[c30904f3.f82566i];
                    }
                }
                this.f82533b.setColor(i2);
                this.f82534c.drawRect(i14, i15, c30904f3.f82560c + i14, c30904f3.f82561d + i15, this.f82533b);
            } else {
                c = 2;
            }
            arrayList.add(new C31840xt.C31841a().m27247a(Bitmap.createBitmap(this.f82538g, i14, i15, c30904f3.f82560c, c30904f3.f82561d)).m27242b(i14 / c30900b.f82543a).m27241b(0).m27248a(0, i15 / c30900b.f82544b).m27249a(0).m27232d(c30904f3.f82560c / c30900b.f82543a).m27250a(c30904f3.f82561d / c30900b.f82544b).m27251a());
            this.f82534c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f82534c.restore();
            i13 = i20 + 1;
            sparseArray6 = sparseArray8;
        }
        return Collections.unmodifiableList(arrayList);
    }
}
