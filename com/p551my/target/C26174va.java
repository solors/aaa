package com.p551my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.va */
/* loaded from: classes7.dex */
public class C26174va extends View {

    /* renamed from: a */
    public final Paint f68095a;

    /* renamed from: b */
    public final Paint f68096b;

    /* renamed from: c */
    public final Paint f68097c;

    /* renamed from: d */
    public final C25869ka f68098d;

    /* renamed from: e */
    public RectF f68099e;

    /* renamed from: f */
    public long f68100f;

    /* renamed from: g */
    public float f68101g;

    /* renamed from: h */
    public float f68102h;

    /* renamed from: i */
    public float f68103i;

    /* renamed from: j */
    public boolean f68104j;

    /* renamed from: k */
    public int f68105k;

    public C26174va(Context context) {
        super(context);
        this.f68095a = new Paint();
        this.f68096b = new Paint();
        this.f68097c = new Paint();
        this.f68099e = new RectF();
        this.f68100f = 0L;
        this.f68101g = 0.0f;
        this.f68102h = 0.0f;
        this.f68103i = 230.0f;
        this.f68104j = false;
        this.f68098d = C25869ka.m43585e(context);
    }

    /* renamed from: a */
    public final void m42647a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f68099e = new RectF(getPaddingLeft() + this.f68098d.m43598b(1), paddingTop + this.f68098d.m43598b(1), (i - getPaddingRight()) - this.f68098d.m43598b(1), (i2 - paddingBottom) - this.f68098d.m43598b(1));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f68099e, this.f68096b);
        if (this.f68101g != this.f68102h) {
            this.f68101g = Math.min(this.f68101g + ((((float) (SystemClock.uptimeMillis() - this.f68100f)) / 1000.0f) * this.f68103i), this.f68102h);
            this.f68100f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.f68101g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.f68099e, -90.0f, f, false, this.f68095a);
        this.f68097c.setColor(-1);
        this.f68097c.setTextSize(this.f68098d.m43598b(12));
        this.f68097c.setTextAlign(Paint.Align.CENTER);
        this.f68097c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f68105k), (int) this.f68099e.centerX(), (int) (this.f68099e.centerY() - ((this.f68097c.descent() + this.f68097c.ascent()) / 2.0f)), this.f68097c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int m43598b = this.f68098d.m43598b(28) + getPaddingLeft() + getPaddingRight();
        int m43598b2 = this.f68098d.m43598b(28) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            m43598b = size;
        } else if (mode == Integer.MIN_VALUE) {
            m43598b = Math.min(m43598b, size);
        }
        if (mode2 != 1073741824 && mode != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                m43598b2 = Math.min(m43598b2, size2);
            }
        } else {
            m43598b2 = size2;
        }
        setMeasuredDimension(m43598b, m43598b2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m42647a(i, i2);
        m42648a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f68100f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f68105k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f68103i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f68104j) {
            this.f68101g = 0.0f;
            this.f68104j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f68102h;
        if (f == f2) {
            return;
        }
        if (this.f68101g == f2) {
            this.f68100f = SystemClock.uptimeMillis();
        }
        this.f68102h = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    /* renamed from: a */
    public final void m42648a() {
        this.f68095a.setColor(-1);
        this.f68095a.setAntiAlias(true);
        this.f68095a.setStyle(Paint.Style.STROKE);
        this.f68095a.setStrokeWidth(this.f68098d.m43598b(1));
        this.f68096b.setColor(-2013265920);
        this.f68096b.setAntiAlias(true);
        this.f68096b.setStyle(Paint.Style.FILL);
        this.f68096b.setStrokeWidth(this.f68098d.m43598b(4));
    }
}
