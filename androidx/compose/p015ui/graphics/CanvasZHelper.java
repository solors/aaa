package androidx.compose.p015ui.graphics;

import android.graphics.Canvas;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CanvasUtils.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.graphics.CanvasZHelper */
/* loaded from: classes.dex */
final class CanvasZHelper {
    @NotNull
    public static final CanvasZHelper INSTANCE = new CanvasZHelper();

    private CanvasZHelper() {
    }

    @DoNotInline
    public final void enableZ(@NotNull Canvas canvas, boolean z) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
