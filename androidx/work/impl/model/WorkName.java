package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkName.kt */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {"name", "work_spec_id"})
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class WorkName {
    @ColumnInfo(name = "name")
    @NotNull
    private final String name;
    @ColumnInfo(name = "work_spec_id")
    @NotNull
    private final String workSpecId;

    public WorkName(@NotNull String name, @NotNull String workSpecId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.name = name;
        this.workSpecId = workSpecId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
