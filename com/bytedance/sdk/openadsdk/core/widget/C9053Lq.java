package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.Lq */
/* loaded from: classes3.dex */
public class C9053Lq extends C9101Kg {

    /* renamed from: IL */
    private RectF f20186IL;

    /* renamed from: bX */
    private int f20187bX;

    /* renamed from: bg */
    private Paint f20188bg;

    public C9053Lq(Context context) {
        this(context, null);
    }

    /* renamed from: bg */
    private void m83686bg() {
        setTextColor(-1);
        Paint paint = new Paint();
        this.f20188bg = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f20188bg.setColor(Color.parseColor("#99333333"));
        this.f20188bg.setAntiAlias(true);
        this.f20188bg.setStrokeWidth(0.0f);
        this.f20186IL = new RectF();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.f20186IL;
        float f = rectF.bottom;
        canvas.drawRoundRect(rectF, f / 2.0f, f / 2.0f, this.f20188bg);
        canvas.translate((this.f20186IL.right / 2.0f) - (getPaint().measureText(getText().toString()) / 2.0f), 0.0f);
        super.onDraw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.p340zx.C9101Kg, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > 0 && measuredHeight > 0) {
            int measureText = (int) getPaint().measureText("00");
            this.f20187bX = measureText;
            if (measuredWidth < measureText) {
                measuredWidth = measureText;
            }
            int i3 = measuredWidth + ((measuredHeight / 2) * 2);
            setMeasuredDimension(i3, measuredHeight);
            this.f20186IL.set(0.0f, 0.0f, i3, measuredHeight);
            return;
        }
        this.f20186IL.set(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public C9053Lq(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9053Lq(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20187bX = 0;
        m83686bg();
    }
}
