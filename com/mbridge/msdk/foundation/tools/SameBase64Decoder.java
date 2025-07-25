package com.mbridge.msdk.foundation.tools;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* renamed from: com.mbridge.msdk.foundation.tools.y */
/* loaded from: classes6.dex */
public final class SameBase64Decoder {

    /* renamed from: a */
    public static final char[] f57032a;

    /* renamed from: b */
    public static final int[] f57033b;

    static {
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f57032a = charArray;
        int[] iArr = new int[256];
        f57033b = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            f57033b[f57032a[i]] = i;
        }
        f57033b[61] = 0;
    }

    /* renamed from: a */
    public static String m51604a(String str) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int length = str.length();
        int i4 = 0;
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i5 = length - 1;
            int i6 = 0;
            while (i6 < i5 && f57033b[str.charAt(i6) & 255] < 0) {
                i6++;
            }
            while (i5 > 0 && f57033b[str.charAt(i5) & 255] < 0) {
                i5--;
            }
            if (str.charAt(i5) == '=') {
                if (str.charAt(i5 - 1) == '=') {
                    i = 2;
                } else {
                    i = 1;
                }
            } else {
                i = 0;
            }
            int i7 = (i5 - i6) + 1;
            if (length > 76) {
                if (str.charAt(76) == '\r') {
                    i3 = i7 / 78;
                } else {
                    i3 = 0;
                }
                i2 = i3 << 1;
            } else {
                i2 = 0;
            }
            int i8 = (((i7 - i2) * 6) >> 3) - i;
            byte[] bArr2 = new byte[i8];
            int i9 = (i8 / 3) * 3;
            int i10 = 0;
            int i11 = 0;
            while (i10 < i9) {
                int[] iArr = f57033b;
                int i12 = i6 + 1;
                int i13 = i12 + 1;
                int i14 = (iArr[str.charAt(i6)] << 18) | (iArr[str.charAt(i12)] << 12);
                int i15 = i13 + 1;
                int i16 = i14 | (iArr[str.charAt(i13)] << 6);
                int i17 = i15 + 1;
                int i18 = i16 | iArr[str.charAt(i15)];
                int i19 = i10 + 1;
                bArr2[i10] = (byte) (i18 >> 16);
                int i20 = i19 + 1;
                bArr2[i19] = (byte) (i18 >> 8);
                int i21 = i20 + 1;
                bArr2[i20] = (byte) i18;
                if (i2 > 0 && (i11 = i11 + 1) == 19) {
                    i17 += 2;
                    i11 = 0;
                }
                i6 = i17;
                i10 = i21;
            }
            if (i10 < i8) {
                int i22 = 0;
                while (i6 <= i5 - i) {
                    i4 |= f57033b[str.charAt(i6)] << (18 - (i22 * 6));
                    i22++;
                    i6++;
                }
                int i23 = 16;
                while (i10 < i8) {
                    bArr2[i10] = (byte) (i4 >> i23);
                    i23 -= 8;
                    i10++;
                }
            }
            bArr = bArr2;
        }
        if (bArr.length == 0) {
            return "";
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
