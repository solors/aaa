package androidx.compose.p015ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidCanvas.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas_androidKt */
/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {
    @NotNull
    private static final Canvas EmptyCanvas = new Canvas();

    @NotNull
    public static final Canvas ActualCanvas(@NotNull ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(image)));
        return androidCanvas;
    }

    @NotNull
    public static final Canvas Canvas(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(c);
        return androidCanvas;
    }

    @NotNull
    public static final Canvas getNativeCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
