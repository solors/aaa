package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Snapshot.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* loaded from: classes.dex */
public final class SnapshotApplyConflictException extends Exception {
    public static final int $stable = 8;
    @NotNull
    private final Snapshot snapshot;

    public SnapshotApplyConflictException(@NotNull Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        this.snapshot = snapshot;
    }

    @NotNull
    public final Snapshot getSnapshot() {
        return this.snapshot;
    }
}
