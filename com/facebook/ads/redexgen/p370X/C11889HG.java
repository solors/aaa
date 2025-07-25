package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.HG */
/* loaded from: assets/audience_network.dex */
public class C11889HG extends AbstractC13209cp<EnumC108900Q> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-56, -49, -58, -58};
    }

    public C11889HG(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13209cp
    /* renamed from: A05 */
    public final C108980Y A04(EnumC108900Q enumC108900Q) {
        return new C108980Y(this, enumC108900Q == null ? A00(0, 4, 46) : A00(0, 0, 18) + enumC108900Q.A03());
    }
}
