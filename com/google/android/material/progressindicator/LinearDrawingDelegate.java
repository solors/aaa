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
public final class LinearDrawingDelegate extends DrawingDelegate<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    private float f38063c;

    /* renamed from: d */
    private float f38064d;

    /* renamed from: e */
    private float f38065e;

    public LinearDrawingDelegate(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f38063c = 300.0f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    /* renamed from: a */
    public void mo71153a(@NonNull Canvas canvas, @NonNull Paint paint) {
        int compositeARGBWithAlpha = MaterialColors.compositeARGBWithAlpha(((LinearProgressIndicatorSpec) this.f38056a).trackColor, this.f38057b.getAlpha());
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(compositeARGBWithAlpha);
        float f = this.f38063c;
        float f2 = this.f38064d;
        RectF rectF = new RectF((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
        float f3 = this.f38065e;
        canvas.drawRoundRect(rectF, f3, f3, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        this.f38063c = rect.width();
        float f2 = ((LinearProgressIndicatorSpec) this.f38056a).trackThickness;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - ((LinearProgressIndicatorSpec) this.f38056a).trackThickness) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f38056a).f38087a) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f38057b.isShowing() && ((LinearProgressIndicatorSpec) this.f38056a).showAnimationBehavior == 1) || (this.f38057b.isHiding() && ((LinearProgressIndicatorSpec) this.f38056a).hideAnimationBehavior == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f38057b.isShowing() || this.f38057b.isHiding()) {
            canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f38056a).trackThickness * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f38063c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f38056a;
        this.f38064d = ((LinearProgressIndicatorSpec) s).trackThickness * f;
        this.f38065e = ((LinearProgressIndicatorSpec) s).trackCornerRadius * f;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2, @ColorInt int i) {
        if (f == f2) {
            return;
        }
        float f3 = this.f38063c;
        float f4 = this.f38065e;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(i);
        float f5 = this.f38064d;
        RectF rectF = new RectF(((-f3) / 2.0f) + (f * (f3 - (f4 * 2.0f))), (-f5) / 2.0f, ((-f3) / 2.0f) + (f2 * (f3 - (f4 * 2.0f))) + (f4 * 2.0f), f5 / 2.0f);
        float f6 = this.f38065e;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredHeight() {
        return ((LinearProgressIndicatorSpec) this.f38056a).trackThickness;
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    public int getPreferredWidth() {
        return -1;
    }
}
