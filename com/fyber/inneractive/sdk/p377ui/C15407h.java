package com.fyber.inneractive.sdk.p377ui;

import android.animation.ValueAnimator;

/* renamed from: com.fyber.inneractive.sdk.ui.h */
/* loaded from: classes4.dex */
public final class C15407h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ IAsmoothProgressBar f30547a;

    public C15407h(IAsmoothProgressBar iAsmoothProgressBar) {
        this.f30547a = iAsmoothProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        super/*android.widget.ProgressBar*/.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
