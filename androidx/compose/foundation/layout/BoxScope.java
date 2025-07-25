package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Box.kt */
@LayoutScopeMarker
@Immutable
@Metadata
/* loaded from: classes.dex */
public interface BoxScope {
    @Stable
    @NotNull
    Modifier align(@NotNull Modifier modifier, @NotNull Alignment alignment);

    @Stable
    @NotNull
    Modifier matchParentSize(@NotNull Modifier modifier);
}
