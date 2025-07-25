package androidx.work.impl.model;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WorkSpecDao.kt */
@Dao
@Metadata
@SuppressLint({"UnknownNullness"})
/* loaded from: classes2.dex */
public interface WorkSpecDao {
    @Query("DELETE FROM workspec WHERE id=:id")
    void delete(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT :maxLimit")
    @NotNull
    List<WorkSpec> getAllEligibleWorkSpecsForScheduling(int i);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    @NotNull
    List<String> getAllUnfinishedWork();

    @Query("SELECT id FROM workspec")
    @NotNull
    List<String> getAllWorkSpecIds();

    @Query("SELECT id FROM workspec")
    @Transaction
    @NotNull
    LiveData<List<String>> getAllWorkSpecIdsLiveData();

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    @NotNull
    List<WorkSpec> getEligibleWorkForScheduling(int i);

    @Query("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    @NotNull
    List<Data> getInputsFromPrerequisites(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE last_enqueue_time >= :startingAt AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC")
    @NotNull
    List<WorkSpec> getRecentlyCompletedWork(long j);

    @Query("SELECT * FROM workspec WHERE state=1")
    @NotNull
    List<WorkSpec> getRunningWork();

    @Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    @NotNull
    LiveData<Long> getScheduleRequestedAtLiveData(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    @NotNull
    List<WorkSpec> getScheduledWork();

    @Query("SELECT state FROM workspec WHERE id=:id")
    @Nullable
    WorkInfo.State getState(@NotNull String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<String> getUnfinishedWorkWithName(@NotNull String str);

    @Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @NotNull
    List<String> getUnfinishedWorkWithTag(@NotNull String str);

    @Query("SELECT * FROM workspec WHERE id=:id")
    @Nullable
    WorkSpec getWorkSpec(@NotNull String str);

    @Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @NotNull
    List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(@NotNull String str);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=:id")
    @Transaction
    @Nullable
    WorkSpec.WorkInfoPojo getWorkStatusPojoForId(@NotNull String str);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(@NotNull List<String> list);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(@NotNull String str);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(@NotNull String str);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (:ids)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(@NotNull List<String> list);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(@NotNull String str);

    @Query("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @Transaction
    @NotNull
    LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(@NotNull String str);

    @Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @Query("UPDATE workspec SET generation=generation+1 WHERE id=:id")
    void incrementGeneration(@NotNull String str);

    @Query("UPDATE workspec SET period_count=period_count+1 WHERE id=:id")
    void incrementPeriodCount(@NotNull String str);

    @Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(@NotNull String str);

    @Insert(onConflict = 5)
    void insertWorkSpec(@NotNull WorkSpec workSpec);

    @Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@NotNull String str, long j);

    @Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(@NotNull String str);

    @Query("UPDATE workspec SET last_enqueue_time=:enqueueTime WHERE id=:id")
    void setLastEnqueuedTime(@NotNull String str, long j);

    @Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(@NotNull String str, @NotNull Data data);

    @Query("UPDATE workspec SET state=:state WHERE id=:id")
    int setState(@NotNull WorkInfo.State state, @NotNull String str);

    @Update
    void updateWorkSpec(@NotNull WorkSpec workSpec);
}
