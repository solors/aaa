package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes5.dex */
public final class FadeProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f39064a = 1.0f;

    /* renamed from: a */
    private static Animator m70236a(final View view, final float f, final float f2, @FloatRange(from = 0.0d, m105511to = 1.0d) final float f3, @FloatRange(from = 0.0d, m105511to = 1.0d) final float f4, final float f5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.transition.platform.FadeProvider.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setAlpha(TransitionUtils.m70152l(f, f2, f3, f4, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.FadeProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setAlpha(f5);
            }
        });
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = alpha;
        return m70236a(view, 0.0f, f, 0.0f, this.f39064a, f);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        float alpha;
        if (view.getAlpha() == 0.0f) {
            alpha = 1.0f;
        } else {
            alpha = view.getAlpha();
        }
        float f = alpha;
        return m70236a(view, f, 0.0f, 0.0f, 1.0f, f);
    }

    public float getIncomingEndThreshold() {
        return this.f39064a;
    }

    public void setIncomingEndThreshold(float f) {
        this.f39064a = f;
    }
}
