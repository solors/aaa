package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.draw.ScaleKt */
/* loaded from: classes.dex */
public final class Scale {
    @Stable
    @NotNull
    public static final Modifier scale(@NotNull Modifier modifier, float f, float f2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f == 1.0f) {
            if (f2 == 1.0f) {
                return modifier;
            }
        }
        return GraphicsLayerModifierKt.m107664graphicsLayerpANQ8Wg$default(modifier, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65532, null);
    }

    @Stable
    @NotNull
    public static final Modifier scale(@NotNull Modifier modifier, float f) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return scale(modifier, f, f);
    }
}
