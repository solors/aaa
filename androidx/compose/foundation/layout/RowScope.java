package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.layout.HorizontalAlignmentLine;
import androidx.compose.p015ui.layout.Measured;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Row.kt */
@LayoutScopeMarker
@Immutable
@Metadata
/* loaded from: classes.dex */
public interface RowScope {

    /* compiled from: Row.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(RowScope rowScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return rowScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    @Stable
    @NotNull
    Modifier align(@NotNull Modifier modifier, @NotNull Alignment.Vertical vertical);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier modifier, @NotNull HorizontalAlignmentLine horizontalAlignmentLine);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier modifier, @NotNull Function1<? super Measured, Integer> function1);

    @Stable
    @NotNull
    Modifier alignByBaseline(@NotNull Modifier modifier);

    @Stable
    @NotNull
    Modifier weight(@NotNull Modifier modifier, float f, boolean z);
}
