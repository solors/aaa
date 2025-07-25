package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.TB */
/* loaded from: assets/audience_network.dex */
public class C12618TB extends AbstractRunnableC12086KY {
    public final /* synthetic */ C12614T7 A00;

    public C12618TB(C12614T7 c12614t7) {
        this.A00 = c12614t7;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        boolean z;
        C113998w c113998w;
        Handler handler;
        int i;
        z = this.A00.A03;
        if (!z) {
            c113998w = this.A00.A0B;
            c113998w.A02(new AbstractC12592Sk(this.A00.getCurrentPositionInMillis()) { // from class: com.facebook.ads.redexgen.X.9O
            });
            handler = this.A00.A07;
            i = this.A00.A00;
            handler.postDelayed(this, i);
        }
    }
}
