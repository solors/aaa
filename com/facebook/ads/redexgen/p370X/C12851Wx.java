package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wx */
/* loaded from: assets/audience_network.dex */
public final class C12851Wx extends C11882H9 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{21, 34, 52, 55, 40, 41, 52, 34, 103, 36, 40, 35, 34, 125, 103};
    }

    public C12851Wx(int i, Map<String, List<String>> map, C11876H3 c11876h3) {
        super(A00(0, 15, 77) + i, c11876h3, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
