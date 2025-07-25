package p1027wa;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: wa.c */
/* loaded from: classes8.dex */
public final class LetterSpacingSpan extends MetricAffectingSpan {

    /* renamed from: b */
    private final float f117158b;

    public LetterSpacingSpan(float f) {
        this.f117158b = f;
    }

    /* renamed from: a */
    private final void m2165a(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.f117158b);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        m2165a(paint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        m2165a(paint);
    }
}
