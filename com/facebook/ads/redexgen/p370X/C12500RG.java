package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.RG */
/* loaded from: assets/audience_network.dex */
public class C12500RG implements Animator.AnimatorListener {
    public final /* synthetic */ C12232Mw A00;

    public C12500RG(C12232Mw c12232Mw) {
        this.A00 = c12232Mw;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = EnumC12498RE.A02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
