package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.geometry.Rect;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TextInputService.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.PlatformTextInputService */
/* loaded from: classes.dex */
public interface PlatformTextInputService {
    void hideSoftwareKeyboard();

    default void notifyFocusedRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
    }

    void showSoftwareKeyboard();

    void startInput(@NotNull TextFieldValue textFieldValue, @NotNull ImeOptions imeOptions, @NotNull Function1<? super List<? extends EditCommand>, Unit> function1, @NotNull Function1<? super ImeAction, Unit> function12);

    void stopInput();

    void updateState(@Nullable TextFieldValue textFieldValue, @NotNull TextFieldValue textFieldValue2);
}
