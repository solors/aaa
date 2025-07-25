package com.google.zxing.maxicode.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: a */
    private final ReedSolomonDecoder f44463a = new ReedSolomonDecoder(GenericGF.MAXICODE_FIELD_64);

    /* renamed from: a */
    private void m65898a(byte[] bArr, int i, int i2, int i3, int i4) throws ChecksumException {
        int i5;
        int i6 = i2 + i3;
        if (i4 == 0) {
            i5 = 1;
        } else {
            i5 = 2;
        }
        int[] iArr = new int[i6 / i5];
        for (int i7 = 0; i7 < i6; i7++) {
            if (i4 == 0 || i7 % 2 == i4 - 1) {
                iArr[i7 / i5] = bArr[i7 + i] & 255;
            }
        }
        try {
            this.f44463a.decode(iArr, i3 / i5);
            for (int i8 = 0; i8 < i2; i8++) {
                if (i4 == 0 || i8 % 2 == i4 - 1) {
                    bArr[i8 + i] = (byte) iArr[i8 / i5];
                }
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        byte[] bArr;
        byte[] m65908a = new BitMatrixParser(bitMatrix).m65908a();
        m65898a(m65908a, 0, 10, 10, 0);
        int i = m65908a[0] & 15;
        if (i == 2 || i == 3 || i == 4) {
            m65898a(m65908a, 20, 84, 40, 1);
            m65898a(m65908a, 20, 84, 40, 2);
            bArr = new byte[94];
        } else if (i == 5) {
            m65898a(m65908a, 20, 68, 56, 1);
            m65898a(m65908a, 20, 68, 56, 2);
            bArr = new byte[78];
        } else {
            throw FormatException.getFormatInstance();
        }
        System.arraycopy(m65908a, 0, bArr, 0, 10);
        System.arraycopy(m65908a, 20, bArr, 10, bArr.length - 10);
        return DecodedBitStreamParser.m65907a(bArr, i);
    }
}
