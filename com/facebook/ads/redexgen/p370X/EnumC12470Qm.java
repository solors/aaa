package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Qm */
/* loaded from: assets/audience_network.dex */
public enum EnumC12470Qm {
    A06(0),
    A08(1),
    A09(2),
    A03(3),
    A05(4),
    A07(5),
    A04(6),
    A0A(7),
    A0B(10);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-40, -35, -50, -48, -40, -41, -56, -90, -105, -85, -87, -101, -67, -71, -82, -58, -24, -37, -23, -21, -29, -37, -36, -44, -46, -39, -31, -42, -38, -46, -24, -31, -32, -24, -25, -40, -5, -18, -22, -4, -26, -25, -15, -22, 4, -18, -14, -11, -9, -22, -8, -8, -18, -12, -13};
    }

    static {
        A01();
    }

    EnumC12470Qm(int i) {
        this.A00 = i;
    }
}
