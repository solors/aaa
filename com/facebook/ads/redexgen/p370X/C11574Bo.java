package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bo */
/* loaded from: assets/audience_network.dex */
public class C11574Bo extends AbstractC12585Sd {
    public static byte[] A01;
    public final /* synthetic */ C12738V7 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{38, 57, 52, 53, 63, 25, 62, 36, 53, 34, 35, 36, 57, 36, 49, 60, 21, 38, 53, 62, 36};
    }

    public C11574Bo(C12738V7 c12738v7) {
        this.A00 = c12738v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
    /* renamed from: A02 */
    public final void A03(C114289P c114289p) {
        InterfaceC12201MR interfaceC12201MR;
        interfaceC12201MR = this.A00.A06;
        interfaceC12201MR.A4Q(A00(0, 21, 40), c114289p);
    }
}
