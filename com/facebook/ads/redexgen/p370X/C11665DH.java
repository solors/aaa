package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DH */
/* loaded from: assets/audience_network.dex */
public final class C11665DH {
    public static byte[] A05;
    public int A00;
    public String A01;
    public final int A02;
    public final int A03;
    public final String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 110);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{100, 84, 86, 93, 86, 65, 82, 71, 86, 125, 86, 68, 122, 87, 27, 26, 19, 94, 70, SignedBytes.MAX_POWER_OF_TWO, 71, 19, 81, 86, 19, 80, 82, 95, 95, 86, 87, 19, 81, 86, 85, 92, 65, 86, 19, 65, 86, 71, 65, 90, 86, 69, 90, 93, 84, 19, 90, 87, SignedBytes.MAX_POWER_OF_TWO, 29};
    }

    public C11665DH(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C11665DH(int i, int i2, int i3) {
        this.A04 = i != Integer.MIN_VALUE ? i + A00(0, 1, 37) : A00(0, 0, 23);
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = Integer.MIN_VALUE;
    }

    private void A01() {
        if (this.A00 != Integer.MIN_VALUE) {
            return;
        }
        throw new IllegalStateException(A00(1, 53, 93));
    }

    public final int A03() {
        A01();
        return this.A00;
    }

    public final String A04() {
        A01();
        return this.A01;
    }

    public final void A05() {
        this.A00 = this.A00 == Integer.MIN_VALUE ? this.A02 : this.A00 + this.A03;
        this.A01 = this.A04 + this.A00;
    }
}
