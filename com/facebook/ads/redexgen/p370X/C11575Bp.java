package com.facebook.ads.redexgen.p370X;

import com.google.common.primitives.SignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bp */
/* loaded from: assets/audience_network.dex */
public class C11575Bp extends AbstractC12533Rn {
    public static byte[] A01;
    public final /* synthetic */ C12738V7 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{115, 108, 97, 96, 106, 76, 107, 113, 96, 119, 118, 113, 108, 113, 100, 105, SignedBytes.MAX_POWER_OF_TWO, 115, 96, 107, 113};
    }

    public C11575Bp(C12738V7 c12738v7) {
        this.A00 = c12738v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
    /* renamed from: A02 */
    public final void A03(C12581SZ c12581sz) {
        InterfaceC12201MR interfaceC12201MR;
        interfaceC12201MR = this.A00.A06;
        interfaceC12201MR.A4Q(A00(0, 21, 63), c12581sz);
    }
}
