package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0Y */
/* loaded from: assets/audience_network.dex */
public final class C108980Y {
    public static byte[] A02;
    public final InterfaceC108990Z A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{55, 36, 63, 63, 52, 61, 14};
    }

    public C108980Y(InterfaceC108990Z interfaceC108990Z, String str) {
        this.A00 = interfaceC108990Z;
        this.A01 = str;
    }

    public final void A02(JSONObject jSONObject) {
        try {
            jSONObject.put(A00(0, 7, 99) + this.A00.getName(), this.A01);
        } catch (JSONException unused) {
        }
    }
}
