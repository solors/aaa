package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextFieldValue.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextFieldValueKt */
/* loaded from: classes.dex */
public final class TextFieldValueKt {
    @NotNull
    public static final AnnotatedString getSelectedText(@NotNull TextFieldValue textFieldValue) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().m109295subSequence5zctL8(textFieldValue.m109559getSelectiond9O1mEE());
    }

    @NotNull
    public static final AnnotatedString getTextAfterSelection(@NotNull TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().subSequence(TextRange.m109379getMaximpl(textFieldValue.m109559getSelectiond9O1mEE()), Math.min(TextRange.m109379getMaximpl(textFieldValue.m109559getSelectiond9O1mEE()) + i, textFieldValue.getText().length()));
    }

    @NotNull
    public static final AnnotatedString getTextBeforeSelection(@NotNull TextFieldValue textFieldValue, int i) {
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        return textFieldValue.getAnnotatedString().subSequence(Math.max(0, TextRange.m109380getMinimpl(textFieldValue.m109559getSelectiond9O1mEE()) - i), TextRange.m109380getMinimpl(textFieldValue.m109559getSelectiond9O1mEE()));
    }
}
