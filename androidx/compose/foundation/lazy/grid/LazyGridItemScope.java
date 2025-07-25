package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholds;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridItemScope.kt */
@Stable
@LazyGridScopeMarker
@Metadata
/* loaded from: classes.dex */
public interface LazyGridItemScope {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItemPlacement$default(LazyGridItemScope lazyGridItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m109843boximpl(VisibilityThresholds.getVisibilityThreshold(IntOffset.Companion)), 1, null);
            }
            return lazyGridItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    @ExperimentalFoundationApi
    @NotNull
    Modifier animateItemPlacement(@NotNull Modifier modifier, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec);
}
