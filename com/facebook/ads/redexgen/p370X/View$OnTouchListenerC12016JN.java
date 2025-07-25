package com.facebook.ads.redexgen.p370X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.JN */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC12016JN implements View.OnTouchListener {
    public final /* synthetic */ C12811WJ A00;
    public final /* synthetic */ boolean A01;

    public View$OnTouchListenerC12016JN(C12811WJ c12811wj, boolean z) {
        this.A00 = c12811wj;
        this.A01 = z;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A01) {
            return false;
        }
        return true;
    }
}
