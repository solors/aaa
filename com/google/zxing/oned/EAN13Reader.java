package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
public final class EAN13Reader extends UPCEANReader {

    /* renamed from: j */
    static final int[] f44492j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: i */
    private final int[] f44493i = new int[4];

    /* renamed from: o */
    private static void m65867o(StringBuilder sb2, int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f44492j[i2]) {
                sb2.insert(0, (char) (i2 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: i */
    protected int mo65831i(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f44493i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 6 && i < size; i3++) {
            int m65838g = UPCEANReader.m65838g(bitArray, iArr2, i, UPCEANReader.f44521h);
            sb2.append((char) ((m65838g % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m65838g >= 10) {
                i2 |= 1 << (5 - i3);
            }
        }
        m65867o(sb2, i2);
        int i5 = UPCEANReader.m65837j(bitArray, i, true, UPCEANReader.f44518e)[1];
        for (int i6 = 0; i6 < 6 && i5 < size; i6++) {
            sb2.append((char) (UPCEANReader.m65838g(bitArray, iArr2, i5, UPCEANReader.f44520g) + 48));
            for (int i7 : iArr2) {
                i5 += i7;
            }
        }
        return i5;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: m */
    BarcodeFormat mo65830m() {
        return BarcodeFormat.EAN_13;
    }
}
