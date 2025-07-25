package com.facebook.ads.redexgen.p370X;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Fk */
/* loaded from: assets/audience_network.dex */
public final class C11797Fk extends AbstractC13171cD implements Serializable {
    public static byte[] A00 = null;
    public static String[] A01 = {"r6wxjppTPk8qqzLRyjcbdQcA77ZMVo55", "Rh6olI4hONJ8yannxuNSF0WPku4wNPsq", "dN5FaQTClehdtxF9CoF19H85hY8wkvGi", "rjB6kg9SBUGr2KH1eIh2YUrCeaZ2IjVH", "uwE4iuczSrXuOAqhix1jvRvaNYVxSPYl", "nB4f3mkqn6tAKhT6MHcT9FS4Qvlri7ut", "bNzGTI7RRMeGoANXUPkwX9ogVwA9ri6n", "cACVCPwRSeRCIlqlGfLHSAYd9Lc4yhZp"};
    public static final long serialVersionUID = 2751287062553772011L;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        String[] strArr = A01;
        if (strArr[2].charAt(16) == strArr[1].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "vDQKNoss9qiPXd8S2Aus0c1HGbd5gMQl";
        strArr2[1] = "nSwGzQN60p1E6knkFapFA8fuyb3FeF6N";
        A00 = new byte[]{51, 38, 56, 34, 51, 37, 38, 37, 32, 55, 42, 37, 38, 48};
    }

    static {
        A04();
    }

    public C11797Fk(List<C109401F> list) {
        super(list);
    }

    public static C11797Fk A02(JSONObject jSONObject, C13029Zs c13029Zs) {
        C11797Fk c11797Fk = new C11797Fk(AbstractC13171cD.A08(jSONObject, c13029Zs, new C13166c8()));
        c11797Fk.A1Y(jSONObject);
        c11797Fk.A0u(A03(0, 14, 106));
        return c11797Fk;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109391E
    public final int A0R() {
        if (A14()) {
            return 3;
        }
        C109621b A06 = A1P().A0E().A06();
        String[] strArr = A01;
        if (strArr[2].charAt(16) != strArr[1].charAt(16)) {
            A01[7] = "ezJ8b8PzsS2LRx1DwJprOyWzSGtMGS3H";
            if (A06 != null) {
                C109401F A1P = A1P();
                String[] strArr2 = A01;
                if (strArr2[5].charAt(18) != strArr2[3].charAt(18)) {
                    A01[7] = "ok7knfjrqIuTR3wAzxIRCawOj6kVTRCj";
                    if (A1P.A0E().A06().A0O()) {
                        return 4;
                    }
                    return 1;
                }
                throw new RuntimeException();
            }
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractC109391E
    public final int A0S() {
        return A1P().A0E().A04();
    }
}
