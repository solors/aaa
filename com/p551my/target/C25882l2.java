package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.my.target.l2 */
/* loaded from: classes7.dex */
public class C25882l2 extends View {

    /* renamed from: a */
    public final Rect f67163a;

    /* renamed from: b */
    public final Paint f67164b;

    /* renamed from: c */
    public final ColorFilter f67165c;

    /* renamed from: d */
    public final float f67166d;

    /* renamed from: e */
    public int f67167e;

    /* renamed from: f */
    public Bitmap f67168f;

    /* renamed from: g */
    public int f67169g;

    /* renamed from: h */
    public int f67170h;

    public C25882l2(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f67164b = paint;
        paint.setFilterBitmap(true);
        this.f67166d = C25869ka.m43615a();
        this.f67167e = C25869ka.m43610a(10, context);
        this.f67163a = new Rect();
        this.f67165c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void m43563a(Bitmap bitmap, boolean z) {
        int i;
        this.f67168f = bitmap;
        if (bitmap != null) {
            if (z) {
                float f = 1.0f;
                if (this.f67166d > 1.0f) {
                    f = 2.0f;
                }
                this.f67170h = (int) ((bitmap.getHeight() / f) * this.f67166d);
                i = (int) ((this.f67168f.getWidth() / f) * this.f67166d);
            } else {
                this.f67169g = bitmap.getWidth();
                this.f67170h = this.f67168f.getHeight();
                requestLayout();
            }
        } else {
            i = 0;
            this.f67170h = 0;
        }
        this.f67169g = i;
        requestLayout();
    }

    public int getPadding() {
        return this.f67167e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f67168f != null) {
            Rect rect = this.f67163a;
            int i = this.f67167e;
            rect.left = i;
            rect.top = i;
            rect.right = getMeasuredWidth() - this.f67167e;
            this.f67163a.bottom = getMeasuredHeight() - this.f67167e;
            canvas.drawBitmap(this.f67168f, (Rect) null, this.f67163a, this.f67164b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = this.f67167e * 2;
        int i6 = size - i5;
        int i7 = size2 - i5;
        if (this.f67168f != null && (i3 = this.f67169g) > 0 && (i4 = this.f67170h) > 0) {
            float f = i3;
            float f2 = i4;
            float f3 = f / f2;
            if (mode == 1073741824 && mode2 == 1073741824) {
                setMeasuredDimension(size, size2);
                return;
            }
            if (mode == 0 && mode2 == 0) {
                i6 = i3;
                i7 = i4;
            } else if (mode == 0) {
                i6 = (int) (i7 * f3);
            } else {
                float f4 = i6;
                if (mode2 != 0) {
                    float f5 = f4 / f;
                    float f6 = i7;
                    if (Math.min(f5, f6 / f2) != f5 || f3 <= 0.0f) {
                        i6 = (int) (f6 * f3);
                    }
                }
                i7 = (int) (f4 / f3);
            }
            int i8 = this.f67167e * 2;
            setMeasuredDimension(i6 + i8, i7 + i8);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Paint paint;
        ColorFilter colorFilter;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 3) {
                    return super.onTouchEvent(motionEvent);
                }
            } else if (motionEvent.getX() >= 0.0f && motionEvent.getX() <= getMeasuredWidth() && motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                performClick();
            }
            paint = this.f67164b;
            colorFilter = null;
        } else {
            paint = this.f67164b;
            colorFilter = this.f67165c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }

    public void setPadding(int i) {
        this.f67167e = i;
    }
}
