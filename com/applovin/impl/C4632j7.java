package com.applovin.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.core.view.ViewCompat;
import com.applovin.impl.C3989a5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.j7 */
/* loaded from: classes2.dex */
final class C4632j7 {

    /* renamed from: h */
    private static final byte[] f7068h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f7069i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f7070j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f7071a;

    /* renamed from: b */
    private final Paint f7072b;

    /* renamed from: c */
    private final Canvas f7073c;

    /* renamed from: d */
    private final C4634b f7074d;

    /* renamed from: e */
    private final C4633a f7075e;

    /* renamed from: f */
    private final C4640h f7076f;

    /* renamed from: g */
    private Bitmap f7077g;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$a */
    /* loaded from: classes2.dex */
    public static final class C4633a {

        /* renamed from: a */
        public final int f7078a;

        /* renamed from: b */
        public final int[] f7079b;

        /* renamed from: c */
        public final int[] f7080c;

        /* renamed from: d */
        public final int[] f7081d;

        public C4633a(int i, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f7078a = i;
            this.f7079b = iArr;
            this.f7080c = iArr2;
            this.f7081d = iArr3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$b */
    /* loaded from: classes2.dex */
    public static final class C4634b {

        /* renamed from: a */
        public final int f7082a;

        /* renamed from: b */
        public final int f7083b;

        /* renamed from: c */
        public final int f7084c;

        /* renamed from: d */
        public final int f7085d;

        /* renamed from: e */
        public final int f7086e;

        /* renamed from: f */
        public final int f7087f;

        public C4634b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7082a = i;
            this.f7083b = i2;
            this.f7084c = i3;
            this.f7085d = i4;
            this.f7086e = i5;
            this.f7087f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$c */
    /* loaded from: classes2.dex */
    public static final class C4635c {

        /* renamed from: a */
        public final int f7088a;

        /* renamed from: b */
        public final boolean f7089b;

        /* renamed from: c */
        public final byte[] f7090c;

        /* renamed from: d */
        public final byte[] f7091d;

        public C4635c(int i, boolean z, byte[] bArr, byte[] bArr2) {
            this.f7088a = i;
            this.f7089b = z;
            this.f7090c = bArr;
            this.f7091d = bArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$d */
    /* loaded from: classes2.dex */
    public static final class C4636d {

        /* renamed from: a */
        public final int f7092a;

        /* renamed from: b */
        public final int f7093b;

        /* renamed from: c */
        public final int f7094c;

        /* renamed from: d */
        public final SparseArray f7095d;

        public C4636d(int i, int i2, int i3, SparseArray sparseArray) {
            this.f7092a = i;
            this.f7093b = i2;
            this.f7094c = i3;
            this.f7095d = sparseArray;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$e */
    /* loaded from: classes2.dex */
    public static final class C4637e {

        /* renamed from: a */
        public final int f7096a;

        /* renamed from: b */
        public final int f7097b;

        public C4637e(int i, int i2) {
            this.f7096a = i;
            this.f7097b = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$f */
    /* loaded from: classes2.dex */
    public static final class C4638f {

        /* renamed from: a */
        public final int f7098a;

        /* renamed from: b */
        public final boolean f7099b;

        /* renamed from: c */
        public final int f7100c;

        /* renamed from: d */
        public final int f7101d;

        /* renamed from: e */
        public final int f7102e;

        /* renamed from: f */
        public final int f7103f;

        /* renamed from: g */
        public final int f7104g;

        /* renamed from: h */
        public final int f7105h;

        /* renamed from: i */
        public final int f7106i;

        /* renamed from: j */
        public final int f7107j;

        /* renamed from: k */
        public final SparseArray f7108k;

        public C4638f(int i, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f7098a = i;
            this.f7099b = z;
            this.f7100c = i2;
            this.f7101d = i3;
            this.f7102e = i4;
            this.f7103f = i5;
            this.f7104g = i6;
            this.f7105h = i7;
            this.f7106i = i8;
            this.f7107j = i9;
            this.f7108k = sparseArray;
        }

        /* renamed from: a */
        public void m98289a(C4638f c4638f) {
            SparseArray sparseArray = c4638f.f7108k;
            for (int i = 0; i < sparseArray.size(); i++) {
                this.f7108k.put(sparseArray.keyAt(i), (C4639g) sparseArray.valueAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$g */
    /* loaded from: classes2.dex */
    public static final class C4639g {

        /* renamed from: a */
        public final int f7109a;

        /* renamed from: b */
        public final int f7110b;

        /* renamed from: c */
        public final int f7111c;

        /* renamed from: d */
        public final int f7112d;

        /* renamed from: e */
        public final int f7113e;

        /* renamed from: f */
        public final int f7114f;

        public C4639g(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f7109a = i;
            this.f7110b = i2;
            this.f7111c = i3;
            this.f7112d = i4;
            this.f7113e = i5;
            this.f7114f = i6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.j7$h */
    /* loaded from: classes2.dex */
    public static final class C4640h {

        /* renamed from: a */
        public final int f7115a;

        /* renamed from: b */
        public final int f7116b;

        /* renamed from: c */
        public final SparseArray f7117c = new SparseArray();

        /* renamed from: d */
        public final SparseArray f7118d = new SparseArray();

        /* renamed from: e */
        public final SparseArray f7119e = new SparseArray();

        /* renamed from: f */
        public final SparseArray f7120f = new SparseArray();

        /* renamed from: g */
        public final SparseArray f7121g = new SparseArray();

        /* renamed from: h */
        public C4634b f7122h;

        /* renamed from: i */
        public C4636d f7123i;

        public C4640h(int i, int i2) {
            this.f7115a = i;
            this.f7116b = i2;
        }

        /* renamed from: a */
        public void m98288a() {
            this.f7117c.clear();
            this.f7118d.clear();
            this.f7119e.clear();
            this.f7120f.clear();
            this.f7121g.clear();
            this.f7122h = null;
            this.f7123i = null;
        }
    }

    public C4632j7(int i, int i2) {
        Paint paint = new Paint();
        this.f7071a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7072b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7073c = new Canvas();
        this.f7074d = new C4634b(719, 575, 0, 719, 0, 575);
        this.f7075e = new C4633a(0, m98307a(), m98297b(), m98293c());
        this.f7076f = new C4640h(i, i2);
    }

    /* renamed from: a */
    private static int m98306a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: b */
    private static int[] m98297b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m98306a(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m98306a(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int[] m98293c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m98306a(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m98306a(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m98306a(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m98306a(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m98306a(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public void m98290d() {
        this.f7076f.m98288a();
    }

    /* renamed from: a */
    private static byte[] m98305a(int i, int i2, C5971zg c5971zg) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c5971zg.m92403a(i2);
        }
        return bArr;
    }

    /* renamed from: b */
    private static int m98294b(C5971zg c5971zg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m92403a;
        int m92403a2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m92403a3 = c5971zg.m92403a(4);
            if (m92403a3 != 0) {
                z = z2;
                i3 = 1;
            } else if (!c5971zg.m92387f()) {
                int m92403a4 = c5971zg.m92403a(3);
                if (m92403a4 != 0) {
                    z = z2;
                    i3 = m92403a4 + 2;
                    m92403a3 = 0;
                } else {
                    z = true;
                    m92403a3 = 0;
                    i3 = 0;
                }
            } else {
                if (!c5971zg.m92387f()) {
                    m92403a = c5971zg.m92403a(2) + 4;
                    m92403a2 = c5971zg.m92403a(4);
                } else {
                    int m92403a5 = c5971zg.m92403a(2);
                    if (m92403a5 == 0) {
                        z = z2;
                        i3 = 1;
                    } else if (m92403a5 == 1) {
                        z = z2;
                        i3 = 2;
                    } else if (m92403a5 == 2) {
                        m92403a = c5971zg.m92403a(4) + 9;
                        m92403a2 = c5971zg.m92403a(4);
                    } else if (m92403a5 != 3) {
                        z = z2;
                        m92403a3 = 0;
                        i3 = 0;
                    } else {
                        m92403a = c5971zg.m92403a(8) + 25;
                        m92403a2 = c5971zg.m92403a(4);
                    }
                    m92403a3 = 0;
                }
                z = z2;
                i3 = m92403a;
                m92403a3 = m92403a2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    m92403a3 = bArr[m92403a3];
                }
                paint.setColor(iArr[m92403a3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: a */
    private static int[] m98307a() {
        return new int[]{0, -1, ViewCompat.MEASURED_STATE_MASK, -8421505};
    }

    /* renamed from: a */
    private static int m98300a(C5971zg c5971zg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int i3;
        int m92403a;
        int m92403a2;
        int i4 = i;
        boolean z2 = false;
        while (true) {
            byte m92403a3 = c5971zg.m92403a(2);
            if (m92403a3 != 0) {
                z = z2;
                i3 = 1;
            } else {
                if (c5971zg.m92387f()) {
                    m92403a = c5971zg.m92403a(3) + 3;
                    m92403a2 = c5971zg.m92403a(2);
                } else {
                    if (c5971zg.m92387f()) {
                        z = z2;
                        i3 = 1;
                    } else {
                        int m92403a4 = c5971zg.m92403a(2);
                        if (m92403a4 == 0) {
                            z = true;
                        } else if (m92403a4 == 1) {
                            z = z2;
                            i3 = 2;
                        } else if (m92403a4 == 2) {
                            m92403a = c5971zg.m92403a(4) + 12;
                            m92403a2 = c5971zg.m92403a(2);
                        } else if (m92403a4 != 3) {
                            z = z2;
                        } else {
                            m92403a = c5971zg.m92403a(8) + 29;
                            m92403a2 = c5971zg.m92403a(2);
                        }
                        m92403a3 = 0;
                        i3 = 0;
                    }
                    m92403a3 = 0;
                }
                z = z2;
                i3 = m92403a;
                m92403a3 = m92403a2;
            }
            if (i3 != 0 && paint != null) {
                if (bArr != null) {
                    m92403a3 = bArr[m92403a3];
                }
                paint.setColor(iArr[m92403a3]);
                canvas.drawRect(i4, i2, i4 + i3, i2 + 1, paint);
            }
            i4 += i3;
            if (z) {
                return i4;
            }
            z2 = z;
        }
    }

    /* renamed from: c */
    private static int m98291c(C5971zg c5971zg, int[] iArr, byte[] bArr, int i, int i2, Paint paint, Canvas canvas) {
        boolean z;
        int m92403a;
        int i3 = i;
        boolean z2 = false;
        while (true) {
            byte m92403a2 = c5971zg.m92403a(8);
            if (m92403a2 != 0) {
                z = z2;
                m92403a = 1;
            } else if (!c5971zg.m92387f()) {
                int m92403a3 = c5971zg.m92403a(7);
                if (m92403a3 != 0) {
                    z = z2;
                    m92403a = m92403a3;
                    m92403a2 = 0;
                } else {
                    z = true;
                    m92403a2 = 0;
                    m92403a = 0;
                }
            } else {
                z = z2;
                m92403a = c5971zg.m92403a(7);
                m92403a2 = c5971zg.m92403a(8);
            }
            if (m92403a != 0 && paint != null) {
                if (bArr != null) {
                    m92403a2 = bArr[m92403a2];
                }
                paint.setColor(iArr[m92403a2]);
                canvas.drawRect(i3, i2, i3 + m92403a, i2 + 1, paint);
            }
            i3 += m92403a;
            if (z) {
                return i3;
            }
            z2 = z;
        }
    }

    /* renamed from: c */
    private static C4638f m98292c(C5971zg c5971zg, int i) {
        int i2;
        int m92403a;
        int m92403a2;
        int m92403a3 = c5971zg.m92403a(8);
        c5971zg.m92390d(4);
        boolean m92387f = c5971zg.m92387f();
        c5971zg.m92390d(3);
        int i3 = 16;
        int m92403a4 = c5971zg.m92403a(16);
        int m92403a5 = c5971zg.m92403a(16);
        int m92403a6 = c5971zg.m92403a(3);
        int m92403a7 = c5971zg.m92403a(3);
        int i4 = 2;
        c5971zg.m92390d(2);
        int m92403a8 = c5971zg.m92403a(8);
        int m92403a9 = c5971zg.m92403a(8);
        int m92403a10 = c5971zg.m92403a(4);
        int m92403a11 = c5971zg.m92403a(2);
        c5971zg.m92390d(2);
        int i5 = i - 10;
        SparseArray sparseArray = new SparseArray();
        while (i5 > 0) {
            int m92403a12 = c5971zg.m92403a(i3);
            int m92403a13 = c5971zg.m92403a(i4);
            int m92403a14 = c5971zg.m92403a(i4);
            int m92403a15 = c5971zg.m92403a(12);
            int i6 = m92403a11;
            c5971zg.m92390d(4);
            int m92403a16 = c5971zg.m92403a(12);
            int i7 = i5 - 6;
            if (m92403a13 != 1) {
                i2 = 2;
                if (m92403a13 != 2) {
                    m92403a = 0;
                    m92403a2 = 0;
                    i5 = i7;
                    sparseArray.put(m92403a12, new C4639g(m92403a13, m92403a14, m92403a15, m92403a16, m92403a, m92403a2));
                    i4 = i2;
                    m92403a11 = i6;
                    i3 = 16;
                }
            } else {
                i2 = 2;
            }
            i5 -= 8;
            m92403a = c5971zg.m92403a(8);
            m92403a2 = c5971zg.m92403a(8);
            sparseArray.put(m92403a12, new C4639g(m92403a13, m92403a14, m92403a15, m92403a16, m92403a, m92403a2));
            i4 = i2;
            m92403a11 = i6;
            i3 = 16;
        }
        return new C4638f(m92403a3, m92387f, m92403a4, m92403a5, m92403a6, m92403a7, m92403a8, m92403a9, m92403a10, m92403a11, sparseArray);
    }

    /* renamed from: b */
    private static C4635c m98296b(C5971zg c5971zg) {
        byte[] bArr;
        int m92403a = c5971zg.m92403a(16);
        c5971zg.m92390d(4);
        int m92403a2 = c5971zg.m92403a(2);
        boolean m92387f = c5971zg.m92387f();
        c5971zg.m92390d(1);
        byte[] bArr2 = AbstractC5863xp.f12156f;
        if (m92403a2 == 1) {
            c5971zg.m92390d(c5971zg.m92403a(8) * 16);
        } else if (m92403a2 == 0) {
            int m92403a3 = c5971zg.m92403a(16);
            int m92403a4 = c5971zg.m92403a(16);
            if (m92403a3 > 0) {
                bArr2 = new byte[m92403a3];
                c5971zg.m92394b(bArr2, 0, m92403a3);
            }
            if (m92403a4 > 0) {
                bArr = new byte[m92403a4];
                c5971zg.m92394b(bArr, 0, m92403a4);
                return new C4635c(m92403a, m92387f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new C4635c(m92403a, m92387f, bArr2, bArr);
    }

    /* renamed from: a */
    private static void m98304a(C4635c c4635c, C4633a c4633a, int i, int i2, int i3, Paint paint, Canvas canvas) {
        int[] iArr;
        if (i == 3) {
            iArr = c4633a.f7081d;
        } else if (i == 2) {
            iArr = c4633a.f7080c;
        } else {
            iArr = c4633a.f7079b;
        }
        int[] iArr2 = iArr;
        m98298a(c4635c.f7090c, iArr2, i, i2, i3, paint, canvas);
        m98298a(c4635c.f7091d, iArr2, i, i2, i3 + 1, paint, canvas);
    }

    /* renamed from: a */
    private static C4633a m98302a(C5971zg c5971zg, int i) {
        int m92403a;
        int i2;
        int m92403a2;
        int m92403a3;
        int i3;
        int i4 = 8;
        int m92403a4 = c5971zg.m92403a(8);
        c5971zg.m92390d(8);
        int i5 = 2;
        int i6 = i - 2;
        int[] m98307a = m98307a();
        int[] m98297b = m98297b();
        int[] m98293c = m98293c();
        while (i6 > 0) {
            int m92403a5 = c5971zg.m92403a(i4);
            int m92403a6 = c5971zg.m92403a(i4);
            int[] iArr = (m92403a6 & 128) != 0 ? m98307a : (m92403a6 & 64) != 0 ? m98297b : m98293c;
            if ((m92403a6 & 1) != 0) {
                m92403a3 = c5971zg.m92403a(i4);
                i3 = c5971zg.m92403a(i4);
                m92403a = c5971zg.m92403a(i4);
                m92403a2 = c5971zg.m92403a(i4);
                i2 = i6 - 6;
            } else {
                int m92403a7 = c5971zg.m92403a(4) << 4;
                m92403a = c5971zg.m92403a(4) << 4;
                i2 = i6 - 4;
                m92403a2 = c5971zg.m92403a(i5) << 6;
                m92403a3 = c5971zg.m92403a(6) << i5;
                i3 = m92403a7;
            }
            if (m92403a3 == 0) {
                m92403a2 = 255;
                i3 = 0;
                m92403a = 0;
            }
            double d = m92403a3;
            double d2 = i3 - 128;
            double d3 = m92403a - 128;
            iArr[m92403a5] = m98306a((byte) (255 - (m92403a2 & 255)), AbstractC5863xp.m93039a((int) (d + (1.402d * d2)), 0, 255), AbstractC5863xp.m93039a((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), AbstractC5863xp.m93039a((int) (d + (d3 * 1.772d)), 0, 255));
            i6 = i2;
            m92403a4 = m92403a4;
            i4 = 8;
            i5 = 2;
        }
        return new C4633a(m92403a4, m98307a, m98297b, m98293c);
    }

    /* renamed from: b */
    private static C4636d m98295b(C5971zg c5971zg, int i) {
        int m92403a = c5971zg.m92403a(8);
        int m92403a2 = c5971zg.m92403a(4);
        int m92403a3 = c5971zg.m92403a(2);
        c5971zg.m92390d(2);
        int i2 = i - 2;
        SparseArray sparseArray = new SparseArray();
        while (i2 > 0) {
            int m92403a4 = c5971zg.m92403a(8);
            c5971zg.m92390d(8);
            i2 -= 6;
            sparseArray.put(m92403a4, new C4637e(c5971zg.m92403a(16), c5971zg.m92403a(16)));
        }
        return new C4636d(m92403a, m92403a2, m92403a3, sparseArray);
    }

    /* renamed from: a */
    private static C4634b m98303a(C5971zg c5971zg) {
        int i;
        int i2;
        int i3;
        int i4;
        c5971zg.m92390d(4);
        boolean m92387f = c5971zg.m92387f();
        c5971zg.m92390d(3);
        int m92403a = c5971zg.m92403a(16);
        int m92403a2 = c5971zg.m92403a(16);
        if (m92387f) {
            int m92403a3 = c5971zg.m92403a(16);
            int m92403a4 = c5971zg.m92403a(16);
            int m92403a5 = c5971zg.m92403a(16);
            i4 = c5971zg.m92403a(16);
            i3 = m92403a4;
            i2 = m92403a5;
            i = m92403a3;
        } else {
            i = 0;
            i2 = 0;
            i3 = m92403a;
            i4 = m92403a2;
        }
        return new C4634b(m92403a, m92403a2, i, i3, i2, i4);
    }

    /* renamed from: a */
    private static void m98301a(C5971zg c5971zg, C4640h c4640h) {
        C4638f c4638f;
        int m92403a = c5971zg.m92403a(8);
        int m92403a2 = c5971zg.m92403a(16);
        int m92403a3 = c5971zg.m92403a(16);
        int m92391d = c5971zg.m92391d() + m92403a3;
        if (m92403a3 * 8 > c5971zg.m92396b()) {
            AbstractC5063oc.m96800d("DvbParser", "Data field length exceeds limit");
            c5971zg.m92390d(c5971zg.m92396b());
            return;
        }
        switch (m92403a) {
            case 16:
                if (m92403a2 == c4640h.f7115a) {
                    C4636d c4636d = c4640h.f7123i;
                    C4636d m98295b = m98295b(c5971zg, m92403a3);
                    if (m98295b.f7094c != 0) {
                        c4640h.f7123i = m98295b;
                        c4640h.f7117c.clear();
                        c4640h.f7118d.clear();
                        c4640h.f7119e.clear();
                        break;
                    } else if (c4636d != null && c4636d.f7093b != m98295b.f7093b) {
                        c4640h.f7123i = m98295b;
                        break;
                    }
                }
                break;
            case 17:
                C4636d c4636d2 = c4640h.f7123i;
                if (m92403a2 == c4640h.f7115a && c4636d2 != null) {
                    C4638f m98292c = m98292c(c5971zg, m92403a3);
                    if (c4636d2.f7094c == 0 && (c4638f = (C4638f) c4640h.f7117c.get(m98292c.f7098a)) != null) {
                        m98292c.m98289a(c4638f);
                    }
                    c4640h.f7117c.put(m98292c.f7098a, m98292c);
                    break;
                }
                break;
            case 18:
                if (m92403a2 == c4640h.f7115a) {
                    C4633a m98302a = m98302a(c5971zg, m92403a3);
                    c4640h.f7118d.put(m98302a.f7078a, m98302a);
                    break;
                } else if (m92403a2 == c4640h.f7116b) {
                    C4633a m98302a2 = m98302a(c5971zg, m92403a3);
                    c4640h.f7120f.put(m98302a2.f7078a, m98302a2);
                    break;
                }
                break;
            case 19:
                if (m92403a2 == c4640h.f7115a) {
                    C4635c m98296b = m98296b(c5971zg);
                    c4640h.f7119e.put(m98296b.f7088a, m98296b);
                    break;
                } else if (m92403a2 == c4640h.f7116b) {
                    C4635c m98296b2 = m98296b(c5971zg);
                    c4640h.f7121g.put(m98296b2.f7088a, m98296b2);
                    break;
                }
                break;
            case 20:
                if (m92403a2 == c4640h.f7115a) {
                    c4640h.f7122h = m98303a(c5971zg);
                    break;
                }
                break;
        }
        c5971zg.m92388e(m92391d - c5971zg.m92391d());
    }

    /* renamed from: a */
    public List m98299a(byte[] bArr, int i) {
        int i2;
        int i3;
        SparseArray sparseArray;
        C5971zg c5971zg = new C5971zg(bArr, i);
        while (c5971zg.m92396b() >= 48 && c5971zg.m92403a(8) == 15) {
            m98301a(c5971zg, this.f7076f);
        }
        C4640h c4640h = this.f7076f;
        C4636d c4636d = c4640h.f7123i;
        if (c4636d == null) {
            return Collections.emptyList();
        }
        C4634b c4634b = c4640h.f7122h;
        if (c4634b == null) {
            c4634b = this.f7074d;
        }
        Bitmap bitmap = this.f7077g;
        if (bitmap == null || c4634b.f7082a + 1 != bitmap.getWidth() || c4634b.f7083b + 1 != this.f7077g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(c4634b.f7082a + 1, c4634b.f7083b + 1, Bitmap.Config.ARGB_8888);
            this.f7077g = createBitmap;
            this.f7073c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = c4636d.f7095d;
        for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
            this.f7073c.save();
            C4637e c4637e = (C4637e) sparseArray2.valueAt(i4);
            C4638f c4638f = (C4638f) this.f7076f.f7117c.get(sparseArray2.keyAt(i4));
            int i5 = c4637e.f7096a + c4634b.f7084c;
            int i6 = c4637e.f7097b + c4634b.f7086e;
            this.f7073c.clipRect(i5, i6, Math.min(c4638f.f7100c + i5, c4634b.f7085d), Math.min(c4638f.f7101d + i6, c4634b.f7087f));
            C4633a c4633a = (C4633a) this.f7076f.f7118d.get(c4638f.f7104g);
            if (c4633a == null && (c4633a = (C4633a) this.f7076f.f7120f.get(c4638f.f7104g)) == null) {
                c4633a = this.f7075e;
            }
            SparseArray sparseArray3 = c4638f.f7108k;
            int i7 = 0;
            while (i7 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i7);
                C4639g c4639g = (C4639g) sparseArray3.valueAt(i7);
                C4635c c4635c = (C4635c) this.f7076f.f7119e.get(keyAt);
                C4635c c4635c2 = c4635c == null ? (C4635c) this.f7076f.f7121g.get(keyAt) : c4635c;
                if (c4635c2 != null) {
                    i3 = i7;
                    sparseArray = sparseArray3;
                    m98304a(c4635c2, c4633a, c4638f.f7103f, c4639g.f7111c + i5, i6 + c4639g.f7112d, c4635c2.f7089b ? null : this.f7071a, this.f7073c);
                } else {
                    i3 = i7;
                    sparseArray = sparseArray3;
                }
                i7 = i3 + 1;
                sparseArray3 = sparseArray;
            }
            if (c4638f.f7099b) {
                int i8 = c4638f.f7103f;
                if (i8 == 3) {
                    i2 = c4633a.f7081d[c4638f.f7105h];
                } else if (i8 == 2) {
                    i2 = c4633a.f7080c[c4638f.f7106i];
                } else {
                    i2 = c4633a.f7079b[c4638f.f7107j];
                }
                this.f7072b.setColor(i2);
                this.f7073c.drawRect(i5, i6, c4638f.f7100c + i5, c4638f.f7101d + i6, this.f7072b);
            }
            arrayList.add(new C3989a5.C3991b().m101046a(Bitmap.createBitmap(this.f7077g, i5, i6, c4638f.f7100c, c4638f.f7101d)).m101042b(i5 / c4634b.f7082a).m101040b(0).m101048a(i6 / c4634b.f7083b, 0).m101047a(0).m101034d(c4638f.f7100c / c4634b.f7082a).m101049a(c4638f.f7101d / c4634b.f7083b).m101050a());
            this.f7073c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f7073c.restore();
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static void m98298a(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        C5971zg c5971zg = new C5971zg(bArr);
        int i4 = i2;
        int i5 = i3;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (c5971zg.m92396b() != 0) {
            int m92403a = c5971zg.m92403a(8);
            if (m92403a != 240) {
                switch (m92403a) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArr7 == null) {
                                bArr3 = f7068h;
                                bArr2 = bArr3;
                            } else {
                                bArr2 = bArr7;
                            }
                            i4 = m98300a(c5971zg, iArr, bArr2, i4, i5, paint, canvas);
                            c5971zg.m92393c();
                            continue;
                        } else if (bArr5 == null) {
                            bArr3 = f7069i;
                            bArr2 = bArr3;
                            i4 = m98300a(c5971zg, iArr, bArr2, i4, i5, paint, canvas);
                            c5971zg.m92393c();
                            continue;
                        } else {
                            bArr2 = bArr5;
                            i4 = m98300a(c5971zg, iArr, bArr2, i4, i5, paint, canvas);
                            c5971zg.m92393c();
                            continue;
                        }
                    case 17:
                        if (i == 3) {
                            bArr4 = bArr6 == null ? f7070j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i4 = m98294b(c5971zg, iArr, bArr4, i4, i5, paint, canvas);
                        c5971zg.m92393c();
                        continue;
                    case 18:
                        i4 = m98291c(c5971zg, iArr, null, i4, i5, paint, canvas);
                        continue;
                    default:
                        switch (m92403a) {
                            case 32:
                                bArr7 = m98305a(4, 4, c5971zg);
                                continue;
                            case 33:
                                bArr5 = m98305a(4, 8, c5971zg);
                                continue;
                            case 34:
                                bArr6 = m98305a(16, 8, c5971zg);
                                continue;
                            default:
                                continue;
                        }
                }
            } else {
                i5 += 2;
                i4 = i2;
            }
        }
    }
}
