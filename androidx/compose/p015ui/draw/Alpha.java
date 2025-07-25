package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.draw.AlphaKt */
/* loaded from: classes.dex */
public final class Alpha {
    @Stable
    @NotNull
    public static final Modifier alpha(@NotNull Modifier modifier, float f) {
        boolean z;
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return GraphicsLayerModifierKt.m107664graphicsLayerpANQ8Wg$default(modifier, 0.0f, 0.0f, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, null, 0L, 0L, 61435, null);
        }
        return modifier;
    }
}
