package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Bn */
/* loaded from: assets/audience_network.dex */
public class C11573Bn extends AbstractC12591Sj {
    public static byte[] A01;
    public static String[] A02 = {"cVYzzU3WDwilAiB6lBwH", "ltb11yKnDLf", "qD1l7ddw57WScFbFlpW6gLQQ4LJZYMm4", "7tmDLtuP1dSUokfmYRKMMhnjp75BOUEQ", "O1T", "OUAaXGhWo5xW6BfvCbr", "NPW6PnCzVK8iTd9b27h5", "ykk8Miz3Z2gvnB5Rb4Sxgn912BIo"};
    public final /* synthetic */ C12738V7 A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A02[2].charAt(8) != '5') {
                throw new RuntimeException();
            }
            A02[5] = "7KI0j9KfVtSFY3dF";
            copyOfRange[i4] = (byte) (i5 ^ 70);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 28, 17, 16, 26, 60, 27, 1, 16, 7, 6, 1, 28, 1, 20, 25, 48, 3, 16, 27, 1};
    }

    static {
        A01();
    }

    public C11573Bn(C12738V7 c12738v7) {
        this.A00 = c12738v7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
    /* renamed from: A02 */
    public final void A03(C114309R c114309r) {
        InterfaceC12201MR interfaceC12201MR;
        interfaceC12201MR = this.A00.A06;
        interfaceC12201MR.A4Q(A00(0, 21, 51), c114309r);
    }
}
