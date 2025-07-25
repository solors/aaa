package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OQ */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12324OQ implements View.OnClickListener {
    public final /* synthetic */ C12326OS A00;

    public View$OnClickListenerC12324OQ(C12326OS c12326os) {
        this.A00 = c12326os;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
