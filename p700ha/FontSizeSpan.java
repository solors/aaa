package p700ha;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.text.style.ParagraphStyle;
import androidx.annotation.IntRange;
import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: ha.b */
/* loaded from: classes8.dex */
public final class FontSizeSpan extends MetricAffectingSpan implements ParagraphStyle {

    /* renamed from: b */
    private final int f91396b;

    /* renamed from: c */
    private final int f91397c;

    public FontSizeSpan(@InterfaceC0152Px int i, @IntRange(from = 0) @InterfaceC0152Px int i2) {
        this.f91396b = i;
        this.f91397c = i2;
    }

    /* renamed from: a */
    public final int m23634a() {
        return this.f91396b;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        paint.setTextSize(this.f91396b);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(@NotNull TextPaint paint) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (this.f91397c == 0) {
            paint.setTextSize(this.f91396b);
        } else {
            paint.setTextScaleX(this.f91396b / paint.getTextSize());
        }
    }
}
