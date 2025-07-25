package com.applovin.impl;

/* renamed from: com.applovin.impl.sf */
/* loaded from: classes2.dex */
public abstract class AbstractC5512sf {

    /* renamed from: a */
    private static final String[] f10336a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f10337b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f10338c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f10339d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f10340e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f10341f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f10342g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: com.applovin.impl.sf$a */
    /* loaded from: classes2.dex */
    public static final class C5513a {

        /* renamed from: a */
        public int f10343a;

        /* renamed from: b */
        public String f10344b;

        /* renamed from: c */
        public int f10345c;

        /* renamed from: d */
        public int f10346d;

        /* renamed from: e */
        public int f10347e;

        /* renamed from: f */
        public int f10348f;

        /* renamed from: g */
        public int f10349g;

        /* renamed from: a */
        public boolean m94618a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            if (!AbstractC5512sf.m94624c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f10343a = i2;
            this.f10344b = AbstractC5512sf.f10336a[3 - i3];
            int i8 = AbstractC5512sf.f10337b[i5];
            this.f10346d = i8;
            int i9 = 2;
            if (i2 == 2) {
                this.f10346d = i8 / 2;
            } else if (i2 == 0) {
                this.f10346d = i8 / 4;
            }
            int i10 = (i >>> 9) & 1;
            this.f10349g = AbstractC5512sf.m94626b(i2, i3);
            if (i3 == 3) {
                if (i2 == 3) {
                    i7 = AbstractC5512sf.f10338c[i4 - 1];
                } else {
                    i7 = AbstractC5512sf.f10339d[i4 - 1];
                }
                this.f10348f = i7;
                this.f10345c = (((i7 * 12) / this.f10346d) + i10) * 4;
            } else {
                int i11 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i6 = AbstractC5512sf.f10340e[i4 - 1];
                    } else {
                        i6 = AbstractC5512sf.f10341f[i4 - 1];
                    }
                    this.f10348f = i6;
                    this.f10345c = ((i6 * 144) / this.f10346d) + i10;
                } else {
                    int i12 = AbstractC5512sf.f10342g[i4 - 1];
                    this.f10348f = i12;
                    if (i3 == 1) {
                        i11 = 72;
                    }
                    this.f10345c = ((i11 * i12) / this.f10346d) + i10;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i9 = 1;
            }
            this.f10347e = i9;
            return true;
        }
    }

    /* renamed from: b */
    public static int m94627b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m94624c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f10337b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f10338c[i4 - 1] : f10339d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f10340e[i4 - 1] : f10341f[i4 - 1];
        } else {
            i6 = f10342g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static boolean m94624c(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* renamed from: d */
    public static int m94622d(int i) {
        int i2;
        int i3;
        if (!m94624c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m94626b(i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static int m94626b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        } else if (i2 != 2) {
            if (i2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }
}
