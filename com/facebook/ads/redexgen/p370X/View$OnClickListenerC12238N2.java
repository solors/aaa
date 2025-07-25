package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N2 */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12238N2 implements View.OnClickListener {
    public final /* synthetic */ C12738V7 A00;

    public View$OnClickListenerC12238N2(C12738V7 c12738v7) {
        this.A00 = c12738v7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12240N4 interfaceC12240N4;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12240N4 = this.A00.A07;
            interfaceC12240N4.ABy();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
