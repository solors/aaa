package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ix */
/* loaded from: assets/audience_network.dex */
public enum EnumC11990Ix {
    A03,
    A02;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 121, 109, 107, 125, 124, 110, 114, Byte.MAX_VALUE, 103, 119, 112, 121};
    }

    static {
        A01();
    }
}
