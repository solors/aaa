package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.OC */
/* loaded from: assets/audience_network.dex */
public enum EnumC12310OC {
    A05(0),
    A04(1),
    A03(2);
    
    public static byte[] A01;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, 22, 13, 16, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC12310OC(int i) {
        this.A00 = i;
    }

    public static EnumC12310OC A00(int i) {
        EnumC12310OC[] values;
        for (EnumC12310OC enumC12310OC : values()) {
            if (enumC12310OC.A00 == i) {
                return enumC12310OC;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
