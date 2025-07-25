package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.IntervalList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: LazyListItemProviderImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class LazyListItemProviderImplKt$generateKeyToIndexMap$1$1 extends Lambda implements Function1<IntervalList.Interval<LazyListIntervalContent>, Unit> {
    final /* synthetic */ int $first;
    final /* synthetic */ int $last;
    final /* synthetic */ HashMap<Object, Integer> $map;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListItemProviderImplKt$generateKeyToIndexMap$1$1(int i, int i2, HashMap<Object, Integer> hashMap) {
        super(1);
        this.$first = i;
        this.$last = i2;
        this.$map = hashMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntervalList.Interval<LazyListIntervalContent> interval) {
        invoke2(interval);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull IntervalList.Interval<LazyListIntervalContent> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getValue().getKey() == null) {
            return;
        }
        Function1<Integer, Object> key = it.getValue().getKey();
        if (key != null) {
            int max = Math.max(this.$first, it.getStartIndex());
            int min = Math.min(this.$last, (it.getStartIndex() + it.getSize()) - 1);
            if (max > min) {
                return;
            }
            while (true) {
                this.$map.put(key.invoke(Integer.valueOf(max - it.getStartIndex())), Integer.valueOf(max));
                if (max == min) {
                    return;
                }
                max++;
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }
}
