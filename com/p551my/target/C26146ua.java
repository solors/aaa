package com.p551my.target;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;

/* renamed from: com.my.target.ua */
/* loaded from: classes7.dex */
public class C26146ua extends View {

    /* renamed from: a */
    public final Paint f68011a;

    /* renamed from: b */
    public final Paint f68012b;

    /* renamed from: c */
    public final Paint f68013c;

    /* renamed from: d */
    public final C25869ka f68014d;

    /* renamed from: e */
    public RectF f68015e;

    /* renamed from: f */
    public long f68016f;

    /* renamed from: g */
    public float f68017g;

    /* renamed from: h */
    public float f68018h;

    /* renamed from: i */
    public float f68019i;

    /* renamed from: j */
    public boolean f68020j;

    /* renamed from: k */
    public int f68021k;

    /* renamed from: l */
    public int f68022l;

    public C26146ua(Context context) {
        super(context);
        this.f68011a = new Paint();
        this.f68012b = new Paint();
        this.f68013c = new Paint();
        this.f68015e = new RectF();
        this.f68016f = 0L;
        this.f68017g = 0.0f;
        this.f68018h = 0.0f;
        this.f68019i = 230.0f;
        this.f68020j = false;
        C25869ka m43585e = C25869ka.m43585e(context);
        this.f68014d = m43585e;
        this.f68022l = m43585e.m43598b(28);
    }

    /* renamed from: a */
    public final void m42742a(int i, int i2) {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        this.f68015e = new RectF(getPaddingLeft() + this.f68014d.m43598b(1), paddingTop + this.f68014d.m43598b(1), (i - getPaddingRight()) - this.f68014d.m43598b(1), (i2 - paddingBottom) - this.f68014d.m43598b(1));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        canvas.drawOval(this.f68015e, this.f68012b);
        if (this.f68017g != this.f68018h) {
            this.f68017g = Math.min(this.f68017g + ((((float) (SystemClock.uptimeMillis() - this.f68016f)) / 1000.0f) * this.f68019i), this.f68018h);
            this.f68016f = SystemClock.uptimeMillis();
            z = true;
        } else {
            z = false;
        }
        float f = this.f68017g;
        if (isInEditMode()) {
            f = 360.0f;
        }
        canvas.drawArc(this.f68015e, -90.0f, f, false, this.f68011a);
        this.f68013c.setColor(-1);
        this.f68013c.setTextSize(this.f68014d.m43598b(12));
        this.f68013c.setTextAlign(Paint.Align.CENTER);
        this.f68013c.setAntiAlias(true);
        canvas.drawText(String.valueOf(this.f68021k), (int) this.f68015e.centerX(), (int) (this.f68015e.centerY() - ((this.f68013c.descent() + this.f68013c.ascent()) / 2.0f)), this.f68013c);
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft = this.f68022l + getPaddingLeft() + getPaddingRight();
        int paddingTop = this.f68022l + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                paddingLeft = size;
            }
        } else {
            paddingLeft = Math.min(paddingLeft, size);
        }
        if (mode2 != 1073741824 && mode != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                paddingTop = Math.min(paddingTop, size2);
            }
        } else {
            paddingTop = size2;
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m42742a(i, i2);
        m42743a();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.f68016f = SystemClock.uptimeMillis();
        }
    }

    public void setDigit(int i) {
        this.f68021k = i;
    }

    public void setMax(float f) {
        if (f > 0.0f) {
            this.f68019i = 360.0f / f;
        }
    }

    public void setProgress(float f) {
        if (this.f68020j) {
            this.f68017g = 0.0f;
            this.f68020j = false;
        }
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = this.f68018h;
        if (f == f2) {
            return;
        }
        if (this.f68017g == f2) {
            this.f68016f = SystemClock.uptimeMillis();
        }
        this.f68018h = Math.min(f * 360.0f, 360.0f);
        invalidate();
    }

    public void setSize(int i) {
        this.f68022l = i;
    }

    /* renamed from: a */
    public final void m42743a() {
        this.f68011a.setColor(-1);
        this.f68011a.setAntiAlias(true);
        this.f68011a.setStyle(Paint.Style.STROKE);
        this.f68011a.setStrokeWidth(this.f68014d.m43598b(1));
        this.f68012b.setColor(-2013265920);
        this.f68012b.setAntiAlias(true);
        this.f68012b.setStyle(Paint.Style.FILL);
        this.f68012b.setStrokeWidth(this.f68014d.m43598b(4));
    }
}
