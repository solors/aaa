package com.facebook.ads.redexgen.p370X;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Th */
/* loaded from: assets/audience_network.dex */
public class C12650Th extends AbstractRunnableC12086KY {
    public final /* synthetic */ InterfaceC12428Q6 A00;
    public final /* synthetic */ C12429Q7 A01;

    public C12650Th(C12429Q7 c12429q7, InterfaceC12428Q6 interfaceC12428Q6) {
        this.A01 = c12429q7;
        this.A00 = interfaceC12428Q6;
    }

    @Override // com.facebook.ads.redexgen.p370X.AbstractRunnableC12086KY
    public final void A06() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C12651Ti(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
