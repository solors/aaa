package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.foundation.lazy.grid.ItemFoundInScroll */
/* loaded from: classes.dex */
final class LazyGridScrolling extends CancellationException {
    @NotNull
    private final LazyGridItemInfo item;
    @NotNull
    private final AnimationState<Float, AnimationVector1D> previousAnimation;

    public LazyGridScrolling(@NotNull LazyGridItemInfo item, @NotNull AnimationState<Float, AnimationVector1D> previousAnimation) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousAnimation, "previousAnimation");
        this.item = item;
        this.previousAnimation = previousAnimation;
    }

    @NotNull
    public final LazyGridItemInfo getItem() {
        return this.item;
    }

    @NotNull
    public final AnimationState<Float, AnimationVector1D> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
