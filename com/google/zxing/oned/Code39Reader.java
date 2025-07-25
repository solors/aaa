package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Code39Reader extends OneDReader {

    /* renamed from: e */
    static final int[] f44482e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f44483a;

    /* renamed from: b */
    private final boolean f44484b;

    /* renamed from: c */
    private final StringBuilder f44485c;

    /* renamed from: d */
    private final int[] f44486d;

    public Code39Reader() {
        this(false);
    }

    /* renamed from: e */
    private static String m65882e(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '+' && charAt != '$' && charAt != '%' && charAt != '/') {
                sb2.append(charAt);
            } else {
                i2++;
                char charAt2 = charSequence.charAt(i2);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i = charAt2 - ' ';
                                } else if (charAt2 == 'Z') {
                                    c = ':';
                                    sb2.append(c);
                                } else {
                                    throw FormatException.getFormatInstance();
                                }
                            }
                            c = 0;
                            sb2.append(c);
                        } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i = charAt2 + ' ';
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i = charAt2 + 16;
                    } else if (charAt2 >= 'P' && charAt2 <= 'T') {
                        i = charAt2 + '+';
                    } else {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c = '@';
                            } else if (charAt2 == 'W') {
                                c = '`';
                            } else if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            } else {
                                c = 127;
                            }
                            sb2.append(c);
                        }
                        c = 0;
                        sb2.append(c);
                    }
                } else if (charAt2 >= 'A' && charAt2 <= 'Z') {
                    i = charAt2 - '@';
                } else {
                    throw FormatException.getFormatInstance();
                }
                c = (char) i;
                sb2.append(c);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static int[] m65881f(BitArray bitArray, int[] iArr) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m65879h(iArr) == 148 && bitArray.isRange(Math.max(0, i2 - ((nextSet - i2) / 2)), i2, false)) {
                        return new int[]{i2, nextSet};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i3 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i3);
                    iArr[i3] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: g */
    private static char m65880g(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f44482e;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i2);
                }
                i2++;
            } else if (i == 148) {
                return '*';
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* renamed from: h */
    private static int m65879h(int[] iArr) {
        int length = iArr.length;
        int i = 0;
        while (true) {
            int i2 = Integer.MAX_VALUE;
            for (int i3 : iArr) {
                if (i3 < i2 && i3 > i) {
                    i2 = i3;
                }
            }
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < length; i7++) {
                int i8 = iArr[i7];
                if (i8 > i2) {
                    i5 |= 1 << ((length - 1) - i7);
                    i4++;
                    i6 += i8;
                }
            }
            if (i4 == 3) {
                for (int i9 = 0; i9 < length && i4 > 0; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i2) {
                        i4--;
                        if ((i10 << 1) >= i6) {
                            return -1;
                        }
                    }
                }
                return i5;
            } else if (i4 <= 3) {
                return -1;
            } else {
                i = i2;
            }
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m65881f;
        String sb2;
        int[] iArr = this.f44486d;
        Arrays.fill(iArr, 0);
        StringBuilder sb3 = this.f44485c;
        sb3.setLength(0);
        int nextSet = bitArray.getNextSet(m65881f(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        while (true) {
            OneDReader.m65854c(bitArray, nextSet, iArr);
            int m65879h = m65879h(iArr);
            if (m65879h >= 0) {
                char m65880g = m65880g(m65879h);
                sb3.append(m65880g);
                int i2 = nextSet;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int nextSet2 = bitArray.getNextSet(i2);
                if (m65880g == '*') {
                    sb3.setLength(sb3.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    int i6 = (nextSet2 - nextSet) - i4;
                    if (nextSet2 != size && (i6 << 1) < i4) {
                        throw NotFoundException.getNotFoundInstance();
                    }
                    if (this.f44483a) {
                        int length = sb3.length() - 1;
                        int i7 = 0;
                        for (int i8 = 0; i8 < length; i8++) {
                            i7 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f44485c.charAt(i8));
                        }
                        if (sb3.charAt(length) == "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i7 % 43)) {
                            sb3.setLength(length);
                        } else {
                            throw ChecksumException.getChecksumInstance();
                        }
                    }
                    if (sb3.length() != 0) {
                        if (this.f44484b) {
                            sb2 = m65882e(sb3);
                        } else {
                            sb2 = sb3.toString();
                        }
                        float f = i;
                        return new Result(sb2, null, new ResultPoint[]{new ResultPoint((m65881f[1] + m65881f[0]) / 2.0f, f), new ResultPoint(nextSet + (i4 / 2.0f), f)}, BarcodeFormat.CODE_39);
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public Code39Reader(boolean z) {
        this(z, false);
    }

    public Code39Reader(boolean z, boolean z2) {
        this.f44483a = z;
        this.f44484b = z2;
        this.f44485c = new StringBuilder(20);
        this.f44486d = new int[9];
    }
}
