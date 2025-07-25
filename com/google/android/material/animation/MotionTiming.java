package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public class MotionTiming {

    /* renamed from: a */
    private long f36550a;

    /* renamed from: b */
    private long f36551b;
    @Nullable

    /* renamed from: c */
    private TimeInterpolator f36552c;

    /* renamed from: d */
    private int f36553d;

    /* renamed from: e */
    private int f36554e;

    public MotionTiming(long j, long j2) {
        this.f36552c = null;
        this.f36553d = 0;
        this.f36554e = 1;
        this.f36550a = j;
        this.f36551b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static MotionTiming m72276a(@NonNull ValueAnimator valueAnimator) {
        MotionTiming motionTiming = new MotionTiming(valueAnimator.getStartDelay(), valueAnimator.getDuration(), m72275b(valueAnimator));
        motionTiming.f36553d = valueAnimator.getRepeatCount();
        motionTiming.f36554e = valueAnimator.getRepeatMode();
        return motionTiming;
    }

    /* renamed from: b */
    private static TimeInterpolator m72275b(@NonNull ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
            if (interpolator instanceof AccelerateInterpolator) {
                return AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR;
            }
            if (interpolator instanceof DecelerateInterpolator) {
                return AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR;
            }
            return interpolator;
        }
        return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    }

    public void apply(@NonNull Animator animator) {
        animator.setStartDelay(getDelay());
        animator.setDuration(getDuration());
        animator.setInterpolator(getInterpolator());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(getRepeatCount());
            valueAnimator.setRepeatMode(getRepeatMode());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (getDelay() != motionTiming.getDelay() || getDuration() != motionTiming.getDuration() || getRepeatCount() != motionTiming.getRepeatCount() || getRepeatMode() != motionTiming.getRepeatMode()) {
            return false;
        }
        return getInterpolator().getClass().equals(motionTiming.getInterpolator().getClass());
    }

    public long getDelay() {
        return this.f36550a;
    }

    public long getDuration() {
        return this.f36551b;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        TimeInterpolator timeInterpolator = this.f36552c;
        if (timeInterpolator == null) {
            return AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        }
        return timeInterpolator;
    }

    public int getRepeatCount() {
        return this.f36553d;
    }

    public int getRepeatMode() {
        return this.f36554e;
    }

    public int hashCode() {
        return (((((((((int) (getDelay() ^ (getDelay() >>> 32))) * 31) + ((int) (getDuration() ^ (getDuration() >>> 32)))) * 31) + getInterpolator().getClass().hashCode()) * 31) + getRepeatCount()) * 31) + getRepeatMode();
    }

    @NonNull
    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + getDelay() + " duration: " + getDuration() + " interpolator: " + getInterpolator().getClass() + " repeatCount: " + getRepeatCount() + " repeatMode: " + getRepeatMode() + "}\n";
    }

    public MotionTiming(long j, long j2, @NonNull TimeInterpolator timeInterpolator) {
        this.f36553d = 0;
        this.f36554e = 1;
        this.f36550a = j;
        this.f36551b = j2;
        this.f36552c = timeInterpolator;
    }
}
