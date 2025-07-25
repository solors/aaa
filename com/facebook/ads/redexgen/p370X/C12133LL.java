package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.LL */
/* loaded from: assets/audience_network.dex */
public final class C12133LL {
    public static byte[] A05;
    public static String[] A06 = {"hdh4k6eZclrlxxYg19ck", "OIQuDIQFpzBifrZrtJIvg4BasUaQd63c", "6y0NffGMqcG8EugdtirNjkqg6svCH2Zl", "13Ua2r6CYJwc6p6BI5coDxRAaPqMz7yS", "7WkbYpbXunBRly3lB1oHckvOip2eqLp6", "2PYz6J8qU0vRqLO17bgOak7iCaiihwk", "gvpJ77qQnx", "SLFhDDNvl2CxgKHJ1vqMDyCxDe74woQD"};
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC13171cD A02;
    public final C13029Zs A03;
    public final InterfaceC12131LJ A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    static {
        A03();
    }

    public C12133LL(C13029Zs c13029Zs, AbstractC13171cD abstractC13171cD, InterfaceC12131LJ interfaceC12131LJ) {
        this.A03 = c13029Zs;
        this.A04 = interfaceC12131LJ;
        this.A02 = abstractC13171cD;
    }

    public static C12133LL A01(C13029Zs c13029Zs, AbstractC13171cD abstractC13171cD, InterfaceC12131LJ interfaceC12131LJ) {
        Object creativeAsCtaLoggingHelper = c13029Zs.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C12133LL(c13029Zs, abstractC13171cD, interfaceC12131LJ);
            c13029Zs.A0O(creativeAsCtaLoggingHelper);
        }
        return (C12133LL) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C109541T c109541t, String str2) {
        Map<String, String> A052 = new C12306O8().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 53), str);
        this.A03.A09().AA9(str2, A052);
        if (c109541t != null) {
            C109541T.A06(c109541t, this.A03);
        }
        if (C11979Im.A2J(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC13206cm.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC13206cm.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC13206cm.A05, Boolean.TRUE.toString());
            this.A03.A09().AAI(str2, hashMap);
        }
        this.A04.ACa();
    }

    private void A06(String str, C109541T c109541t, String str2, long j) {
        this.A00 = true;
        this.A01.postDelayed(new RunnableC12130LI(this, str, c109541t, str2), j);
    }

    public static boolean A07(C13029Zs c13029Zs) {
        return C11979Im.A1W(c13029Zs) && C12114L2.A0H(c13029Zs);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
        if (r5 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p370X.C12132LK A0A(com.facebook.ads.redexgen.p370X.AbstractC13171cD r7) {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = com.facebook.ads.redexgen.p370X.C11979Im.A1c(r0)
            r4 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r7.A17()
            if (r0 == 0) goto L1d
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r0 = A07(r0)
            if (r0 == 0) goto L1d
        L17:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r4, r4)
            return r0
        L1d:
            r4 = 0
            goto L17
        L1f:
            boolean r3 = r7.A17()
            if (r3 == 0) goto L51
            com.facebook.ads.redexgen.X.Zs r0 = r6.A03
            boolean r5 = A07(r0)
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12133LL.A06
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L53
            java.lang.String[] r2 = com.facebook.ads.redexgen.p370X.C12133LL.A06
            java.lang.String r1 = "D5RQoHah0ZffyX7n6MMHscTeZuBHZQ8g"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "oKN8Sif1fTCm3hFJqGEcKAR8lt3N8fjA"
            r0 = 4
            r2[r0] = r1
            if (r5 == 0) goto L51
        L4b:
            com.facebook.ads.redexgen.X.LK r0 = new com.facebook.ads.redexgen.X.LK
            r0.<init>(r3, r4)
            return r0
        L51:
            r4 = 0
            goto L4b
        L53:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C12133LL.A0A(com.facebook.ads.redexgen.X.cD):com.facebook.ads.redexgen.X.LK");
    }

    public final void A0B() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0C(String str, C109541T c109541t, String str2) {
        A0B();
        A06(str, c109541t, str2, this.A02 != null ? this.A02.A0T() : 2000L);
    }

    public final void A0D(String str, C109541T c109541t, String str2) {
        A0B();
        A06(str, c109541t, str2, this.A02 != null ? this.A02.A0U() : 2000L);
    }
}
