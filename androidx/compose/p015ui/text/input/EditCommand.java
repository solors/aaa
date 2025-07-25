package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EditCommand.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.EditCommand */
/* loaded from: classes.dex */
public interface EditCommand {
    void applyTo(@NotNull EditingBuffer editingBuffer);
}
