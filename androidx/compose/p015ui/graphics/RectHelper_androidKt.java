package androidx.compose.p015ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RectHelper.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.RectHelper_androidKt */
/* loaded from: classes.dex */
public final class RectHelper_androidKt {
    @NotNull
    public static final Rect toAndroidRect(@NotNull androidx.compose.p015ui.geometry.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.getRight(), (int) rect.getBottom());
    }

    @NotNull
    public static final RectF toAndroidRectF(@NotNull androidx.compose.p015ui.geometry.Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new RectF(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }

    @NotNull
    public static final androidx.compose.p015ui.geometry.Rect toComposeRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<this>");
        return new androidx.compose.p015ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
