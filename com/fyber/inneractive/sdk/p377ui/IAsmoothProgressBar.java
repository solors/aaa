package com.fyber.inneractive.sdk.p377ui;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ProgressBar;

@TargetApi(11)
/* renamed from: com.fyber.inneractive.sdk.ui.IAsmoothProgressBar */
/* loaded from: classes4.dex */
public class IAsmoothProgressBar extends ProgressBar {

    /* renamed from: c */
    public static final AccelerateDecelerateInterpolator f30524c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public ValueAnimator f30525a;

    /* renamed from: b */
    public ValueAnimator f30526b;

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f30525a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f30526b;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        ValueAnimator valueAnimator = this.f30525a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f30525a;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.f30525a = ofInt;
            ofInt.setInterpolator(f30524c);
            this.f30525a.addUpdateListener(new C15407h(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f30525a.start();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setSecondaryProgress(int i) {
        ValueAnimator valueAnimator = this.f30526b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f30526b;
        if (valueAnimator2 == null) {
            ValueAnimator ofInt = ValueAnimator.ofInt(getProgress(), i);
            this.f30526b = ofInt;
            ofInt.setInterpolator(f30524c);
            this.f30526b.addUpdateListener(new C15408i(this));
        } else {
            valueAnimator2.setIntValues(getProgress(), i);
        }
        this.f30526b.start();
    }

    public IAsmoothProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
