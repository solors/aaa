package p1027wa;

import android.graphics.Paint;
import android.os.Build;
import android.text.style.ReplacementSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: wa.d */
/* loaded from: classes8.dex */
public abstract class PositionAwareReplacementSpan extends ReplacementSpan {
    /* renamed from: b */
    private final void m2163b(int i, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null && i == 0 && Build.VERSION.SDK_INT < 28) {
            fontMetricsInt.top = 0;
            fontMetricsInt.ascent = 0;
            fontMetricsInt.bottom = 0;
            fontMetricsInt.descent = 0;
            fontMetricsInt.leading = 0;
        }
    }

    /* renamed from: a */
    public abstract int mo2164a(@NotNull Paint paint, @NotNull CharSequence charSequence, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt);

    @Override // android.text.style.ReplacementSpan
    public final int getSize(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2, @Nullable Paint.FontMetricsInt fontMetricsInt) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        m2163b(i, fontMetricsInt);
        return mo2164a(paint, text, i, i2, fontMetricsInt);
    }
}
