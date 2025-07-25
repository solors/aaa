package com.facebook.ads.redexgen.p370X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qj */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC12467Qj implements View.OnTouchListener {
    public final /* synthetic */ C12614T7 A00;

    public View$OnTouchListenerC12467Qj(C12614T7 c12614t7) {
        this.A00 = c12614t7;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C113998w c113998w;
        c113998w = this.A00.A0B;
        c113998w.A02(new C12482Qy(view, motionEvent));
        return false;
    }
}
