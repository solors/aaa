package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Code39Writer extends OneDimensionalCodeWriter {
    /* renamed from: c */
    private static void m65878c(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    /* renamed from: d */
    private static String m65877d(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt != '@') {
                        if (charAt != '`') {
                            if (charAt != '-' && charAt != '.') {
                                if (charAt <= 26) {
                                    sb2.append('$');
                                    sb2.append((char) ((charAt - 1) + 65));
                                } else if (charAt < ' ') {
                                    sb2.append('%');
                                    sb2.append((char) ((charAt - 27) + 65));
                                } else if (charAt > ',' && charAt != '/' && charAt != ':') {
                                    if (charAt <= '9') {
                                        sb2.append((char) ((charAt - '0') + 48));
                                    } else if (charAt <= '?') {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - ';') + 70));
                                    } else if (charAt <= 'Z') {
                                        sb2.append((char) ((charAt - 'A') + 65));
                                    } else if (charAt <= '_') {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - '[') + 75));
                                    } else if (charAt <= 'z') {
                                        sb2.append('+');
                                        sb2.append((char) ((charAt - 'a') + 65));
                                    } else if (charAt <= 127) {
                                        sb2.append('%');
                                        sb2.append((char) ((charAt - '{') + 80));
                                    } else {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i) + "'");
                                    }
                                } else {
                                    sb2.append('/');
                                    sb2.append((char) ((charAt - '!') + 65));
                                }
                            }
                        } else {
                            sb2.append("%W");
                        }
                    } else {
                        sb2.append("%V");
                    }
                }
                sb2.append(charAt);
            } else {
                sb2.append("%U");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_39) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                    str = m65877d(str);
                    length = str.length();
                    if (length > 80) {
                        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                    }
                } else {
                    i++;
                }
            }
            int[] iArr = new int[9];
            int i2 = length + 25;
            for (int i3 = 0; i3 < length; i3++) {
                m65878c(Code39Reader.f44482e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
                for (int i4 = 0; i4 < 9; i4++) {
                    i2 += iArr[i4];
                }
            }
            boolean[] zArr = new boolean[i2];
            m65878c(148, iArr);
            int m65852a = OneDimensionalCodeWriter.m65852a(zArr, 0, iArr, true);
            int[] iArr2 = {1};
            int m65852a2 = m65852a + OneDimensionalCodeWriter.m65852a(zArr, m65852a, iArr2, false);
            for (int i5 = 0; i5 < length; i5++) {
                m65878c(Code39Reader.f44482e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
                int m65852a3 = m65852a2 + OneDimensionalCodeWriter.m65852a(zArr, m65852a2, iArr, true);
                m65852a2 = m65852a3 + OneDimensionalCodeWriter.m65852a(zArr, m65852a3, iArr2, false);
            }
            m65878c(148, iArr);
            OneDimensionalCodeWriter.m65852a(zArr, m65852a2, iArr, true);
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
