package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NB */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12247NB implements View.OnClickListener {
    public final /* synthetic */ C12249ND A00;

    public View$OnClickListenerC12247NB(C12249ND c12249nd) {
        this.A00 = c12249nd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12252NG interfaceC12252NG;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12252NG = this.A00.A04;
            interfaceC12252NG.A9m();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
