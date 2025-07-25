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
public final class SpringSpec<T> implements FiniteAnimationSpec<T> {
    private final float dampingRatio;
    private final float stiffness;
    @Nullable
    private final T visibilityThreshold;

    public SpringSpec() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        boolean z2;
        if (!(obj instanceof SpringSpec)) {
            return false;
        }
        SpringSpec springSpec = (SpringSpec) obj;
        if (springSpec.dampingRatio == this.dampingRatio) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        if (springSpec.stiffness == this.stiffness) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !Intrinsics.m17075f(springSpec.visibilityThreshold, this.visibilityThreshold)) {
            return false;
        }
        return true;
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getStiffness() {
        return this.stiffness;
    }

    @Nullable
    public final T getVisibilityThreshold() {
        return this.visibilityThreshold;
    }

    public int hashCode() {
        int i;
        T t = this.visibilityThreshold;
        if (t != null) {
            i = t.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Float.hashCode(this.dampingRatio)) * 31) + Float.hashCode(this.stiffness);
    }

    public SpringSpec(float f, float f2, @Nullable T t) {
        this.dampingRatio = f;
        this.stiffness = f2;
        this.visibilityThreshold = t;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    @NotNull
    public <V extends AnimationVectors> VectorizedSpringSpec<V> vectorize(@NotNull VectorConverters<T, V> converter) {
        AnimationVectors convert;
        Intrinsics.checkNotNullParameter(converter, "converter");
        float f = this.dampingRatio;
        float f2 = this.stiffness;
        convert = AnimationSpecKt.convert(converter, this.visibilityThreshold);
        return new VectorizedSpringSpec<>(f, f2, convert);
    }

    public /* synthetic */ SpringSpec(float f, float f2, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
