package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;

/* loaded from: classes5.dex */
final class DecodedBitStreamParser {

    /* renamed from: a */
    private static final String[] f44462a = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static DecoderResult m65907a(byte[] bArr, int i) {
        String m65900h;
        StringBuilder sb2 = new StringBuilder(144);
        if (i != 2 && i != 3) {
            if (i != 4) {
                if (i == 5) {
                    sb2.append(m65903e(bArr, 1, 77));
                }
            } else {
                sb2.append(m65903e(bArr, 1, 93));
            }
        } else {
            if (i == 2) {
                m65900h = new DecimalFormat("0000000000".substring(0, m65901g(bArr))).format(m65902f(bArr));
            } else {
                m65900h = m65900h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(m65905c(bArr));
            String format2 = decimalFormat.format(m65899i(bArr));
            sb2.append(m65903e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                sb2.insert(9, m65900h + (char) 29 + format + (char) 29 + format2 + (char) 29);
            } else {
                sb2.insert(0, m65900h + (char) 29 + format + (char) 29 + format2 + (char) 29);
            }
        }
        return new DecoderResult(bArr, sb2.toString(), null, String.valueOf(i));
    }

    /* renamed from: b */
    private static int m65906b(int i, byte[] bArr) {
        int i2 = i - 1;
        if (((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    private static int m65905c(byte[] bArr) {
        return m65904d(bArr, new byte[]{53, 54, 43, 44, 45, 46, 47, 48, 37, 38});
    }

    /* renamed from: d */
    private static int m65904d(byte[] bArr, byte[] bArr2) {
        if (bArr2.length != 0) {
            int i = 0;
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                i += m65906b(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
            }
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: e */
    private static String m65903e(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        StringBuilder sb2 = new StringBuilder();
        int i7 = i;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i + i2) {
            char charAt = f44462a[i9].charAt(bArr[i7]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i10 = i9;
                    i9 = charAt - 65520;
                    i8 = 1;
                    break;
                case 65525:
                    i8 = 2;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65526:
                    i8 = 3;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65527:
                    i8 = -1;
                    i9 = 0;
                    break;
                case 65528:
                    i8 = -1;
                    i9 = 1;
                    break;
                case 65529:
                    i8 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(charAt);
                    break;
                case 65531:
                    i7 = i7 + 1 + 1 + 1 + 1 + 1;
                    sb2.append(new DecimalFormat("000000000").format((bArr[i3] << 24) + (bArr[i4] << 18) + (bArr[i5] << 12) + (bArr[i6] << 6) + bArr[i7]));
                    break;
            }
            int i11 = i8 - 1;
            if (i8 == 0) {
                i9 = i10;
            }
            i7++;
            i8 = i11;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static int m65902f(byte[] bArr) {
        return m65904d(bArr, new byte[]{33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    /* renamed from: g */
    private static int m65901g(byte[] bArr) {
        return m65904d(bArr, new byte[]{39, 40, 41, 42, 31, 32});
    }

    /* renamed from: h */
    private static String m65900h(byte[] bArr) {
        String[] strArr = f44462a;
        return String.valueOf(new char[]{strArr[0].charAt(m65904d(bArr, new byte[]{39, 40, 41, 42, 31, 32})), strArr[0].charAt(m65904d(bArr, new byte[]{33, 34, 35, 36, 25, 26})), strArr[0].charAt(m65904d(bArr, new byte[]{27, 28, 29, 30, 19, 20})), strArr[0].charAt(m65904d(bArr, new byte[]{21, 22, 23, 24, 13, 14})), strArr[0].charAt(m65904d(bArr, new byte[]{15, 16, 17, 18, 7, 8})), strArr[0].charAt(m65904d(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    /* renamed from: i */
    private static int m65899i(byte[] bArr) {
        return m65904d(bArr, new byte[]{55, 56, 57, 58, 59, 60, 49, 50, 51, 52});
    }
}
