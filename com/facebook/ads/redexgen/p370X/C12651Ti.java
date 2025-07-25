package com.facebook.ads.redexgen.p370X;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Ti */
/* loaded from: assets/audience_network.dex */
public class C12651Ti extends animationAnimation$AnimationListenerC12176M2 {
    public final /* synthetic */ C12650Th A00;

    public C12651Ti(C12650Th c12650Th) {
        this.A00 = c12650Th;
    }

    @Override // com.facebook.ads.redexgen.p370X.animationAnimation$AnimationListenerC12176M2, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AbstractC12177M3.A0H(this.A00.A01);
        this.A00.A00.ACL();
    }
}
