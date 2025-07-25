package com.fyber.inneractive.sdk.p377ui;

import android.animation.ValueAnimator;

/* renamed from: com.fyber.inneractive.sdk.ui.i */
/* loaded from: classes4.dex */
public final class C15408i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ IAsmoothProgressBar f30548a;

    public C15408i(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f30548a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setSecondaryProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
