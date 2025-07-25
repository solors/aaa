package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.FinishComposingTextCommand */
/* loaded from: classes.dex */
public final class FinishComposingTextCommand implements EditCommand {
    @Override // androidx.compose.p015ui.text.input.EditCommand
    public void applyTo(@NotNull EditingBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.commitComposition$ui_text_release();
    }

    public boolean equals(@Nullable Object obj) {
        return obj instanceof FinishComposingTextCommand;
    }

    public int hashCode() {
        return Reflection.m17042b(FinishComposingTextCommand.class).hashCode();
    }

    @NotNull
    public String toString() {
        return "FinishComposingTextCommand()";
    }
}
