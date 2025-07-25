package androidx.compose.foundation.layout;

import androidx.compose.p015ui.Alignment;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.layout.Measured;
import androidx.compose.p015ui.layout.VerticalAlignmentLine;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: Column.kt */
@LayoutScopeMarker
@Immutable
@Metadata
/* loaded from: classes.dex */
public interface ColumnScope {

    /* compiled from: Column.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Modifier weight$default(ColumnScope columnScope, Modifier modifier, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = true;
            }
            return columnScope.weight(modifier, f, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }

    @Stable
    @NotNull
    Modifier align(@NotNull Modifier modifier, @NotNull Alignment.Horizontal horizontal);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier modifier, @NotNull VerticalAlignmentLine verticalAlignmentLine);

    @Stable
    @NotNull
    Modifier alignBy(@NotNull Modifier modifier, @NotNull Function1<? super Measured, Integer> function1);

    @Stable
    @NotNull
    Modifier weight(@NotNull Modifier modifier, float f, boolean z);
}
