package p700ha;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ha.a */
/* loaded from: classes8.dex */
public final class FontFeatureSpan extends MetricAffectingSpan {
    @NotNull

    /* renamed from: b */
    private final String f91395b;

    public FontFeatureSpan(@NotNull String settings) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f91395b = settings;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f91395b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f91395b);
    }
}
