package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalFoundationApi
@Metadata
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemReusePolicy */
/* loaded from: classes.dex */
final class LazyLayout implements SubcomposeSlotReusePolicy {
    @NotNull
    private final Map<Object, Integer> countPerType;
    @NotNull
    private final LazyLayoutItemContentFactory factory;

    public LazyLayout(@NotNull LazyLayoutItemContentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
        this.countPerType = new LinkedHashMap();
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        return Intrinsics.m17075f(this.factory.getContentType(obj), this.factory.getContentType(obj2));
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        int i;
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        this.countPerType.clear();
        Iterator<Object> it = slotIds.iterator();
        while (it.hasNext()) {
            Object contentType = this.factory.getContentType(it.next());
            Integer num = this.countPerType.get(contentType);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            if (i == 7) {
                it.remove();
            } else {
                this.countPerType.put(contentType, Integer.valueOf(i + 1));
            }
        }
    }
}
