package p1027wa;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: wa.e */
/* loaded from: classes8.dex */
public final class TypefaceSpan extends MetricAffectingSpan {
    @NotNull

    /* renamed from: b */
    private final Typeface f117159b;

    public TypefaceSpan(@NotNull Typeface typeface) {
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        this.f117159b = typeface;
    }

    /* renamed from: a */
    private final void m2162a(TextPaint textPaint) {
        textPaint.setTypeface(this.f117159b);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        m2162a(ds);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        m2162a(paint);
    }
}
