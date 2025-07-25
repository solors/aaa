package androidx.compose.animation;

import androidx.compose.p015ui.layout.Placeable;
import androidx.compose.p015ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class ExpandShrinkModifier$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ long $offset;
    final /* synthetic */ long $offsetDelta;
    final /* synthetic */ Placeable $placeable;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandShrinkModifier$measure$1(Placeable placeable, long j, long j2) {
        super(1);
        this.$placeable = placeable;
        this.$offset = j;
        this.$offsetDelta = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable.PlacementScope.place$default(layout, this.$placeable, IntOffset.m109852getXimpl(this.$offset) + IntOffset.m109852getXimpl(this.$offsetDelta), IntOffset.m109853getYimpl(this.$offset) + IntOffset.m109853getYimpl(this.$offsetDelta), 0.0f, 4, null);
    }
}
