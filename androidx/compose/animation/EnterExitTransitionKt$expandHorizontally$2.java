package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.p015ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionKt$expandHorizontally$2 extends Lambda implements Function1<IntSize, IntSize> {
    final /* synthetic */ Function1<Integer, Integer> $initialWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$expandHorizontally$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$initialWidth = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
        return IntSize.m109886boximpl(m105965invokemzRDjE0(intSize.m109898unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0  reason: not valid java name */
    public final long m105965invokemzRDjE0(long j) {
        return IntSizeKt.IntSize(this.$initialWidth.invoke(Integer.valueOf(IntSize.m109894getWidthimpl(j))).intValue(), IntSize.m109893getHeightimpl(j));
    }
}
