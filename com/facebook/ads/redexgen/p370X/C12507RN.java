package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.RN */
/* loaded from: assets/audience_network.dex */
public class C12507RN implements Animator.AnimatorListener {
    public final /* synthetic */ C12183M9 A00;

    public C12507RN(C12183M9 c12183m9) {
        this.A00 = c12183m9;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC12498RE.A04;
        view = this.A00.A05;
        AbstractC12177M3.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
