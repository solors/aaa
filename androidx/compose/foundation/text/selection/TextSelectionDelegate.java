package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.text.selection.TextSelectionDelegateKt */
/* loaded from: classes.dex */
public final class TextSelectionDelegate {
    public static final float getHorizontalPosition(@NotNull TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        int max;
        Intrinsics.checkNotNullParameter(textLayoutResult, "<this>");
        boolean z3 = false;
        if ((z && !z2) || (!z && z2)) {
            max = i;
        } else {
            max = Math.max(i - 1, 0);
        }
        if (textLayoutResult.getBidiRunDirection(max) == textLayoutResult.getParagraphDirection(i)) {
            z3 = true;
        }
        return textLayoutResult.getHorizontalPosition(i, z3);
    }

    public static final long getSelectionHandleCoordinates(@NotNull TextLayoutResult textLayoutResult, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        return OffsetKt.Offset(getHorizontalPosition(textLayoutResult, i, z, z2), textLayoutResult.getLineBottom(textLayoutResult.getLineForOffset(i)));
    }
}
