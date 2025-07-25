package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.8H */
/* loaded from: assets/audience_network.dex */
public class C113598H extends AbstractC12481Qx {
    public final /* synthetic */ C12332OY A00;

    public C113598H(C12332OY c12332oy) {
        this.A00 = c12332oy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p370X.AbstractC114008x
    /* renamed from: A00 */
    public final void A03(C12482Qy c12482Qy) {
        C12614T7 c12614t7;
        Handler handler;
        c12614t7 = this.A00.A01;
        if (c12614t7 == null || c12482Qy.A00().getAction() != 0) {
            return;
        }
        handler = this.A00.A04;
        handler.removeCallbacksAndMessages(null);
        this.A00.A07(new C12487R3(this));
    }
}
