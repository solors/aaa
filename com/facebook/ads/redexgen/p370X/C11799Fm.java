package com.facebook.ads.redexgen.p370X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fm */
/* loaded from: assets/audience_network.dex */
public final class C11799Fm extends AbstractC13171cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"", "DwBpRdjhynFrlzLsBFrR", "QSeBoONoLaQYOKTzvkglRPiKzJDmlw8V", "7gQnCJoaPerIMpa6ilCeIjK7d9DzDLkx", "0G82UgBGsFbmab2LaOSe1R1N", "BET7yFkEMT8u6XlB2K", "", "QGCw11GNV2Lw2F7bA4MSMYlzIGOyIq"};
    public static final long serialVersionUID = 5751287062553772011L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            if (A01[5].length() != 18) {
                throw new RuntimeException();
            }
            A01[4] = "xBe8M";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{86, 81, 75, 90, 77, 76, 75, 86, 75, 86, 94, 83};
    }

    static {
        A04();
    }

    public C11799Fm(List<C109401F> list) {
        super(list);
    }

    public static C11799Fm A02(JSONObject jSONObject, C13029Zs c13029Zs) {
        C11799Fm c11799Fm = new C11799Fm(AbstractC13171cD.A08(jSONObject, c13029Zs, new C13168cA()));
        c11799Fm.A1Y(jSONObject);
        c11799Fm.A0u(A03(0, 12, 9));
        return c11799Fm;
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
