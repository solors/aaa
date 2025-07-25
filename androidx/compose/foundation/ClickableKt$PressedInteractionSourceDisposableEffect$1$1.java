package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Clickable.kt */
@Metadata
/* loaded from: classes.dex */
final class ClickableKt$PressedInteractionSourceDisposableEffect$1$1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ SnapshotState<PressInteraction.Press> $pressedInteraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$1$1(SnapshotState<PressInteraction.Press> snapshotState, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$pressedInteraction = snapshotState;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SnapshotState<PressInteraction.Press> snapshotState = this.$pressedInteraction;
        final MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                PressInteraction.Press press = (PressInteraction.Press) snapshotState.getValue();
                if (press != null) {
                    mutableInteractionSource.tryEmit(new PressInteraction.Cancel(press));
                    snapshotState.setValue(null);
                }
            }
        };
    }
}
