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
public final class UPCEANExtension5Support {

    /* renamed from: c */
    private static final int[] f44511c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a */
    private final int[] f44512a = new int[4];

    /* renamed from: b */
    private final StringBuilder f44513b = new StringBuilder();

    /* renamed from: a */
    private int m65846a(BitArray bitArray, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f44512a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 5 && i < size; i3++) {
            int m65838g = UPCEANReader.m65838g(bitArray, iArr2, i, UPCEANReader.f44521h);
            sb2.append((char) ((m65838g % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m65838g >= 10) {
                i2 |= 1 << (4 - i3);
            }
            if (i3 != 4) {
                i = bitArray.getNextUnset(bitArray.getNextSet(i));
            }
        }
        if (sb2.length() == 5) {
            if (m65843d(sb2.toString()) == m65844c(i2)) {
                return i;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: c */
    private static int m65844c(int i) throws NotFoundException {
        for (int i2 = 0; i2 < 10; i2++) {
            if (i == f44511c[i2]) {
                return i2;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* renamed from: d */
    private static int m65843d(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 2; i2 >= 0; i2 -= 2) {
            i += charSequence.charAt(i2) - '0';
        }
        int i3 = i * 3;
        for (int i4 = length - 1; i4 >= 0; i4 -= 2) {
            i3 += charSequence.charAt(i4) - '0';
        }
        return (i3 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m65842e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            r3 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            java.lang.String r4 = ""
            if (r1 == r2) goto L15
            goto L4f
        L15:
            int r1 = r5.hashCode()
            r2 = -1
            switch(r1) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r2
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r3
            goto L3e
        L35:
            java.lang.String r1 = "90000"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r4 = "$"
            goto L4f
        L4d:
            java.lang.String r4 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r1 = "0"
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.oned.UPCEANExtension5Support.m65842e(java.lang.String):java.lang.String");
    }

    /* renamed from: f */
    private static Map<ResultMetadataType, Object> m65841f(String str) {
        String m65842e;
        if (str.length() != 5 || (m65842e = m65842e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        enumMap.put((EnumMap) ResultMetadataType.SUGGESTED_PRICE, (ResultMetadataType) m65842e);
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Result m65845b(int i, BitArray bitArray, int[] iArr) throws NotFoundException {
        StringBuilder sb2 = this.f44513b;
        sb2.setLength(0);
        int m65846a = m65846a(bitArray, iArr, sb2);
        String sb3 = sb2.toString();
        Map<ResultMetadataType, Object> m65841f = m65841f(sb3);
        float f = i;
        Result result = new Result(sb3, null, new ResultPoint[]{new ResultPoint((iArr[0] + iArr[1]) / 2.0f, f), new ResultPoint(m65846a, f)}, BarcodeFormat.UPC_EAN_EXTENSION);
        if (m65841f != null) {
            result.putAllMetadata(m65841f);
        }
        return result;
    }
}
