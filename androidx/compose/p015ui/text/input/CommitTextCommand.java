package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.CommitTextCommand */
/* loaded from: classes.dex */
public final class CommitTextCommand implements EditCommand {
    @NotNull
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public CommitTextCommand(@NotNull AnnotatedString annotatedString, int i) {
        Intrinsics.checkNotNullParameter(annotatedString, "annotatedString");
        this.annotatedString = annotatedString;
        this.newCursorPosition = i;
    }

    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        int length;
        int m16908n;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.replace$ui_text_release(buffer.getCompositionStart$ui_text_release(), buffer.getCompositionEnd$ui_text_release(), getText());
        } else {
            buffer.replace$ui_text_release(buffer.getSelectionStart$ui_text_release(), buffer.getSelectionEnd$ui_text_release(), getText());
        }
        int cursor$ui_text_release = buffer.getCursor$ui_text_release();
        int i = this.newCursorPosition;
        if (i > 0) {
            length = (cursor$ui_text_release + i) - 1;
        } else {
            length = (cursor$ui_text_release + i) - getText().length();
        }
        m16908n = _Ranges.m16908n(length, 0, buffer.getLength$ui_text_release());
        buffer.setCursor$ui_text_release(m16908n);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommitTextCommand)) {
            return false;
        }
        CommitTextCommand commitTextCommand = (CommitTextCommand) obj;
        if (Intrinsics.m17075f(getText(), commitTextCommand.getText()) && this.newCursorPosition == commitTextCommand.newCursorPosition) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    @NotNull
    public final String getText() {
        return this.annotatedString.getText();
    }

    public int hashCode() {
        return (getText().hashCode() * 31) + this.newCursorPosition;
    }

    @NotNull
    public String toString() {
        return "CommitTextCommand(text='" + getText() + "', newCursorPosition=" + this.newCursorPosition + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommitTextCommand(@NotNull String text, int i) {
        this(new AnnotatedString(text, null, null, 6, null), i);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
