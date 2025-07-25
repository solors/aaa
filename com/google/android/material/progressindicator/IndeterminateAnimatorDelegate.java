package com.google.android.material.progressindicator;

import android.animation.Animator;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class IndeterminateAnimatorDelegate<T extends Animator> {

    /* renamed from: a */
    protected IndeterminateDrawable f38058a;

    /* renamed from: b */
    protected final float[] f38059b;

    /* renamed from: c */
    protected final int[] f38060c;

    /* JADX INFO: Access modifiers changed from: protected */
    public IndeterminateAnimatorDelegate(int i) {
        this.f38059b = new float[i * 2];
        this.f38060c = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public float m71160a(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m71159b(@NonNull IndeterminateDrawable indeterminateDrawable) {
        this.f38058a = indeterminateDrawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void cancelAnimatorImmediately();

    public abstract void invalidateSpecValues();

    public abstract void registerAnimatorsCompleteCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void requestCancelAnimatorAfterCurrentCycle();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void startAnimator();

    public abstract void unregisterAnimatorsCompleteCallback();
}
