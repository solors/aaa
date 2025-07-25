package androidx.work.impl.model;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SystemIdInfoDao.kt */
@Dao
@Metadata
/* loaded from: classes2.dex */
public interface SystemIdInfoDao {

    /* compiled from: SystemIdInfoDao.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Nullable
        public static SystemIdInfo getSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao, @NotNull WorkGenerationalId id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            return systemIdInfoDao.getSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
        }

        public static void removeSystemIdInfo(@NotNull SystemIdInfoDao systemIdInfoDao, @NotNull WorkGenerationalId id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            systemIdInfoDao.removeSystemIdInfo(id2.getWorkSpecId(), id2.getGeneration());
        }
    }

    @Nullable
    SystemIdInfo getSystemIdInfo(@NotNull WorkGenerationalId workGenerationalId);

    @Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId AND generation=:generation")
    @Nullable
    SystemIdInfo getSystemIdInfo(@NotNull String str, int i);

    @Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    @NotNull
    List<String> getWorkSpecIds();

    @Insert(onConflict = 1)
    void insertSystemIdInfo(@NotNull SystemIdInfo systemIdInfo);

    void removeSystemIdInfo(@NotNull WorkGenerationalId workGenerationalId);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@NotNull String str);

    @Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId AND generation=:generation")
    void removeSystemIdInfo(@NotNull String str, int i);
}
