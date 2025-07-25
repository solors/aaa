package com.p551my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

/* renamed from: com.my.target.l0 */
/* loaded from: classes7.dex */
public class C25880l0 extends TextView {

    /* renamed from: a */
    public final GradientDrawable f67159a;

    /* renamed from: b */
    public final int f67160b;

    public C25880l0(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m43568a(int i, int i2) {
        m43567a(i, i2, 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        this.f67159a.setBounds(getPaddingLeft() - this.f67160b, getPaddingTop(), getWidth(), getHeight());
        this.f67159a.draw(canvas);
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth() + (this.f67160b * 2), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.f67159a.setColor(i);
        invalidate();
    }

    public C25880l0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public void m43567a(int i, int i2, int i3) {
        this.f67159a.setStroke(i, i2);
        this.f67159a.setCornerRadius(i3);
        invalidate();
    }

    public C25880l0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.f67159a = gradientDrawable;
        gradientDrawable.setStroke(0, -13421773);
        gradientDrawable.setColor(0);
        this.f67160b = (int) TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics());
    }
}
