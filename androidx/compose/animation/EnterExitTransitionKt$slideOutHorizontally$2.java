package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntOffset;
import androidx.compose.p015ui.unit.IntOffsetKt;
import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideOutHorizontally$2 extends Lambda implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $targetOffsetX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$slideOutHorizontally$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$targetOffsetX = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
        return IntOffset.m109843boximpl(m105977invokemHKZG7I(intSize.m109898unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m105977invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(this.$targetOffsetX.invoke(Integer.valueOf(IntSize.m109894getWidthimpl(j))).intValue(), 0);
    }
}
