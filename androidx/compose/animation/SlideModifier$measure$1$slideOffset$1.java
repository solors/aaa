package androidx.compose.animation;

import androidx.compose.p015ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
public final class SlideModifier$measure$1$slideOffset$1 extends Lambda implements Function1<EnterExitState, IntOffset> {
    final /* synthetic */ long $measuredSize;
    final /* synthetic */ SlideModifier this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideModifier$measure$1$slideOffset$1(SlideModifier slideModifier, long j) {
        super(1);
        this.this$0 = slideModifier;
        this.$measuredSize = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
        return IntOffset.m109843boximpl(m105997invokeBjo55l4(enterExitState));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m105997invokeBjo55l4(@NotNull EnterExitState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.this$0.m105996targetValueByStateoFUgxo0(it, this.$measuredSize);
    }
}
