package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class ScaleProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private float f39035a;

    /* renamed from: b */
    private float f39036b;

    /* renamed from: c */
    private float f39037c;

    /* renamed from: d */
    private float f39038d;

    /* renamed from: e */
    private boolean f39039e;

    /* renamed from: f */
    private boolean f39040f;

    public ScaleProvider() {
        this(true);
    }

    /* renamed from: a */
    private static Animator m70267a(final View view, float f, float f2) {
        final float scaleX = view.getScaleX();
        final float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.SCALE_X, scaleX * f, scaleX * f2), PropertyValuesHolder.ofFloat(View.SCALE_Y, f * scaleY, f2 * scaleY));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.ScaleProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setScaleX(scaleX);
                view.setScaleY(scaleY);
            }
        });
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f39039e) {
            return m70267a(view, this.f39037c, this.f39038d);
        }
        return m70267a(view, this.f39036b, this.f39035a);
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (!this.f39040f) {
            return null;
        }
        if (this.f39039e) {
            return m70267a(view, this.f39035a, this.f39036b);
        }
        return m70267a(view, this.f39038d, this.f39037c);
    }

    public float getIncomingEndScale() {
        return this.f39038d;
    }

    public float getIncomingStartScale() {
        return this.f39037c;
    }

    public float getOutgoingEndScale() {
        return this.f39036b;
    }

    public float getOutgoingStartScale() {
        return this.f39035a;
    }

    public boolean isGrowing() {
        return this.f39039e;
    }

    public boolean isScaleOnDisappear() {
        return this.f39040f;
    }

    public void setGrowing(boolean z) {
        this.f39039e = z;
    }

    public void setIncomingEndScale(float f) {
        this.f39038d = f;
    }

    public void setIncomingStartScale(float f) {
        this.f39037c = f;
    }

    public void setOutgoingEndScale(float f) {
        this.f39036b = f;
    }

    public void setOutgoingStartScale(float f) {
        this.f39035a = f;
    }

    public void setScaleOnDisappear(boolean z) {
        this.f39040f = z;
    }

    public ScaleProvider(boolean z) {
        this.f39035a = 1.0f;
        this.f39036b = 1.1f;
        this.f39037c = 0.8f;
        this.f39038d = 1.0f;
        this.f39040f = true;
        this.f39039e = z;
    }
}
