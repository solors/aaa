package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.work.Data;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkProgress.kt */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class WorkProgress {
    @ColumnInfo(name = "progress")
    @NotNull
    private final Data progress;
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    @NotNull
    private final String workSpecId;

    public WorkProgress(@NotNull String workSpecId, @NotNull Data progress) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.workSpecId = workSpecId;
        this.progress = progress;
    }

    @NotNull
    public final Data getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
