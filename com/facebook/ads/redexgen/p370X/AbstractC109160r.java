package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0r */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC109160r {
    public static byte[] A04;
    public boolean A00;
    public final AbstractC109170s A01;
    public final C13029Zs A02;
    public final C12530Rk A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-2, 34, 37, 39, 26, 40, 40, 30, 36, 35, -43, 33, 36, 28, 28, 26, 25};
    }

    public abstract void A06(Map<String, String> map);

    public AbstractC109160r(C13029Zs c13029Zs, AbstractC109170s abstractC109170s, C12530Rk c12530Rk) {
        this.A02 = c13029Zs;
        this.A01 = abstractC109170s;
        this.A03 = c12530Rk;
    }

    public final void A03() {
        if (this.A00) {
            return;
        }
        if (this.A01 != null) {
            this.A01.A00();
        }
        Map<String, String> extraData = new C12306O8().A03(this.A03).A05();
        A06(extraData);
        this.A00 = true;
        AbstractC12124LC.A04(this.A02, A00(0, 17, 60));
        AbstractC109170s abstractC109170s = this.A01;
    }
}
