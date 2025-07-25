package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: c */
    private static int m65884c(CharSequence charSequence, int i, int i2) {
        CType m65883d;
        CType m65883d2;
        char charAt;
        CType m65883d3 = m65883d(charSequence, i);
        CType cType = CType.ONE_DIGIT;
        if (m65883d3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (m65883d3 == cType2) {
            if (i >= charSequence.length() || ((charAt = charSequence.charAt(i)) >= ' ' && (i2 != 101 || charAt >= '`'))) {
                return 100;
            }
            return 101;
        } else if (i2 == 99) {
            return 99;
        } else {
            if (i2 == 100) {
                CType cType3 = CType.FNC_1;
                if (m65883d3 == cType3 || (m65883d = m65883d(charSequence, i + 2)) == cType2 || m65883d == cType) {
                    return 100;
                }
                if (m65883d == cType3) {
                    if (m65883d(charSequence, i + 3) != CType.TWO_DIGITS) {
                        return 100;
                    }
                    return 99;
                }
                int i3 = i + 4;
                while (true) {
                    m65883d2 = m65883d(charSequence, i3);
                    if (m65883d2 != CType.TWO_DIGITS) {
                        break;
                    }
                    i3 += 2;
                }
                if (m65883d2 == CType.ONE_DIGIT) {
                    return 100;
                }
                return 99;
            }
            if (m65883d3 == CType.FNC_1) {
                m65883d3 = m65883d(charSequence, i + 1);
            }
            if (m65883d3 != CType.TWO_DIGITS) {
                return 100;
            }
            return 99;
        }
    }

    /* renamed from: d */
    private static CType m65883d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (i >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt >= '0' && charAt <= '9') {
            int i2 = i + 1;
            if (i2 >= length) {
                return CType.ONE_DIGIT;
            }
            char charAt2 = charSequence.charAt(i2);
            if (charAt2 >= '0' && charAt2 <= '9') {
                return CType.TWO_DIGITS;
            }
            return CType.ONE_DIGIT;
        }
        return CType.UNCODABLE;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                switch (charAt) {
                    case 241:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt <= 127) {
                            break;
                        } else {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 1;
            while (true) {
                int i7 = 103;
                if (i3 < length) {
                    int m65884c = m65884c(str, i3, i5);
                    int i8 = 100;
                    if (m65884c == i5) {
                        switch (str.charAt(i3)) {
                            case 241:
                                i8 = 102;
                                break;
                            case 242:
                                i8 = 97;
                                break;
                            case 243:
                                i8 = 96;
                                break;
                            case 244:
                                if (i5 == 101) {
                                    i8 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i5 != 100) {
                                    if (i5 == 101) {
                                        i8 = str.charAt(i3) - ' ';
                                        if (i8 < 0) {
                                            i8 += 96;
                                            break;
                                        }
                                    } else {
                                        i8 = Integer.parseInt(str.substring(i3, i3 + 2));
                                        i3++;
                                        break;
                                    }
                                } else {
                                    i8 = str.charAt(i3) - ' ';
                                    break;
                                }
                                break;
                        }
                        i3++;
                    } else {
                        if (i5 != 0) {
                            i7 = m65884c;
                        } else if (m65884c == 100) {
                            i7 = 104;
                        } else if (m65884c != 101) {
                            i7 = 105;
                        }
                        i8 = i7;
                        i5 = m65884c;
                    }
                    arrayList.add(Code128Reader.f44480a[i8]);
                    i4 += i8 * i6;
                    if (i3 != 0) {
                        i6++;
                    }
                } else {
                    int[][] iArr = Code128Reader.f44480a;
                    arrayList.add(iArr[i4 % 103]);
                    arrayList.add(iArr[106]);
                    int i9 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i10 : iArr2) {
                            i9 += i10;
                        }
                    }
                    boolean[] zArr = new boolean[i9];
                    for (int[] iArr3 : arrayList) {
                        i += OneDimensionalCodeWriter.m65852a(zArr, i, iArr3, true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
