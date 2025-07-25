package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Clickable.kt */
@Metadata
/* loaded from: classes.dex */
final class ClickableKt$clickable$4$delayPressInteraction$1 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ SnapshotState<Boolean> $isClickableInScrollableContainer;
    final /* synthetic */ Functions<Boolean> $isRootInScrollableContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableKt$clickable$4$delayPressInteraction$1(SnapshotState<Boolean> snapshotState, Functions<Boolean> functions) {
        super(0);
        this.$isClickableInScrollableContainer = snapshotState;
        this.$isRootInScrollableContainer = functions;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$isClickableInScrollableContainer.getValue().booleanValue() || this.$isRootInScrollableContainer.invoke().booleanValue());
    }
}
