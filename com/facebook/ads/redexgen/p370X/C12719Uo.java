package com.facebook.ads.redexgen.p370X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Uo */
/* loaded from: assets/audience_network.dex */
public class C12719Uo extends AbstractRunnableC12086KY {
    public final /* synthetic */ C12304O6 A00;

    public C12719Uo(C12304O6 c12304o6) {
        this.A00 = c12304o6;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        boolean z;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z = this.A00.A08;
        if (z) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
