package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVectors;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimationState.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class AnimationScope<T, V extends AnimationVectors> {
    public static final int $stable = 8;
    private long finishedTimeNanos;
    @NotNull
    private final SnapshotState isRunning$delegate;
    private long lastFrameTimeNanos;
    @NotNull
    private final Functions<Unit> onCancel;
    private final long startTimeNanos;
    private final T targetValue;
    @NotNull
    private final VectorConverters<T, V> typeConverter;
    @NotNull
    private final SnapshotState value$delegate;
    @NotNull
    private V velocityVector;

    public AnimationScope(T t, @NotNull VectorConverters<T, V> typeConverter, @NotNull V initialVelocityVector, long j, T t2, long j2, boolean z, @NotNull Functions<Unit> onCancel) {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
        Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        this.typeConverter = typeConverter;
        this.targetValue = t2;
        this.startTimeNanos = j2;
        this.onCancel = onCancel;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
        this.value$delegate = mutableStateOf$default;
        this.velocityVector = (V) AnimationVectorsKt.copy(initialVelocityVector);
        this.lastFrameTimeNanos = j;
        this.finishedTimeNanos = Long.MIN_VALUE;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
        this.isRunning$delegate = mutableStateOf$default2;
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.onCancel.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final long getStartTimeNanos() {
        return this.startTimeNanos;
    }

    public final T getTargetValue() {
        return this.targetValue;
    }

    @NotNull
    public final VectorConverters<T, V> getTypeConverter() {
        return this.typeConverter;
    }

    public final T getValue() {
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
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.finishedTimeNanos = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.lastFrameTimeNanos = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setValue$animation_core_release(T t) {
        this.value$delegate.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@NotNull V v) {
        Intrinsics.checkNotNullParameter(v, "<set-?>");
        this.velocityVector = v;
    }

    @NotNull
    public final AnimationState<T, V> toAnimationState() {
        return new AnimationState<>(this.typeConverter, getValue(), this.velocityVector, this.lastFrameTimeNanos, this.finishedTimeNanos, isRunning());
    }
}
