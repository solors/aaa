package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@StabilityInferred(parameters = 0)
@InternalComposeApi
@Metadata
/* loaded from: classes.dex */
public final class MovableContentState {
    public static final int $stable = 8;
    @NotNull
    private final SlotTable slotTable;

    public MovableContentState(@NotNull SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        this.slotTable = slotTable;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }
}
