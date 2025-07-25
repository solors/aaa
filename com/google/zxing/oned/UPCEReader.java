package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes5.dex */
public final class UPCEReader extends UPCEANReader {

    /* renamed from: j */
    private static final int[] f44525j = {1, 1, 1, 1, 1, 1};

    /* renamed from: k */
    static final int[][] f44526k = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: i */
    private final int[] f44527i = new int[4];

    public static String convertUPCEtoUPCA(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c = cArr[5];
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    /* renamed from: o */
    private static void m65829o(StringBuilder sb2, int i) throws NotFoundException {
        for (int i2 = 0; i2 <= 1; i2++) {
            for (int i3 = 0; i3 < 10; i3++) {
                if (i == f44526k[i2][i3]) {
                    sb2.insert(0, (char) (i2 + 48));
                    sb2.append((char) (i3 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: e */
    public boolean mo65833e(String str) throws FormatException {
        return super.mo65833e(convertUPCEtoUPCA(str));
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: h */
    protected int[] mo65832h(BitArray bitArray, int i) throws NotFoundException {
        return UPCEANReader.m65837j(bitArray, i, true, f44525j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: i */
    public int mo65831i(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f44527i;
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
        m65829o(sb2, i2);
        return i;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    /* renamed from: m */
    BarcodeFormat mo65830m() {
        return BarcodeFormat.UPC_E;
    }
}
