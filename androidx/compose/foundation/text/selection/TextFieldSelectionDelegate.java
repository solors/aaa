package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionDelegateKt */
/* loaded from: classes.dex */
public final class TextFieldSelectionDelegate {
    /* renamed from: getTextFieldSelection-bb3KNj8  reason: not valid java name */
    public static final long m106755getTextFieldSelectionbb3KNj8(@Nullable TextLayoutResult textLayoutResult, int i, int i2, @Nullable TextRange textRange, boolean z, @NotNull SelectionAdjustment adjustment) {
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (textLayoutResult != null) {
            long TextRange = TextRangeKt.TextRange(i, i2);
            if (textRange == null && Intrinsics.m17075f(adjustment, SelectionAdjustment.Companion.getCharacter())) {
                return TextRange;
            }
            return adjustment.mo106692adjustZXO7KMw(textLayoutResult, TextRange, -1, z, textRange);
        }
        return TextRangeKt.TextRange(0, 0);
    }
}
