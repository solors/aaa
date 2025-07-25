package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.94 */
/* loaded from: assets/audience_network.dex */
public final class C1140794 {
    public static byte[] A02;
    public final int A00;
    public final int A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 34);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-85, -48, -40, -61, -50, -53, -58, -126, -53, -48, -58, -57, -38, -90, -57, -50, -42, -61, -126, -118, -121, -58, -114, -126, -53, -48, -58, -57, -38, -126, -97, -126, -121, -58, -117, -56, -53, -50, -57, -126, -118, -121, -58, -117, -126, -98, -126, -113, -109, -12, -9, -6, -13, -82, -53, -82, -77, -14, -82, -76, -76, -82, -9, -4, -14, -13, 6, -82, -53, -82, -77, -14, -47, -44, -41, -48, -117, -88, -88, -117, -104, -100, -117, -111, -111, -117, -44, -39, -49, -48, -29, -117, -88, -117, -112, -49};
    }

    public C1140794() {
        this(-1, -1);
    }

    public C1140794(int i, int i2) {
        if (i < -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(35, 14, 64), Integer.valueOf(i)));
        }
        if (i >= 0 && i2 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(49, 23, 108), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i == -1 && i2 != -1) {
            throw new IllegalArgumentException(String.format(Locale.US, A00(72, 24, 73), Integer.valueOf(i2)));
        }
        this.A00 = i;
        this.A01 = i2;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04(C1140794 c1140794) {
        if (this.A00 != c1140794.A00) {
            return this.A00 - c1140794.A00;
        }
        return this.A01 - c1140794.A01;
    }

    public final C1140794 A05(int i) {
        if (this.A01 + i >= 0) {
            return new C1140794(this.A00, this.A01 + i);
        }
        throw new IllegalArgumentException(String.format(Locale.US, A00(0, 35, 64), Integer.valueOf(i), Integer.valueOf(this.A01)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1140794) {
            C1140794 c1140794 = (C1140794) obj;
            return c1140794.A00 == this.A00 && c1140794.A01 == this.A01;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00 * 2) + (this.A01 * 3);
    }
}
