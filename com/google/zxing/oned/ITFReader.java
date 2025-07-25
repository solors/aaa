package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ITFReader extends OneDReader {

    /* renamed from: b */
    private static final int[] f44497b = {6, 8, 10, 12, 14};

    /* renamed from: c */
    private static final int[] f44498c = {1, 1, 1, 1};

    /* renamed from: d */
    private static final int[][] f44499d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* renamed from: e */
    private static final int[][] f44500e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* renamed from: a */
    private int f44501a = -1;

    /* renamed from: e */
    private static int m65863e(int[] iArr) throws NotFoundException {
        int length = f44500e.length;
        float f = 0.38f;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            float m65855b = OneDReader.m65855b(iArr, f44500e[i2], 0.5f);
            if (m65855b < f) {
                i = i2;
                f = m65855b;
            } else if (m65855b == f) {
                i = -1;
            }
        }
        if (i >= 0) {
            return i % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: f */
    private int[] m65862f(BitArray bitArray) throws NotFoundException {
        int i;
        int[] m65859i;
        bitArray.reverse();
        try {
            try {
                m65859i = m65859i(bitArray, m65858j(bitArray), f44499d[0]);
            } catch (NotFoundException unused) {
                m65859i = m65859i(bitArray, i, f44499d[1]);
            }
            m65857k(bitArray, m65859i[0]);
            int i2 = m65859i[0];
            m65859i[0] = bitArray.getSize() - m65859i[1];
            m65859i[1] = bitArray.getSize() - i2;
            return m65859i;
        } finally {
            bitArray.reverse();
        }
    }

    /* renamed from: g */
    private static void m65861g(BitArray bitArray, int i, int i2, StringBuilder sb2) throws NotFoundException {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i < i2) {
            OneDReader.m65854c(bitArray, i, iArr);
            for (int i3 = 0; i3 < 5; i3++) {
                int i4 = i3 * 2;
                iArr2[i3] = iArr[i4];
                iArr3[i3] = iArr[i4 + 1];
            }
            sb2.append((char) (m65863e(iArr2) + 48));
            sb2.append((char) (m65863e(iArr3) + 48));
            for (int i5 = 0; i5 < 10; i5++) {
                i += iArr[i5];
            }
        }
    }

    /* renamed from: h */
    private int[] m65860h(BitArray bitArray) throws NotFoundException {
        int[] m65859i = m65859i(bitArray, m65858j(bitArray), f44498c);
        int i = m65859i[1];
        int i2 = m65859i[0];
        this.f44501a = (i - i2) / 4;
        m65857k(bitArray, i2);
        return m65859i;
    }

    /* renamed from: i */
    private static int[] m65859i(BitArray bitArray, int i, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i2 = i;
        boolean z = false;
        int i3 = 0;
        while (i < size) {
            if (bitArray.get(i) != z) {
                iArr2[i3] = iArr2[i3] + 1;
            } else {
                if (i3 == length - 1) {
                    if (OneDReader.m65855b(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i2, i};
                    }
                    i2 += iArr2[0] + iArr2[1];
                    int i4 = i3 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i3] = 0;
                    i3--;
                } else {
                    i3++;
                }
                iArr2[i3] = 1;
                z = !z;
            }
            i++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: j */
    private static int m65858j(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
        return;
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m65857k(com.google.zxing.common.BitArray r3, int r4) throws com.google.zxing.NotFoundException {
        /*
            r2 = this;
            int r0 = r2.f44501a
            int r0 = r0 * 10
            if (r0 >= r4) goto L7
            goto L8
        L7:
            r0 = r4
        L8:
            int r4 = r4 + (-1)
        La:
            if (r0 <= 0) goto L19
            if (r4 < 0) goto L19
            boolean r1 = r3.get(r4)
            if (r1 != 0) goto L19
            int r0 = r0 + (-1)
            int r4 = r4 + (-1)
            goto La
        L19:
            if (r0 != 0) goto L1c
            return
        L1c:
            com.google.zxing.NotFoundException r3 = com.google.zxing.NotFoundException.getNotFoundInstance()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.ITFReader.m65857k(com.google.zxing.common.BitArray, int):void");
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws FormatException, NotFoundException {
        int[] iArr;
        boolean z;
        int[] m65860h = m65860h(bitArray);
        int[] m65862f = m65862f(bitArray);
        StringBuilder sb2 = new StringBuilder(20);
        m65861g(bitArray, m65860h[1], m65862f[0], sb2);
        String sb3 = sb2.toString();
        if (map != null) {
            iArr = (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS);
        } else {
            iArr = null;
        }
        if (iArr == null) {
            iArr = f44497b;
        }
        int length = sb3.length();
        int length2 = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 < length2) {
                int i4 = iArr[i2];
                if (length == i4) {
                    z = true;
                    break;
                }
                if (i4 > i3) {
                    i3 = i4;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (!z && length > i3) {
            z = true;
        }
        if (z) {
            float f = i;
            return new Result(sb3, null, new ResultPoint[]{new ResultPoint(m65860h[1], f), new ResultPoint(m65862f[0], f)}, BarcodeFormat.ITF);
        }
        throw FormatException.getFormatInstance();
    }
}
