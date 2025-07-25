package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NU */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12266NU implements View.OnClickListener {
    public final /* synthetic */ C12268NW A00;

    public View$OnClickListenerC12266NU(C12268NW c12268nw) {
        this.A00 = c12268nw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12252NG interfaceC12252NG;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12252NG = this.A00.A02;
            interfaceC12252NG.A8n();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
