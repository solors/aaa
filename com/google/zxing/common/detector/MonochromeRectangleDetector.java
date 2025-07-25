package com.google.zxing.common.detector;

import com.google.zxing.NotFoundException;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;

@Deprecated
/* loaded from: classes5.dex */
public final class MonochromeRectangleDetector {

    /* renamed from: a */
    private final BitMatrix f44380a;

    public MonochromeRectangleDetector(BitMatrix bitMatrix) {
        this.f44380a = bitMatrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0031 A[EDGE_INSN: B:70:0x0031->B:22:0x0031 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0067 A[EDGE_INSN: B:86:0x0067->B:47:0x0067 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int[] m66016a(int r6, int r7, int r8, int r9, boolean r10) {
        /*
            r5 = this;
            int r0 = r8 + r9
            r1 = 2
            int r0 = r0 / r1
            r2 = r0
        L5:
            if (r2 < r8) goto L3a
            com.google.zxing.common.BitMatrix r3 = r5.f44380a
            if (r10 == 0) goto L12
            boolean r3 = r3.get(r2, r6)
            if (r3 == 0) goto L1b
            goto L18
        L12:
            boolean r3 = r3.get(r6, r2)
            if (r3 == 0) goto L1b
        L18:
            int r2 = r2 + (-1)
            goto L5
        L1b:
            r3 = r2
        L1c:
            int r3 = r3 + (-1)
            if (r3 < r8) goto L31
            com.google.zxing.common.BitMatrix r4 = r5.f44380a
            if (r10 == 0) goto L2b
            boolean r4 = r4.get(r3, r6)
            if (r4 == 0) goto L1c
            goto L31
        L2b:
            boolean r4 = r4.get(r6, r3)
            if (r4 == 0) goto L1c
        L31:
            int r4 = r2 - r3
            if (r3 < r8) goto L3a
            if (r4 <= r7) goto L38
            goto L3a
        L38:
            r2 = r3
            goto L5
        L3a:
            r8 = 1
            int r2 = r2 + r8
        L3c:
            if (r0 >= r9) goto L70
            com.google.zxing.common.BitMatrix r3 = r5.f44380a
            if (r10 == 0) goto L49
            boolean r3 = r3.get(r0, r6)
            if (r3 == 0) goto L52
            goto L4f
        L49:
            boolean r3 = r3.get(r6, r0)
            if (r3 == 0) goto L52
        L4f:
            int r0 = r0 + 1
            goto L3c
        L52:
            r3 = r0
        L53:
            int r3 = r3 + r8
            if (r3 >= r9) goto L67
            com.google.zxing.common.BitMatrix r4 = r5.f44380a
            if (r10 == 0) goto L61
            boolean r4 = r4.get(r3, r6)
            if (r4 == 0) goto L53
            goto L67
        L61:
            boolean r4 = r4.get(r6, r3)
            if (r4 == 0) goto L53
        L67:
            int r4 = r3 - r0
            if (r3 >= r9) goto L70
            if (r4 <= r7) goto L6e
            goto L70
        L6e:
            r0 = r3
            goto L3c
        L70:
            int r0 = r0 + (-1)
            if (r0 <= r2) goto L7c
            int[] r6 = new int[r1]
            r7 = 0
            r6[r7] = r2
            r6[r8] = r0
            return r6
        L7c:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.common.detector.MonochromeRectangleDetector.m66016a(int, int, int, int, boolean):int[]");
    }

    /* renamed from: b */
    private ResultPoint m66015b(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws NotFoundException {
        int[] m66016a;
        int[] iArr = null;
        int i10 = i;
        int i11 = i5;
        while (i11 < i8 && i11 >= i7 && i10 < i4 && i10 >= i3) {
            if (i2 == 0) {
                m66016a = m66016a(i11, i9, i3, i4, true);
            } else {
                m66016a = m66016a(i10, i9, i7, i8, false);
            }
            if (m66016a == null) {
                if (iArr != null) {
                    char c = 0;
                    if (i2 == 0) {
                        int i12 = i11 - i6;
                        int i13 = iArr[0];
                        if (i13 < i) {
                            if (iArr[1] > i) {
                                if (i6 <= 0) {
                                    c = 1;
                                }
                                return new ResultPoint(iArr[c], i12);
                            }
                            return new ResultPoint(i13, i12);
                        }
                        return new ResultPoint(iArr[1], i12);
                    }
                    int i14 = i10 - i2;
                    int i15 = iArr[0];
                    if (i15 < i5) {
                        if (iArr[1] > i5) {
                            float f = i14;
                            if (i2 >= 0) {
                                c = 1;
                            }
                            return new ResultPoint(f, iArr[c]);
                        }
                        return new ResultPoint(i14, i15);
                    }
                    return new ResultPoint(i14, iArr[1]);
                }
                throw NotFoundException.getNotFoundInstance();
            }
            i11 += i6;
            i10 += i2;
            iArr = m66016a;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public ResultPoint[] detect() throws NotFoundException {
        int height = this.f44380a.getHeight();
        int width = this.f44380a.getWidth();
        int i = height / 2;
        int i2 = width / 2;
        int max = Math.max(1, height / 256);
        int max2 = Math.max(1, width / 256);
        int i3 = -max;
        int i4 = i2 / 2;
        int y = ((int) m66015b(i2, 0, 0, width, i, i3, 0, height, i4).getY()) - 1;
        int i5 = i / 2;
        ResultPoint m66015b = m66015b(i2, -max2, 0, width, i, 0, y, height, i5);
        int x = ((int) m66015b.getX()) - 1;
        ResultPoint m66015b2 = m66015b(i2, max2, x, width, i, 0, y, height, i5);
        int x2 = ((int) m66015b2.getX()) + 1;
        ResultPoint m66015b3 = m66015b(i2, 0, x, x2, i, max, y, height, i4);
        return new ResultPoint[]{m66015b(i2, 0, x, x2, i, i3, y, ((int) m66015b3.getY()) + 1, i2 / 4), m66015b, m66015b2, m66015b3};
    }
}
