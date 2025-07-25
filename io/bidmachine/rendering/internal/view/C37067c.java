package io.bidmachine.rendering.internal.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import io.bidmachine.rendering.internal.AbstractC37034i;
import io.bidmachine.rendering.internal.InterfaceC37031f;
import io.bidmachine.rendering.internal.InterfaceC37040n;
import io.bidmachine.rendering.model.AppearanceParams;

/* renamed from: io.bidmachine.rendering.internal.view.c */
/* loaded from: classes9.dex */
public class C37067c extends View implements InterfaceC37031f, InterfaceC37040n {

    /* renamed from: a */
    final Paint f97789a;

    /* renamed from: b */
    float f97790b;

    /* renamed from: c */
    int f97791c;

    /* renamed from: d */
    int f97792d;

    public C37067c(Context context) {
        super(context);
        this.f97789a = new Paint(1);
        this.f97790b = 0.0f;
        this.f97791c = AbstractC37034i.f97742b;
        this.f97792d = 0;
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37031f
    /* renamed from: a */
    public void mo19098a(AppearanceParams appearanceParams) {
        Integer backgroundColor = appearanceParams.getBackgroundColor();
        if (backgroundColor != null) {
            this.f97792d = backgroundColor.intValue();
        }
        Integer strokeColor = appearanceParams.getStrokeColor();
        if (strokeColor != null) {
            this.f97791c = strokeColor.intValue();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f97789a.setColor(this.f97792d);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f97789a);
        this.f97789a.setColor(this.f97791c);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f97790b) / 100.0f), measuredHeight, this.f97789a);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f97789a.setStrokeWidth(getMeasuredHeight());
    }

    @Override // io.bidmachine.rendering.internal.InterfaceC37040n
    /* renamed from: a */
    public void mo19099a(long j, long j2, float f) {
        this.f97790b = f;
        postInvalidate();
    }
}
