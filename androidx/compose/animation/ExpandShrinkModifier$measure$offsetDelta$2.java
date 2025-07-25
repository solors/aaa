package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$offsetDelta$2 extends Lambda implements Function1<EnterExitState, IntOffset> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$offsetDelta$2(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
        return IntOffset.m109843boximpl(m105982invokeBjo55l4(enterExitState));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m105982invokeBjo55l4(@NotNull EnterExitState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.m105980targetOffsetByStateoFUgxo0(it, this.$measuredSize);
    }
}
