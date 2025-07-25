package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Effects.kt */
@Metadata
/* loaded from: classes.dex */
public final class CompositionScopedCoroutineScopeCanceller implements RememberObserver {
    @NotNull
    private final CoroutineScope coroutineScope;

    public CompositionScopedCoroutineScopeCanceller(@NotNull CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    @NotNull
    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        C37785p0.m16126f(this.coroutineScope, null, 1, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        C37785p0.m16126f(this.coroutineScope, null, 1, null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
