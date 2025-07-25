package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snapshot.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    @Nullable
    private StateRecord next;
    private int snapshotId = SnapshotKt.currentSnapshot().getId();

    public abstract void assign(@NotNull StateRecord stateRecord);

    @NotNull
    public abstract StateRecord create();

    @Nullable
    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final int getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(@Nullable StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(int i) {
        this.snapshotId = i;
    }
}
