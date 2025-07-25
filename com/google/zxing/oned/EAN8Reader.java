package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
public final class EAN8Reader extends UPCEANReader {

    /* renamed from: i */
    private final int[] f44494i = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: i */
    public int mo65831i(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f44494i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < size; i2++) {
            sb2.append((char) (UPCEANReader.m65838g(bitArray, iArr2, i, UPCEANReader.f44520g) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = UPCEANReader.m65837j(bitArray, i, true, UPCEANReader.f44518e)[1];
        for (int i5 = 0; i5 < 4 && i4 < size; i5++) {
            sb2.append((char) (UPCEANReader.m65838g(bitArray, iArr2, i4, UPCEANReader.f44520g) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: m */
    BarcodeFormat mo65830m() {
        return BarcodeFormat.EAN_8;
    }
}
