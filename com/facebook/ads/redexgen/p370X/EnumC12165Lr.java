package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Lr */
/* loaded from: assets/audience_network.dex */
public enum EnumC12165Lr {
    A08(0),
    A07(0),
    A06(1),
    A03(2),
    A04(3),
    A05(4);
    
    public static byte[] A01;
    public final int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-63, -61, -74, -67, -64, -71, -45, -90, -69, -47, -45, -58, -51, -48, -55, -29, -73, -53, -97, -95, -108, -101, -98, -105, -79, -122, -103, -74, -72, -85, -78, -75, -82, -56, -78, -73, -67, -82, -69, -73, -82, -67, Byte.MAX_VALUE, UnsignedBytes.MAX_POWER_OF_TWO, Byte.MAX_VALUE, 118, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    EnumC12165Lr(int i) {
        this.A00 = i;
    }
}
