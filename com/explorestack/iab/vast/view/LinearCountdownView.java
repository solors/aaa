package com.explorestack.iab.vast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.explorestack.iab.utils.C10504a;
import com.explorestack.iab.utils.C10507d;
import com.explorestack.iab.utils.C10512g;
import com.explorestack.iab.utils.InterfaceC10506c;

/* loaded from: classes3.dex */
public class LinearCountdownView extends View implements InterfaceC10506c {

    /* renamed from: b */
    private final Paint f24307b;

    /* renamed from: c */
    private float f24308c;

    /* renamed from: d */
    private float f24309d;

    /* renamed from: f */
    private int f24310f;

    /* renamed from: g */
    private int f24311g;

    public LinearCountdownView(Context context) {
        super(context);
        this.f24307b = new Paint(1);
        this.f24308c = 0.0f;
        this.f24309d = 15.0f;
        this.f24310f = C10504a.f23989a;
        this.f24311g = 0;
        m78957a();
    }

    /* renamed from: a */
    private void m78957a() {
        this.f24309d = C10512g.m79302o(getContext(), 4.0f);
    }

    public void changePercentage(float f) {
        this.f24308c = f;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        float measuredHeight = (getMeasuredHeight() / 2.0f) + getPaddingTop();
        this.f24307b.setStrokeWidth(this.f24309d);
        this.f24307b.setColor(this.f24311g);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + width, measuredHeight, this.f24307b);
        this.f24307b.setColor(this.f24310f);
        canvas.drawLine(getPaddingLeft(), measuredHeight, getPaddingLeft() + ((width * this.f24308c) / 100.0f), measuredHeight, this.f24307b);
    }

    @Override // com.explorestack.iab.utils.InterfaceC10506c
    public void setStyle(@NonNull C10507d c10507d) {
        this.f24310f = c10507d.m79356v().intValue();
        this.f24311g = c10507d.m79371g().intValue();
        this.f24309d = c10507d.m79355w(getContext()).floatValue();
        setAlpha(c10507d.m79361q().floatValue());
        postInvalidate();
    }

    public LinearCountdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24307b = new Paint(1);
        this.f24308c = 0.0f;
        this.f24309d = 15.0f;
        this.f24310f = C10504a.f23989a;
        this.f24311g = 0;
        m78957a();
    }
}
