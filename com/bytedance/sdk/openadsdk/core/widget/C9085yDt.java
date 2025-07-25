package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.bytedance.sdk.openadsdk.core.widget.yDt */
/* loaded from: classes3.dex */
public class C9085yDt extends C9105eqN {

    /* renamed from: IL */
    private RectF f20283IL;

    /* renamed from: bg */
    private Paint f20284bg;

    public C9085yDt(Context context) {
        super(context);
        m83599bg();
    }

    /* renamed from: bg */
    private void m83599bg() {
        Paint paint = new Paint();
        this.f20284bg = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f20284bg.setColor(Color.parseColor("#99333333"));
        this.f20284bg.setAntiAlias(true);
        this.f20284bg.setStrokeWidth(0.0f);
        this.f20283IL = new RectF();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f20283IL;
        canvas.drawRoundRect(rectF, rectF.right / 2.0f, rectF.bottom / 2.0f, this.f20284bg);
        super.onDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9105eqN, android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f20283IL.right != getMeasuredWidth() || this.f20283IL.bottom != getMeasuredHeight()) {
            this.f20283IL.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
