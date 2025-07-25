package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand */
/* loaded from: classes.dex */
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int i, int i2) {
        boolean z;
        this.lengthBeforeCursor = i;
        this.lengthAfterCursor = i2;
        if (i >= 0 && i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
    }

    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        boolean isSurrogatePair;
        boolean isSurrogatePair2;
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i = this.lengthBeforeCursor;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            if (buffer.getSelectionStart$ui_text_release() > i2) {
                isSurrogatePair2 = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionStart$ui_text_release() - i2) - 1), buffer.get$ui_text_release(buffer.getSelectionStart$ui_text_release() - i2));
                if (isSurrogatePair2) {
                    i2++;
                }
            }
            if (i2 == buffer.getSelectionStart$ui_text_release()) {
                break;
            }
        }
        int i4 = this.lengthAfterCursor;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5++;
            if (buffer.getSelectionEnd$ui_text_release() + i5 < buffer.getLength$ui_text_release()) {
                isSurrogatePair = EditCommandKt.isSurrogatePair(buffer.get$ui_text_release((buffer.getSelectionEnd$ui_text_release() + i5) - 1), buffer.get$ui_text_release(buffer.getSelectionEnd$ui_text_release() + i5));
                if (isSurrogatePair) {
                    i5++;
                }
            }
            if (buffer.getSelectionEnd$ui_text_release() + i5 == buffer.getLength$ui_text_release()) {
                break;
            }
        }
        buffer.delete$ui_text_release(buffer.getSelectionEnd$ui_text_release(), buffer.getSelectionEnd$ui_text_release() + i5);
        buffer.delete$ui_text_release(buffer.getSelectionStart$ui_text_release() - i2, buffer.getSelectionStart$ui_text_release());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        DeleteSurroundingTextInCodePointsCommand deleteSurroundingTextInCodePointsCommand = (DeleteSurroundingTextInCodePointsCommand) obj;
        if (this.lengthBeforeCursor == deleteSurroundingTextInCodePointsCommand.lengthBeforeCursor && this.lengthAfterCursor == deleteSurroundingTextInCodePointsCommand.lengthAfterCursor) {
            return true;
        }
        return false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    public int hashCode() {
        return (this.lengthBeforeCursor * 31) + this.lengthAfterCursor;
    }

    @NotNull
    public String toString() {
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}
