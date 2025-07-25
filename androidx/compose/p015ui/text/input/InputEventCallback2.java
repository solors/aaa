package androidx.compose.p015ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: InputEventCallback2.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputEventCallback2 */
/* loaded from: classes.dex */
public interface InputEventCallback2 {
    void onEditCommands(@NotNull List<? extends EditCommand> list);

    /* renamed from: onImeAction-KlQnJC8  reason: not valid java name */
    void mo109526onImeActionKlQnJC8(int i);

    void onKeyEvent(@NotNull KeyEvent keyEvent);
}
