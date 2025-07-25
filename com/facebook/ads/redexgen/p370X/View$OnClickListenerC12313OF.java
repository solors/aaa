package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OF */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12313OF implements View.OnClickListener {
    public final /* synthetic */ C12715Uk A00;

    public View$OnClickListenerC12313OF(C12715Uk c12715Uk) {
        this.A00 = c12715Uk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
