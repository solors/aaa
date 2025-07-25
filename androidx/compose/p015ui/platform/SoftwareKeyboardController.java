package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

/* compiled from: SoftwareKeyboardController.kt */
@Stable
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.platform.SoftwareKeyboardController */
/* loaded from: classes.dex */
public interface SoftwareKeyboardController {
    void hide();

    default void hideSoftwareKeyboard() {
        hide();
    }

    void show();

    default void showSoftwareKeyboard() {
        show();
    }
}
