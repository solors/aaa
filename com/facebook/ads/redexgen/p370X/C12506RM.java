package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.RM */
/* loaded from: assets/audience_network.dex */
public class C12506RM implements Animator.AnimatorListener {
    public final /* synthetic */ C12183M9 A00;

    public C12506RM(C12183M9 c12183m9) {
        this.A00 = c12183m9;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = EnumC12498RE.A02;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
