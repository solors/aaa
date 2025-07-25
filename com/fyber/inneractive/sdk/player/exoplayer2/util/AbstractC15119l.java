package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.l */
/* loaded from: classes4.dex */
public abstract class AbstractC15119l {

    /* renamed from: a */
    public static final byte[] f29796a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f29797b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    public static final Object f29798c = new Object();

    /* renamed from: d */
    public static int[] f29799d = new int[10];

    /* renamed from: a */
    public static int m77216a(int i, byte[] bArr) {
        int i2;
        synchronized (f29798c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f29799d;
                    if (iArr.length <= i4) {
                        f29799d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f29799d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f29799d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.util.C15118k m77215a(byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15119l.m77215a(byte[], int, int):com.fyber.inneractive.sdk.player.exoplayer2.util.k");
    }

    /* renamed from: a */
    public static int m77214a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            if (i3 == 0) {
                return i2;
            }
            if (zArr[0]) {
                m77213a(zArr);
                return i - 3;
            } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
                m77213a(zArr);
                return i - 2;
            } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
                m77213a(zArr);
                return i - 1;
            } else {
                int i4 = i2 - 1;
                int i5 = i + 2;
                while (i5 < i4) {
                    byte b = bArr[i5];
                    if ((b & 254) == 0) {
                        int i6 = i5 - 2;
                        if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                            m77213a(zArr);
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
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m77213a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
