package com.bytedance.adsdk.p183IL.ldr;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.bytedance.adsdk.IL.ldr.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC6861bg extends ValueAnimator {

    /* renamed from: bg */
    private final Set<ValueAnimator.AnimatorUpdateListener> f14752bg = new CopyOnWriteArraySet();

    /* renamed from: IL */
    private final Set<Animator.AnimatorListener> f14750IL = new CopyOnWriteArraySet();

    /* renamed from: bX */
    private final Set<Animator.AnimatorPauseListener> f14751bX = new CopyOnWriteArraySet();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void m90628IL(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f14750IL) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f14750IL.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f14751bX.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14752bg.add(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bX */
    public void m90627bX() {
        for (ValueAnimator.AnimatorUpdateListener animatorUpdateListener : this.f14752bg) {
            animatorUpdateListener.onAnimationUpdate(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90625bg(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f14750IL) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void eqN() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f14751bX) {
            animatorPauseListener.onAnimationPause(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f14750IL.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f14752bg.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f14750IL.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f14751bX.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f14752bg.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zx */
    public void m90624zx() {
        for (Animator.AnimatorPauseListener animatorPauseListener : this.f14751bX) {
            animatorPauseListener.onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public void mo90629IL() {
        for (Animator.AnimatorListener animatorListener : this.f14750IL) {
            animatorListener.onAnimationCancel(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m90626bg() {
        for (Animator.AnimatorListener animatorListener : this.f14750IL) {
            animatorListener.onAnimationRepeat(this);
        }
    }
}
