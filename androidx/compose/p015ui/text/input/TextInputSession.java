package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextInputService.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputSession */
/* loaded from: classes.dex */
public final class TextInputSession {
    @NotNull
    private final PlatformTextInputService platformTextInputService;
    @NotNull
    private final TextInputService textInputService;

    public TextInputSession(@NotNull TextInputService textInputService, @NotNull PlatformTextInputService platformTextInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.textInputService = textInputService;
        this.platformTextInputService = platformTextInputService;
    }

    private final boolean ensureOpenSession(Functions<Unit> functions) {
        boolean isOpen = isOpen();
        if (isOpen) {
            functions.invoke();
        }
        return isOpen;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    public final boolean hideSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean isOpen() {
        return Intrinsics.m17075f(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.notifyFocusedRect(rect);
        }
        return isOpen;
    }

    public final boolean showSoftwareKeyboard() {
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return isOpen;
    }

    public final boolean updateState(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean isOpen = isOpen();
        if (isOpen) {
            this.platformTextInputService.updateState(textFieldValue, newValue);
        }
        return isOpen;
    }
}
