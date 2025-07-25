package sg.bigo.ads.p883ad.p887c;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Handler;
import android.os.Looper;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43811b;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.ad.c.a */
/* loaded from: classes10.dex */
public final class C42871a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.ad.c.a$4 */
    /* loaded from: classes10.dex */
    public static class RunnableC428764 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f112278a;

        /* renamed from: b */
        final /* synthetic */ View f112279b;

        /* renamed from: c */
        final /* synthetic */ int[] f112280c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f112281d;

        /* renamed from: e */
        final /* synthetic */ int f112282e;

        RunnableC428764(View view, View view2, int[] iArr, ViewGroup viewGroup, int i) {
            this.f112278a = view;
            this.f112279b = view2;
            this.f112280c = iArr;
            this.f112281d = viewGroup;
            this.f112282e = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f112278a.getVisibility() != 0) {
                this.f112278a.setVisibility(0);
            }
            View view = this.f112279b;
            int[] iArr = this.f112280c;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", iArr[0], iArr[1]);
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(C43811b.m4940a(0));
            ofFloat.addListener(new C43811b.C43817d() { // from class: sg.bigo.ads.ad.c.a.4.1
                @Override // sg.bigo.ads.common.utils.C43811b.C43817d, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(RunnableC428764.this.f112279b, "rotation", 0.0f, -20.0f, 0.0f);
                    ofFloat2.setInterpolator(C43811b.m4940a(1));
                    ofFloat2.setDuration(500L);
                    ofFloat2.setRepeatCount(1);
                    ofFloat2.addListener(new C43811b.C43817d() { // from class: sg.bigo.ads.ad.c.a.4.1.1
                        @Override // sg.bigo.ads.common.utils.C43811b.C43817d, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator2) {
                            RunnableC428764 runnableC428764 = RunnableC428764.this;
                            ViewGroup viewGroup = runnableC428764.f112281d;
                            View view2 = runnableC428764.f112278a;
                            int i = runnableC428764.f112282e - 1;
                            C42871a.m6435a(viewGroup, 0L, i, runnableC428764.f112280c);
                            if (i == 0) {
                                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f);
                                ofFloat3.setDuration(300L);
                                ofFloat3.setInterpolator(C43811b.m4940a(1));
                                ofFloat3.start();
                            }
                        }
                    });
                    ofFloat2.start();
                }
            });
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f112279b, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.setInterpolator(C43811b.m4940a(1));
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f112279b, "scaleX", 0.0f, 1.0f);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f112279b, "scaleY", 0.0f, 1.0f);
            ofFloat3.setDuration(300L);
            ofFloat3.setInterpolator(C43811b.m4940a(1));
            ofFloat4.setDuration(300L);
            ofFloat4.setInterpolator(C43811b.m4940a(1));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            animatorSet.start();
        }
    }

    /* renamed from: a */
    public static void m6436a(@NonNull final ViewGroup viewGroup, final long j, final int i) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (i <= 0) {
            return;
        }
        handler.post(new Runnable() { // from class: sg.bigo.ads.ad.c.a.3
            @Override // java.lang.Runnable
            public final void run() {
                int m4906a = C43822e.m4906a(viewGroup.getContext(), 8);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationX", 0.0f, -m4906a, 0.0f, m4906a, 0.0f);
                ofFloat.setInterpolator(C43811b.m4940a(3));
                ofFloat.setDuration(300L);
                ofFloat.setRepeatMode(2);
                ofFloat.setStartDelay(j);
                ofFloat.addListener(new AnimatorListenerAdapter() { // from class: sg.bigo.ads.ad.c.a.3.1
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        RunnableC428743 runnableC428743 = RunnableC428743.this;
                        C42871a.m6436a(viewGroup, 100L, i - 1);
                    }
                });
                ofFloat.start();
            }
        });
    }

    /* renamed from: a */
    public static void m6435a(ViewGroup viewGroup, long j, int i, int[] iArr) {
        if (i > 0 && iArr.length >= 2 && viewGroup != null) {
            View findViewById = viewGroup.findViewById(C42750R.C42753id.click_img);
            View findViewById2 = viewGroup.findViewById(C42750R.C42753id.click_guide_contain);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            viewGroup.postDelayed(new RunnableC428764(findViewById2, findViewById, iArr, viewGroup, i), j);
        }
    }

    /* renamed from: a */
    public static void m6434a(final ViewGroup viewGroup, final View view, final boolean z) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (viewGroup == null || view == null) {
            return;
        }
        handler.post(new Runnable() { // from class: sg.bigo.ads.ad.c.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (z) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new ChangeBounds());
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(viewGroup, transitionSet);
                }
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                }
                View findViewById = view.findViewById(C42750R.C42753id.placeholder_view);
                if (findViewById != null) {
                    C43841u.m4797b(findViewById);
                }
            }
        });
    }
}
