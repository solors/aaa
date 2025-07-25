package androidx.compose.foundation.lazy.grid;

import androidx.compose.p015ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridMeasure.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridMeasureKt$measureLazyGrid$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<LazyGridPositionedItem> $positionedItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridMeasureKt$measureLazyGrid$3(List<LazyGridPositionedItem> list) {
        super(1);
        this.$positionedItems = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        List<LazyGridPositionedItem> list = this.$positionedItems;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).place(invoke);
        }
    }
}
