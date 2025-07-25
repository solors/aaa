package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkTagDao.kt */
@Dao
@Metadata
/* loaded from: classes2.dex */
public interface WorkTagDao {

    /* compiled from: WorkTagDao.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static void insertTags(@NotNull WorkTagDao workTagDao, @NotNull String id2, @NotNull Set<String> tags) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(tags, "tags");
            for (String str : tags) {
                workTagDao.insert(new WorkTag(str, id2));
            }
        }
    }

    @Query("DELETE FROM worktag WHERE work_spec_id=:id")
    void deleteByWorkSpecId(@NotNull String str);

    @Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    @NotNull
    List<String> getTagsForWorkSpecId(@NotNull String str);

    @Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    @NotNull
    List<String> getWorkSpecIdsWithTag(@NotNull String str);

    @Insert(onConflict = 5)
    void insert(@NotNull WorkTag workTag);

    void insertTags(@NotNull String str, @NotNull Set<String> set);
}
