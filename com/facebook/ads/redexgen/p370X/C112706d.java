package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6d */
/* loaded from: assets/audience_network.dex */
public class C112706d {
    public static byte[] A08;
    public C112786l A00;
    public String A01 = A00(0, 4, 75);
    public boolean A02 = false;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{7, 10, -4, -1};
    }

    public C112706d(String str, int i, int i2, String str2, String str3) {
        this.A07 = str;
        this.A03 = i;
        this.A04 = i2;
        this.A06 = str2;
        this.A05 = str3;
    }
}
