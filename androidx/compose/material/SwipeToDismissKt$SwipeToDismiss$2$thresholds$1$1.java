package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends Lambda implements Function2<DismissValue, DismissValue, ThresholdConfig> {
    final /* synthetic */ Function1<SwipeToDismiss, ThresholdConfig> $dismissThresholds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(Function1<? super SwipeToDismiss, ? extends ThresholdConfig> function1) {
        super(2);
        this.$dismissThresholds = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ThresholdConfig mo105910invoke(@NotNull DismissValue from, @NotNull DismissValue to) {
        SwipeToDismiss dismissDirection;
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to, "to");
        Function1<SwipeToDismiss, ThresholdConfig> function1 = this.$dismissThresholds;
        dismissDirection = SwipeToDismissKt.getDismissDirection(from, to);
        Intrinsics.m17074g(dismissDirection);
        return function1.invoke(dismissDirection);
    }
}
