package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.FixedCountSubcomposeSlotReusePolicy */
/* loaded from: classes.dex */
final class FixedCountSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    private final int maxSlotsToRetainForReuse;

    public FixedCountSubcomposeSlotReusePolicy(int i) {
        this.maxSlotsToRetainForReuse = i;
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        return true;
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        if (slotIds.size() > this.maxSlotsToRetainForReuse) {
            Iterator<Object> it = slotIds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                i++;
                if (i > this.maxSlotsToRetainForReuse) {
                    it.remove();
                }
            }
        }
    }
}
