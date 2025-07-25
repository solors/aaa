package androidx.compose.foundation.lazy;

import androidx.compose.p015ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListMeasure.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyListMeasureKt$measureLazyList$3 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ LazyListPositionedItem $headerItem;
    final /* synthetic */ List<LazyListPositionedItem> $positionedItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListMeasureKt$measureLazyList$3(List<LazyListPositionedItem> list, LazyListPositionedItem lazyListPositionedItem) {
        super(1);
        this.$positionedItems = list;
        this.$headerItem = lazyListPositionedItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Placeable.PlacementScope invoke) {
        Intrinsics.checkNotNullParameter(invoke, "$this$invoke");
        List<LazyListPositionedItem> list = this.$positionedItems;
        LazyListPositionedItem lazyListPositionedItem = this.$headerItem;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            LazyListPositionedItem lazyListPositionedItem2 = list.get(i);
            if (lazyListPositionedItem2 != lazyListPositionedItem) {
                lazyListPositionedItem2.place(invoke);
            }
        }
        LazyListPositionedItem lazyListPositionedItem3 = this.$headerItem;
        if (lazyListPositionedItem3 != null) {
            lazyListPositionedItem3.place(invoke);
        }
    }
}
