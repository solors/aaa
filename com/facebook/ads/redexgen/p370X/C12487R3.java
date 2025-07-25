package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.R3 */
/* loaded from: assets/audience_network.dex */
public class C12487R3 extends AnimatorListenerAdapter {
    public final /* synthetic */ C113598H A00;

    public C12487R3(C113598H c113598h) {
        this.A00 = c113598h;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new C12333OZ(this), 2000L);
    }
}
