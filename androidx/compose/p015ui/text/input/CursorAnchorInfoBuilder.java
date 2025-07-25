package androidx.compose.p015ui.text.input;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.p015ui.geometry.Rect;
import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.p015ui.text.TextRange;
import androidx.compose.p015ui.text.style.ResolvedTextDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.text.input.CursorAnchorInfoBuilderKt */
/* loaded from: classes.dex */
public final class CursorAnchorInfoBuilder {
    @NotNull
    public static final CursorAnchorInfo build(@NotNull CursorAnchorInfo.Builder builder, @NotNull TextFieldValue textFieldValue, @NotNull TextLayoutResult textLayoutResult, @NotNull Matrix matrix) {
        int i;
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        builder.reset();
        builder.setMatrix(matrix);
        int m109380getMinimpl = TextRange.m109380getMinimpl(textFieldValue.m109559getSelectiond9O1mEE());
        builder.setSelectionRange(m109380getMinimpl, TextRange.m109379getMaximpl(textFieldValue.m109559getSelectiond9O1mEE()));
        setInsertionMarker(builder, m109380getMinimpl, textLayoutResult);
        TextRange m109558getCompositionMzsxiRA = textFieldValue.m109558getCompositionMzsxiRA();
        int i2 = -1;
        if (m109558getCompositionMzsxiRA != null) {
            i = TextRange.m109380getMinimpl(m109558getCompositionMzsxiRA.m109386unboximpl());
        } else {
            i = -1;
        }
        TextRange m109558getCompositionMzsxiRA2 = textFieldValue.m109558getCompositionMzsxiRA();
        if (m109558getCompositionMzsxiRA2 != null) {
            i2 = TextRange.m109379getMaximpl(m109558getCompositionMzsxiRA2.m109386unboximpl());
        }
        boolean z = false;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            builder.setComposingText(i, textFieldValue.getText().subSequence(i, i2));
        }
        CursorAnchorInfo build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build()");
        return build;
    }

    private static final CursorAnchorInfo.Builder setInsertionMarker(CursorAnchorInfo.Builder builder, int i, TextLayoutResult textLayoutResult) {
        boolean z;
        if (i < 0) {
            return builder;
        }
        Rect cursorRect = textLayoutResult.getCursorRect(i);
        int i2 = 0;
        if (textLayoutResult.getBidiRunDirection(i) == ResolvedTextDirection.Rtl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 4;
        }
        builder.setInsertionMarkerLocation(cursorRect.getLeft(), cursorRect.getTop(), cursorRect.getBottom(), cursorRect.getBottom(), i2);
        return builder;
    }
}
