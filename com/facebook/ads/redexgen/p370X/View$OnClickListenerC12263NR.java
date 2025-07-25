package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NR */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12263NR implements View.OnClickListener {
    public final /* synthetic */ C12733V2 A00;

    public View$OnClickListenerC12263NR(C12733V2 c12733v2) {
        this.A00 = c12733v2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A8n();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
