package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mj */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12219Mj implements View.OnClickListener {
    public final /* synthetic */ C12222Mm A00;

    public View$OnClickListenerC12219Mj(C12222Mm c12222Mm) {
        this.A00 = c12222Mm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A0D();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
