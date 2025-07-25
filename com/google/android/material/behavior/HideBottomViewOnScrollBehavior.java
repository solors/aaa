package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.AnimationUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    public static final int STATE_SCROLLED_DOWN = 1;
    public static final int STATE_SCROLLED_UP = 2;
    @NonNull

    /* renamed from: a */
    private final LinkedHashSet<OnScrollStateChangedListener> f36721a;

    /* renamed from: b */
    private int f36722b;
    @ScrollState

    /* renamed from: c */
    private int f36723c;

    /* renamed from: d */
    private int f36724d;
    @Nullable

    /* renamed from: e */
    private ViewPropertyAnimator f36725e;

    /* loaded from: classes5.dex */
    public interface OnScrollStateChangedListener {
        void onStateChanged(@NonNull View view, @ScrollState int i);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface ScrollState {
    }

    public HideBottomViewOnScrollBehavior() {
        this.f36721a = new LinkedHashSet<>();
        this.f36722b = 0;
        this.f36723c = 2;
        this.f36724d = 0;
    }

    /* renamed from: b */
    private void m72067b(@NonNull V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f36725e = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f36725e = null;
            }
        });
    }

    /* renamed from: c */
    private void m72066c(@NonNull V v, @ScrollState int i) {
        this.f36723c = i;
        Iterator<OnScrollStateChangedListener> it = this.f36721a.iterator();
        while (it.hasNext()) {
            it.next().onStateChanged(v, this.f36723c);
        }
    }

    public void addOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f36721a.add(onScrollStateChangedListener);
    }

    public void clearOnScrollStateChangedListeners() {
        this.f36721a.clear();
    }

    public boolean isScrolledDown() {
        if (this.f36723c == 1) {
            return true;
        }
        return false;
    }

    public boolean isScrolledUp() {
        if (this.f36723c == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
        this.f36722b = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(coordinatorLayout, v, i);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (i2 > 0) {
            slideDown(v);
        } else if (i2 < 0) {
            slideUp(v);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (i == 2) {
            return true;
        }
        return false;
    }

    public void removeOnScrollStateChangedListener(@NonNull OnScrollStateChangedListener onScrollStateChangedListener) {
        this.f36721a.remove(onScrollStateChangedListener);
    }

    public void setAdditionalHiddenOffsetY(@NonNull V v, @Dimension int i) {
        this.f36724d = i;
        if (this.f36723c == 1) {
            v.setTranslationY(this.f36722b + i);
        }
    }

    public void slideDown(@NonNull V v) {
        slideDown(v, true);
    }

    public void slideUp(@NonNull V v) {
        slideUp(v, true);
    }

    public void slideDown(@NonNull V v, boolean z) {
        if (isScrolledDown()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f36725e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m72066c(v, 1);
        int i = this.f36722b + this.f36724d;
        if (z) {
            m72067b(v, i, 175L, AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR);
        } else {
            v.setTranslationY(i);
        }
    }

    public void slideUp(@NonNull V v, boolean z) {
        if (isScrolledUp()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f36725e;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        m72066c(v, 2);
        if (z) {
            m72067b(v, 0, 225L, AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        } else {
            v.setTranslationY(0);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36721a = new LinkedHashSet<>();
        this.f36722b = 0;
        this.f36723c = 2;
        this.f36724d = 0;
    }
}
