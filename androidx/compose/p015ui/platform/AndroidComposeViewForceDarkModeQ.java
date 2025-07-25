package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeView.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidComposeViewForceDarkModeQ */
/* loaded from: classes.dex */
final class AndroidComposeViewForceDarkModeQ {
    @NotNull
    public static final AndroidComposeViewForceDarkModeQ INSTANCE = new AndroidComposeViewForceDarkModeQ();

    private AndroidComposeViewForceDarkModeQ() {
    }

    @DoNotInline
    @RequiresApi(29)
    public final void disallowForceDark(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setForceDarkAllowed(false);
    }
}
