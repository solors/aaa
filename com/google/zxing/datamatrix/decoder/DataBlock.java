package com.google.zxing.datamatrix.decoder;

import com.google.zxing.datamatrix.decoder.Version;

/* loaded from: classes5.dex */
final class DataBlock {

    /* renamed from: a */
    private final int f44405a;

    /* renamed from: b */
    private final byte[] f44406b;

    private DataBlock(int i, byte[] bArr) {
        this.f44405a = i;
        this.f44406b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static DataBlock[] m65974b(byte[] bArr, Version version) {
        boolean z;
        int i;
        int i2;
        Version.ECBlocks m65961b = version.m65961b();
        Version.ECB[] m65958a = m65961b.m65958a();
        int i3 = 0;
        for (Version.ECB ecb : m65958a) {
            i3 += ecb.m65960a();
        }
        DataBlock[] dataBlockArr = new DataBlock[i3];
        int i4 = 0;
        for (Version.ECB ecb2 : m65958a) {
            int i5 = 0;
            while (i5 < ecb2.m65960a()) {
                int m65959b = ecb2.m65959b();
                dataBlockArr[i4] = new DataBlock(m65959b, new byte[m65961b.m65957b() + m65959b]);
                i5++;
                i4++;
            }
        }
        int length = dataBlockArr[0].f44406b.length - m65961b.m65957b();
        int i6 = length - 1;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            int i9 = 0;
            while (i9 < i4) {
                dataBlockArr[i9].f44406b[i8] = bArr[i7];
                i9++;
                i7++;
            }
        }
        if (version.getVersionNumber() == 24) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 8;
        } else {
            i = i4;
        }
        int i10 = 0;
        while (i10 < i) {
            dataBlockArr[i10].f44406b[i6] = bArr[i7];
            i10++;
            i7++;
        }
        int length2 = dataBlockArr[0].f44406b.length;
        while (length < length2) {
            int i11 = 0;
            while (i11 < i4) {
                if (z) {
                    i2 = (i11 + 8) % i4;
                } else {
                    i2 = i11;
                }
                dataBlockArr[i2].f44406b[(z && i2 > 7) ? length - 1 : length] = bArr[i7];
                i11++;
                i7++;
            }
            length++;
        }
        if (i7 == bArr.length) {
            return dataBlockArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public byte[] m65975a() {
        return this.f44406b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m65973c() {
        return this.f44405a;
    }
}
