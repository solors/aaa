package androidx.compose.p015ui.text.input;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.EnumC38505n;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: InputMethodManager.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.InputMethodManagerImpl */
/* loaded from: classes.dex */
public final class InputMethodManagerImpl implements InputMethodManager {
    @NotNull
    private final InterfaceC38501j imm$delegate;

    public InputMethodManagerImpl(@NotNull Context context) {
        InterfaceC38501j m14553b;
        Intrinsics.checkNotNullParameter(context, "context");
        m14553b = LazyJVM.m14553b(EnumC38505n.f101867d, new InputMethodManagerImpl$imm$2(context));
        this.imm$delegate = m14553b;
    }

    private final InputMethodManager getImm() {
        return (InputMethodManager) this.imm$delegate.getValue();
    }

    @Override // androidx.compose.p015ui.text.input.InputMethodManager
    public void hideSoftInputFromWindow(@Nullable IBinder iBinder) {
        getImm().hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // androidx.compose.p015ui.text.input.InputMethodManager
    public void restartInput(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getImm().restartInput(view);
    }

    @Override // androidx.compose.p015ui.text.input.InputMethodManager
    public void showSoftInput(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        getImm().showSoftInput(view, 0);
    }

    @Override // androidx.compose.p015ui.text.input.InputMethodManager
    public void updateExtractedText(@NotNull View view, int i, @NotNull ExtractedText extractedText) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(extractedText, "extractedText");
        getImm().updateExtractedText(view, i, extractedText);
    }

    @Override // androidx.compose.p015ui.text.input.InputMethodManager
    public void updateSelection(@NotNull View view, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(view, "view");
        getImm().updateSelection(view, i, i2, i3, i4);
    }
}
