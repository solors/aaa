package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cp */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC13209cp<T> implements InterfaceC108990Z<T> {
    public static byte[] A01;
    public final String A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-90, -83, -92, -92};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public AbstractC13209cp(String str) {
        this.A00 = str;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    public C108980Y A04(T t) {
        return new C108980Y(this, t == null ? A02(0, 4, 35) : t.toString());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.cp != com.facebook.ads.funnel.FunnelParamType$AbstractFunnelParamType<T> */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC108990Z
    public final String getName() {
        return this.A00;
    }
}
