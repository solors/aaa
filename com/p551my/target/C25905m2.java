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

/* renamed from: com.my.target.m2 */
/* loaded from: classes7.dex */
public class C25905m2 extends View {

    /* renamed from: a */
    public final Rect f67247a;

    /* renamed from: b */
    public final Paint f67248b;

    /* renamed from: c */
    public final ColorFilter f67249c;

    /* renamed from: d */
    public final float f67250d;

    /* renamed from: e */
    public final int f67251e;

    /* renamed from: f */
    public Bitmap f67252f;

    /* renamed from: g */
    public int f67253g;

    /* renamed from: h */
    public int f67254h;

    public C25905m2(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f67248b = paint;
        paint.setFilterBitmap(true);
        this.f67250d = C25869ka.m43615a();
        this.f67251e = C25869ka.m43610a(10, context);
        this.f67247a = new Rect();
        this.f67249c = new LightingColorFilter(-3355444, 1);
    }

    /* renamed from: a */
    public void m43472a(Bitmap bitmap, boolean z) {
        int i;
        this.f67252f = bitmap;
        if (bitmap != null) {
            if (z) {
                float f = 1.0f;
                if (this.f67250d > 1.0f) {
                    f = 2.0f;
                }
                this.f67254h = (int) ((bitmap.getHeight() / f) * this.f67250d);
                i = (int) ((this.f67252f.getWidth() / f) * this.f67250d);
            } else {
                this.f67253g = bitmap.getWidth();
                this.f67254h = this.f67252f.getHeight();
                int i2 = this.f67253g;
                int i3 = this.f67251e * 2;
                setMeasuredDimension(i2 + i3, this.f67254h + i3);
                requestLayout();
            }
        } else {
            i = 0;
            this.f67254h = 0;
        }
        this.f67253g = i;
        int i22 = this.f67253g;
        int i32 = this.f67251e * 2;
        setMeasuredDimension(i22 + i32, this.f67254h + i32);
        requestLayout();
    }

    public int getPadding() {
        return this.f67251e;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.f67252f;
        if (bitmap != null) {
            Rect rect = this.f67247a;
            int i = this.f67251e;
            rect.left = i;
            rect.top = i;
            rect.right = this.f67253g + i;
            rect.bottom = this.f67254h + i;
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.f67248b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
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
            paint = this.f67248b;
            colorFilter = null;
        } else {
            paint = this.f67248b;
            colorFilter = this.f67249c;
        }
        paint.setColorFilter(colorFilter);
        invalidate();
        return true;
    }
}
