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
final class EnterExitTransitionKt$slideInVertically$2 extends Lambda implements Function1<IntSize, IntOffset> {
    final /* synthetic */ Function1<Integer, Integer> $initialOffsetY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$slideInVertically$2(Function1<? super Integer, Integer> function1) {
        super(1);
        this.$initialOffsetY = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
        return IntOffset.m109843boximpl(m105976invokemHKZG7I(intSize.m109898unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I  reason: not valid java name */
    public final long m105976invokemHKZG7I(long j) {
        return IntOffsetKt.IntOffset(0, this.$initialOffsetY.invoke(Integer.valueOf(IntSize.m109893getHeightimpl(j))).intValue());
    }
}
