package com.google.zxing.oned;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.maticoo.sdk.p405ad.utils.error.ErrorCode;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Code93Reader extends OneDReader {

    /* renamed from: c */
    private static final char[] f44487c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f44488d;

    /* renamed from: e */
    private static final int f44489e;

    /* renamed from: a */
    private final StringBuilder f44490a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f44491b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, FacebookRequestErrorClassification.ESC_APP_NOT_INSTALLED, 366, 374, 430, 294, 474, 470, ErrorCode.CODE_SHOW_RESOURCE_ERROR, 350};
        f44488d = iArr;
        f44489e = iArr[47];
    }

    /* renamed from: e */
    private static void m65876e(CharSequence charSequence) throws ChecksumException {
        int length = charSequence.length();
        m65875f(charSequence, length - 2, 20);
        m65875f(charSequence, length - 1, 15);
    }

    /* renamed from: f */
    private static void m65875f(CharSequence charSequence, int i, int i2) throws ChecksumException {
        int i3 = 0;
        int i4 = 1;
        for (int i5 = i - 1; i5 >= 0; i5--) {
            i3 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i5)) * i4;
            i4++;
            if (i4 > i2) {
                i4 = 1;
            }
        }
        if (charSequence.charAt(i) == f44487c[i3 % 47]) {
            return;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /* renamed from: g */
    private static String m65874g(CharSequence charSequence) throws FormatException {
        int i;
        char c;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i2 = 0;
        while (i2 < length) {
            char charAt = charSequence.charAt(i2);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i2 < length - 1) {
                    i2++;
                    char charAt2 = charSequence.charAt(i2);
                    switch (charAt) {
                        case 'a':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 - '@';
                                c = (char) i;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            break;
                        case 'b':
                            if (charAt2 >= 'A' && charAt2 <= 'E') {
                                i = charAt2 - '&';
                            } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                                i = charAt2 - 11;
                            } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                                i = charAt2 + 16;
                            } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                                i = charAt2 + '+';
                            } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                                c = 127;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                            c = (char) i;
                            break;
                        case 'c':
                            if (charAt2 >= 'A' && charAt2 <= 'O') {
                                i = charAt2 - ' ';
                                c = (char) i;
                                break;
                            } else if (charAt2 == 'Z') {
                                c = ':';
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        case 'd':
                            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                                i = charAt2 + ' ';
                                c = (char) i;
                                break;
                            } else {
                                throw FormatException.getFormatInstance();
                            }
                        default:
                            c = 0;
                            break;
                    }
                    sb2.append(c);
                } else {
                    throw FormatException.getFormatInstance();
                }
            } else {
                sb2.append(charAt);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: h */
    private int[] m65873h(BitArray bitArray) throws NotFoundException {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.f44491b, 0);
        int[] iArr = this.f44491b;
        int length = iArr.length;
        boolean z = false;
        int i = 0;
        int i2 = nextSet;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == length - 1) {
                    if (m65871j(iArr) == f44489e) {
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

    /* renamed from: i */
    private static char m65872i(int i) throws NotFoundException {
        int i2 = 0;
        while (true) {
            int[] iArr = f44488d;
            if (i2 < iArr.length) {
                if (iArr[i2] == i) {
                    return f44487c[i2];
                }
                i2++;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    /* renamed from: j */
    private static int m65871j(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int round = Math.round((iArr[i4] * 9.0f) / i);
            if (round > 0 && round <= 4) {
                if ((i4 & 1) == 0) {
                    for (int i5 = 0; i5 < round; i5++) {
                        i3 = (i3 << 1) | 1;
                    }
                } else {
                    i3 <<= round;
                }
            } else {
                return -1;
            }
        }
        return i3;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i, BitArray bitArray, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        int[] m65873h;
        int nextSet = bitArray.getNextSet(m65873h(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.f44491b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f44490a;
        sb2.setLength(0);
        while (true) {
            OneDReader.m65854c(bitArray, nextSet, iArr);
            int m65871j = m65871j(iArr);
            if (m65871j >= 0) {
                char m65872i = m65872i(m65871j);
                sb2.append(m65872i);
                int i2 = nextSet;
                for (int i3 : iArr) {
                    i2 += i3;
                }
                int nextSet2 = bitArray.getNextSet(i2);
                if (m65872i == '*') {
                    sb2.deleteCharAt(sb2.length() - 1);
                    int i4 = 0;
                    for (int i5 : iArr) {
                        i4 += i5;
                    }
                    if (nextSet2 != size && bitArray.get(nextSet2)) {
                        if (sb2.length() >= 2) {
                            m65876e(sb2);
                            sb2.setLength(sb2.length() - 2);
                            float f = i;
                            return new Result(m65874g(sb2), null, new ResultPoint[]{new ResultPoint((m65873h[1] + m65873h[0]) / 2.0f, f), new ResultPoint(nextSet + (i4 / 2.0f), f)}, BarcodeFormat.CODE_93);
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                nextSet = nextSet2;
            } else {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }
}
