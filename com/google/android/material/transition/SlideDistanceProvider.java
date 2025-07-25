package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.C16310R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public final class SlideDistanceProvider implements VisibilityAnimatorProvider {

    /* renamed from: a */
    private int f39044a;
    @InterfaceC0152Px

    /* renamed from: b */
    private int f39045b = -1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface GravityFlag {
    }

    public SlideDistanceProvider(int i) {
        this.f39044a = i;
    }

    /* renamed from: a */
    private static Animator m70266a(View view, View view2, int i, @InterfaceC0152Px int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (m70261f(view)) {
                                    f2 = translationX - i2;
                                } else {
                                    f2 = i2 + translationX;
                                }
                                return m70264c(view2, f2, translationX, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m70261f(view)) {
                            f = i2 + translationX;
                        } else {
                            f = translationX - i2;
                        }
                        return m70264c(view2, f, translationX, translationX);
                    }
                    return m70263d(view2, i2 + translationY, translationY, translationY);
                }
                return m70263d(view2, translationY - i2, translationY, translationY);
            }
            return m70264c(view2, translationX - i2, translationX, translationX);
        }
        return m70264c(view2, i2 + translationX, translationX, translationX);
    }

    /* renamed from: b */
    private static Animator m70265b(View view, View view2, int i, @InterfaceC0152Px int i2) {
        float f;
        float f2;
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i != 3) {
            if (i != 5) {
                if (i != 48) {
                    if (i != 80) {
                        if (i != 8388611) {
                            if (i == 8388613) {
                                if (m70261f(view)) {
                                    f2 = i2 + translationX;
                                } else {
                                    f2 = translationX - i2;
                                }
                                return m70264c(view2, translationX, f2, translationX);
                            }
                            throw new IllegalArgumentException("Invalid slide direction: " + i);
                        }
                        if (m70261f(view)) {
                            f = translationX - i2;
                        } else {
                            f = i2 + translationX;
                        }
                        return m70264c(view2, translationX, f, translationX);
                    }
                    return m70263d(view2, translationY, translationY - i2, translationY);
                }
                return m70263d(view2, translationY, i2 + translationY, translationY);
            }
            return m70264c(view2, translationX, i2 + translationX, translationX);
        }
        return m70264c(view2, translationX, translationX - i2, translationX);
    }

    /* renamed from: c */
    private static Animator m70264c(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationX(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* renamed from: d */
    private static Animator m70263d(final View view, float f, float f2, final float f3) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f, f2));
        ofPropertyValuesHolder.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transition.SlideDistanceProvider.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                view.setTranslationY(f3);
            }
        });
        return ofPropertyValuesHolder;
    }

    /* renamed from: e */
    private int m70262e(Context context) {
        int i = this.f39045b;
        if (i != -1) {
            return i;
        }
        return context.getResources().getDimensionPixelSize(C16310R.dimen.mtrl_transition_shared_axis_slide_distance);
    }

    /* renamed from: f */
    private static boolean m70261f(View view) {
        if (ViewCompat.getLayoutDirection(view) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createAppear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m70266a(viewGroup, view, this.f39044a, m70262e(view.getContext()));
    }

    @Override // com.google.android.material.transition.VisibilityAnimatorProvider
    @Nullable
    public Animator createDisappear(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return m70265b(viewGroup, view, this.f39044a, m70262e(view.getContext()));
    }

    @InterfaceC0152Px
    public int getSlideDistance() {
        return this.f39045b;
    }

    public int getSlideEdge() {
        return this.f39044a;
    }

    public void setSlideDistance(@InterfaceC0152Px int i) {
        if (i >= 0) {
            this.f39045b = i;
            return;
        }
        throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
    }

    public void setSlideEdge(int i) {
        this.f39044a = i;
    }
}
