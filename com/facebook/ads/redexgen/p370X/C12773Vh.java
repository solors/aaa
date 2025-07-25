package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Vh */
/* loaded from: assets/audience_network.dex */
public class C12773Vh extends animationAnimation$AnimationListenerC12176M2 {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ScaleAnimation A01;

    public C12773Vh(View view, ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.p370X.animationAnimation$AnimationListenerC12176M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
