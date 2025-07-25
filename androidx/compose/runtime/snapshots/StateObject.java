package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Snapshot.kt */
@Metadata
/* loaded from: classes.dex */
public interface StateObject {

    /* compiled from: Snapshot.kt */
    @Metadata
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        public static StateRecord mergeRecords(@NotNull StateObject stateObject, @NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
            Intrinsics.checkNotNullParameter(previous, "previous");
            Intrinsics.checkNotNullParameter(current, "current");
            Intrinsics.checkNotNullParameter(applied, "applied");
            return StateObject.super.mergeRecords(previous, current, applied);
        }
    }

    @NotNull
    StateRecord getFirstStateRecord();

    @Nullable
    default StateRecord mergeRecords(@NotNull StateRecord previous, @NotNull StateRecord current, @NotNull StateRecord applied) {
        Intrinsics.checkNotNullParameter(previous, "previous");
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(applied, "applied");
        return null;
    }

    void prependStateRecord(@NotNull StateRecord stateRecord);
}
