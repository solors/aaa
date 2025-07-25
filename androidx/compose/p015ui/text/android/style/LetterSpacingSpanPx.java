package androidx.compose.p015ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.annotation.InterfaceC0152Px;
import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LetterSpacingSpanPx.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.style.LetterSpacingSpanPx */
/* loaded from: classes.dex */
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpanPx(@InterfaceC0152Px float f) {
        this.letterSpacing = f;
    }

    private final void updatePaint(TextPaint textPaint) {
        boolean z;
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            textPaint.setLetterSpacing(this.letterSpacing / textSize);
        }
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        updatePaint(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        updatePaint(textPaint);
    }
}
