package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
class AnimatorTracker {
    @Nullable

    /* renamed from: a */
    private Animator f37484a;

    public void cancelCurrent() {
        Animator animator = this.f37484a;
        if (animator != null) {
            animator.cancel();
        }
    }

    public void clear() {
        this.f37484a = null;
    }

    public void onNextAnimationStart(Animator animator) {
        cancelCurrent();
        this.f37484a = animator;
    }
}
