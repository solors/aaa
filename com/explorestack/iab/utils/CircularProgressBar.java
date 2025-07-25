package com.explorestack.iab.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes3.dex */
public final class CircularProgressBar extends ProgressBar implements InterfaceC10506c {
    @VisibleForTesting

    /* renamed from: b */
    C10518i f23987b;
    @VisibleForTesting

    /* renamed from: c */
    final Paint f23988c;

    public CircularProgressBar(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f23988c = paint;
        paint.setColor(0);
        m79405a(context);
    }

    /* renamed from: a */
    void m79405a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int m79302o = C10512g.m79302o(context, 8.0f);
        setPadding(m79302o, m79302o, m79302o, m79302o);
        C10518i c10518i = new C10518i(context);
        this.f23987b = c10518i;
        c10518i.m79266q(f * 4.0f);
        this.f23987b.m79272k(SupportMenu.CATEGORY_MASK);
        this.f23987b.m79275h(Paint.Cap.ROUND);
        setIndeterminateDrawable(this.f23987b);
        setIndeterminate(true);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, this.f23988c);
        super.onDraw(canvas);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f23987b.m79278e((Math.min((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) / 2.0f) - this.f23987b.m79282a());
    }

    public void setColorSchemeColors(int... iArr) {
        this.f23987b.m79272k(iArr);
    }

    public void setProgressBackgroundColor(int i) {
        this.f23988c.setColor(i);
    }

    @Override // com.explorestack.iab.utils.InterfaceC10506c
    public void setStyle(@NonNull C10507d c10507d) {
        this.f23987b.m79266q(c10507d.m79355w(getContext()).floatValue());
        this.f23987b.m79272k(c10507d.m79356v().intValue());
        this.f23988c.setColor(c10507d.m79371g().intValue());
        postInvalidate();
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f23988c = paint;
        paint.setColor(0);
        m79405a(context);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(1);
        this.f23988c = paint;
        paint.setColor(0);
        m79405a(context);
    }
}
