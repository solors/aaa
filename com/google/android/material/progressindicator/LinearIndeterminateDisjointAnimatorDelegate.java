package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class LinearIndeterminateDisjointAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: l */
    private static final int[] f38074l = {533, 567, 850, UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS};

    /* renamed from: m */
    private static final int[] f38075m = {1267, 1000, 333, 0};

    /* renamed from: n */
    private static final Property<LinearIndeterminateDisjointAnimatorDelegate, Float> f38076n = new Property<LinearIndeterminateDisjointAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.3
        @Override // android.util.Property
        public Float get(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateDisjointAnimatorDelegate.m71136h());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate, Float f) {
            linearIndeterminateDisjointAnimatorDelegate.m71132l(f.floatValue());
        }
    };

    /* renamed from: d */
    private ObjectAnimator f38077d;

    /* renamed from: e */
    private ObjectAnimator f38078e;

    /* renamed from: f */
    private final Interpolator[] f38079f;

    /* renamed from: g */
    private final BaseProgressIndicatorSpec f38080g;

    /* renamed from: h */
    private int f38081h;

    /* renamed from: i */
    private boolean f38082i;

    /* renamed from: j */
    private float f38083j;

    /* renamed from: k */
    Animatable2Compat.AnimationCallback f38084k;

    public LinearIndeterminateDisjointAnimatorDelegate(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f38081h = 0;
        this.f38084k = null;
        this.f38080g = linearProgressIndicatorSpec;
        this.f38079f = new Interpolator[]{AnimationUtilsCompat.loadInterpolator(context, C16310R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C16310R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtilsCompat.loadInterpolator(context, C16310R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtilsCompat.loadInterpolator(context, C16310R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    /* renamed from: h */
    public float m71136h() {
        return this.f38083j;
    }

    /* renamed from: i */
    private void m71135i() {
        if (this.f38077d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f38076n, 0.0f, 1.0f);
            this.f38077d = ofFloat;
            ofFloat.setDuration(1800L);
            this.f38077d.setInterpolator(null);
            this.f38077d.setRepeatCount(-1);
            this.f38077d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                {
                    LinearIndeterminateDisjointAnimatorDelegate.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    linearIndeterminateDisjointAnimatorDelegate.f38081h = (linearIndeterminateDisjointAnimatorDelegate.f38081h + 1) % LinearIndeterminateDisjointAnimatorDelegate.this.f38080g.indicatorColors.length;
                    LinearIndeterminateDisjointAnimatorDelegate.this.f38082i = true;
                }
            });
        }
        if (this.f38078e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f38076n, 1.0f);
            this.f38078e = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f38078e.setInterpolator(null);
            this.f38078e.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.2
                {
                    LinearIndeterminateDisjointAnimatorDelegate.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    LinearIndeterminateDisjointAnimatorDelegate.this.cancelAnimatorImmediately();
                    LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = LinearIndeterminateDisjointAnimatorDelegate.this;
                    Animatable2Compat.AnimationCallback animationCallback = linearIndeterminateDisjointAnimatorDelegate.f38084k;
                    if (animationCallback != null) {
                        animationCallback.onAnimationEnd(linearIndeterminateDisjointAnimatorDelegate.f38058a);
                    }
                }
            });
        }
    }

    /* renamed from: j */
    private void m71134j() {
        if (this.f38082i) {
            Arrays.fill(this.f38060c, MaterialColors.compositeARGBWithAlpha(this.f38080g.indicatorColors[this.f38081h], this.f38058a.getAlpha()));
            this.f38082i = false;
        }
    }

    /* renamed from: m */
    private void m71131m(int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f38059b[i2] = Math.max(0.0f, Math.min(1.0f, this.f38079f[i2].getInterpolation(m71160a(i, f38075m[i2], f38074l[i2]))));
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f38077d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        m71133k();
    }

    @VisibleForTesting
    /* renamed from: k */
    void m71133k() {
        this.f38081h = 0;
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(this.f38080g.indicatorColors[0], this.f38058a.getAlpha());
        int[] iArr = this.f38060c;
        iArr[0] = compositeARGBWithAlpha;
        iArr[1] = compositeARGBWithAlpha;
    }

    @VisibleForTesting
    /* renamed from: l */
    void m71132l(float f) {
        this.f38083j = f;
        m71131m((int) (f * 1800.0f));
        m71134j();
        this.f38058a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f38084k = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.f38078e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            cancelAnimatorImmediately();
            if (this.f38058a.isVisible()) {
                this.f38078e.setFloatValues(this.f38083j, 1.0f);
                this.f38078e.setDuration((1.0f - this.f38083j) * 1800.0f);
                this.f38078e.start();
            }
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        m71135i();
        m71133k();
        this.f38077d.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
        this.f38084k = null;
    }
}
