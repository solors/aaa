package com.google.zxing.oned.rss;

import com.google.zxing.NotFoundException;
import com.google.zxing.oned.OneDReader;

/* loaded from: classes5.dex */
public abstract class AbstractRSSReader extends OneDReader {

    /* renamed from: b */
    private final int[] f44529b;

    /* renamed from: e */
    private final int[] f44532e;

    /* renamed from: f */
    private final int[] f44533f;

    /* renamed from: a */
    private final int[] f44528a = new int[4];

    /* renamed from: c */
    private final float[] f44530c = new float[4];

    /* renamed from: d */
    private final float[] f44531d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractRSSReader() {
        int[] iArr = new int[8];
        this.f44529b = iArr;
        this.f44532e = new int[iArr.length / 2];
        this.f44533f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public static void m65828e(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static void m65821l(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static boolean m65820m(int[] iArr) {
        int i;
        float f = (iArr[0] + iArr[1]) / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Integer.MAX_VALUE;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static int m65819n(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (OneDReader.m65855b(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final int[] m65827f() {
        return this.f44529b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final int[] m65826g() {
        return this.f44528a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final int[] m65825h() {
        return this.f44533f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public final float[] m65824i() {
        return this.f44531d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] m65823j() {
        return this.f44532e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final float[] m65822k() {
        return this.f44530c;
    }
}
