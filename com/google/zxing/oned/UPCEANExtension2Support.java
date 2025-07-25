package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class UPCEANExtension2Support {

    /* renamed from: a */
    private final int[] f44509a = new int[4];

    /* renamed from: b */
    private final StringBuilder f44510b = new StringBuilder();

    /* renamed from: a */
    private int m65849a(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f44509a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < size; i3++) {
            int m65838g = UPCEANReader.m65838g(bitArray, iArr2, i, UPCEANReader.f44521h);
            sb2.append((char) ((m65838g % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m65838g >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb2.length() == 2) {
            if (Integer.parseInt(sb2.toString()) % 4 == i2) {
                return i;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: c */
    private static Map<ResultMetadataType, Object> m65847c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.ISSUE_NUMBER, (ResultMetadataType) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Result m65848b(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f44510b;
        sb2.setLength(0);
        int m65849a = m65849a(bitArray, iArr, sb2);
        String sb3 = sb2.toString();
        Map<ResultMetadataType, Object> m65847c = m65847c(sb3);
        float f = i;
        Result result = new Result(sb3, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new ResultPoint(m65849a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (m65847c != null) {
            result.putAllMetadata(m65847c);
        }
        return result;
    }
}
