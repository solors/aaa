package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import androidx.annotation.ColorInt;
import androidx.core.graphics.ColorUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coo2iico */
/* loaded from: classes8.dex */
public class C32473coo2iico {
    private static final String coo2iico = "AnimationUtils";

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    class C32474coi222o222 implements ValueAnimator.AnimatorUpdateListener {
        final /* synthetic */ View coo2iico;

        C32474coi222o222(View view) {
            this.coo2iico = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            ((GradientDrawable) this.coo2iico.getBackground()).setColor(intValue);
            View view = this.coo2iico;
            if (view instanceof Button) {
                Button button = (Button) view;
                if (C32473coo2iico.coo2iico(intValue)) {
                    button.setTextColor(-1442840576);
                } else {
                    button.setTextColor(-1);
                }
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class RunnableC32475coo2iico implements Runnable {
        final /* synthetic */ Animation coi222o222;
        final /* synthetic */ View coo2iico;

        RunnableC32475coo2iico(View view, Animation animation) {
            this.coo2iico = view;
            this.coi222o222 = animation;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.coo2iico.startAnimation(this.coi222o222);
        }
    }

    private C32473coo2iico() {
    }

    public static void coo2iico(View view, float f, long j, int i, int i2, long j2) {
        if (view == null) {
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                view.postDelayed(new RunnableC32475coo2iico(view, coo2iico(f, j, i)), (i3 * i2 * j) + (i3 * j2));
            } catch (Exception e) {
                MLog.m25891d(coo2iico, "startRotateAnim", e);
                return;
            }
        }
    }

    private static Animation coo2iico(float f, long j, int i) {
        RotateAnimation rotateAnimation = new RotateAnimation(-f, f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setRepeatCount(i);
        rotateAnimation.setDuration(j);
        return rotateAnimation;
    }

    public static void coo2iico(View view, String[] strArr) {
        if (view == null || strArr == null || strArr.length <= 1) {
            return;
        }
        try {
            Object[] objArr = new Object[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                objArr[i] = Integer.valueOf(Color.parseColor(strArr[i]));
            }
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), objArr);
            ofObject.addUpdateListener(new C32474coi222o222(view));
            ofObject.setDuration(strArr.length * 1000);
            ofObject.start();
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "startColorAnim", e);
        }
    }

    public static boolean coo2iico(@ColorInt int i) {
        return ColorUtils.calculateLuminance(i) >= 0.5d;
    }

    public static void coo2iico(View view, float f, float f2, long j, int i) {
        if (view == null) {
            return;
        }
        try {
            ScaleAnimation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(j);
            scaleAnimation.setRepeatMode(2);
            scaleAnimation.setRepeatCount(i);
            view.startAnimation(scaleAnimation);
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "startScaleAnim", e);
        }
    }

    public static void coo2iico(View view) {
        if (view == null) {
            return;
        }
        view.setVisibility(0);
        try {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(500L);
            view.startAnimation(alphaAnimation);
        } catch (Exception e) {
            MLog.m25891d(coo2iico, "startAlphaAnim", e);
        }
    }
}
