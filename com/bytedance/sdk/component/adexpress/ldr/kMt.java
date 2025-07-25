package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.core.view.ViewCompat;

/* loaded from: classes3.dex */
public class kMt extends View {

    /* renamed from: bX */
    private static int f16412bX = 50;

    /* renamed from: IL */
    private int f16413IL;

    /* renamed from: bg */
    private Paint f16414bg;
    private ObjectAnimator eqN;

    public kMt(Context context) {
        this(context, null);
    }

    /* renamed from: bX */
    private void m88595bX() {
        Paint paint = new Paint();
        this.f16414bg = paint;
        paint.setAntiAlias(true);
        this.f16414bg.setColor(Color.parseColor("#FFFFFFFF"));
        this.f16414bg.setStyle(Paint.Style.STROKE);
        this.f16414bg.setStrokeWidth(18.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        this.eqN = ofFloat;
        ofFloat.setDuration(200L);
    }

    /* renamed from: IL */
    public void m88596IL() {
        clearAnimation();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f16414bg.setShader(new LinearGradient(getMeasuredWidth() / 2, 0.0f, getMeasuredWidth() / 2, getMeasuredHeight(), -1, (int) ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, this.f16413IL, this.f16414bg);
    }

    public kMt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public kMt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16413IL = 10;
        m88595bX();
    }

    /* renamed from: bg */
    public void m88594bg() {
        int min = ((int) Math.min(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f)) - 18;
        f16412bX = min;
        ValueAnimator ofInt = ValueAnimator.ofInt(10, min);
        ofInt.setInterpolator(new PathInterpolator(0.0f, 0.2f, 0.3f, 1.0f));
        ofInt.setDuration(800L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.kMt.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                kMt.this.f16413IL = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kMt.this.invalidate();
            }
        });
        ofInt.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.kMt.2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                kMt.this.eqN.start();
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                kMt.this.setVisibility(0);
                kMt.this.setAlpha(1.0f);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }
        });
        ofInt.start();
    }
}
