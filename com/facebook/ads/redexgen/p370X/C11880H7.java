package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.H7 */
/* loaded from: assets/audience_network.dex */
public class C11880H7 extends AbstractC13209cp<EnumC109040e> {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{83, 90, 81, 81};
    }

    public C11880H7(String str) {
        super(str);
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC13209cp
    /* renamed from: A05 */
    public final C108980Y A04(EnumC109040e enumC109040e) {
        return new C108980Y(this, enumC109040e == null ? A00(0, 4, 114) : enumC109040e.A03());
    }
}
