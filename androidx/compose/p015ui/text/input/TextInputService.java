package androidx.compose.p015ui.text.input;

import androidx.compose.animation.core.C0379a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextInputService.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputService */
/* loaded from: classes.dex */
public class TextInputService {
    @NotNull
    private final AtomicReference<TextInputSession> _currentInputSession;
    @NotNull
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(@NotNull PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.platformTextInputService = platformTextInputService;
        this._currentInputSession = new AtomicReference<>(null);
    }

    @Nullable
    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return this._currentInputSession.get();
    }

    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    public final void showSoftwareKeyboard() {
        if (this._currentInputSession.get() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    @NotNull
    public TextInputSession startInput(@NotNull TextFieldValue value, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> onEditCommand, @NotNull Function1<? super ImeAction, Unit> onImeActionPerformed) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(imeOptions, "imeOptions");
        Intrinsics.checkNotNullParameter(onEditCommand, "onEditCommand");
        Intrinsics.checkNotNullParameter(onImeActionPerformed, "onImeActionPerformed");
        this.platformTextInputService.startInput(value, imeOptions, onEditCommand, onImeActionPerformed);
        TextInputSession textInputSession = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession);
        return textInputSession;
    }

    public void stopInput(@NotNull TextInputSession session) {
        Intrinsics.checkNotNullParameter(session, "session");
        if (C0379a.m105461a(this._currentInputSession, session, null)) {
            this.platformTextInputService.stopInput();
        }
    }
}
