package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class CircularDrawingDelegate extends DrawingDelegate<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    private int f38014c;

    /* renamed from: d */
    private float f38015d;

    /* renamed from: e */
    private float f38016e;

    /* renamed from: f */
    private float f38017f;

    public CircularDrawingDelegate(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.f38014c = 1;
    }

    /* renamed from: d */
    private void m71198d(Canvas canvas, Paint paint, float f, float f2, float f3) {
        canvas.save();
        canvas.rotate(f3);
        float f4 = this.f38017f;
        float f5 = f / 2.0f;
        canvas.drawRoundRect(new RectF(f4 - f5, f2, f4 + f5, -f2), f2, f2, paint);
        canvas.restore();
    }

    /* renamed from: e */
    private int m71197e() {
        S s = this.f38056a;
        return ((CircularProgressIndicatorSpec) s).indicatorSize + (((CircularProgressIndicatorSpec) s).indicatorInset * 2);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: a */
    public void mo71153a(@NonNull Canvas canvas, @NonNull Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((CircularProgressIndicatorSpec) this.f38056a).trackColor, this.f38057b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        paint.setStrokeWidth(this.f38015d);
        float f = this.f38017f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        S s;
        int i;
        float width = rect.width() / getPreferredWidth();
        float height = rect.height() / getPreferredHeight();
        S s2 = this.f38056a;
        float f2 = (((CircularProgressIndicatorSpec) s2).indicatorSize / 2.0f) + ((CircularProgressIndicatorSpec) s2).indicatorInset;
        canvas.translate((f2 * width) + rect.left, (f2 * height) + rect.top);
        canvas.scale(width, height);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        if (((CircularProgressIndicatorSpec) this.f38056a).indicatorDirection == 0) {
            i = 1;
        } else {
            i = -1;
        }
        this.f38014c = i;
        this.f38015d = ((CircularProgressIndicatorSpec) s).trackThickness * f;
        this.f38016e = ((CircularProgressIndicatorSpec) s).trackCornerRadius * f;
        this.f38017f = (((CircularProgressIndicatorSpec) s).indicatorSize - ((CircularProgressIndicatorSpec) s).trackThickness) / 2.0f;
        if ((this.f38057b.isShowing() && ((CircularProgressIndicatorSpec) this.f38056a).showAnimationBehavior == 2) || (this.f38057b.isHiding() && ((CircularProgressIndicatorSpec) this.f38056a).hideAnimationBehavior == 1)) {
            this.f38017f += ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f38056a).trackThickness) / 2.0f;
        } else if ((this.f38057b.isShowing() && ((CircularProgressIndicatorSpec) this.f38056a).showAnimationBehavior == 1) || (this.f38057b.isHiding() && ((CircularProgressIndicatorSpec) this.f38056a).hideAnimationBehavior == 2)) {
            this.f38017f -= ((1.0f - f) * ((CircularProgressIndicatorSpec) this.f38056a).trackThickness) / 2.0f;
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2, @ColorInt int i) {
        float f3;
        if (f == f2) {
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f38015d);
        int i2 = this.f38014c;
        float f4 = f * 360.0f * i2;
        if (f2 >= f) {
            f3 = f2 - f;
        } else {
            f3 = (1.0f + f2) - f;
        }
        float f5 = f3 * 360.0f * i2;
        float f6 = this.f38017f;
        canvas.drawArc(new RectF(-f6, -f6, f6, f6), f4, f5, false, paint);
        if (this.f38016e > 0.0f && Math.abs(f5) < 360.0f) {
            paint.setStyle(Paint.Style.FILL);
            m71198d(canvas, paint, this.f38015d, this.f38016e, f4);
            m71198d(canvas, paint, this.f38015d, this.f38016e, f4 + f5);
        }
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return m71197e();
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return m71197e();
    }
}
