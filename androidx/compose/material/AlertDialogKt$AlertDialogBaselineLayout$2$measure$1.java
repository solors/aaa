package androidx.compose.material;

import androidx.compose.p015ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AlertDialog.kt */
@Metadata
/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogBaselineLayout$2$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ Placeable $textPlaceable;
    final /* synthetic */ int $textPositionY;
    final /* synthetic */ Placeable $titlePlaceable;
    final /* synthetic */ int $titlePositionY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(Placeable placeable, int i, Placeable placeable2, int i2) {
        super(1);
        this.$titlePlaceable = placeable;
        this.$titlePositionY = i;
        this.$textPlaceable = placeable2;
        this.$textPositionY = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        Placeable placeable = this.$titlePlaceable;
        if (placeable != null) {
            Placeable.PlacementScope.place$default(layout, placeable, 0, this.$titlePositionY, 0.0f, 4, null);
        }
        Placeable placeable2 = this.$textPlaceable;
        if (placeable2 != null) {
            Placeable.PlacementScope.place$default(layout, placeable2, 0, this.$textPositionY, 0.0f, 4, null);
        }
    }
}
