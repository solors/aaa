package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.RawQuery;
import androidx.sqlite.p021db.SupportSQLiteQuery;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RawWorkInfoDao.kt */
@Dao
@Metadata
/* loaded from: classes2.dex */
public interface RawWorkInfoDao {
    @RawQuery(observedEntities = {WorkSpec.class})
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(@NotNull SupportSQLiteQuery supportSQLiteQuery);

    @RawQuery(observedEntities = {WorkSpec.class})
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(@NotNull SupportSQLiteQuery supportSQLiteQuery);
}
