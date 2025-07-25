package androidx.compose.foundation.selection;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Toggleable.kt */
@Metadata
/* loaded from: classes.dex */
final class ToggleableKt$toggleableImpl$1$delayPressInteraction$1 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ Functions<Boolean> $isRootInScrollableContainer;
    final /* synthetic */ SnapshotState<Boolean> $isToggleableInScrollableContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$delayPressInteraction$1(SnapshotState<Boolean> snapshotState, Functions<Boolean> functions) {
        super(0);
        this.$isToggleableInScrollableContainer = snapshotState;
        this.$isRootInScrollableContainer = functions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isToggleableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
