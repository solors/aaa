package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.YY */
/* loaded from: assets/audience_network.dex */
public final class C12947YY extends AbstractC11610CO {
    public static byte[] A03;
    public final long A00;
    public final List<C12947YY> A01;
    public final List<C12946YX> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{121, 58, 54, 55, 45, 56, 48, 55, 60, 43, 42, 99, 121, 24, 84, 93, 89, 78, 93, 75, 2, 24};
    }

    public C12947YY(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C12947YY A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C12947YY c12947yy = this.A01.get(i2);
            int childrenSize = ((AbstractC11610CO) c12947yy).A00;
            if (childrenSize == i) {
                return c12947yy;
            }
        }
        return null;
    }

    public final C12946YX A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C12946YX c12946yx = this.A02.get(i2);
            int childrenSize = ((AbstractC11610CO) c12946yx).A00;
            if (childrenSize == i) {
                return c12946yx;
            }
        }
        return null;
    }

    public final void A08(C12947YY c12947yy) {
        this.A01.add(c12947yy);
    }

    public final void A09(C12946YX c12946yx) {
        this.A02.add(c12946yx);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC11610CO
    public final String toString() {
        return AbstractC11610CO.A02(super.A00) + A04(13, 9, 74) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 43) + Arrays.toString(this.A01.toArray());
    }
}
