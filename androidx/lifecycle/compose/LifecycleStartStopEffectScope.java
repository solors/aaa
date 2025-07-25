package androidx.lifecycle.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: LifecycleEffect.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class LifecycleStartStopEffectScope implements LifecycleOwner {
    public static final int $stable = 8;
    @NotNull
    private final Lifecycle lifecycle;

    public LifecycleStartStopEffectScope(@NotNull Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    public final LifecycleStopOrDisposeEffectResult onStopOrDispose(@NotNull final Function1<? super LifecycleOwner, Unit> function1) {
        return new LifecycleStopOrDisposeEffectResult() { // from class: androidx.lifecycle.compose.LifecycleStartStopEffectScope$onStopOrDispose$1
            @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
            public void runStopOrDisposeEffect() {
                function1.invoke(this);
            }
        };
    }
}
