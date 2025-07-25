package com.facebook.ads.redexgen.p370X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nd */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC12275Nd implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        switch (motionEvent.getAction()) {
            case 0:
                i = C12281Nj.A0H;
                AbstractC12177M3.A0M(view, i);
                break;
            case 1:
                AbstractC12177M3.A0M(view, 0);
                break;
        }
        return false;
    }
}
