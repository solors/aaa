package p1027wa;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.annotation.CallSuper;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: wa.b */
/* loaded from: classes8.dex */
public final class ImagePlaceholderSpan extends PositionAwareReplacementSpan {

    /* renamed from: b */
    private final int f117154b;

    /* renamed from: c */
    private final int f117155c;

    /* renamed from: d */
    private final int f117156d;

    /* renamed from: f */
    private final int f117157f;

    public ImagePlaceholderSpan(int i, int i2, int i3, int i4) {
        this.f117154b = i;
        this.f117155c = i2;
        this.f117156d = i3;
        this.f117157f = i4;
    }

    /* renamed from: c */
    private final float m2166c(int i, Paint paint) {
        float f;
        int i2 = this.f117157f;
        if (i2 > 0) {
            f = i2 / paint.getTextSize();
        } else {
            f = 1.0f;
        }
        return (((paint.ascent() + paint.descent()) / 2.0f) * f) - ((-i) / 2.0f);
    }

    @Override // p1027wa.PositionAwareReplacementSpan
    @CallSuper
    /* renamed from: a */
    public int mo2164a(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        int m103791d;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        if (fontMetricsInt != null && this.f117156d <= 0) {
            m103791d = MathJVM.m103791d(m2166c(this.f117155c, paint));
            int i3 = this.f117155c;
            int i4 = (-i3) + m103791d;
            int i5 = fontMetricsInt.top;
            int i6 = fontMetricsInt.ascent;
            fontMetricsInt.ascent = Math.min(i4, i6);
            int max = Math.max(i3 + i4, fontMetricsInt.descent);
            fontMetricsInt.descent = max;
            fontMetricsInt.top = fontMetricsInt.ascent + (i5 - i6);
            fontMetricsInt.bottom = max + (fontMetricsInt.bottom - fontMetricsInt.descent);
            return this.f117154b;
        }
        return this.f117154b;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int i, int i2, float f, int i3, int i4, int i5, @NotNull Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
    }
}
