package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.PA */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12370PA implements View.OnClickListener {
    public final /* synthetic */ C12694UP A00;

    public View$OnClickListenerC12370PA(C12694UP c12694up) {
        this.A00 = c12694up;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC12433QB interfaceC12433QB;
        InterfaceC12433QB interfaceC12433QB2;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            interfaceC12433QB = this.A00.A02;
            if (interfaceC12433QB == null) {
                return;
            }
            interfaceC12433QB2 = this.A00.A02;
            interfaceC12433QB2.A8w();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
