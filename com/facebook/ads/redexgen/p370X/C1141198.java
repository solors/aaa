package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;

/* renamed from: com.facebook.ads.redexgen.X.98 */
/* loaded from: assets/audience_network.dex */
public class C1141198 extends AbstractC12481Qx {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", CmcdConfiguration.KEY_DEADLINE, "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C12438QG A00;

    public C1141198(C12438QG c12438qg) {
        this.A00 = c12438qg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
    /* renamed from: A00 */
    public final void A03(C12482Qy c12482Qy) {
        C12614T7 c12614t7;
        boolean z;
        Handler handler;
        boolean A0D;
        boolean z2;
        Handler handler2;
        int i;
        c12614t7 = this.A00.A01;
        if (c12614t7 == null) {
            return;
        }
        z = this.A00.A03;
        if (!z && c12482Qy.A00().getAction() == 0) {
            C12438QG c12438qg = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            handler = c12438qg.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = this.A00.A0D(EnumC12498RE.A04);
            if (A0D) {
                this.A00.A03();
                C12438QG c12438qg2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c12438qg2.A06(true, false);
                } else {
                    c12438qg2.A06(true, false);
                }
            }
            z2 = this.A00.A02;
            if (!z2) {
                return;
            }
            handler2 = this.A00.A05;
            C12445QN c12445qn = new C12445QN(this);
            i = this.A00.A00;
            handler2.postDelayed(c12445qn, i);
        }
    }
}
