package com.facebook.ads.redexgen.p370X;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.MV  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class animationAnimation$AnimationListenerC12205MV implements Animation.AnimationListener {
    public final /* synthetic */ View$OnClickListenerC11604CI A00;

    public animationAnimation$AnimationListenerC12205MV(View$OnClickListenerC11604CI view$OnClickListenerC11604CI) {
        this.A00 = view$OnClickListenerC11604CI;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i;
        Handler handler;
        Runnable runnable;
        int i2;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i2 = this.A00.A04;
            handler.postDelayed(runnable, i2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
