package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.tuV */
/* loaded from: classes3.dex */
public class C7550tuV extends View {

    /* renamed from: IL */
    private float f16441IL;

    /* renamed from: Kg */
    private float f16442Kg;

    /* renamed from: WR */
    private Animator.AnimatorListener f16443WR;

    /* renamed from: bX */
    private ValueAnimator f16444bX;

    /* renamed from: bg */
    private float f16445bg;

    /* renamed from: eo */
    private int f16446eo;
    private ValueAnimator eqN;

    /* renamed from: iR */
    private float f16447iR;
    private long ldr;

    /* renamed from: zx */
    private Paint f16448zx;

    public C7550tuV(Context context, int i) {
        super(context);
        this.ldr = 300L;
        this.f16447iR = 0.0f;
        this.f16446eo = i;
        m88575bg();
    }

    /* renamed from: IL */
    public void m88577IL() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, this.f16442Kg);
        this.f16444bX = ofFloat;
        ofFloat.setDuration(this.ldr);
        this.f16444bX.setInterpolator(new LinearInterpolator());
        this.f16444bX.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tuV.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7550tuV.this.f16447iR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C7550tuV.this.invalidate();
            }
        });
        this.f16444bX.start();
    }

    /* renamed from: bX */
    public void m88576bX() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f16442Kg, 0.0f);
        this.eqN = ofFloat;
        ofFloat.setDuration(this.ldr);
        this.eqN.setInterpolator(new LinearInterpolator());
        this.eqN.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.tuV.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7550tuV.this.f16447iR = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C7550tuV.this.invalidate();
            }
        });
        Animator.AnimatorListener animatorListener = this.f16443WR;
        if (animatorListener != null) {
            this.eqN.addListener(animatorListener);
        }
        this.eqN.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(this.f16445bg, this.f16441IL, this.f16447iR, this.f16448zx);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16445bg = i / 2.0f;
        this.f16441IL = i2 / 2.0f;
        this.f16442Kg = (float) (Math.hypot(i, i2) / 2.0d);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f16443WR = animatorListener;
    }

    /* renamed from: bg */
    public void m88575bg() {
        Paint paint = new Paint(1);
        this.f16448zx = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f16448zx.setColor(this.f16446eo);
    }
}
