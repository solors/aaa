package com.bytedance.sdk.openadsdk.p290Ta;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.bytedance.sdk.openadsdk.Ta.VB */
/* loaded from: classes3.dex */
public class C7908VB extends View {

    /* renamed from: IL */
    private float f17249IL;

    /* renamed from: bX */
    private float f17250bX;

    /* renamed from: bg */
    private final Paint f17251bg;

    public C7908VB(Context context) {
        super(context);
        setBackgroundColor(Color.parseColor("#8A8A8A"));
        Paint paint = new Paint();
        this.f17251bg = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.f17250bX;
        if (f > 0.0f) {
            float f2 = this.f17249IL;
            canvas.drawLine(0.0f, f2, f, f2, this.f17251bg);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i2;
        this.f17249IL = (1.0f * f) / 2.0f;
        this.f17251bg.setStrokeWidth(f);
    }

    public void setProgress(float f) {
        this.f17250bX = getWidth() * f;
        invalidate();
    }
}
