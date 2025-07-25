package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnimationState.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AnimationVectors> implements State<T> {
    public static final int $stable = 0;
    private long finishedTimeNanos;
    private boolean isRunning;
    private long lastFrameTimeNanos;
    @NotNull
    private final VectorConverters<T, V> typeConverter;
    @NotNull
    private final SnapshotState value$delegate;
    @NotNull
    private V velocityVector;

    public AnimationState(@NotNull VectorConverters<T, V> typeConverter, T t, @Nullable V v, long j, long j2, boolean z) {
        SnapshotState mutableStateOf$default;
        V v2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        this.typeConverter = typeConverter;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (v == null || (v2 = (V) AnimationVectorsKt.copy(v)) == null) ? (V) AnimationStateKt.createZeroVectorFrom(typeConverter, t) : v2;
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = j2;
        this.isRunning = z;
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    @NotNull
    public final VectorConverters<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    @Override // androidx.compose.runtime.State
    public T getValue() {
        return this.value$delegate.getValue();
    }

    public final T getVelocity() {
        return this.typeConverter.getConvertFromVector().invoke(this.velocityVector);
    }

    @NotNull
    public final V getVelocityVector() {
        return this.velocityVector;
    }

    public final boolean isRunning() {
        return this.isRunning;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning = z;
    }

    public void setValue$animation_core_release(T t) {
        this.value$delegate.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.velocityVector = v;
    }

    @NotNull
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public /* synthetic */ AnimationState(VectorConverters vectorConverters, Object obj, AnimationVectors animationVectors, long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vectorConverters, obj, (i & 4) != 0 ? null : animationVectors, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
