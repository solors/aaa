package androidx.compose.p015ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.text.android.Paint29 */
/* loaded from: classes.dex */
final class PaintExtensions {
    @NotNull
    public static final PaintExtensions INSTANCE = new PaintExtensions();

    private PaintExtensions() {
    }

    @DoNotInline
    public static final void getTextBounds(@NotNull Paint paint, @NotNull CharSequence text, int i, int i2, @NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(rect, "rect");
        paint.getTextBounds(text, i, i2, rect);
    }
}
