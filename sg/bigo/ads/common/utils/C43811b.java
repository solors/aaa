package sg.bigo.ads.common.utils;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.transition.ChangeBounds;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import sg.bigo.ads.common.utils.AnimationUtils;

/* renamed from: sg.bigo.ads.common.utils.b */
/* loaded from: classes10.dex */
public final class C43811b {

    @RequiresApi(api = 19)
    /* renamed from: sg.bigo.ads.common.utils.b$a */
    /* loaded from: classes10.dex */
    public static class C43814a extends ChangeBounds implements ValueAnimator.AnimatorUpdateListener {
        /* renamed from: a */
        protected void mo4938a(TransitionValues transitionValues, TransitionValues transitionValues2) {
        }

        @Override // android.transition.ChangeBounds, android.transition.Transition
        public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            try {
                mo4938a(transitionValues, transitionValues2);
            } catch (Exception unused) {
            }
            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (createAnimator instanceof ValueAnimator) {
                ((ValueAnimator) createAnimator).addUpdateListener(this);
            }
            return createAnimator;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (valueAnimator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
                mo4937a(objectAnimator.getTarget(), objectAnimator.getAnimatedValue());
            }
        }

        /* renamed from: a */
        protected void mo4937a(Object obj, Object obj2) {
        }
    }

    /* renamed from: sg.bigo.ads.common.utils.b$b  reason: invalid class name */
    /* loaded from: classes10.dex */
    public static class animationInterpolatorC43815b implements Interpolator {

        /* renamed from: a */
        private final long f114649a;

        /* renamed from: b */
        private final float f114650b;

        /* renamed from: c */
        private final float f114651c;

        public animationInterpolatorC43815b(long j, long j2, long j3) {
            long j4 = j + j2;
            long j5 = j3 + j4;
            this.f114649a = j5;
            this.f114650b = (((float) j2) * 1.0f) / ((float) j5);
            this.f114651c = (((float) j4) * 1.0f) / ((float) j5);
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = this.f114650b;
            if (f < f2) {
                return 0.0f;
            }
            float f3 = this.f114651c;
            if (f > f3) {
                return 1.0f;
            }
            return (f - f2) / (f3 - f2);
        }
    }

    @NonNull
    /* renamed from: a */
    public static Interpolator m4940a(@AnimationUtils.AnimationEffect int i) {
        return i != 1 ? i != 2 ? i != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator(1.5f) : new AccelerateInterpolator(1.5f);
    }

    /* renamed from: a */
    public static void m4939a(final View view) {
        if (view == null) {
            return;
        }
        final int m4906a = C43822e.m4906a(view.getContext(), 40);
        view.setVisibility(4);
        view.post(new Runnable() { // from class: sg.bigo.ads.common.utils.b.1
            @Override // java.lang.Runnable
            public final void run() {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, view.getTranslationY() + m4906a, view.getTranslationY());
                translateAnimation.setDuration(300L);
                translateAnimation.setInterpolator(C43811b.m4940a(2));
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                alphaAnimation.setInterpolator(C43811b.m4940a(2));
                AnimationSet animationSet = new AnimationSet(false);
                animationSet.addAnimation(alphaAnimation);
                animationSet.addAnimation(translateAnimation);
                animationSet.setAnimationListener(new animationAnimation$AnimationListenerC43816c() { // from class: sg.bigo.ads.common.utils.b.1.1
                    @Override // sg.bigo.ads.common.utils.C43811b.animationAnimation$AnimationListenerC43816c, android.view.animation.Animation.AnimationListener
                    public final void onAnimationStart(Animation animation) {
                        view.setVisibility(0);
                    }
                });
                view.startAnimation(animationSet);
            }
        });
    }

    /* renamed from: sg.bigo.ads.common.utils.b$c  reason: invalid class name */
    /* loaded from: classes10.dex */
    public static class animationAnimation$AnimationListenerC43816c implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: sg.bigo.ads.common.utils.b$d */
    /* loaded from: classes10.dex */
    public static class C43817d implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
