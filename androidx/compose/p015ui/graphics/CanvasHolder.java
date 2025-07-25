package androidx.compose.p015ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidCanvas.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.CanvasHolder */
/* loaded from: classes.dex */
public final class CanvasHolder {
    @NotNull
    private final AndroidCanvas androidCanvas = new AndroidCanvas();

    public final void drawInto(@NotNull Canvas targetCanvas, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(targetCanvas, "targetCanvas");
        Intrinsics.checkNotNullParameter(block, "block");
        Canvas internalCanvas = getAndroidCanvas().getInternalCanvas();
        getAndroidCanvas().setInternalCanvas(targetCanvas);
        block.invoke(getAndroidCanvas());
        getAndroidCanvas().setInternalCanvas(internalCanvas);
    }

    @NotNull
    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    public static /* synthetic */ void getAndroidCanvas$annotations() {
    }
}
