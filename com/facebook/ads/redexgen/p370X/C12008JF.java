package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.JF */
/* loaded from: assets/audience_network.dex */
public final class C12008JF {
    public static byte[] A02;
    public final InterfaceC12000J7 A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 45);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-15, -13, -32, -14, -9, -18, -29};
    }

    public C12008JF(String str, InterfaceC12000J7 interfaceC12000J7) {
        this.A01 = str;
        this.A00 = interfaceC12000J7;
    }

    public static void A02(EnumC12007JE enumC12007JE, Map<String, String> map, String str, InterfaceC12000J7 interfaceC12000J7) {
        A03(enumC12007JE.A03(), map, str, interfaceC12000J7);
    }

    public static void A03(String str, Map<String, String> map, String str2, InterfaceC12000J7 interfaceC12000J7) {
        if (!AbstractC12010JH.A0B(str2, str)) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(A00(0, 7, 81), str);
        interfaceC12000J7.AA3(str2, map);
    }

    public final void A04(EnumC12007JE enumC12007JE, Map<String, String> data) {
        A05(enumC12007JE.A03(), data);
    }

    public final void A05(String str, Map<String, String> data) {
        A03(str, data, this.A01, this.A00);
    }
}
