package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.color.MaterialColors;

/* loaded from: classes5.dex */
public final class CircularIndeterminateAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f38018l = {0, 1350, 2700, 4050};

    /* renamed from: m */
    private static final int[] f38019m = {667, 2017, 3367, 4717};

    /* renamed from: n */
    private static final int[] f38020n = {1000, 2350, 3700, 5050};

    /* renamed from: o */
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> f38021o = new Property<CircularIndeterminateAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.3
        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.m71190i());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.m71185n(f.floatValue());
        }
    };

    /* renamed from: p */
    private static final Property<CircularIndeterminateAnimatorDelegate, Float> f38022p = new Property<CircularIndeterminateAnimatorDelegate, Float>(Float.class, "completeEndFraction") { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.4
        @Override // android.util.Property
        public Float get(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate) {
            return Float.valueOf(circularIndeterminateAnimatorDelegate.m71189j());
        }

        @Override // android.util.Property
        public void set(CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate, Float f) {
            circularIndeterminateAnimatorDelegate.m71184o(f.floatValue());
        }
    };

    /* renamed from: d */
    private ObjectAnimator f38023d;

    /* renamed from: e */
    private ObjectAnimator f38024e;

    /* renamed from: f */
    private final FastOutSlowInInterpolator f38025f;

    /* renamed from: g */
    private final BaseProgressIndicatorSpec f38026g;

    /* renamed from: h */
    private int f38027h;

    /* renamed from: i */
    private float f38028i;

    /* renamed from: j */
    private float f38029j;

    /* renamed from: k */
    Animatable2Compat.AnimationCallback f38030k;

    public CircularIndeterminateAnimatorDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f38027h = 0;
        this.f38030k = null;
        this.f38026g = circularProgressIndicatorSpec;
        this.f38025f = new FastOutSlowInInterpolator();
    }

    /* renamed from: i */
    public float m71190i() {
        return this.f38028i;
    }

    /* renamed from: j */
    public float m71189j() {
        return this.f38029j;
    }

    /* renamed from: k */
    private void m71188k() {
        if (this.f38023d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f38021o, 0.0f, 1.0f);
            this.f38023d = ofFloat;
            ofFloat.setDuration(5400L);
            this.f38023d.setInterpolator(null);
            this.f38023d.setRepeatCount(-1);
            this.f38023d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.1
                {
                    CircularIndeterminateAnimatorDelegate.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    circularIndeterminateAnimatorDelegate.f38027h = (circularIndeterminateAnimatorDelegate.f38027h + 4) % CircularIndeterminateAnimatorDelegate.this.f38026g.indicatorColors.length;
                }
            });
        }
        if (this.f38024e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f38022p, 0.0f, 1.0f);
            this.f38024e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f38024e.setInterpolator(this.f38025f);
            this.f38024e.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.CircularIndeterminateAnimatorDelegate.2
                {
                    CircularIndeterminateAnimatorDelegate.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    CircularIndeterminateAnimatorDelegate.this.cancelAnimatorImmediately();
                    CircularIndeterminateAnimatorDelegate circularIndeterminateAnimatorDelegate = CircularIndeterminateAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = circularIndeterminateAnimatorDelegate.f38030k;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(circularIndeterminateAnimatorDelegate.f38058a);
                    }
                }
            });
        }
    }

    /* renamed from: l */
    private void m71187l(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            float m71160a = m71160a(i, f38020n[i2], 333);
            if (m71160a >= 0.0f && m71160a <= 1.0f) {
                int i3 = i2 + this.f38027h;
                int[] iArr = this.f38026g.indicatorColors;
                int length = i3 % iArr.length;
                this.f38060c[0] = ArgbEvaluatorCompat.getInstance().evaluate(this.f38025f.getInterpolation(m71160a), Integer.valueOf(MaterialColors.compositeARGBWithAlpha(iArr[length], this.f38058a.getAlpha())), Integer.valueOf(MaterialColors.compositeARGBWithAlpha(this.f38026g.indicatorColors[(length + 1) % iArr.length], this.f38058a.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* renamed from: o */
    public void m71184o(float f) {
        this.f38029j = f;
    }

    /* renamed from: p */
    private void m71183p(int i) {
        float[] fArr = this.f38059b;
        float f = this.f38028i;
        fArr[0] = (f * 1520.0f) - 20.0f;
        fArr[1] = f * 1520.0f;
        for (int i2 = 0; i2 < 4; i2++) {
            float m71160a = m71160a(i, f38018l[i2], 667);
            float[] fArr2 = this.f38059b;
            fArr2[1] = fArr2[1] + (this.f38025f.getInterpolation(m71160a) * 250.0f);
            float m71160a2 = m71160a(i, f38019m[i2], 667);
            float[] fArr3 = this.f38059b;
            fArr3[0] = fArr3[0] + (this.f38025f.getInterpolation(m71160a2) * 250.0f);
        }
        float[] fArr4 = this.f38059b;
        float f2 = fArr4[0];
        float f3 = fArr4[1];
        float f4 = f2 + ((f3 - f2) * this.f38029j);
        fArr4[0] = f4;
        fArr4[0] = f4 / 360.0f;
        fArr4[1] = f3 / 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f38023d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        m71186m();
    }

    @VisibleForTesting
    /* renamed from: m */
    void m71186m() {
        this.f38027h = 0;
        this.f38060c[0] = MaterialColors.compositeARGBWithAlpha(this.f38026g.indicatorColors[0], this.f38058a.getAlpha());
        this.f38029j = 0.0f;
    }

    @VisibleForTesting
    /* renamed from: n */
    void m71185n(float f) {
        this.f38028i = f;
        int i = (int) (f * 5400.0f);
        m71183p(i);
        m71187l(i);
        this.f38058a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f38030k = animationCallback;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f38024e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f38058a.isVisible()) {
                this.f38024e.start();
            } else {
                cancelAnimatorImmediately();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        m71188k();
        m71186m();
        this.f38023d.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.f38030k = null;
    }
}
