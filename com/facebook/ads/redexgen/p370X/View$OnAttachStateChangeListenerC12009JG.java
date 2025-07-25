package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.JG */
/* loaded from: assets/audience_network.dex */
public class View$OnAttachStateChangeListenerC12009JG implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC12007JE A00;
    public final /* synthetic */ C12008JF A01;

    public View$OnAttachStateChangeListenerC12009JG(C12008JF c12008jf, EnumC12007JE enumC12007JE) {
        this.A01 = c12008jf;
        this.A00 = enumC12007JE;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
