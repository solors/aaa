package com.bytedance.sdk.component.adexpress.ldr;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.C7741PX;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: com.bytedance.sdk.component.adexpress.ldr.Ta */
/* loaded from: classes3.dex */
public class C7516Ta extends ImageView {

    /* renamed from: IL */
    private long f16337IL;

    /* renamed from: Kg */
    private float f16338Kg;

    /* renamed from: PX */
    private volatile boolean f16339PX;

    /* renamed from: Ta */
    private boolean f16340Ta;

    /* renamed from: VB */
    private int f16341VB;

    /* renamed from: WR */
    private float f16342WR;

    /* renamed from: bX */
    private int f16343bX;

    /* renamed from: bg */
    private Movie f16344bg;

    /* renamed from: eo */
    private int f16345eo;
    private AnimatedImageDrawable eqN;

    /* renamed from: iR */
    private float f16346iR;
    private boolean ldr;
    private boolean yDt;

    /* renamed from: zx */
    private boolean f16347zx;

    public C7516Ta(Context context) {
        super(context);
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        this.f16347zx = z;
        this.ldr = false;
        this.f16340Ta = true;
        this.yDt = true;
        m88627bg();
    }

    /* renamed from: IL */
    private void m88629IL() {
        if (this.f16344bg != null && !this.f16347zx && this.f16340Ta) {
            postInvalidateOnAnimation();
        }
    }

    /* renamed from: bX */
    private void m88628bX() {
        if (this.f16344bg == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f16337IL == 0) {
            this.f16337IL = uptimeMillis;
        }
        int duration = this.f16344bg.duration();
        if (duration == 0) {
            duration = 1000;
        }
        if (!this.yDt && Math.abs(duration - this.f16343bX) < 60) {
            this.f16343bX = duration;
            this.f16339PX = true;
            return;
        }
        this.f16343bX = (int) ((uptimeMillis - this.f16337IL) % duration);
    }

    private void setDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        setImageDrawable(drawable);
        if (Build.VERSION.SDK_INT >= 28 && (drawable instanceof AnimatedImageDrawable)) {
            AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) drawable;
            this.eqN = animatedImageDrawable;
            if (!this.f16339PX) {
                animatedImageDrawable.start();
            }
            if (!this.yDt) {
                animatedImageDrawable.setRepeatCount(0);
            }
        }
        m88629IL();
    }

    /* renamed from: bg */
    void m88627bg() {
        if (this.f16347zx) {
            return;
        }
        setLayerType(1, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f16344bg != null && !this.f16347zx) {
            try {
                if (!this.f16339PX) {
                    m88628bX();
                    m88626bg(canvas);
                    m88629IL();
                    return;
                }
                m88626bg(canvas);
                return;
            } catch (Throwable th) {
                C7741PX.m87871bg("GifView", "onDraw->Throwable->", th);
                return;
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f16344bg != null && !this.f16347zx) {
            this.f16346iR = (getWidth() - this.f16345eo) / 2.0f;
            this.f16338Kg = (getHeight() - this.f16341VB) / 2.0f;
        }
        if (getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f16340Ta = z2;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        Movie movie;
        float f;
        float f2;
        int size;
        int size2;
        super.onMeasure(i, i2);
        if (!this.f16347zx && (movie = this.f16344bg) != null) {
            int width = movie.width();
            int height = this.f16344bg.height();
            if (View.MeasureSpec.getMode(i) != 0 && width > (size2 = View.MeasureSpec.getSize(i))) {
                f = width / size2;
            } else {
                f = 1.0f;
            }
            if (View.MeasureSpec.getMode(i2) != 0 && height > (size = View.MeasureSpec.getSize(i2))) {
                f2 = height / size;
            } else {
                f2 = 1.0f;
            }
            float max = 1.0f / Math.max(f, f2);
            this.f16342WR = max;
            int i3 = (int) (width * max);
            this.f16345eo = i3;
            int i4 = (int) (height * max);
            this.f16341VB = i4;
            setMeasuredDimension(i3, i4);
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void onScreenStateChanged(int i) {
        super.onScreenStateChanged(i);
        if (this.f16344bg != null) {
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            this.f16340Ta = z;
            m88629IL();
        }
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (this.f16344bg != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f16340Ta = z;
            m88629IL();
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (this.f16344bg != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f16340Ta = z;
            m88629IL();
        }
    }

    public void setRepeatConfig(boolean z) {
        AnimatedImageDrawable animatedImageDrawable;
        this.yDt = z;
        if (!z) {
            try {
                if (Build.VERSION.SDK_INT >= 28 && (animatedImageDrawable = this.eqN) != null) {
                    animatedImageDrawable.setRepeatCount(0);
                }
            } catch (Exception e) {
                C7741PX.m87871bg("GifView", "setRepeatConfig error", e);
            }
        }
    }

    /* renamed from: bg */
    private void m88626bg(Canvas canvas) {
        Movie movie = this.f16344bg;
        if (movie == null) {
            return;
        }
        movie.setTime(this.f16343bX);
        float f = this.f16342WR;
        if (f == 0.0f) {
            canvas.scale(1.0f, 1.0f);
            this.f16344bg.draw(canvas, 0.0f, 0.0f);
        } else {
            canvas.scale(f, f);
            Movie movie2 = this.f16344bg;
            float f2 = this.f16346iR;
            float f3 = this.f16342WR;
            movie2.draw(canvas, f2 / f3, this.f16338Kg / f3);
        }
        canvas.restore();
    }
}
