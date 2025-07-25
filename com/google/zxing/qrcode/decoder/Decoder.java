package com.google.zxing.qrcode.decoder;

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
    private final ReedSolomonDecoder f44690a = new ReedSolomonDecoder(GenericGF.QR_CODE_FIELD_256);

    /* renamed from: a */
    private void m65552a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f44690a.decode(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* renamed from: b */
    private DecoderResult m65551b(BitMatrixParser bitMatrixParser, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        Version m65568e = bitMatrixParser.m65568e();
        ErrorCorrectionLevel m65547d = bitMatrixParser.m65569d().m65547d();
        DataBlock[] m65564b = DataBlock.m65564b(bitMatrixParser.m65570c(), m65568e, m65547d);
        int i = 0;
        for (DataBlock dataBlock : m65564b) {
            i += dataBlock.m65563c();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (DataBlock dataBlock2 : m65564b) {
            byte[] m65565a = dataBlock2.m65565a();
            int m65563c = dataBlock2.m65563c();
            m65552a(m65565a, m65563c);
            int i3 = 0;
            while (i3 < m65563c) {
                bArr[i2] = m65565a[i3];
                i3++;
                i2++;
            }
        }
        return DecodedBitStreamParser.m65560a(bArr, m65568e, m65547d, map);
    }

    public DecoderResult decode(boolean[][] zArr) throws ChecksumException, FormatException {
        return decode(zArr, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(boolean[][] zArr, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        return decode(BitMatrix.parse(zArr), map);
    }

    public DecoderResult decode(BitMatrix bitMatrix) throws ChecksumException, FormatException {
        return decode(bitMatrix, (Map<DecodeHintType, ?>) null);
    }

    public DecoderResult decode(BitMatrix bitMatrix, Map<DecodeHintType, ?> map) throws FormatException, ChecksumException {
        ChecksumException e;
        BitMatrixParser bitMatrixParser = new BitMatrixParser(bitMatrix);
        FormatException formatException = null;
        try {
            return m65551b(bitMatrixParser, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                bitMatrixParser.m65567f();
                bitMatrixParser.m65566g(true);
                bitMatrixParser.m65568e();
                bitMatrixParser.m65569d();
                bitMatrixParser.m65571b();
                DecoderResult m65551b = m65551b(bitMatrixParser, map);
                m65551b.setOther(new QRCodeDecoderMetaData(true));
                return m65551b;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            bitMatrixParser.m65567f();
            bitMatrixParser.m65566g(true);
            bitMatrixParser.m65568e();
            bitMatrixParser.m65569d();
            bitMatrixParser.m65571b();
            DecoderResult m65551b2 = m65551b(bitMatrixParser, map);
            m65551b2.setOther(new QRCodeDecoderMetaData(true));
            return m65551b2;
        }
    }
}
