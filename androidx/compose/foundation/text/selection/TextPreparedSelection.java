package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextLayoutResult;
import androidx.compose.p015ui.text.input.OffsetMapping;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextPreparedSelection.kt */
@Metadata
/* loaded from: classes.dex */
public final class TextPreparedSelection extends BaseTextPreparedSelection<TextPreparedSelection> {
    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }

    public /* synthetic */ TextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, (i & 4) != 0 ? null : textLayoutResult, (i & 8) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, (i & 16) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    private TextPreparedSelection(AnnotatedString annotatedString, long j, TextLayoutResult textLayoutResult, OffsetMapping offsetMapping, TextPreparedSelectionState textPreparedSelectionState) {
        super(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState, null);
    }
}
