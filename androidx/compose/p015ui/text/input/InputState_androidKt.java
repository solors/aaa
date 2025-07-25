package androidx.compose.p015ui.text.input;

import android.view.inputmethod.ExtractedText;
import androidx.compose.p015ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputState.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputState_androidKt */
/* loaded from: classes.dex */
public final class InputState_androidKt {
    @NotNull
    public static final ExtractedText toExtractedText(@NotNull TextFieldValue textFieldValue) {
        boolean m16594Q;
        Intrinsics.checkNotNullParameter(textFieldValue, "<this>");
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.getText();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.getText().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = TextRange.m109380getMinimpl(textFieldValue.m109559getSelectiond9O1mEE());
        extractedText.selectionEnd = TextRange.m109379getMaximpl(textFieldValue.m109559getSelectiond9O1mEE());
        m16594Q = C37690r.m16594Q(textFieldValue.getText(), '\n', false, 2, null);
        extractedText.flags = !m16594Q ? 1 : 0;
        return extractedText;
    }
}
