package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fl */
/* loaded from: assets/audience_network.dex */
public final class C11798Fl extends AbstractC13171cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 49);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{52, 59, 46, 51, 44, 63};
    }

    public C11798Fl(List<C109401F> list) {
        super(list);
    }

    public static C11798Fl A02(JSONObject jSONObject, C13029Zs c13029Zs) {
        C11798Fl c11798Fl = new C11798Fl(AbstractC13171cD.A08(jSONObject, c13029Zs, new C13167c9()));
        c11798Fl.A1Y(jSONObject);
        c11798Fl.A0u(A03(0, 6, 107));
        return c11798Fl;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109391E
    public final int A0R() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109391E
    public final int A0S() {
        return 0;
    }
}
