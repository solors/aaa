package com.google.zxing.qrcode.decoder;

import com.google.zxing.qrcode.decoder.Version;

/* loaded from: classes5.dex */
final class DataBlock {

    /* renamed from: a */
    private final int f44685a;

    /* renamed from: b */
    private final byte[] f44686b;

    private DataBlock(int i, byte[] bArr) {
        this.f44685a = i;
        this.f44686b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static DataBlock[] m65564b(byte[] bArr, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        int i;
        if (bArr.length == version.getTotalCodewords()) {
            Version.ECBlocks eCBlocksForLevel = version.getECBlocksForLevel(errorCorrectionLevel);
            Version.ECB[] eCBlocks = eCBlocksForLevel.getECBlocks();
            int i2 = 0;
            for (Version.ECB ecb : eCBlocks) {
                i2 += ecb.getCount();
            }
            DataBlock[] dataBlockArr = new DataBlock[i2];
            int i3 = 0;
            for (Version.ECB ecb2 : eCBlocks) {
                int i4 = 0;
                while (i4 < ecb2.getCount()) {
                    int dataCodewords = ecb2.getDataCodewords();
                    dataBlockArr[i3] = new DataBlock(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                    i4++;
                    i3++;
                }
            }
            int length = dataBlockArr[0].f44686b.length;
            int i5 = i2 - 1;
            while (i5 >= 0 && dataBlockArr[i5].f44686b.length != length) {
                i5--;
            }
            int i6 = i5 + 1;
            int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
            int i7 = 0;
            for (int i8 = 0; i8 < eCCodewordsPerBlock; i8++) {
                int i9 = 0;
                while (i9 < i3) {
                    dataBlockArr[i9].f44686b[i8] = bArr[i7];
                    i9++;
                    i7++;
                }
            }
            int i10 = i6;
            while (i10 < i3) {
                dataBlockArr[i10].f44686b[eCCodewordsPerBlock] = bArr[i7];
                i10++;
                i7++;
            }
            int length2 = dataBlockArr[0].f44686b.length;
            while (eCCodewordsPerBlock < length2) {
                int i11 = 0;
                while (i11 < i3) {
                    if (i11 < i6) {
                        i = eCCodewordsPerBlock;
                    } else {
                        i = eCCodewordsPerBlock + 1;
                    }
                    dataBlockArr[i11].f44686b[i] = bArr[i7];
                    i11++;
                    i7++;
                }
                eCCodewordsPerBlock++;
            }
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m65565a() {
        return this.f44686b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65563c() {
        return this.f44685a;
    }
}
