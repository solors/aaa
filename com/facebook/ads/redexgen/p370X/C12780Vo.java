package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Vo */
/* loaded from: assets/audience_network.dex */
public class C12780Vo extends AbstractRunnableC12086KY {
    public final /* synthetic */ C12129LH A00;

    public C12780Vo(C12129LH c12129lh) {
        this.A00 = c12129lh;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        Handler handler;
        long j;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j = this.A00.A02;
            handler.postDelayed(this, j);
        }
    }
}
