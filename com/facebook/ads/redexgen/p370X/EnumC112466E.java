package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6E */
/* loaded from: assets/audience_network.dex */
public enum EnumC112466E {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, 15, 24, 11, 9, 26, -32, -51, -32, -6, -17, -32, -18, -17, 57, 53, 39, 52, -54, -53, -37, -61, -55, -49, 41, 28, 29, 35, 28, 26, 43, 32, 38, 37, 39, 25, 38, 42, 29, 23, 25, 28, 17, 10, 27, 14, 13, 40, 25, 27, 14, 15, 28, 31, 16, 30, 31};
    }

    static {
        A01();
    }
}
