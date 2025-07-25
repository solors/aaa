package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class CodaBarReader extends OneDReader {

    /* renamed from: d */
    static final char[] f44470d = "0123456789-$:/.+ABCD".toCharArray();

    /* renamed from: e */
    static final int[] f44471e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* renamed from: f */
    private static final char[] f44472f = {'A', 'B', 'C', 'D'};

    /* renamed from: a */
    private final StringBuilder f44473a = new StringBuilder(20);

    /* renamed from: b */
    private int[] f44474b = new int[80];

    /* renamed from: c */
    private int f44475c = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static boolean m65892e(char[] cArr, char c) {
        if (cArr != null) {
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m65891f(int i) {
        int[] iArr = this.f44474b;
        int i2 = this.f44475c;
        iArr[i2] = i;
        int i3 = i2 + 1;
        this.f44475c = i3;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[i3 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f44474b = iArr2;
        }
    }

    /* renamed from: g */
    private int m65890g() throws NotFoundException {
        for (int i = 1; i < this.f44475c; i += 2) {
            int m65888i = m65888i(i);
            if (m65888i != -1 && m65892e(f44472f, f44470d[m65888i])) {
                int i2 = 0;
                for (int i3 = i; i3 < i + 7; i3++) {
                    i2 += this.f44474b[i3];
                }
                if (i == 1 || this.f44474b[i - 1] >= i2 / 2) {
                    return i;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: h */
    private void m65889h(BitArray bitArray) throws NotFoundException {
        int i = 0;
        this.f44475c = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset < size) {
            boolean z = true;
            while (nextUnset < size) {
                if (bitArray.get(nextUnset) != z) {
                    i++;
                } else {
                    m65891f(i);
                    z = !z;
                    i = 1;
                }
                nextUnset++;
            }
            m65891f(i);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: i */
    private int m65888i(int i) {
        int i2;
        int i3 = i + 7;
        if (i3 >= this.f44475c) {
            return -1;
        }
        int[] iArr = this.f44474b;
        int i4 = Integer.MAX_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = 0;
        for (int i8 = i; i8 < i3; i8 += 2) {
            int i9 = iArr[i8];
            if (i9 < i6) {
                i6 = i9;
            }
            if (i9 > i7) {
                i7 = i9;
            }
        }
        int i10 = (i6 + i7) / 2;
        int i11 = 0;
        for (int i12 = i + 1; i12 < i3; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 < i4) {
                i4 = i13;
            }
            if (i13 > i11) {
                i11 = i13;
            }
        }
        int i14 = (i4 + i11) / 2;
        int i15 = 128;
        int i16 = 0;
        for (int i17 = 0; i17 < 7; i17++) {
            if ((i17 & 1) == 0) {
                i2 = i10;
            } else {
                i2 = i14;
            }
            i15 >>= 1;
            if (iArr[i + i17] > i2) {
                i16 |= i15;
            }
        }
        while (true) {
            int[] iArr2 = f44471e;
            if (i5 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i5] == i16) {
                return i5;
            }
            i5++;
        }
    }

    /* renamed from: j */
    private void m65887j(int i) throws NotFoundException {
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.f44473a.length() - 1;
        int i2 = 0;
        int i3 = i;
        int i4 = 0;
        while (true) {
            int i5 = f44471e[this.f44473a.charAt(i4)];
            for (int i6 = 6; i6 >= 0; i6--) {
                int i7 = (i6 & 1) + ((i5 & 1) << 1);
                iArr[i7] = iArr[i7] + this.f44474b[i3 + i6];
                iArr2[i7] = iArr2[i7] + 1;
                i5 >>= 1;
            }
            if (i4 >= length) {
                break;
            }
            i3 += 8;
            i4++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i8 = 0; i8 < 2; i8++) {
            fArr2[i8] = 0.0f;
            int i9 = i8 + 2;
            int i10 = iArr[i9];
            int i11 = iArr2[i9];
            float f = ((iArr[i8] / iArr2[i8]) + (i10 / i11)) / 2.0f;
            fArr2[i9] = f;
            fArr[i8] = f;
            fArr[i9] = ((i10 * 2.0f) + 1.5f) / i11;
        }
        loop3: while (true) {
            int i12 = f44471e[this.f44473a.charAt(i2)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                float f2 = this.f44474b[i + i13];
                if (f2 < fArr2[i14] || f2 > fArr[i14]) {
                    break loop3;
                }
                i12 >>= 1;
            }
            if (i2 < length) {
                i += 8;
                i2++;
            } else {
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException {
        Arrays.fill(this.f44474b, 0);
        m65889h(bitArray);
        int m65890g = m65890g();
        this.f44473a.setLength(0);
        int i2 = m65890g;
        do {
            int m65888i = m65888i(i2);
            if (m65888i != -1) {
                this.f44473a.append((char) m65888i);
                i2 += 8;
                if (this.f44473a.length() > 1 && m65892e(f44472f, f44470d[m65888i])) {
                    break;
                }
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        } while (i2 < this.f44475c);
        int i3 = i2 - 1;
        int i4 = this.f44474b[i3];
        int i5 = 0;
        for (int i6 = -8; i6 < -1; i6++) {
            i5 += this.f44474b[i2 + i6];
        }
        if (i2 < this.f44475c && i4 < i5 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        m65887j(m65890g);
        for (int i7 = 0; i7 < this.f44473a.length(); i7++) {
            StringBuilder sb2 = this.f44473a;
            sb2.setCharAt(i7, f44470d[sb2.charAt(i7)]);
        }
        char charAt = this.f44473a.charAt(0);
        char[] cArr = f44472f;
        if (m65892e(cArr, charAt)) {
            StringBuilder sb3 = this.f44473a;
            if (m65892e(cArr, sb3.charAt(sb3.length() - 1))) {
                if (this.f44473a.length() > 3) {
                    if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
                        StringBuilder sb4 = this.f44473a;
                        sb4.deleteCharAt(sb4.length() - 1);
                        this.f44473a.deleteCharAt(0);
                    }
                    int i8 = 0;
                    for (int i9 = 0; i9 < m65890g; i9++) {
                        i8 += this.f44474b[i9];
                    }
                    float f = i8;
                    while (m65890g < i3) {
                        i8 += this.f44474b[m65890g];
                        m65890g++;
                    }
                    float f2 = i;
                    return new Result(this.f44473a.toString(), null, new ResultPoint[]{new ResultPoint(f, f2), new ResultPoint(i8, f2)}, BarcodeFormat.CODABAR);
                }
                throw NotFoundException.getNotFoundInstance();
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
