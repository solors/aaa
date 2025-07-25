package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Transition.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class MutableTransitionState<S> {
    public static final int $stable = 0;
    @NotNull
    private final SnapshotState currentState$delegate;
    @NotNull
    private final SnapshotState isRunning$delegate;
    @NotNull
    private final SnapshotState targetState$delegate;

    public MutableTransitionState(S s) {
        SnapshotState mutableStateOf$default;
        SnapshotState mutableStateOf$default2;
        SnapshotState mutableStateOf$default3;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.currentState$delegate = mutableStateOf$default;
        mutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(s, null, 2, null);
        this.targetState$delegate = mutableStateOf$default2;
        mutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isRunning$delegate = mutableStateOf$default3;
    }

    public final S getCurrentState() {
        return (S) this.currentState$delegate.getValue();
    }

    public final S getTargetState() {
        return (S) this.targetState$delegate.getValue();
    }

    public final boolean isIdle() {
        if (Intrinsics.m17075f(getCurrentState(), getTargetState()) && !isRunning$animation_core_release()) {
            return true;
        }
        return false;
    }

    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.isRunning$delegate.getValue()).booleanValue();
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.currentState$delegate.setValue(s);
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.isRunning$delegate.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState(S s) {
        this.targetState$delegate.setValue(s);
    }
}
