package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkNameDao.kt */
@Dao
@Metadata
/* loaded from: classes2.dex */
public interface WorkNameDao {
    @Query("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    @NotNull
    List<String> getNamesForWorkSpecId(@NotNull String str);

    @Query("SELECT work_spec_id FROM workname WHERE name=:name")
    @NotNull
    List<String> getWorkSpecIdsWithName(@NotNull String str);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkName workName);
}
