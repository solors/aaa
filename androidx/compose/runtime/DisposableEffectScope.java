package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Effects.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class DisposableEffectScope {
    public static final int $stable = 0;

    @NotNull
    public final DisposableEffectResult onDispose(@NotNull final Functions<Unit> onDisposeEffect) {
        Intrinsics.checkNotNullParameter(onDisposeEffect, "onDisposeEffect");
        return new DisposableEffectResult() { // from class: androidx.compose.runtime.DisposableEffectScope$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                onDisposeEffect.invoke();
            }
        };
    }
}
