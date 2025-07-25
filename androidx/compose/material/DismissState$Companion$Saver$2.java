package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
final class DismissState$Companion$Saver$2 extends Lambda implements Function1<DismissValue, DismissState> {
    final /* synthetic */ Function1<DismissValue, Boolean> $confirmStateChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DismissState$Companion$Saver$2(Function1<? super DismissValue, Boolean> function1) {
        super(1);
        this.$confirmStateChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final DismissState invoke(@NotNull DismissValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new DismissState(it, this.$confirmStateChange);
    }
}
