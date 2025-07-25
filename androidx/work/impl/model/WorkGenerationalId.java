package androidx.work.impl.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WorkSpec.kt */
@Metadata
/* loaded from: classes2.dex */
public final class WorkGenerationalId {
    private final int generation;
    @NotNull
    private final String workSpecId;

    public WorkGenerationalId(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i;
    }

    public static /* synthetic */ WorkGenerationalId copy$default(WorkGenerationalId workGenerationalId, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = workGenerationalId.workSpecId;
        }
        if ((i2 & 2) != 0) {
            i = workGenerationalId.generation;
        }
        return workGenerationalId.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    @NotNull
    public final WorkGenerationalId copy(@NotNull String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new WorkGenerationalId(workSpecId, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WorkGenerationalId)) {
            return false;
        }
        WorkGenerationalId workGenerationalId = (WorkGenerationalId) obj;
        if (Intrinsics.m17075f(this.workSpecId, workGenerationalId.workSpecId) && this.generation == workGenerationalId.generation) {
            return true;
        }
        return false;
    }

    public final int getGeneration() {
        return this.generation;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.workSpecId;
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation);
    }

    @NotNull
    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ')';
    }
}
