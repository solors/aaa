package androidx.compose.p015ui.graphics;

import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Canvas.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.CanvasKt */
/* loaded from: classes.dex */
public final class CanvasKt {
    @NotNull
    public static final Canvas Canvas(@NotNull ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return AndroidCanvas_androidKt.ActualCanvas(image);
    }

    public static final void rotate(@NotNull Canvas canvas, float f, float f2, float f3) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        if (f == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        canvas.translate(f2, f3);
        canvas.rotate(f);
        canvas.translate(-f2, -f3);
    }

    public static final void rotateRad(@NotNull Canvas canvas, float f, float f2, float f3) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        rotate(canvas, Degrees.degrees(f), f2, f3);
    }

    public static /* synthetic */ void rotateRad$default(Canvas canvas, float f, float f2, float f3, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        rotateRad(canvas, f, f2, f3);
    }

    public static final void scale(@NotNull Canvas canvas, float f, float f2, float f3, float f4) {
        boolean z;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        boolean z2 = true;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f2 != 1.0f) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        canvas.translate(f3, f4);
        canvas.scale(f, f2);
        canvas.translate(-f3, -f4);
    }

    public static /* synthetic */ void scale$default(Canvas canvas, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        scale(canvas, f, f2, f3, f4);
    }

    public static final void withSave(@NotNull Canvas canvas, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            canvas.save();
            block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            canvas.restore();
            InlineMarker.m17018a(1);
        }
    }

    public static final void withSaveLayer(@NotNull Canvas canvas, @NotNull Rect bounds, @NotNull Paint paint, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            canvas.saveLayer(bounds, paint);
            block.invoke();
        } finally {
            InlineMarker.m17017b(1);
            canvas.restore();
            InlineMarker.m17018a(1);
        }
    }
}
