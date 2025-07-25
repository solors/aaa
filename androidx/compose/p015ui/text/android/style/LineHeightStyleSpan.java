package androidx.compose.p015ui.text.android.style;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.annotation.IntRange;
import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LineHeightStyleSpan.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.style.LineHeightStyleSpan */
/* loaded from: classes.dex */
public final class LineHeightStyleSpan implements LineHeightSpan {
    private int ascent;
    private int descent;
    private final int endIndex;
    private int firstAscent;
    private int firstAscentDiff;
    private int lastDescent;
    private int lastDescentDiff;
    private final float lineHeight;
    private final int startIndex;
    private final int topPercentage;
    private final boolean trimFirstLineTop;
    private final boolean trimLastLineBottom;

    public LineHeightStyleSpan(float f, int i, int i2, boolean z, boolean z2, @IntRange(from = 0, m105510to = 100) int i3) {
        boolean z3;
        this.lineHeight = f;
        this.startIndex = i;
        this.endIndex = i2;
        this.trimFirstLineTop = z;
        this.trimLastLineBottom = z2;
        this.topPercentage = i3;
        boolean z4 = true;
        if (i3 >= 0 && i3 < 101) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && i3 != -1) {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalStateException("topRatio should be in [0..100] range or -1".toString());
    }

    private final void calculateTargetMetrics(Paint.FontMetricsInt fontMetricsInt) {
        double ceil;
        int lineHeight = LineHeightStyleSpanKt.lineHeight(fontMetricsInt);
        int ceil2 = (int) Math.ceil(this.lineHeight);
        int i = ceil2 - lineHeight;
        int i2 = this.topPercentage;
        if (i2 == -1) {
            i2 = (int) ((Math.abs(fontMetricsInt.ascent) / LineHeightStyleSpanKt.lineHeight(fontMetricsInt)) * 100.0f);
        }
        if (i <= 0) {
            ceil = Math.ceil((i * i2) / 100.0f);
        } else {
            ceil = Math.ceil((i * (100 - i2)) / 100.0f);
        }
        int i3 = fontMetricsInt.descent;
        int i4 = ((int) ceil) + i3;
        this.descent = i4;
        int i5 = i4 - ceil2;
        this.ascent = i5;
        if (this.trimFirstLineTop) {
            i5 = fontMetricsInt.ascent;
        }
        this.firstAscent = i5;
        if (this.trimLastLineBottom) {
            i4 = i3;
        }
        this.lastDescent = i4;
        this.firstAscentDiff = fontMetricsInt.ascent - i5;
        this.lastDescentDiff = i4 - i3;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(@NotNull CharSequence text, int i, int i2, int i3, int i4, @NotNull Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontMetricsInt, "fontMetricsInt");
        if (LineHeightStyleSpanKt.lineHeight(fontMetricsInt) <= 0) {
            return;
        }
        boolean z2 = true;
        if (i == this.startIndex) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != this.endIndex) {
            z2 = false;
        }
        if (z && z2 && this.trimFirstLineTop && this.trimLastLineBottom) {
            return;
        }
        if (z) {
            calculateTargetMetrics(fontMetricsInt);
        }
        if (z) {
            i5 = this.firstAscent;
        } else {
            i5 = this.ascent;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.lastDescent;
        } else {
            i6 = this.descent;
        }
        fontMetricsInt.descent = i6;
    }

    public final int getFirstAscentDiff() {
        return this.firstAscentDiff;
    }

    public final int getLastDescentDiff() {
        return this.lastDescentDiff;
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }
}
