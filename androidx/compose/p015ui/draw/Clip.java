package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.p015ui.graphics.Shape;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.draw.ClipKt */
/* loaded from: classes.dex */
public final class Clip {
    @Stable
    @NotNull
    public static final Modifier clip(@NotNull Modifier modifier, @NotNull Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return GraphicsLayerModifierKt.m107664graphicsLayerpANQ8Wg$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape, true, null, 0L, 0L, 59391, null);
    }

    @Stable
    @NotNull
    public static final Modifier clipToBounds(@NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return GraphicsLayerModifierKt.m107664graphicsLayerpANQ8Wg$default(modifier, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 61439, null);
    }
}
