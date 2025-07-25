package com.facebook.ads.redexgen.p370X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OB */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12309OB {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else if (!z) {
        } else {
            View$OnClickListenerC12308OA view$OnClickListenerC12308OA = new View$OnClickListenerC12308OA(onClickListener);
            view.setOnClickListener(view$OnClickListenerC12308OA);
            view.setOnTouchListener(new View$OnTouchListenerC12307O9(view$OnClickListenerC12308OA));
        }
    }
}
