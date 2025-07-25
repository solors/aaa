package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EnterExitTransition.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class Fade {
    private final float alpha;
    @NotNull
    private final FiniteAnimationSpec<Float> animationSpec;

    public Fade(float f, @NotNull FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.alpha = f;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Fade copy$default(Fade fade, float f, FiniteAnimationSpec finiteAnimationSpec, int i, Object obj) {
        if ((i & 1) != 0) {
            f = fade.alpha;
        }
        if ((i & 2) != 0) {
            finiteAnimationSpec = fade.animationSpec;
        }
        return fade.copy(f, finiteAnimationSpec);
    }

    public final float component1() {
        return this.alpha;
    }

    @NotNull
    public final FiniteAnimationSpec<Float> component2() {
        return this.animationSpec;
    }

    @NotNull
    public final Fade copy(float f, @NotNull FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Fade(f, animationSpec);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fade)) {
            return false;
        }
        Fade fade = (Fade) obj;
        if (Intrinsics.m17075f(Float.valueOf(this.alpha), Float.valueOf(fade.alpha)) && Intrinsics.m17075f(this.animationSpec, fade.animationSpec)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    @NotNull
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public int hashCode() {
        return (Float.hashCode(this.alpha) * 31) + this.animationSpec.hashCode();
    }

    @NotNull
    public String toString() {
        return "Fade(alpha=" + this.alpha + ", animationSpec=" + this.animationSpec + ')';
    }
}
