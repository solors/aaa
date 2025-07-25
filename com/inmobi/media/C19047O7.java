package com.inmobi.media;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.inmobi.media.O7 */
/* loaded from: classes6.dex */
public final class C19047O7 extends View {

    /* renamed from: a */
    public Bitmap f47579a;

    /* renamed from: b */
    public Canvas f47580b;

    /* renamed from: c */
    public RectF f47581c;

    /* renamed from: d */
    public RectF f47582d;

    /* renamed from: e */
    public final Rect f47583e;

    /* renamed from: f */
    public long f47584f;

    /* renamed from: g */
    public final Paint f47585g;

    /* renamed from: h */
    public final Paint f47586h;

    /* renamed from: i */
    public final Paint f47587i;

    /* renamed from: j */
    public final Paint f47588j;

    /* renamed from: k */
    public final Paint f47589k;

    /* renamed from: l */
    public float f47590l;

    /* renamed from: m */
    public long f47591m;

    /* renamed from: n */
    public ValueAnimator f47592n;

    /* renamed from: o */
    public InterfaceC19034N7 f47593o;

    public C19047O7(Context context) {
        super(context);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-723724);
        this.f47585g = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setAntiAlias(true);
        this.f47589k = paint2;
        this.f47583e = new Rect();
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f47586h = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(0);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.f47587i = paint4;
        Paint paint5 = new Paint();
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setAntiAlias(true);
        paint5.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.f47588j = paint5;
    }

    /* renamed from: a */
    public final void m60831a() {
        InterfaceC19034N7 interfaceC19034N7 = this.f47593o;
        if (interfaceC19034N7 != null) {
            C19510w7 c19510w7 = (C19510w7) interfaceC19034N7;
            C19440r7 c19440r7 = c19510w7.f48825a.f48896p;
            if (c19440r7 != null) {
                C19007L7 timerAsset = c19510w7.f48826b;
                Intrinsics.checkNotNullParameter(timerAsset, "timerAsset");
                if (timerAsset.f47910j == 1) {
                    c19440r7.f48626b.mo59923a();
                }
            }
        }
        ValueAnimator valueAnimator = this.f47592n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f47592n = null;
    }

    /* renamed from: b */
    public final void m60830b() {
        ValueAnimator valueAnimator = this.f47592n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f47591m = valueAnimator.getCurrentPlayTime();
            valueAnimator.cancel();
        }
    }

    /* renamed from: c */
    public final void m60829c() {
        ValueAnimator valueAnimator = this.f47592n;
        if (valueAnimator != null && !valueAnimator.isRunning()) {
            valueAnimator.setCurrentPlayTime(this.f47591m);
            valueAnimator.start();
        }
    }

    /* renamed from: d */
    public final void m60828d() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(TimeUnit.SECONDS.toMillis(this.f47584f));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new C19021M7(this));
        this.f47592n = ofFloat;
        ofFloat.start();
    }

    /* renamed from: e */
    public final void m60827e() {
        ValueAnimator valueAnimator = this.f47592n;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            valueAnimator.setCurrentPlayTime(this.f47584f * 1000);
            this.f47590l = 360 * 1.0f;
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        Canvas canvas3;
        Object animatedValue;
        Object animatedValue2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Canvas canvas4 = this.f47580b;
        if (canvas4 != null) {
            canvas4.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int width = getWidth() / 2;
        int height = getHeight() / 2;
        int min = Math.min(width, height);
        C19352l3 c19352l3 = AbstractC19338k3.f48430a;
        int m60132b = (int) (AbstractC19338k3.m60132b() * ((int) (getWidth() * 7.0f * 0.007f)));
        float f = width;
        float f2 = height;
        canvas.drawCircle(f, f2, min, this.f47585g);
        canvas.drawCircle(f, f2, min - m60132b, this.f47588j);
        ValueAnimator valueAnimator = this.f47592n;
        if (valueAnimator != null) {
            int currentPlayTime = (int) (this.f47584f - (valueAnimator.getCurrentPlayTime() / 1000));
            Intrinsics.m17073h(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue).floatValue() >= 1.0d) {
                currentPlayTime = 0;
            }
            Paint paint = this.f47589k;
            Rect rect = this.f47583e;
            String valueOf = String.valueOf(currentPlayTime);
            paint.getTextBounds(valueOf, 0, valueOf.length(), rect);
            canvas.drawText(valueOf, getWidth() / 2, (getHeight() / 2) + (((paint.descent() - paint.ascent()) / 2) - paint.descent()), paint);
            Intrinsics.m17073h(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Float");
            if (((Float) animatedValue2).floatValue() >= 1.0d) {
                m60831a();
            }
        }
        float f3 = this.f47590l;
        if (f3 > 0.0f) {
            RectF rectF = this.f47581c;
            if (rectF != null && (canvas3 = this.f47580b) != null) {
                canvas3.drawArc(rectF, 270.0f, f3, true, this.f47586h);
            }
            RectF rectF2 = this.f47582d;
            if (rectF2 != null && (canvas2 = this.f47580b) != null) {
                canvas2.drawOval(rectF2, this.f47587i);
            }
        }
        Bitmap bitmap = this.f47579a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
            createBitmap.eraseColor(0);
            this.f47579a = createBitmap;
            this.f47580b = new Canvas(createBitmap);
        }
        super.onSizeChanged(i, i2, i3, i4);
        C19352l3 c19352l3 = AbstractC19338k3.f48430a;
        float m60132b = (int) (AbstractC19338k3.m60132b() * ((int) (getWidth() * 4.0f * 0.007f)));
        float m60132b2 = AbstractC19338k3.m60132b();
        float m60132b3 = (int) (AbstractC19338k3.m60132b() * ((int) (getWidth() * 5.0f * 0.007f)));
        float m60132b4 = AbstractC19338k3.m60132b();
        RectF rectF = new RectF(m60132b3, m60132b3, getWidth() - m60132b3, getHeight() - m60132b3);
        this.f47581c = rectF;
        this.f47582d = new RectF(rectF.left + m60132b, rectF.top + m60132b, rectF.right - m60132b, rectF.bottom - m60132b);
        this.f47588j.setStrokeWidth((int) (m60132b4 * ((int) (getWidth() * 1.5f * 0.007f))));
        this.f47589k.setTextSize((int) (m60132b2 * ((int) (getWidth() * 14.0f * 0.007f))));
        invalidate();
    }

    public final void setTimerEventsListener(@Nullable InterfaceC19034N7 interfaceC19034N7) {
        this.f47593o = interfaceC19034N7;
    }

    public final void setTimerValue(long j) {
        this.f47584f = j;
    }
}
