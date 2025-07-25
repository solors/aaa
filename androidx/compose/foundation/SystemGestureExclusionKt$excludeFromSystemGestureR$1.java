package androidx.compose.foundation;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SystemGestureExclusion.kt */
@Metadata
/* loaded from: classes.dex */
public final class SystemGestureExclusionKt$excludeFromSystemGestureR$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ SystemGestureExclusion $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemGestureExclusionKt$excludeFromSystemGestureR$1(SystemGestureExclusion systemGestureExclusion) {
        super(1);
        this.$modifier = systemGestureExclusion;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SystemGestureExclusion systemGestureExclusion = this.$modifier;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.SystemGestureExclusionKt$excludeFromSystemGestureR$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                systemGestureExclusion.removeRect();
            }
        };
    }
}
