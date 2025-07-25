package com.google.zxing.qrcode.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class AlignmentPatternFinder {

    /* renamed from: a */
    private final BitMatrix f44716a;

    /* renamed from: c */
    private final int f44718c;

    /* renamed from: d */
    private final int f44719d;

    /* renamed from: e */
    private final int f44720e;

    /* renamed from: f */
    private final int f44721f;

    /* renamed from: g */
    private final float f44722g;

    /* renamed from: i */
    private final ResultPointCallback f44724i;

    /* renamed from: b */
    private final List<AlignmentPattern> f44717b = new ArrayList(5);

    /* renamed from: h */
    private final int[] f44723h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public AlignmentPatternFinder(BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, ResultPointCallback resultPointCallback) {
        this.f44716a = bitMatrix;
        this.f44718c = i;
        this.f44719d = i2;
        this.f44720e = i3;
        this.f44721f = i4;
        this.f44722g = f;
        this.f44724i = resultPointCallback;
    }

    /* renamed from: a */
    private static float m65540a(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* renamed from: b */
    private float m65539b(int i, int i2, int i3, int i4) {
        BitMatrix bitMatrix = this.f44716a;
        int height = bitMatrix.getHeight();
        int[] iArr = this.f44723h;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i5 = i;
        while (i5 >= 0 && bitMatrix.get(i2, i5)) {
            int i6 = iArr[1];
            if (i6 > i3) {
                break;
            }
            iArr[1] = i6 + 1;
            i5--;
        }
        if (i5 >= 0 && iArr[1] <= i3) {
            while (i5 >= 0 && !bitMatrix.get(i2, i5)) {
                int i7 = iArr[0];
                if (i7 > i3) {
                    break;
                }
                iArr[0] = i7 + 1;
                i5--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            int i8 = i + 1;
            while (i8 < height && bitMatrix.get(i2, i8)) {
                int i9 = iArr[1];
                if (i9 > i3) {
                    break;
                }
                iArr[1] = i9 + 1;
                i8++;
            }
            if (i8 != height && iArr[1] <= i3) {
                while (i8 < height && !bitMatrix.get(i2, i8)) {
                    int i10 = iArr[2];
                    if (i10 > i3) {
                        break;
                    }
                    iArr[2] = i10 + 1;
                    i8++;
                }
                int i11 = iArr[2];
                if (i11 <= i3 && Math.abs(((iArr[0] + iArr[1]) + i11) - i4) * 5 < i4 * 2 && m65537d(iArr)) {
                    return m65540a(iArr, i8);
                }
            }
        }
        return Float.NaN;
    }

    /* renamed from: d */
    private boolean m65537d(int[] iArr) {
        float f = this.f44722g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    private AlignmentPattern m65536e(int[] iArr, int i, int i2) {
        int i3 = iArr[0] + iArr[1] + iArr[2];
        float m65540a = m65540a(iArr, i2);
        float m65539b = m65539b(i, (int) m65540a, iArr[1] * 2, i3);
        if (!Float.isNaN(m65539b)) {
            float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
            for (AlignmentPattern alignmentPattern : this.f44717b) {
                if (alignmentPattern.m65542b(f, m65539b, m65540a)) {
                    return alignmentPattern.m65541c(m65539b, m65540a, f);
                }
            }
            AlignmentPattern alignmentPattern2 = new AlignmentPattern(m65540a, m65539b, f);
            this.f44717b.add(alignmentPattern2);
            ResultPointCallback resultPointCallback = this.f44724i;
            if (resultPointCallback != null) {
                resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public AlignmentPattern m65538c() throws NotFoundException {
        int i;
        AlignmentPattern m65536e;
        AlignmentPattern m65536e2;
        int i2 = this.f44718c;
        int i3 = this.f44721f;
        int i4 = this.f44720e + i2;
        int i5 = this.f44719d + (i3 / 2);
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i3; i6++) {
            if ((i6 & 1) == 0) {
                i = (i6 + 1) / 2;
            } else {
                i = -((i6 + 1) / 2);
            }
            int i7 = i + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i2;
            while (i8 < i4 && !this.f44716a.get(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i4) {
                if (this.f44716a.get(i8, i7)) {
                    if (i9 == 1) {
                        iArr[1] = iArr[1] + 1;
                    } else if (i9 == 2) {
                        if (m65537d(iArr) && (m65536e2 = m65536e(iArr, i7, i8)) != null) {
                            return m65536e2;
                        }
                        iArr[0] = iArr[2];
                        iArr[1] = 1;
                        iArr[2] = 0;
                        i9 = 1;
                    } else {
                        i9++;
                        iArr[i9] = iArr[i9] + 1;
                    }
                } else {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (m65537d(iArr) && (m65536e = m65536e(iArr, i7, i4)) != null) {
                return m65536e;
            }
        }
        if (!this.f44717b.isEmpty()) {
            return this.f44717b.get(0);
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
