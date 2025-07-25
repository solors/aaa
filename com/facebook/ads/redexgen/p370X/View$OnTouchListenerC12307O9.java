package com.facebook.ads.redexgen.p370X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.O9 */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC12307O9 implements View.OnTouchListener {
    public final /* synthetic */ View$OnClickListenerC12308OA A00;

    public View$OnTouchListenerC12307O9(View$OnClickListenerC12308OA view$OnClickListenerC12308OA) {
        this.A00 = view$OnClickListenerC12308OA;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
