package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes5.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f39206a;

    /* renamed from: b */
    private float f39207b;

    /* renamed from: c */
    private float f39208c;

    /* renamed from: d */
    private float f39209d;

    /* renamed from: e */
    private boolean f39210e;

    /* renamed from: f */
    private boolean f39211f;

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    private static Animator m70170a(final View view, float f, float f2) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.platform.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f39210e) {
            return m70170a(view, this.f39208c, this.f39209d);
        }
        return m70170a(view, this.f39207b, this.f39206a);
    }

    @Override // com.google.android.material.transition.platform.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f39211f) {
            return null;
        }
        if (this.f39210e) {
            return m70170a(view, this.f39206a, this.f39207b);
        }
        return m70170a(view, this.f39209d, this.f39208c);
    }

    public float getIncomingEndScale() {
        return this.f39209d;
    }

    public float getIncomingStartScale() {
        return this.f39208c;
    }

    public float getOutgoingEndScale() {
        return this.f39207b;
    }

    public float getOutgoingStartScale() {
        return this.f39206a;
    }

    public boolean isGrowing() {
        return this.f39210e;
    }

    public boolean isScaleOnDisappear() {
        return this.f39211f;
    }

    public void setGrowing(boolean z) {
        this.f39210e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f39209d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f39208c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f39207b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f39206a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f39211f = z;
    }

    public ScaleProvider(boolean z) {
        this.f39206a = 1.0f;
        this.f39207b = 1.1f;
        this.f39208c = 0.8f;
        this.f39209d = 1.0f;
        this.f39211f = true;
        this.f39210e = z;
    }
}
