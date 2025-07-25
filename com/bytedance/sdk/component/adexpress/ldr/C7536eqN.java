package com.bytedance.sdk.component.adexpress.ldr;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.ldr.eqN */
/* loaded from: classes3.dex */
public class C7536eqN extends View {

    /* renamed from: IL */
    private int f16398IL;

    /* renamed from: Kg */
    private List<Integer> f16399Kg;

    /* renamed from: PX */
    private float f16400PX;

    /* renamed from: Ta */
    private float f16401Ta;

    /* renamed from: VB */
    private Paint f16402VB;

    /* renamed from: WR */
    private List<Integer> f16403WR;

    /* renamed from: bX */
    private float f16404bX;

    /* renamed from: bg */
    private int f16405bg;

    /* renamed from: eo */
    private Paint f16406eo;
    private int eqN;

    /* renamed from: iR */
    private boolean f16407iR;
    private int ldr;
    private int yDt;

    /* renamed from: zx */
    private float f16408zx;

    public C7536eqN(Context context) {
        this(context, null);
    }

    /* renamed from: bX */
    private void m88599bX() {
        Paint paint = new Paint();
        this.f16406eo = paint;
        paint.setAntiAlias(true);
        this.f16406eo.setStrokeWidth(this.yDt);
        this.f16399Kg.add(255);
        this.f16403WR.add(0);
        Paint paint2 = new Paint();
        this.f16402VB = paint2;
        paint2.setAntiAlias(true);
        this.f16402VB.setColor(Color.parseColor("#0FFFFFFF"));
        this.f16402VB.setStyle(Paint.Style.FILL);
    }

    /* renamed from: IL */
    public void m88600IL() {
        this.f16407iR = false;
        this.f16403WR.clear();
        this.f16399Kg.clear();
        this.f16399Kg.add(255);
        this.f16403WR.add(0);
        invalidate();
    }

    /* renamed from: bg */
    public void m88598bg() {
        this.f16407iR = true;
        invalidate();
    }

    @Override // android.view.View
    public void invalidate() {
        if (hasWindowFocus()) {
            super.invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f16406eo.setShader(new LinearGradient(this.f16400PX, 0.0f, this.f16401Ta, getMeasuredHeight(), -1, (int) ViewCompat.MEASURED_SIZE_MASK, Shader.TileMode.CLAMP));
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= this.f16399Kg.size()) {
                break;
            }
            Integer num = this.f16399Kg.get(i);
            this.f16406eo.setAlpha(num.intValue());
            Integer num2 = this.f16403WR.get(i);
            if (this.f16404bX + num2.intValue() < this.f16408zx) {
                canvas.drawCircle(this.f16400PX, this.f16401Ta, this.f16404bX + num2.intValue(), this.f16406eo);
            }
            if (num.intValue() > 0 && num2.intValue() < this.f16408zx) {
                List<Integer> list = this.f16399Kg;
                if (num.intValue() - this.ldr > 0) {
                    i2 = num.intValue() - (this.ldr * 3);
                }
                list.set(i, Integer.valueOf(i2));
                this.f16403WR.set(i, Integer.valueOf(num2.intValue() + this.ldr));
            }
            i++;
        }
        List<Integer> list2 = this.f16403WR;
        if (list2.get(list2.size() - 1).intValue() >= this.f16408zx / this.eqN) {
            this.f16399Kg.add(255);
            this.f16403WR.add(0);
        }
        if (this.f16403WR.size() >= 3) {
            this.f16403WR.remove(0);
            this.f16399Kg.remove(0);
        }
        this.f16406eo.setAlpha(255);
        this.f16406eo.setColor(this.f16398IL);
        canvas.drawCircle(this.f16400PX, this.f16401Ta, this.f16404bX, this.f16402VB);
        if (this.f16407iR) {
            invalidate();
        }
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
        float f = i / 2.0f;
        this.f16400PX = f;
        this.f16401Ta = i2 / 2.0f;
        float f2 = f - (this.yDt / 2.0f);
        this.f16408zx = f2;
        this.f16404bX = f2 / 4.0f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            invalidate();
        }
    }

    public void setColor(int i) {
        this.f16405bg = i;
    }

    public void setCoreColor(int i) {
        this.f16398IL = i;
    }

    public void setCoreRadius(int i) {
        this.f16404bX = i;
    }

    public void setDiffuseSpeed(int i) {
        this.ldr = i;
    }

    public void setDiffuseWidth(int i) {
        this.eqN = i;
    }

    public void setMaxWidth(int i) {
        this.f16408zx = i;
    }

    public C7536eqN(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public C7536eqN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16405bg = -1;
        this.f16398IL = SupportMenu.CATEGORY_MASK;
        this.f16404bX = 18.0f;
        this.eqN = 3;
        this.f16408zx = 50.0f;
        this.ldr = 2;
        this.f16407iR = false;
        this.f16399Kg = new ArrayList();
        this.f16403WR = new ArrayList();
        this.yDt = 24;
        m88599bX();
    }
}
