package com.google.zxing.pdf417.detector;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Detector {

    /* renamed from: a */
    private static final int[] f44646a = {0, 4, 1, 5};

    /* renamed from: b */
    private static final int[] f44647b = {6, 2, 7, 3};

    /* renamed from: c */
    private static final int[] f44648c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* renamed from: d */
    private static final int[] f44649d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    private Detector() {
    }

    /* renamed from: a */
    private static void m65608a(ResultPoint[] resultPointArr, ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            resultPointArr[iArr[i]] = resultPointArr2[i];
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
        if (r4 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r3.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        r4 = (com.google.zxing.ResultPoint[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        r2 = (int) java.lang.Math.max(r2, r7.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r4 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        r2 = java.lang.Math.max(r2, (int) r4.getY());
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<com.google.zxing.ResultPoint[]> m65607b(boolean r8, com.google.zxing.common.BitMatrix r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = r1
            r3 = r2
        L8:
            r4 = r3
        L9:
            int r5 = r9.getHeight()
            if (r2 >= r5) goto L77
            com.google.zxing.ResultPoint[] r3 = m65604e(r9, r2, r3)
            r5 = r3[r1]
            r6 = 1
            if (r5 != 0) goto L4f
            r5 = 3
            r7 = r3[r5]
            if (r7 != 0) goto L4f
            if (r4 == 0) goto L77
            java.util.Iterator r3 = r0.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            com.google.zxing.ResultPoint[] r4 = (com.google.zxing.ResultPoint[]) r4
            r7 = r4[r6]
            if (r7 == 0) goto L3d
            float r2 = (float) r2
            float r7 = r7.getY()
            float r2 = java.lang.Math.max(r2, r7)
            int r2 = (int) r2
        L3d:
            r4 = r4[r5]
            if (r4 == 0) goto L23
            float r4 = r4.getY()
            int r4 = (int) r4
            int r2 = java.lang.Math.max(r2, r4)
            goto L23
        L4b:
            int r2 = r2 + 5
            r3 = r1
            goto L8
        L4f:
            r0.add(r3)
            if (r8 == 0) goto L77
            r2 = 2
            r4 = r3[r2]
            if (r4 == 0) goto L65
            float r4 = r4.getX()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.getY()
            goto L73
        L65:
            r2 = 4
            r4 = r3[r2]
            float r4 = r4.getX()
            int r4 = (int) r4
            r2 = r3[r2]
            float r2 = r2.getY()
        L73:
            int r2 = (int) r2
            r3 = r4
            r4 = r6
            goto L9
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.detector.Detector.m65607b(boolean, com.google.zxing.common.BitMatrix):java.util.List");
    }

    /* renamed from: c */
    private static int[] m65606c(BitMatrix bitMatrix, int i, int i2, int i3, boolean z, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i4 = 0;
        while (bitMatrix.get(i, i2) && i > 0) {
            int i5 = i4 + 1;
            if (i4 >= 3) {
                break;
            }
            i--;
            i4 = i5;
        }
        int length = iArr.length;
        boolean z2 = z;
        int i6 = 0;
        int i7 = i;
        while (i < i3) {
            if (bitMatrix.get(i, i2) != z2) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 == length - 1) {
                    if (m65603f(iArr2, iArr, 0.8f) < 0.42f) {
                        return new int[]{i7, i};
                    }
                    i7 += iArr2[0] + iArr2[1];
                    int i8 = i6 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i8);
                    iArr2[i8] = 0;
                    iArr2[i6] = 0;
                    i6--;
                } else {
                    i6++;
                }
                iArr2[i6] = 1;
                z2 = !z2;
            }
            i++;
        }
        if (i6 != length - 1 || m65603f(iArr2, iArr, 0.8f) >= 0.42f) {
            return null;
        }
        return new int[]{i7, i - 1};
    }

    /* renamed from: d */
    private static ResultPoint[] m65605d(BitMatrix bitMatrix, int i, int i2, int i3, int i4, int[] iArr) {
        boolean z;
        int i5;
        int i6;
        int i7;
        ResultPoint[] resultPointArr = new ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i8 = i3;
        while (true) {
            if (i8 < i) {
                int[] m65606c = m65606c(bitMatrix, i4, i8, i2, false, iArr, iArr2);
                if (m65606c != null) {
                    int i9 = i8;
                    int[] iArr3 = m65606c;
                    int i10 = i9;
                    while (true) {
                        if (i10 > 0) {
                            int i11 = i10 - 1;
                            int[] m65606c2 = m65606c(bitMatrix, i4, i11, i2, false, iArr, iArr2);
                            if (m65606c2 != null) {
                                iArr3 = m65606c2;
                                i10 = i11;
                            } else {
                                i7 = i11 + 1;
                                break;
                            }
                        } else {
                            i7 = i10;
                            break;
                        }
                    }
                    float f = i7;
                    resultPointArr[0] = new ResultPoint(iArr3[0], f);
                    resultPointArr[1] = new ResultPoint(iArr3[1], f);
                    z = true;
                    i8 = i7;
                } else {
                    i8 += 5;
                }
            } else {
                z = false;
                break;
            }
        }
        int i12 = i8 + 1;
        if (z) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i13 = i12;
            int i14 = 0;
            while (true) {
                if (i13 < i) {
                    i5 = i14;
                    i6 = i13;
                    int[] m65606c3 = m65606c(bitMatrix, iArr4[0], i13, i2, false, iArr, iArr2);
                    if (m65606c3 != null && Math.abs(iArr4[0] - m65606c3[0]) < 5 && Math.abs(iArr4[1] - m65606c3[1]) < 5) {
                        iArr4 = m65606c3;
                        i14 = 0;
                    } else if (i5 > 25) {
                        break;
                    } else {
                        i14 = i5 + 1;
                    }
                    i13 = i6 + 1;
                } else {
                    i5 = i14;
                    i6 = i13;
                    break;
                }
            }
            i12 = i6 - (i5 + 1);
            float f2 = i12;
            resultPointArr[2] = new ResultPoint(iArr4[0], f2);
            resultPointArr[3] = new ResultPoint(iArr4[1], f2);
        }
        if (i12 - i8 < 10) {
            Arrays.fill(resultPointArr, (Object) null);
        }
        return resultPointArr;
    }

    public static PDF417DetectorResult detect(BinaryBitmap binaryBitmap, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException {
        BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        List<ResultPoint[]> m65607b = m65607b(z, blackMatrix);
        if (m65607b.isEmpty()) {
            blackMatrix = blackMatrix.m110232clone();
            blackMatrix.rotate180();
            m65607b = m65607b(z, blackMatrix);
        }
        return new PDF417DetectorResult(blackMatrix, m65607b);
    }

    /* renamed from: e */
    private static ResultPoint[] m65604e(BitMatrix bitMatrix, int i, int i2) {
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        ResultPoint[] resultPointArr = new ResultPoint[8];
        m65608a(resultPointArr, m65605d(bitMatrix, height, width, i, i2, f44648c), f44646a);
        ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            i2 = (int) resultPoint.getX();
            i = (int) resultPointArr[4].getY();
        }
        m65608a(resultPointArr, m65605d(bitMatrix, height, width, i, i2, f44649d), f44647b);
        return resultPointArr;
    }

    /* renamed from: f */
    private static float m65603f(int[] iArr, int[] iArr2, float f) {
        float f2;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f3 = i;
        float f4 = f3 / i2;
        float f5 = f * f4;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f7 = iArr2[i4] * f4;
            float f8 = iArr[i4];
            if (f8 > f7) {
                f2 = f8 - f7;
            } else {
                f2 = f7 - f8;
            }
            if (f2 > f5) {
                return Float.POSITIVE_INFINITY;
            }
            f6 += f2;
        }
        return f6 / f3;
    }
}
