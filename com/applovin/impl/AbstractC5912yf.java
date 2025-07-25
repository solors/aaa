package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.impl.yf */
/* loaded from: classes2.dex */
public abstract class AbstractC5912yf {

    /* renamed from: a */
    public static final byte[] f12322a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f12323b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f12324c = new Object();

    /* renamed from: d */
    private static int[] f12325d = new int[10];

    /* renamed from: com.applovin.impl.yf$a */
    /* loaded from: classes2.dex */
    public static final class C5913a {

        /* renamed from: a */
        public final int f12326a;

        /* renamed from: b */
        public final int f12327b;

        /* renamed from: c */
        public final boolean f12328c;

        public C5913a(int i, int i2, boolean z) {
            this.f12326a = i;
            this.f12327b = i2;
            this.f12328c = z;
        }
    }

    /* renamed from: com.applovin.impl.yf$b */
    /* loaded from: classes2.dex */
    public static final class C5914b {

        /* renamed from: a */
        public final int f12329a;

        /* renamed from: b */
        public final int f12330b;

        /* renamed from: c */
        public final int f12331c;

        /* renamed from: d */
        public final int f12332d;

        /* renamed from: e */
        public final int f12333e;

        /* renamed from: f */
        public final int f12334f;

        /* renamed from: g */
        public final float f12335g;

        /* renamed from: h */
        public final boolean f12336h;

        /* renamed from: i */
        public final boolean f12337i;

        /* renamed from: j */
        public final int f12338j;

        /* renamed from: k */
        public final int f12339k;

        /* renamed from: l */
        public final int f12340l;

        /* renamed from: m */
        public final boolean f12341m;

        public C5914b(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, boolean z2, int i7, int i8, int i9, boolean z3) {
            this.f12329a = i;
            this.f12330b = i2;
            this.f12331c = i3;
            this.f12332d = i4;
            this.f12333e = i5;
            this.f12334f = i6;
            this.f12335g = f;
            this.f12336h = z;
            this.f12337i = z2;
            this.f12338j = i7;
            this.f12339k = i8;
            this.f12340l = i9;
            this.f12341m = z3;
        }
    }

    /* renamed from: a */
    public static void m92749a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static int m92748b(byte[] bArr, int i) {
        return bArr[i + 3] & 31;
    }

    /* renamed from: c */
    public static int m92746c(byte[] bArr, int i) {
        int i2;
        synchronized (f12324c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = m92751a(bArr, i3, i);
                    if (i3 < i) {
                        int[] iArr = f12325d;
                        if (iArr.length <= i4) {
                            f12325d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f12325d[i4] = i3;
                        i3 += 3;
                        i4++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f12325d[i7] - i5;
                System.arraycopy(bArr, i5, bArr, i6, i8);
                int i9 = i6 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i6 = i9 + 2;
                bArr[i10] = 0;
                i5 += i8 + 3;
            }
            System.arraycopy(bArr, i5, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* renamed from: b */
    public static C5913a m92747b(byte[] bArr, int i, int i2) {
        C4123bh c4123bh = new C4123bh(bArr, i, i2);
        c4123bh.m100431d(8);
        int m100429f = c4123bh.m100429f();
        int m100429f2 = c4123bh.m100429f();
        c4123bh.m100428g();
        return new C5913a(m100429f, m100429f2, c4123bh.m100434c());
    }

    /* renamed from: a */
    public static void m92753a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                int i4 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (i4 == 1 && (byteBuffer.get(i3) & 31) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (i4 == 0) {
                    i2++;
                }
                if (i4 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    /* renamed from: a */
    public static int m92750a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        AbstractC4100b1.m100577b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m92749a(zArr);
            return i - 3;
        } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m92749a(zArr);
            return i - 2;
        } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m92749a(zArr);
            return i - 1;
        } else {
            int i4 = i2 - 1;
            int i5 = i + 2;
            while (i5 < i4) {
                byte b = bArr[i5];
                if ((b & 254) == 0) {
                    int i6 = i5 - 2;
                    if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                        m92749a(zArr);
                        return i6;
                    }
                    i5 -= 2;
                }
                i5 += 3;
            }
            zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
            zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
            zArr[2] = bArr[i4] == 0;
            return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.AbstractC5912yf.C5914b m92745c(byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.AbstractC5912yf.m92745c(byte[], int, int):com.applovin.impl.yf$b");
    }

    /* renamed from: a */
    private static int m92751a(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m92752a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    /* renamed from: a */
    private static void m92755a(C4123bh c4123bh, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((c4123bh.m100430e() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }

    /* renamed from: a */
    public static boolean m92754a(String str, byte b) {
        if ("video/avc".equals(str) && (b & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b & 126) >> 1) == 39;
    }
}
