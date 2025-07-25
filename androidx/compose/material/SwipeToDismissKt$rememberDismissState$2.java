package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
final class SwipeToDismissKt$rememberDismissState$2 extends Lambda implements Functions<DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmStateChange;
    final /* synthetic */ DismissValue $initialValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$rememberDismissState$2(DismissValue dismissValue, Function1<? super DismissValue, Boolean> function1) {
        super(0);
        this.$initialValue = dismissValue;
        this.$confirmStateChange = function1;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final DismissState invoke() {
        return new DismissState(this.$initialValue, this.$confirmStateChange);
    }
}
