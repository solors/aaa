package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotMutableState.kt */
@Metadata
/* loaded from: classes.dex */
public interface SnapshotMutableState<T> extends SnapshotState<T> {
    @NotNull
    SnapshotMutationPolicy<T> getPolicy();
}
