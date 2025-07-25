package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.WR */
/* loaded from: classes3.dex */
public class C7527WR extends View {

    /* renamed from: IL */
    private int f16367IL;

    /* renamed from: Kg */
    private int f16368Kg;

    /* renamed from: bX */
    private final RectF f16369bX;

    /* renamed from: bg */
    private int f16370bg;
    private Paint eqN;

    /* renamed from: iR */
    private Paint f16371iR;
    private int ldr;

    /* renamed from: zx */
    private Paint f16372zx;

    public C7527WR(Context context) {
        super(context);
        this.f16369bX = new RectF();
        m88613bg();
    }

    /* renamed from: bg */
    private void m88613bg() {
        Paint paint = new Paint();
        this.eqN = paint;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f16371iR = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f16372zx = paint3;
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.f16369bX;
        int i = this.ldr;
        canvas.drawRoundRect(rectF, i, i, this.f16372zx);
        RectF rectF2 = this.f16369bX;
        int i2 = this.ldr;
        canvas.drawRoundRect(rectF2, i2, i2, this.eqN);
        int i3 = this.f16370bg;
        int i4 = this.f16367IL;
        canvas.drawLine(i3 * 0.3f, i4 * 0.3f, i3 * 0.7f, i4 * 0.7f, this.f16371iR);
        int i5 = this.f16370bg;
        int i6 = this.f16367IL;
        canvas.drawLine(i5 * 0.7f, i6 * 0.3f, i5 * 0.3f, i6 * 0.7f, this.f16371iR);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16370bg = i;
        this.f16367IL = i2;
        RectF rectF = this.f16369bX;
        int i5 = this.f16368Kg;
        rectF.set(i5, i5, i - i5, i2 - i5);
    }

    public void setBgColor(int i) {
        this.f16372zx.setStyle(Paint.Style.FILL);
        this.f16372zx.setColor(i);
    }

    public void setDislikeColor(int i) {
        this.f16371iR.setColor(i);
    }

    public void setDislikeWidth(int i) {
        this.f16371iR.setStrokeWidth(i);
    }

    public void setRadius(int i) {
        this.ldr = i;
    }

    public void setStrokeColor(int i) {
        this.eqN.setStyle(Paint.Style.STROKE);
        this.eqN.setColor(i);
    }

    public void setStrokeWidth(int i) {
        this.eqN.setStrokeWidth(i);
        this.f16368Kg = i;
    }
}
