package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class DrawableWithAnimatedVisibilityChange extends Drawable implements Animatable2Compat {

    /* renamed from: q */
    private static final Property<DrawableWithAnimatedVisibilityChange, Float> f38039q = new Property<DrawableWithAnimatedVisibilityChange, Float>(Float.class, "growFraction") { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.3
        @Override // android.util.Property
        public Float get(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
            return Float.valueOf(drawableWithAnimatedVisibilityChange.m71167g());
        }

        @Override // android.util.Property
        public void set(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange, Float f) {
            drawableWithAnimatedVisibilityChange.m71165i(f.floatValue());
        }
    };

    /* renamed from: b */
    final Context f38040b;

    /* renamed from: c */
    final BaseProgressIndicatorSpec f38041c;

    /* renamed from: f */
    private ValueAnimator f38043f;

    /* renamed from: g */
    private ValueAnimator f38044g;

    /* renamed from: h */
    private boolean f38045h;

    /* renamed from: i */
    private boolean f38046i;

    /* renamed from: j */
    private float f38047j;

    /* renamed from: k */
    private List<Animatable2Compat.AnimationCallback> f38048k;

    /* renamed from: l */
    private Animatable2Compat.AnimationCallback f38049l;

    /* renamed from: m */
    private boolean f38050m;

    /* renamed from: n */
    private float f38051n;

    /* renamed from: p */
    private int f38053p;

    /* renamed from: o */
    final Paint f38052o = new Paint();

    /* renamed from: d */
    AnimatorDurationScaleProvider f38042d = new AnimatorDurationScaleProvider();

    /* JADX INFO: Access modifiers changed from: package-private */
    public DrawableWithAnimatedVisibilityChange(@NonNull Context context, @NonNull BaseProgressIndicatorSpec baseProgressIndicatorSpec) {
        this.f38040b = context;
        this.f38041c = baseProgressIndicatorSpec;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m71170d() {
        Animatable2Compat.AnimationCallback animationCallback = this.f38049l;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f38048k;
        if (list != null && !this.f38050m) {
            for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
                animationCallback2.onAnimationEnd(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public void m71169e() {
        Animatable2Compat.AnimationCallback animationCallback = this.f38049l;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f38048k;
        if (list != null && !this.f38050m) {
            for (Animatable2Compat.AnimationCallback animationCallback2 : list) {
                animationCallback2.onAnimationStart(this);
            }
        }
    }

    /* renamed from: f */
    private void m71168f(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z = this.f38050m;
        this.f38050m = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f38050m = z;
    }

    /* renamed from: h */
    private void m71166h() {
        if (this.f38043f == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f38039q, 0.0f, 1.0f);
            this.f38043f = ofFloat;
            ofFloat.setDuration(500L);
            this.f38043f.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            m71163k(this.f38043f);
        }
        if (this.f38044g == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f38039q, 1.0f, 0.0f);
            this.f38044g = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f38044g.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            m71164j(this.f38044g);
        }
    }

    /* renamed from: j */
    private void m71164j(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f38044g;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f38044g = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DrawableWithAnimatedVisibilityChange.super.setVisible(false, false);
                DrawableWithAnimatedVisibilityChange.this.m71170d();
            }
        });
    }

    /* renamed from: k */
    private void m71163k(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f38043f;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f38043f = valueAnimator;
        valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
                DrawableWithAnimatedVisibilityChange.this.m71169e();
            }
        });
    }

    public void clearAnimationCallbacks() {
        this.f38048k.clear();
        this.f38048k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public float m71167g() {
        if (!this.f38041c.isShowAnimationEnabled() && !this.f38041c.isHideAnimationEnabled()) {
            return 1.0f;
        }
        if (!this.f38046i && !this.f38045h) {
            return this.f38051n;
        }
        return this.f38047j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38053p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean hideNow() {
        return setVisible(false, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m71165i(@FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        if (this.f38051n != f) {
            this.f38051n = f;
            invalidateSelf();
        }
    }

    public boolean isHiding() {
        ValueAnimator valueAnimator = this.f38044g;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f38046i) {
            return true;
        }
        return false;
    }

    public boolean isRunning() {
        if (!isShowing() && !isHiding()) {
            return false;
        }
        return true;
    }

    public boolean isShowing() {
        ValueAnimator valueAnimator = this.f38043f;
        if ((valueAnimator != null && valueAnimator.isRunning()) || this.f38045h) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo71158l(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator;
        boolean z4;
        boolean isHideAnimationEnabled;
        m71166h();
        if (!isVisible() && !z) {
            return false;
        }
        if (z) {
            valueAnimator = this.f38043f;
        } else {
            valueAnimator = this.f38044g;
        }
        if (!z3) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m71168f(valueAnimator);
            }
            return super.setVisible(z, false);
        } else if (z3 && valueAnimator.isRunning()) {
            return false;
        } else {
            if (z && !super.setVisible(z, false)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z) {
                isHideAnimationEnabled = this.f38041c.isShowAnimationEnabled();
            } else {
                isHideAnimationEnabled = this.f38041c.isHideAnimationEnabled();
            }
            if (!isHideAnimationEnabled) {
                m71168f(valueAnimator);
                return z4;
            }
            if (!z2 && valueAnimator.isPaused()) {
                valueAnimator.resume();
            } else {
                valueAnimator.start();
            }
            return z4;
        }
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f38048k == null) {
            this.f38048k = new ArrayList();
        }
        if (!this.f38048k.contains(animationCallback)) {
            this.f38048k.add(animationCallback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f38053p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f38052o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return setVisible(z, z2, true);
    }

    public void start() {
        mo71158l(true, true, false);
    }

    public void stop() {
        mo71158l(false, true, false);
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f38048k;
        if (list != null && list.contains(animationCallback)) {
            this.f38048k.remove(animationCallback);
            if (this.f38048k.isEmpty()) {
                this.f38048k = null;
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean setVisible(boolean z, boolean z2, boolean z3) {
        return mo71158l(z, z2, z3 && this.f38042d.getSystemAnimatorDurationScale(this.f38040b.getContentResolver()) > 0.0f);
    }
}
