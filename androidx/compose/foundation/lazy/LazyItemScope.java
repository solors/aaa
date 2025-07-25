package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholds;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyItemScope.kt */
@LazyScopeMarker
@Stable
@Metadata
/* loaded from: classes.dex */
public interface LazyItemScope {

    /* compiled from: LazyItemScope.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItemPlacement$default(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m109843boximpl(VisibilityThresholds.getVisibilityThreshold(IntOffset.Companion)), 1, null);
            }
            return lazyItemScope.animateItemPlacement(modifier, finiteAnimationSpec);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItemPlacement");
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxHeight(modifier, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxSize(modifier, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope, Modifier modifier, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                f = 1.0f;
            }
            return lazyItemScope.fillParentMaxWidth(modifier, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
    }

    @ExperimentalFoundationApi
    @NotNull
    Modifier animateItemPlacement(@NotNull Modifier modifier, @NotNull FiniteAnimationSpec<IntOffset> finiteAnimationSpec);

    @NotNull
    Modifier fillParentMaxHeight(@NotNull Modifier modifier, float f);

    @NotNull
    Modifier fillParentMaxSize(@NotNull Modifier modifier, float f);

    @NotNull
    Modifier fillParentMaxWidth(@NotNull Modifier modifier, float f);
}
