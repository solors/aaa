package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NA */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12246NA implements View.OnClickListener {
    public final /* synthetic */ C12249ND A00;

    public View$OnClickListenerC12246NA(C12249ND c12249nd) {
        this.A00 = c12249nd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC12252NG interfaceC12252NG;
        InterfaceC12252NG interfaceC12252NG2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC12252NG2 = this.A00.A04;
                interfaceC12252NG2.A4h();
                return;
            }
            interfaceC12252NG = this.A00.A04;
            interfaceC12252NG.A4i();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
