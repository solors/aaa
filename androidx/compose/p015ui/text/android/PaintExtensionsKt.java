package androidx.compose.p015ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.VisibleForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PaintExtensions.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.PaintExtensionsKt */
/* loaded from: classes.dex */
public final class PaintExtensionsKt {
    private static final void extendWith(Rect rect, Rect rect2) {
        rect.right += rect2.width();
        rect.top = Math.min(rect.top, rect2.top);
        rect.bottom = Math.max(rect.bottom, rect2.bottom);
    }

    private static final void fillStringBounds(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        if (Build.VERSION.SDK_INT >= 29) {
            PaintExtensions.getTextBounds(paint, charSequence, i, i2, rect);
        } else {
            paint.getTextBounds(charSequence.toString(), i, i2, rect);
        }
    }

    @NotNull
    public static final Rect getCharSequenceBounds(@NotNull TextPaint textPaint, @NotNull CharSequence text, int i, int i2) {
        Intrinsics.checkNotNullParameter(textPaint, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            if (SpannedExtensions.hasSpan(spanned, MetricAffectingSpan.class, i, i2)) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] spans = (MetricAffectingSpan[]) spanned.getSpans(i, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    Intrinsics.checkNotNullExpressionValue(spans, "spans");
                    for (MetricAffectingSpan metricAffectingSpan : spans) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    fillStringBounds(textPaint2, text, i, nextSpanTransition, rect2);
                    extendWith(rect, rect2);
                    i = nextSpanTransition;
                }
                return rect;
            }
        }
        return getStringBounds(textPaint, text, i, i2);
    }

    @VisibleForTesting
    @NotNull
    public static final Rect getStringBounds(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Rect rect = new Rect();
        fillStringBounds(paint, text, i, i2, rect);
        return rect;
    }
}
