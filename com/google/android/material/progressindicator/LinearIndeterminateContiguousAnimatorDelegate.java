package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.color.MaterialColors;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class LinearIndeterminateContiguousAnimatorDelegate extends IndeterminateAnimatorDelegate<ObjectAnimator> {

    /* renamed from: j */
    private static final Property<LinearIndeterminateContiguousAnimatorDelegate, Float> f38066j = new Property<LinearIndeterminateContiguousAnimatorDelegate, Float>(Float.class, "animationFraction") { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.2
        @Override // android.util.Property
        public Float get(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate) {
            return Float.valueOf(linearIndeterminateContiguousAnimatorDelegate.m71147h());
        }

        @Override // android.util.Property
        public void set(LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate, Float f) {
            linearIndeterminateContiguousAnimatorDelegate.m71143l(f.floatValue());
        }
    };

    /* renamed from: d */
    private ObjectAnimator f38067d;

    /* renamed from: e */
    private FastOutSlowInInterpolator f38068e;

    /* renamed from: f */
    private final BaseProgressIndicatorSpec f38069f;

    /* renamed from: g */
    private int f38070g;

    /* renamed from: h */
    private boolean f38071h;

    /* renamed from: i */
    private float f38072i;

    public LinearIndeterminateContiguousAnimatorDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f38070g = 1;
        this.f38069f = linearProgressIndicatorSpec;
        this.f38068e = new FastOutSlowInInterpolator();
    }

    /* renamed from: h */
    public float m71147h() {
        return this.f38072i;
    }

    /* renamed from: i */
    private void m71146i() {
        if (this.f38067d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f38066j, 0.0f, 1.0f);
            this.f38067d = ofFloat;
            ofFloat.setDuration(333L);
            this.f38067d.setInterpolator(null);
            this.f38067d.setRepeatCount(-1);
            this.f38067d.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.LinearIndeterminateContiguousAnimatorDelegate.1
                {
                    LinearIndeterminateContiguousAnimatorDelegate.this = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    super.onAnimationRepeat(animator);
                    LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = LinearIndeterminateContiguousAnimatorDelegate.this;
                    linearIndeterminateContiguousAnimatorDelegate.f38070g = (linearIndeterminateContiguousAnimatorDelegate.f38070g + 1) % LinearIndeterminateContiguousAnimatorDelegate.this.f38069f.indicatorColors.length;
                    LinearIndeterminateContiguousAnimatorDelegate.this.f38071h = true;
                }
            });
        }
    }

    /* renamed from: j */
    private void m71145j() {
        if (this.f38071h && this.f38059b[3] < 1.0f) {
            int[] iArr = this.f38060c;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = MaterialColors.compositeARGBWithAlpha(this.f38069f.indicatorColors[this.f38070g], this.f38058a.getAlpha());
            this.f38071h = false;
        }
    }

    /* renamed from: m */
    private void m71142m(int i) {
        this.f38059b[0] = 0.0f;
        float m71160a = m71160a(i, 0, 667);
        float[] fArr = this.f38059b;
        float interpolation = this.f38068e.getInterpolation(m71160a);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f38059b;
        float interpolation2 = this.f38068e.getInterpolation(m71160a + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f38059b[5] = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.f38067d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void invalidateSpecValues() {
        m71144k();
    }

    @VisibleForTesting
    /* renamed from: k */
    void m71144k() {
        this.f38071h = true;
        this.f38070g = 1;
        Arrays.fill(this.f38060c, MaterialColors.compositeARGBWithAlpha(this.f38069f.indicatorColors[0], this.f38058a.getAlpha()));
    }

    @VisibleForTesting
    /* renamed from: l */
    void m71143l(float f) {
        this.f38072i = f;
        m71142m((int) (f * 333.0f));
        m71145j();
        this.f38058a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void startAnimator() {
        m71146i();
        m71144k();
        this.f38067d.start();
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void requestCancelAnimatorAfterCurrentCycle() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void unregisterAnimatorsCompleteCallback() {
    }

    @Override // com.google.android.material.progressindicator.IndeterminateAnimatorDelegate
    public void registerAnimatorsCompleteCallback(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }
}
