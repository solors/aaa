package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Va */
/* loaded from: assets/audience_network.dex */
public class C12766Va implements InterfaceC12280Ni {
    public static byte[] A01;
    public final /* synthetic */ C12764VY A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-17, -19, -33, -20, -39, -36, -17, -32, -32, -33, -20, -33, -34, -39, -35, -26, -29, -35, -27, -39, -29, -37, -36, -39, -33, -14, -18, -33, -20, -24, -37, -26, -39, -24, -37, -16, -29, -31, -37, -18, -29, -23, -24};
    }

    public C12766Va(C12764VY c12764vy) {
        this.A00 = c12764vy;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12280Ni
    public final void ABX() {
        this.A00.A0G();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12280Ni
    public final void ACs() {
        this.A00.A0H(A00(0, 43, 56));
    }
}
