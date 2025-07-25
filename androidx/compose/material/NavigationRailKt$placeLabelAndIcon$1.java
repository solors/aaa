package androidx.compose.material;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: NavigationRail.kt */
@Metadata
/* loaded from: classes.dex */
final class NavigationRailKt$placeLabelAndIcon$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $iconPlaceable;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ int $iconX;
    final /* synthetic */ Placeable $labelPlaceable;
    final /* synthetic */ int $labelX;
    final /* synthetic */ int $labelY;
    final /* synthetic */ int $offset;
    final /* synthetic */ int $selectedIconY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationRailKt$placeLabelAndIcon$1(float f, Placeable placeable, int i, int i2, int i3, Placeable placeable2, int i4, int i5) {
        super(1);
        this.$iconPositionAnimationProgress = f;
        this.$labelPlaceable = placeable;
        this.$labelX = i;
        this.$labelY = i2;
        this.$offset = i3;
        this.$iconPlaceable = placeable2;
        this.$iconX = i4;
        this.$selectedIconY = i5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        if (!(this.$iconPositionAnimationProgress == 0.0f)) {
            Placeable.PlacementScope.placeRelative$default(layout, this.$labelPlaceable, this.$labelX, this.$labelY + this.$offset, 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(layout, this.$iconPlaceable, this.$iconX, this.$selectedIconY + this.$offset, 0.0f, 4, null);
    }
}
