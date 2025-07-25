package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationSpec.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class SnapSpec<T> implements DurationBasedAnimationSpec<T> {
    private final int delay;

    public SnapSpec() {
        this(0, 1, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SnapSpec) || ((SnapSpec) obj).delay != this.delay) {
            return false;
        }
        return true;
    }

    public final int getDelay() {
        return this.delay;
    }

    public int hashCode() {
        return this.delay;
    }

    public SnapSpec(int i) {
        this.delay = i;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVectors> VectorizedDurationBasedAnimationSpec<V> vectorize(@NotNull VectorConverters<T, V> converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        return new VectorizedSnapSpec(this.delay);
    }

    public /* synthetic */ SnapSpec(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
