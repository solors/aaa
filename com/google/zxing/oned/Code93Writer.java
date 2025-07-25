package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes5.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    /* renamed from: c */
    private static int m65870c(boolean[] zArr, int i, int[] iArr) {
        boolean z;
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = i + 1;
            if (iArr[i2] != 0) {
                z = true;
            } else {
                z = false;
            }
            zArr[i] = z;
            i2++;
            i = i3;
        }
        return 9;
    }

    /* renamed from: d */
    private static int m65869d(String str, int i) {
        int i2 = 0;
        int i3 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i2 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i3;
            i3++;
            if (i3 > i) {
                i3 = 1;
            }
        }
        return i2 % 47;
    }

    /* renamed from: e */
    private static void m65868e(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) == 0) {
                i3 = 0;
            }
            iArr[i2] = i3;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            m65868e(Code93Reader.f44488d[47], iArr);
            boolean[] zArr = new boolean[((str.length() + 2 + 2) * 9) + 1];
            int m65870c = m65870c(zArr, 0, iArr);
            for (int i = 0; i < length; i++) {
                m65868e(Code93Reader.f44488d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i))], iArr);
                m65870c += m65870c(zArr, m65870c, iArr);
            }
            int m65869d = m65869d(str, 20);
            int[] iArr2 = Code93Reader.f44488d;
            m65868e(iArr2[m65869d], iArr);
            int m65870c2 = m65870c + m65870c(zArr, m65870c, iArr);
            m65868e(iArr2[m65869d(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(m65869d), 15)], iArr);
            int m65870c3 = m65870c2 + m65870c(zArr, m65870c2, iArr);
            m65868e(iArr2[47], iArr);
            zArr[m65870c3 + m65870c(zArr, m65870c3, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
