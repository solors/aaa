package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class yy0 {

    /* renamed from: a */
    private static final String[] f88611a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b */
    private static final int[] f88612b = {44100, 48000, 32000};

    /* renamed from: c */
    private static final int[] f88613c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d */
    private static final int[] f88614d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e */
    private static final int[] f88615e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f */
    private static final int[] f88616f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g */
    private static final int[] f88617g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: com.yandex.mobile.ads.impl.yy0$a */
    /* loaded from: classes8.dex */
    public static final class C31938a {

        /* renamed from: a */
        public int f88618a;
        @Nullable

        /* renamed from: b */
        public String f88619b;

        /* renamed from: c */
        public int f88620c;

        /* renamed from: d */
        public int f88621d;

        /* renamed from: e */
        public int f88622e;

        /* renamed from: f */
        public int f88623f;

        /* renamed from: g */
        public int f88624g;

        /* renamed from: a */
        public final boolean m26531a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f88618a = i2;
            this.f88619b = yy0.f88611a[3 - i3];
            int i9 = yy0.f88612b[i5];
            this.f88621d = i9;
            int i10 = 2;
            if (i2 == 2) {
                this.f88621d = i9 / 2;
            } else if (i2 == 0) {
                this.f88621d = i9 / 4;
            }
            int i11 = (i >>> 9) & 1;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        i6 = 384;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                i6 = 1152;
            } else {
                if (i2 != 3) {
                    i6 = 576;
                }
                i6 = 1152;
            }
            this.f88624g = i6;
            if (i3 == 3) {
                if (i2 == 3) {
                    i8 = yy0.f88613c[i4 - 1];
                } else {
                    i8 = yy0.f88614d[i4 - 1];
                }
                this.f88623f = i8;
                this.f88620c = (((i8 * 12) / this.f88621d) + i11) * 4;
            } else {
                int i12 = 144;
                if (i2 == 3) {
                    if (i3 == 2) {
                        i7 = yy0.f88615e[i4 - 1];
                    } else {
                        i7 = yy0.f88616f[i4 - 1];
                    }
                    this.f88623f = i7;
                    this.f88620c = ((i7 * 144) / this.f88621d) + i11;
                } else {
                    int i13 = yy0.f88617g[i4 - 1];
                    this.f88623f = i13;
                    if (i3 == 1) {
                        i12 = 72;
                    }
                    this.f88620c = ((i12 * i13) / this.f88621d) + i11;
                }
            }
            if (((i >> 6) & 3) == 3) {
                i10 = 1;
            }
            this.f88622e = i10;
            return true;
        }
    }

    /* renamed from: a */
    public static int m26539a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f88612b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f88613c[i4 - 1] : f88614d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f88615e[i4 - 1] : f88616f[i4 - 1];
        } else {
            i6 = f88617g[i4 - 1];
        }
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        return (((i3 == 1 ? 72 : 144) * i6) / i7) + i8;
    }

    /* renamed from: b */
    public static int m26537b(int i) {
        int i2;
        int i3;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 != 0 && i4 != 15 && i5 != 3) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        return 384;
                    }
                    throw new IllegalArgumentException();
                }
            } else if (i2 != 3) {
                return 576;
            }
            return 1152;
        }
        return -1;
    }
}
