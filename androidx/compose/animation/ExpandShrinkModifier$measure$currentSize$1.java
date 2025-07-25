package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$currentSize$1 extends Lambda implements Function1<EnterExitState, IntSize> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ ExpandShrinkModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$currentSize$1(ExpandShrinkModifier expandShrinkModifier, long j) {
        super(1);
        this.this$0 = expandShrinkModifier;
        this.$measuredSize = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
        return IntSize.m109886boximpl(m105981invokeYEO4UFw(enterExitState));
    }

    /* renamed from: invoke-YEO4UFw  reason: not valid java name */
    public final long m105981invokeYEO4UFw(@NotNull EnterExitState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.m105979sizeByStateUzc_VyU(it, this.$measuredSize);
    }
}
