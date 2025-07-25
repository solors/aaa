package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.RL */
/* loaded from: assets/audience_network.dex */
public class C12505RL implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C12230Mu A02;

    public C12505RL(C12230Mu c12230Mu, int i, int i2) {
        this.A02 = c12230Mu;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        EnumC12498RE enumC12498RE;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        C12230Mu c12230Mu = this.A02;
        int i2 = this.A01;
        i = this.A02.A04;
        if (i2 == i) {
            enumC12498RE = EnumC12498RE.A02;
        } else {
            enumC12498RE = EnumC12498RE.A04;
        }
        c12230Mu.A01 = enumC12498RE;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
