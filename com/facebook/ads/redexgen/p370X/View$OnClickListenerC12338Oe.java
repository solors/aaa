package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Oe */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC12338Oe implements View.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC12713Ui A00;
    public final /* synthetic */ String A01;

    public View$OnClickListenerC12338Oe(View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui, String str) {
        this.A00 = view$OnClickListenerC12713Ui;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A00.A09(this.A01);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
