package androidx.compose.foundation.lazy.grid;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyGridScrolling.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ List<LazyGridItemInfo> $visibleItems;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyGridScrollingKt$calculateLineAverageMainAxisSize$lineOf$1(boolean z, List<? extends LazyGridItemInfo> list) {
        super(1);
        this.$isVertical = z;
        this.$visibleItems = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf(this.$isVertical ? this.$visibleItems.get(i).getRow() : this.$visibleItems.get(i).getColumn());
    }
}
