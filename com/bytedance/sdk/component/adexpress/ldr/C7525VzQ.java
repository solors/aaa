package com.bytedance.sdk.component.adexpress.ldr;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.VzQ */
/* loaded from: classes3.dex */
public class C7525VzQ extends View {

    /* renamed from: IL */
    private Paint f16361IL;

    /* renamed from: bX */
    private RectF f16362bX;

    /* renamed from: bg */
    private Context f16363bg;
    private float eqN;

    /* renamed from: iR */
    private boolean f16364iR;
    private int ldr;

    /* renamed from: zx */
    private ValueAnimator f16365zx;

    public C7525VzQ(Context context) {
        super(context);
        this.ldr = 1500;
        this.f16363bg = context;
        Paint paint = new Paint();
        this.f16361IL = paint;
        paint.setAntiAlias(true);
        this.f16361IL.setStyle(Paint.Style.STROKE);
        this.f16361IL.setStrokeWidth(10.0f);
        this.f16361IL.setColor(Color.parseColor("#80FFFFFF"));
        this.f16362bX = new RectF();
    }

    /* renamed from: IL */
    public void m88617IL() {
        ValueAnimator valueAnimator = this.f16365zx;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    /* renamed from: bX */
    public void m88616bX() {
        this.f16364iR = true;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16364iR) {
            return;
        }
        canvas.drawArc(this.f16362bX, 270.0f, this.eqN, false, this.f16361IL);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(Math.min(size, size2), Math.min(size, size2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16362bX.set(5.0f, 5.0f, i - 5, i2 - 5);
    }

    public void setDuration(int i) {
        this.ldr = i;
    }

    /* renamed from: bg */
    public void m88615bg() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.f16365zx = ofFloat;
        ofFloat.setDuration(this.ldr);
        this.f16365zx.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.ldr.VzQ.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7525VzQ.this.eqN = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C7525VzQ.this.requestLayout();
            }
        });
        this.f16365zx.start();
    }
}
