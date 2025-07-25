package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.BackspaceCommand */
/* loaded from: classes.dex */
public final class BackspaceCommand implements EditCommand {
    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasComposition$ui_text_release()) {
            buffer.delete$ui_text_release(buffer.getCompositionStart$ui_text_release(), buffer.getCompositionEnd$ui_text_release());
        } else if (buffer.getCursor$ui_text_release() == -1) {
            int selectionStart$ui_text_release = buffer.getSelectionStart$ui_text_release();
            int selectionEnd$ui_text_release = buffer.getSelectionEnd$ui_text_release();
            buffer.setCursor$ui_text_release(buffer.getSelectionStart$ui_text_release());
            buffer.delete$ui_text_release(selectionStart$ui_text_release, selectionEnd$ui_text_release);
        } else if (buffer.getCursor$ui_text_release() == 0) {
        } else {
            buffer.delete$ui_text_release(JvmCharHelpers_androidKt.findPrecedingBreak(buffer.toString(), buffer.getCursor$ui_text_release()), buffer.getCursor$ui_text_release());
        }
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof BackspaceCommand;
    }

    public int hashCode() {
        return Reflection.m17042b(BackspaceCommand.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "BackspaceCommand()";
    }
}
