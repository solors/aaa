package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.MoveCursorCommand */
/* loaded from: classes.dex */
public final class MoveCursorCommand implements EditCommand {
    private final int amount;

    public MoveCursorCommand(int i) {
        this.amount = i;
    }

    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.getCursor$ui_text_release() == -1) {
            buffer.setCursor$ui_text_release(buffer.getSelectionStart$ui_text_release());
        }
        int selectionStart$ui_text_release = buffer.getSelectionStart$ui_text_release();
        String editingBuffer = buffer.toString();
        int i = this.amount;
        int i2 = 0;
        if (i > 0) {
            while (i2 < i) {
                int findFollowingBreak = JvmCharHelpers_androidKt.findFollowingBreak(editingBuffer, selectionStart$ui_text_release);
                if (findFollowingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = findFollowingBreak;
            }
        } else {
            int i3 = -i;
            while (i2 < i3) {
                int findPrecedingBreak = JvmCharHelpers_androidKt.findPrecedingBreak(editingBuffer, selectionStart$ui_text_release);
                if (findPrecedingBreak == -1) {
                    break;
                }
                i2++;
                selectionStart$ui_text_release = findPrecedingBreak;
            }
        }
        buffer.setCursor$ui_text_release(selectionStart$ui_text_release);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof MoveCursorCommand) && this.amount == ((MoveCursorCommand) obj).amount) {
            return true;
        }
        return false;
    }

    public final int getAmount() {
        return this.amount;
    }

    public int hashCode() {
        return this.amount;
    }

    @NotNull
    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}
