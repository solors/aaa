package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SystemIdInfo.kt */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class SystemIdInfo {
    @ColumnInfo(defaultValue = "0")
    private final int generation;
    @ColumnInfo(name = "system_id")
    public final int systemId;
    @ColumnInfo(name = "work_spec_id")
    @NotNull
    public final String workSpecId;

    public SystemIdInfo(@NotNull String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.workSpecId = workSpecId;
        this.generation = i;
        this.systemId = i2;
    }

    public static /* synthetic */ SystemIdInfo copy$default(SystemIdInfo systemIdInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = systemIdInfo.workSpecId;
        }
        if ((i3 & 2) != 0) {
            i = systemIdInfo.generation;
        }
        if ((i3 & 4) != 0) {
            i2 = systemIdInfo.systemId;
        }
        return systemIdInfo.copy(str, i, i2);
    }

    @NotNull
    public final String component1() {
        return this.workSpecId;
    }

    public final int component2() {
        return this.generation;
    }

    public final int component3() {
        return this.systemId;
    }

    @NotNull
    public final SystemIdInfo copy(@NotNull String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        return new SystemIdInfo(workSpecId, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SystemIdInfo)) {
            return false;
        }
        SystemIdInfo systemIdInfo = (SystemIdInfo) obj;
        if (Intrinsics.m17075f(this.workSpecId, systemIdInfo.workSpecId) && this.generation == systemIdInfo.generation && this.systemId == systemIdInfo.systemId) {
            return true;
        }
        return false;
    }

    public final int getGeneration() {
        return this.generation;
    }

    public int hashCode() {
        return (((this.workSpecId.hashCode() * 31) + Integer.hashCode(this.generation)) * 31) + Integer.hashCode(this.systemId);
    }

    @NotNull
    public String toString() {
        return "SystemIdInfo(workSpecId=" + this.workSpecId + ", generation=" + this.generation + ", systemId=" + this.systemId + ')';
    }
}
