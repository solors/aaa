package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.R4 */
/* loaded from: assets/audience_network.dex */
public class C12488R4 extends AnimatorListenerAdapter {
    public final /* synthetic */ C12332OY A00;

    public C12488R4(C12332OY c12332oy) {
        this.A00 = c12332oy;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
