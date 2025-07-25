package com.facebook.ads.redexgen.p370X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: com.facebook.ads.redexgen.X.RJ */
/* loaded from: assets/audience_network.dex */
public class C12503RJ extends AnimatorListenerAdapter {
    public static String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ C12231Mv A00;

    public C12503RJ(C12231Mv c12231Mv) {
        this.A00 = c12231Mv;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        boolean z;
        View view;
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        View view2;
        z = this.A00.A04;
        if (z) {
            view2 = this.A00.A03;
            AbstractC12177M3.A0H(view2);
        }
        C12231Mv c12231Mv = this.A00;
        if (A01[5].length() == 4) {
            throw new RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        view = c12231Mv.A03;
        view.setAlpha(0.0f);
        this.A00.A01 = EnumC12498RE.A04;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2;
        this.A00.A01 = EnumC12498RE.A02;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
