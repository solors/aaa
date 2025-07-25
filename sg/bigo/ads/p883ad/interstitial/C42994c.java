package sg.bigo.ads.p883ad.interstitial;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.common.C43680h;
import sg.bigo.ads.common.utils.C43811b;
import sg.bigo.ads.common.utils.C43822e;

/* renamed from: sg.bigo.ads.ad.interstitial.c */
/* loaded from: classes10.dex */
public final class C42994c {
    /* renamed from: a */
    public static ValueAnimator m6218a(int i, int i2, long j, final ValueCallback<Integer> valueCallback, final ValueCallback<Void> valueCallback2) {
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i3 == 0) {
            valueCallback.onReceiveValue(Integer.valueOf(i2));
            valueCallback2.onReceiveValue(null);
            return null;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.bigo.ads.ad.interstitial.c.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ValueCallback valueCallback3;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if ((animatedValue instanceof Integer) && (valueCallback3 = valueCallback) != null) {
                    valueCallback3.onReceiveValue(Integer.valueOf(((Integer) animatedValue).intValue()));
                }
            }
        });
        ofInt.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.interstitial.c.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ValueCallback valueCallback3 = valueCallback2;
                if (valueCallback3 != null) {
                    valueCallback3.onReceiveValue(null);
                }
            }
        });
        if (i3 >= 0) {
            ofInt.setDuration(j);
        }
        ofInt.start();
        return ofInt;
    }

    /* renamed from: b */
    public static void m6207b(@NonNull View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(C43811b.m4940a(2));
        alphaAnimation.setFillAfter(true);
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: c */
    public static void m6204c(@NonNull final View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(C43811b.m4940a(1));
        alphaAnimation.setFillAfter(true);
        alphaAnimation.setAnimationListener(new C43811b.animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.ad.interstitial.c.7
            @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
            }
        });
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: d */
    public static void m6202d(@NonNull View view) {
        AnimationSet animationSet = new AnimationSet(true);
        Interpolator m4940a = C43811b.m4940a(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(m4940a);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.1f, 1.0f, 0.1f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(m4940a);
        animationSet.addAnimation(scaleAnimation);
        view.startAnimation(animationSet);
    }

    /* renamed from: e */
    public static void m6200e(@NonNull View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.9f, 1.0f, 0.9f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(C43811b.m4940a(1));
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        view.startAnimation(scaleAnimation);
    }

    /* renamed from: a */
    public static void m6217a(@NonNull final View view) {
        m6206b(view, new C43811b.animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.ad.interstitial.c.1
            @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.clearAnimation();
                view.setVisibility(8);
            }
        });
    }

    /* renamed from: b */
    public static void m6206b(@NonNull View view, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, view.getHeight());
        translateAnimation.setDuration(200L);
        translateAnimation.setInterpolator(C43811b.m4940a(1));
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(animationListener);
        view.startAnimation(translateAnimation);
    }

    /* renamed from: c */
    public static void m6203c(@NonNull View view, @Nullable Animation.AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        Interpolator m4940a = C43811b.m4940a(2);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setInterpolator(m4940a);
        animationSet.addAnimation(alphaAnimation);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.1f, 1.0f, 0.1f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(m4940a);
        animationSet.addAnimation(scaleAnimation);
        animationSet.setAnimationListener(animationListener);
        view.startAnimation(animationSet);
    }

    /* renamed from: d */
    public static void m6201d(@NonNull View view, @Nullable Animation.AnimationListener animationListener) {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(C43811b.m4940a(3));
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(animationListener);
        view.startAnimation(animationSet);
    }

    /* renamed from: a */
    public static void m6216a(@NonNull View view, float f) {
        AnimationSet animationSet = new AnimationSet(true);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, f, 0.0f);
        translateAnimation.setDuration(300L);
        translateAnimation.setInterpolator(C43811b.m4940a(3));
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        view.startAnimation(animationSet);
    }

    /* renamed from: b */
    public static void m6205b(ViewGroup viewGroup) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new ChangeBounds());
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }

    /* renamed from: a */
    public static void m6215a(@NonNull View view, float f, float f2, @Nullable Animation.AnimationListener animationListener) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        if (animationListener != null) {
            alphaAnimation.setAnimationListener(animationListener);
        }
        view.startAnimation(alphaAnimation);
    }

    /* renamed from: a */
    public static void m6214a(@NonNull View view, long j, Animation.AnimationListener animationListener) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getHeight(), 0.0f);
        translateAnimation.setDuration(j);
        translateAnimation.setInterpolator(C43811b.m4940a(2));
        translateAnimation.setFillAfter(true);
        translateAnimation.setAnimationListener(animationListener);
        view.startAnimation(translateAnimation);
    }

    /* renamed from: a */
    public static void m6213a(@NonNull View view, @NonNull View view2) {
        m6212a(view, view2, 560);
    }

    /* renamed from: a */
    public static void m6212a(@NonNull final View view, @NonNull final View view2, int i) {
        final RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 10.0f, 1, 0.5f, 1, 0.6f);
        rotateAnimation.setDuration(200L);
        if (i > 0) {
            rotateAnimation.setStartOffset(i);
        }
        rotateAnimation.setFillAfter(true);
        final RotateAnimation rotateAnimation2 = new RotateAnimation(10.0f, 0.0f, 1, 0.5f, 1, 0.6f);
        rotateAnimation2.setDuration(240L);
        rotateAnimation2.setFillAfter(true);
        final AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 5.0f, 1.0f, 5.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setInterpolator(C43811b.m4940a(2));
        scaleAnimation.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(400L);
        scaleAnimation.setInterpolator(C43811b.m4940a(2));
        alphaAnimation.setFillAfter(true);
        animationSet.addAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new C43811b.animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.ad.interstitial.c.13
            @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view2.setVisibility(4);
            }
        });
        rotateAnimation.setAnimationListener(new C43811b.animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.ad.interstitial.c.14
            @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.startAnimation(rotateAnimation2);
            }
        });
        rotateAnimation2.setAnimationListener(new C43811b.animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.ad.interstitial.c.2
            @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                view.startAnimation(rotateAnimation);
                view2.setVisibility(0);
                view2.startAnimation(animationSet);
            }
        });
        view.startAnimation(rotateAnimation);
    }

    /* renamed from: a */
    public static void m6211a(final View view, final ViewGroup viewGroup, final Runnable runnable) {
        if (view != null && viewGroup != null) {
            view.setVisibility(8);
            view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.5

                /* renamed from: a */
                final /* synthetic */ int f112607a = 300;

                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new Slide());
                    transitionSet.setDuration(this.f112607a);
                    transitionSet.addListener((Transition.TransitionListener) new C43680h() { // from class: sg.bigo.ads.ad.interstitial.c.5.1
                        @Override // sg.bigo.ads.common.C43680h, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            super.onTransitionEnd(transition);
                            Runnable runnable2 = runnable;
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    });
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                    view.setVisibility(0);
                }
            });
        } else if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static void m6210a(@NonNull View view, Animation.AnimationListener animationListener) {
        m6214a(view, 200L, animationListener);
    }

    /* renamed from: a */
    public static void m6209a(final View view, boolean z) {
        if (view == null) {
            return;
        }
        final int m4906a = C43822e.m4906a(view.getContext(), 56);
        if (!z) {
            m4906a = -m4906a;
        }
        view.post(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.6
            @Override // java.lang.Runnable
            public final void run() {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, m4906a);
                translateAnimation.setDuration(2000L);
                translateAnimation.setInterpolator(C43811b.m4940a(3));
                translateAnimation.setRepeatCount(-1);
                translateAnimation.setRepeatMode(2);
                view.startAnimation(translateAnimation);
            }
        });
    }

    /* renamed from: a */
    public static void m6208a(ViewGroup viewGroup) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Fade(2));
        transitionSet.setDuration(300L);
        TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
    }
}
