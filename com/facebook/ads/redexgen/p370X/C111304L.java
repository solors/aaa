package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4L */
/* loaded from: assets/audience_network.dex */
public class C111304L {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AbstractC1117656 A04;
    public AbstractC1117656 A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, 14, 2, 68, 80, 77, 79, 123, 31, 76, SignedBytes.MAX_POWER_OF_TWO, 14, 5, 23, 40, 15, 12, 4, 5, 18, 93, 86, 90, 14, 21, 34, 71, 71, 75, 31, 4, 50, 86, 109, 70, 79, SignedBytes.MAX_POWER_OF_TWO, 73, 75, 103, SignedBytes.MAX_POWER_OF_TWO, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public C111304L(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562) {
        this.A05 = abstractC1117656;
        this.A04 = abstractC11176562;
    }

    public C111304L(AbstractC1117656 abstractC1117656, AbstractC1117656 abstractC11176562, int i, int i2, int i3, int i4) {
        this(abstractC1117656, abstractC11176562);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + '}';
    }
}
