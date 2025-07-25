package com.google.zxing.datamatrix.decoder;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonDecoder;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes5.dex */
public final class Decoder {

    /* renamed from: a */
    private final ReedSolomonDecoder f44414a = new ReedSolomonDecoder(GenericGF.DATA_MATRIX_FIELD_256);

    /* renamed from: a */
    private void m65963a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f44414a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public DecoderResult decode(boolean[][] zArr) throws FormatException, ChecksumException {
        return decode(BitMatrix.parse(zArr));
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws FormatException, ChecksumException {
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        DataBlock[] m65974b = DataBlock.m65974b(bitMatrixParser.m65983c(), bitMatrixParser.m65984b());
        int i = 0;
        for (DataBlock dataBlock : m65974b) {
            i += dataBlock.m65973c();
        }
        byte[] bArr = new byte[i];
        int length = m65974b.length;
        for (int i2 = 0; i2 < length; i2++) {
            DataBlock dataBlock2 = m65974b[i2];
            byte[] m65975a = dataBlock2.m65975a();
            int m65973c = dataBlock2.m65973c();
            m65963a(m65975a, m65973c);
            for (int i3 = 0; i3 < m65973c; i3++) {
                bArr[(i3 * length) + i2] = m65975a[i3];
            }
        }
        return DecodedBitStreamParser.m65972a(bArr);
    }
}
