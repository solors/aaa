package androidx.compose.p015ui.text.input;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InputMethodManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputMethodManager */
/* loaded from: classes.dex */
public interface InputMethodManager {
    void hideSoftInputFromWindow(@Nullable IBinder iBinder);

    void restartInput(@NotNull View view);

    void showSoftInput(@NotNull View view);

    void updateExtractedText(@NotNull View view, int i, @NotNull ExtractedText extractedText);

    void updateSelection(@NotNull View view, int i, int i2, int i3, int i4);
}
