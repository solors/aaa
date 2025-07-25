package com.mbridge.msdk.video.dynview.p523h;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.mbridge.msdk.video.dynview.h.b */
/* loaded from: classes6.dex */
public final class MBridgeUIAnim {
    /* renamed from: a */
    public final void m48949a(final View view, long j) {
        ValueAnimator ofInt;
        if (view == null) {
            return;
        }
        if (view.getLayoutParams().width == 0) {
            ofInt = ValueAnimator.ofInt(0, r0);
        } else {
            ofInt = ValueAnimator.ofInt(r0, 0);
        }
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        ValueAnimator ofFloat = view.getLayoutParams().width == 0 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                view.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofFloat);
        animatorSet.start();
    }

    /* renamed from: b */
    public final void m48945b(final View view, long j) {
        if (view != null) {
            view.setAlpha(1.0f);
            view.animate().alpha(0.0f).setDuration(j).setListener(new Animator.AnimatorListener() { // from class: com.mbridge.msdk.video.dynview.h.b.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    View view2 = view;
                    if (view2 != null && (view2 instanceof ViewGroup)) {
                        ((ViewGroup) view2).removeAllViews();
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }
            });
        }
    }

    /* renamed from: c */
    public final void m48942c(View view, long j) {
        if (view != null) {
            view.setVisibility(0);
            view.setAlpha(0.0f);
            view.animate().alpha(1.0f).setDuration(j);
        }
    }

    /* renamed from: b */
    private PropertyValuesHolder m48947b(Property property, float f) {
        float f2 = (-2.0f) * f;
        float f3 = f * 2.0f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f2), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f2), Keyframe.ofFloat(0.9f, f3), Keyframe.ofFloat(1.0f, 0.0f));
    }

    /* renamed from: c */
    private PropertyValuesHolder m48944c(Property property, float f) {
        float f2 = f - 0.4f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f), Keyframe.ofFloat(0.1f, f2), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f), Keyframe.ofFloat(0.4f, f), Keyframe.ofFloat(0.5f, f), Keyframe.ofFloat(0.6f, f), Keyframe.ofFloat(0.7f, f), Keyframe.ofFloat(0.8f, f), Keyframe.ofFloat(0.9f, f), Keyframe.ofFloat(1.0f, f));
    }

    /* renamed from: a */
    public final void m48948a(final List<View> list, int i, int i2, long j) {
        ValueAnimator duration = ValueAnimator.ofInt(i, i2).setDuration(j);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                List list2 = list;
                if (list2 != null && list2.size() > 0) {
                    for (View view : list) {
                        if (view != null) {
                            view.setPadding(0, 0, 0, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                            view.requestLayout();
                        }
                    }
                }
            }
        });
        duration.start();
    }

    /* renamed from: b */
    public final ObjectAnimator m48946b(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m48944c(View.SCALE_X, 1.0f), m48944c(View.SCALE_Y, 1.0f)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* renamed from: c */
    public final ObjectAnimator m48943c(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m48947b(View.ROTATION, 2.0f)).setDuration(1000L);
        duration.setRepeatCount(-1);
        return duration;
    }

    /* renamed from: a */
    public final void m48950a(final View view, int i, int i2, int i3, int i4, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                }
            }
        });
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i3, i4);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.mbridge.msdk.video.dynview.h.b.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                if (view2 != null) {
                    view2.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    view.requestLayout();
                    if (view.getVisibility() != 0) {
                        view.setVisibility(0);
                    }
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofInt, ofInt2);
        animatorSet.setDuration(j);
        animatorSet.start();
    }

    /* renamed from: a */
    private PropertyValuesHolder m48952a(Property property, float f) {
        float f2 = f - 0.2f;
        float f3 = f + 0.3f;
        return PropertyValuesHolder.ofKeyframe(property, Keyframe.ofFloat(0.0f, f), Keyframe.ofFloat(0.1f, f - 0.4f), Keyframe.ofFloat(0.2f, f2), Keyframe.ofFloat(0.3f, f3), Keyframe.ofFloat(0.4f, f2), Keyframe.ofFloat(0.5f, f3), Keyframe.ofFloat(0.6f, f - 0.1f), Keyframe.ofFloat(0.7f, f3), Keyframe.ofFloat(0.8f, f), Keyframe.ofFloat(0.9f, 0.1f + f), Keyframe.ofFloat(1.0f, f));
    }

    /* renamed from: a */
    public final ObjectAnimator m48951a(View view) {
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(view, m48952a(View.SCALE_X, 1.0f), m48952a(View.SCALE_Y, 1.0f), m48947b(View.ROTATION_X, 5.0f)).setDuration(2000L);
        duration.setRepeatCount(-1);
        return duration;
    }
}
