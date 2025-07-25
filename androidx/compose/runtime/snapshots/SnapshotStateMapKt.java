package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SnapshotStateMap.kt */
@Metadata
/* loaded from: classes.dex */
public final class SnapshotStateMapKt {
    @NotNull
    private static final Object sync = new Object();

    @NotNull
    public static final Void unsupported() {
        throw new UnsupportedOperationException();
    }
}
