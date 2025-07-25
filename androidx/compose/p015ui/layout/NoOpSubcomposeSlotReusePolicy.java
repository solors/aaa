package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SubcomposeLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.NoOpSubcomposeSlotReusePolicy */
/* loaded from: classes.dex */
final class NoOpSubcomposeSlotReusePolicy implements SubcomposeSlotReusePolicy {
    @NotNull
    public static final NoOpSubcomposeSlotReusePolicy INSTANCE = new NoOpSubcomposeSlotReusePolicy();

    private NoOpSubcomposeSlotReusePolicy() {
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public boolean areCompatible(@Nullable Object obj, @Nullable Object obj2) {
        return false;
    }

    @Override // androidx.compose.p015ui.layout.SubcomposeSlotReusePolicy
    public void getSlotsToRetain(@NotNull SubcomposeSlotReusePolicy.SlotIdsSet slotIds) {
        Intrinsics.checkNotNullParameter(slotIds, "slotIds");
        slotIds.clear();
    }
}
