package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p015ui.input.pointer.AndroidPointerIcon;
import androidx.compose.p015ui.input.pointer.AndroidPointerIconType;
import androidx.compose.p015ui.input.pointer.PointerIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidComposeView.android.kt */
@RequiresApi(24)
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewVerificationHelperMethodsN */
/* loaded from: classes.dex */
public final class AndroidComposeViewVerificationHelperMethodsN {
    @NotNull
    public static final AndroidComposeViewVerificationHelperMethodsN INSTANCE = new AndroidComposeViewVerificationHelperMethodsN();

    private AndroidComposeViewVerificationHelperMethodsN() {
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setPointerIcon(@NotNull View view, @Nullable PointerIcon pointerIcon) {
        android.view.PointerIcon systemIcon;
        Intrinsics.checkNotNullParameter(view, "view");
        if (pointerIcon instanceof AndroidPointerIcon) {
            systemIcon = ((AndroidPointerIcon) pointerIcon).getPointerIcon();
        } else if (pointerIcon instanceof AndroidPointerIconType) {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), ((AndroidPointerIconType) pointerIcon).getType());
        } else {
            systemIcon = android.view.PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (!Intrinsics.m17075f(view.getPointerIcon(), systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
