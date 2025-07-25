package androidx.compose.foundation;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Overscroll.kt */
@Metadata
/* loaded from: classes.dex */
public final class OverscrollKt {
    @ExperimentalFoundationApi
    @NotNull
    public static final Modifier overscroll(@NotNull Modifier modifier, @NotNull Overscroll overscrollEffect) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(overscrollEffect, "overscrollEffect");
        return modifier.then(overscrollEffect.getEffectModifier());
    }
}
