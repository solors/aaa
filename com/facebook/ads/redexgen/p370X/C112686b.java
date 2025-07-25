package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.6b */
/* loaded from: assets/audience_network.dex */
public class C112686b {
    public static byte[] A09;
    public long A00;
    public Integer A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public final String A06;
    public final String A07;
    public final String A08;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{-107, -104, -118, -115};
    }

    public C112686b(String str, String str2, String str3) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
    }

    public C112686b(String str, String str2, String str3, long j) {
        this.A03 = A00(0, 0, 68);
        this.A02 = A00(0, 4, 27);
        this.A00 = -1L;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A01 = null;
        this.A00 = j;
    }
}
