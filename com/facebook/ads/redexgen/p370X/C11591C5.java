package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.C5 */
/* loaded from: assets/audience_network.dex */
public final class C11591C5 {
    public static byte[] A02;
    public final C11593C7 A00;
    public final C11593C7 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-106, -118, 101, -72};
    }

    public C11591C5(C11593C7 c11593c7) {
        this(c11593c7, c11593c7);
    }

    public C11591C5(C11593C7 c11593c7, C11593C7 c11593c72) {
        this.A00 = (C11593C7) AbstractC11914Hf.A01(c11593c7);
        this.A01 = (C11593C7) AbstractC11914Hf.A01(c11593c72);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11591C5 c11591c5 = (C11591C5) obj;
        return this.A00.equals(c11591c5.A00) && this.A01.equals(c11591c5.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return A00(2, 1, 0) + this.A00 + (this.A00.equals(this.A01) ? A00(0, 0, 17) : A00(0, 2, 96) + this.A01) + A00(3, 1, 81);
    }
}
