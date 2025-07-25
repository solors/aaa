package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.TextRangeKt;
import kotlin.Metadata;

/* compiled from: SelectionAdjustment.kt */
@Metadata
/* loaded from: classes.dex */
public final class SelectionAdjustmentKt {
    public static final long ensureAtLeastOneChar(int i, int i2, boolean z, boolean z2) {
        if (i2 == 0) {
            return TextRangeKt.TextRange(i, i);
        }
        if (i == 0) {
            if (z) {
                return TextRangeKt.TextRange(1, 0);
            }
            return TextRangeKt.TextRange(0, 1);
        } else if (i == i2) {
            if (z) {
                return TextRangeKt.TextRange(i2 - 1, i2);
            }
            return TextRangeKt.TextRange(i2, i2 - 1);
        } else if (z) {
            if (!z2) {
                return TextRangeKt.TextRange(i - 1, i);
            }
            return TextRangeKt.TextRange(i + 1, i);
        } else if (!z2) {
            return TextRangeKt.TextRange(i, i + 1);
        } else {
            return TextRangeKt.TextRange(i, i - 1);
        }
    }
}
