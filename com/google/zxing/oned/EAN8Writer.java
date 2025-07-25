package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EAN8Writer extends UPCEANWriter {
    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        if (barcodeFormat == BarcodeFormat.EAN_8) {
            return super.encode(str, barcodeFormat, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + UPCEANReader.m65834n(str);
            } catch (FormatException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (length == 8) {
            try {
                if (!UPCEANReader.m65839f(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int m65852a = OneDimensionalCodeWriter.m65852a(zArr, 0, UPCEANReader.f44517d, true) + 0;
        for (int i = 0; i <= 3; i++) {
            m65852a += OneDimensionalCodeWriter.m65852a(zArr, m65852a, UPCEANReader.f44520g[Character.digit(str.charAt(i), 10)], false);
        }
        int m65852a2 = m65852a + OneDimensionalCodeWriter.m65852a(zArr, m65852a, UPCEANReader.f44518e, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            m65852a2 += OneDimensionalCodeWriter.m65852a(zArr, m65852a2, UPCEANReader.f44520g[Character.digit(str.charAt(i2), 10)], true);
        }
        OneDimensionalCodeWriter.m65852a(zArr, m65852a2, UPCEANReader.f44517d, true);
        return zArr;
    }
}
