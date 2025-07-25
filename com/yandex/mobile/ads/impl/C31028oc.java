package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import be.MathJVM;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.oc */
/* loaded from: classes8.dex */
public final class C31028oc extends ImageSpan {

    /* renamed from: a */
    private final int f83401a;
    @Nullable

    /* renamed from: b */
    private WeakReference<Drawable> f83402b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31028oc(@NotNull Drawable drawable) {
        super(drawable);
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f83401a = -1;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(@NotNull Canvas canvas, @Nullable CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Drawable drawable;
        int m103791d;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.f83401a == -1) {
            WeakReference<Drawable> weakReference = this.f83402b;
            if (weakReference != null) {
                drawable = weakReference.get();
            } else {
                drawable = null;
            }
            if (drawable == null) {
                drawable = getDrawable();
                this.f83402b = new WeakReference<>(drawable);
                Intrinsics.m17074g(drawable);
            }
            canvas.save();
            m103791d = MathJVM.m103791d(((i3 + i5) / 2.0f) - (drawable.getBounds().height() / 2.0f));
            canvas.translate(f, m103791d);
            drawable.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @Nullable CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(paint, "paint");
        WeakReference<Drawable> weakReference = this.f83402b;
        if (weakReference != null) {
            drawable = weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = getDrawable();
            this.f83402b = new WeakReference<>(drawable);
            Intrinsics.m17074g(drawable);
        }
        Rect bounds = drawable.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return bounds.right;
    }
}
