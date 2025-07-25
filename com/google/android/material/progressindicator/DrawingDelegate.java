package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;

/* loaded from: classes5.dex */
abstract class DrawingDelegate<S extends BaseProgressIndicatorSpec> {

    /* renamed from: a */
    S f38056a;

    /* renamed from: b */
    protected DrawableWithAnimatedVisibilityChange f38057b;

    public DrawingDelegate(S s) {
        this.f38056a = s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo71153a(@NonNull Canvas canvas, @NonNull Paint paint);

    abstract void adjustCanvas(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m105511to = 1.0d) float f);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public void m71162b(@NonNull DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.f38057b = drawableWithAnimatedVisibilityChange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m71161c(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, m105511to = 1.0d) float f) {
        this.f38056a.mo71127c();
        adjustCanvas(canvas, rect, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void fillIndicator(@NonNull Canvas canvas, @NonNull Paint paint, @FloatRange(from = 0.0d, m105511to = 1.0d) float f, @FloatRange(from = 0.0d, m105511to = 1.0d) float f2, @ColorInt int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredHeight();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int getPreferredWidth();
}
