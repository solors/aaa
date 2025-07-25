package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.work.Data;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WorkProgressDao.kt */
@Dao
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface WorkProgressDao {
    @Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@NotNull String str);

    @Query("DELETE FROM WorkProgress")
    void deleteAll();

    @Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    @Nullable
    Data getProgressForWorkSpecId(@NotNull String str);

    @Insert(onConflict = 1)
    void insert(@NotNull WorkProgress workProgress);
}
