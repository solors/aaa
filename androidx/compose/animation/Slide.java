package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class Slide {
    @NotNull
    private final FiniteAnimationSpec<IntOffset> animationSpec;
    @NotNull
    private final Function1<IntSize, IntOffset> slideOffset;

    /* JADX WARN: Multi-variable type inference failed */
    public Slide(@NotNull Function1<? super IntSize, IntOffset> slideOffset, @NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(slideOffset, "slideOffset");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.slideOffset = slideOffset;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Slide copy$default(Slide slide, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = slide.slideOffset;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = slide.animationSpec;
        }
        return slide.copy(function1, finiteAnimationSpec);
    }

    @NotNull
    public final Function1<IntSize, IntOffset> component1() {
        return this.slideOffset;
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> component2() {
        return this.animationSpec;
    }

    @NotNull
    public final Slide copy(@NotNull Function1<? super IntSize, IntOffset> slideOffset, @NotNull FiniteAnimationSpec<IntOffset> animationSpec) {
        Intrinsics.checkNotNullParameter(slideOffset, "slideOffset");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Slide(slideOffset, animationSpec);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Slide)) {
            return false;
        }
        Slide slide = (Slide) obj;
        if (Intrinsics.m17075f(this.slideOffset, slide.slideOffset) && Intrinsics.m17075f(this.animationSpec, slide.animationSpec)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final FiniteAnimationSpec<IntOffset> getAnimationSpec() {
        return this.animationSpec;
    }

    @NotNull
    public final Function1<IntSize, IntOffset> getSlideOffset() {
        return this.slideOffset;
    }

    public int hashCode() {
        return (this.slideOffset.hashCode() * 31) + this.animationSpec.hashCode();
    }

    @NotNull
    public String toString() {
        return "Slide(slideOffset=" + this.slideOffset + ", animationSpec=" + this.animationSpec + ')';
    }
}
