package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fn */
/* loaded from: assets/audience_network.dex */
public final class C11800Fn extends AbstractC13171cD {
    public static byte[] A00 = null;
    public static final long serialVersionUID = 5751287062553772012L;

    static {
        A04();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{63, 60, 51, 51, 56, 47};
    }

    public C11800Fn(List<C109401F> list) {
        super(list);
    }

    public static C11800Fn A02(JSONObject jSONObject, C13029Zs c13029Zs) {
        C11800Fn c11800Fn = new C11800Fn(AbstractC13171cD.A08(jSONObject, c13029Zs, new C13170cC()));
        c11800Fn.A1Y(jSONObject);
        c11800Fn.A0u(A03(0, 6, 6));
        return c11800Fn;
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
