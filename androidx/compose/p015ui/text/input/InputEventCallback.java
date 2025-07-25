package androidx.compose.p015ui.text.input;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputEventCallback.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputEventCallback */
/* loaded from: classes.dex */
public interface InputEventCallback {
    void onEditCommands(@NotNull List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8  reason: not valid java name */
    void m109525onImeActionKlQnJC8(int i);
}
