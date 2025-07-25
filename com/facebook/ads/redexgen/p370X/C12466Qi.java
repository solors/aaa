package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qi */
/* loaded from: assets/audience_network.dex */
public final class C12466Qi {
    public static byte[] A07;
    public final C12614T7 A02;
    public final C12611T4 A04;
    public final String A05;
    public final Map<String, String> A06;
    public final AbstractC12588Sg A03 = new AbstractC12588Sg() { // from class: com.facebook.ads.redexgen.X.9X
        {
            C12466Qi.this = this;
        }

        @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
        /* renamed from: A00 */
        public final void A03(C114299Q c114299q) {
            String str;
            C12611T4 c12611t4;
            str = C12466Qi.this.A05;
            C12612T5 c12612t5 = new C12612T5(str, c114299q.A03(), c114299q.A01(), c114299q.A02());
            if (c114299q.A00() >= 0.05d) {
                c12612t5.A06(c114299q.A01());
            }
            C12466Qi.A00(C12466Qi.this);
            c12611t4 = C12466Qi.this.A04;
            c12611t4.A0C(c12612t5);
        }
    };
    public int A01 = 0;
    public int A00 = 0;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 31);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A07 = new byte[]{-116, -99, -116, -107, -101, -122, -112, -107, -117, -116, -97, 3, 15, -2, 10, 2, -4, 0, 12, 18, 11, 17, -90, -78, -95, -83, -91, -77};
    }

    public C12466Qi(C12614T7 c12614t7, String str, Map<String, String> extraParams) {
        this.A05 = str;
        this.A02 = c12614t7;
        this.A06 = extraParams;
        this.A04 = new C12611T4(this.A05);
        this.A02.getEventBus().A05(this.A03);
    }

    public static /* synthetic */ int A00(C12466Qi c12466Qi) {
        int i = c12466Qi.A01;
        c12466Qi.A01 = i + 1;
        return i;
    }

    public final Map<String, String> A05() {
        String A04 = C12611T4.A04(this.A04.A0B());
        HashMap hashMap = new HashMap();
        if (this.A06 != null) {
            hashMap.putAll(this.A06);
        }
        if (A04 == null) {
            A04 = A02(0, 0, 25);
        }
        hashMap.put(A02(22, 6, 33), A04);
        hashMap.put(A02(11, 11, 126), String.valueOf(this.A01));
        int i = this.A00 + 1;
        this.A00 = i;
        hashMap.put(A02(0, 11, 8), String.valueOf(i));
        return hashMap;
    }

    public final void A06() {
        this.A02.getEventBus().A06(this.A03);
    }
}
