package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.SP */
/* loaded from: assets/audience_network.dex */
public enum EnumC12571SP {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 117);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, SignedBytes.MAX_POWER_OF_TWO, 87, 83, SignedBytes.MAX_POWER_OF_TWO, 87, 5, 87, SignedBytes.MAX_POWER_OF_TWO, 86, 85, 74, 75, 86, SignedBytes.MAX_POWER_OF_TWO, 31, 5, 0, 86, 51, 40, 45, 40, 41, 49, 40, 106, 104, 96, 55, 44, 41, 44, 45, 53, 44};
    }

    static {
        A02();
    }

    EnumC12571SP(String str) {
        this.A00 = str;
    }

    public static EnumC12571SP A00(String str) {
        EnumC12571SP[] values;
        for (EnumC12571SP enumC12571SP : values()) {
            if (enumC12571SP.A00.equals(str)) {
                return enumC12571SP;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 80), str));
    }
}
