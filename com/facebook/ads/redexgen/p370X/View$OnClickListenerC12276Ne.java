package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12276Ne implements View.OnClickListener {
    public final /* synthetic */ C12281Nj A00;

    public View$OnClickListenerC12276Ne(C12281Nj c12281Nj) {
        this.A00 = c12281Nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12280Ni interfaceC12280Ni;
        InterfaceC12280Ni interfaceC12280Ni2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12280Ni = this.A00.A05;
            if (interfaceC12280Ni == null) {
                return;
            }
            interfaceC12280Ni2 = this.A00.A05;
            interfaceC12280Ni2.ABX();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
