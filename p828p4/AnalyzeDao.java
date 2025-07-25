package p828p4;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import java.util.List;
import p842q4.EventEntity;
import p842q4.EventPropertiesEntity;
import p842q4.PublicPropertiesEntity;
import p842q4.UserPropertiesEntity;

@Dao
/* renamed from: p4.a */
/* loaded from: classes6.dex */
public abstract class AnalyzeDao {
    @Insert(onConflict = 1)
    /* renamed from: a */
    public abstract long mo13316a(EventEntity eventEntity);

    @Insert(onConflict = 1)
    /* renamed from: b */
    public abstract long mo13315b(EventPropertiesEntity eventPropertiesEntity);

    @Insert(onConflict = 1)
    /* renamed from: c */
    public abstract long mo13314c(PublicPropertiesEntity publicPropertiesEntity);

    @Insert(onConflict = 1)
    /* renamed from: d */
    public abstract long mo13313d(UserPropertiesEntity userPropertiesEntity);

    @Query("DELETE FROM event_property  WHERE commitId >= (:startCommitId) and commitId <= (:endCommitId)")
    @Transaction
    /* renamed from: e */
    public abstract void mo13312e(long j, long j2);

    @Query("DELETE FROM events WHERE commitId == (:commitId)")
    /* renamed from: f */
    public abstract int mo13311f(long j);

    @Query("DELETE FROM events WHERE timestamp <= (:time)")
    /* renamed from: g */
    public abstract int mo13310g(long j);

    @Query("DELETE FROM dynamic_property  WHERE commitId >= (:startCommitId) and commitId <= (:endCommitId)")
    @Transaction
    /* renamed from: h */
    public abstract void mo13309h(long j, long j2);

    @Query("DELETE FROM user_property  WHERE commitId >= (:startCommitId) and commitId <= (:endCommitId)")
    @Transaction
    /* renamed from: i */
    public abstract void mo13308i(long j, long j2);

    @Query("SELECT * FROM event_property Order by commitId")
    @Transaction
    /* renamed from: j */
    public abstract EventPropertiesEntity[] mo13307j();

    @Query("SELECT * FROM events WHERE commitId = (:commitId)")
    /* renamed from: k */
    public abstract List<EventEntity> mo13306k(long j);

    @Query("SELECT COUNT(*) FROM events WHERE commitId == (:commitId)")
    /* renamed from: l */
    public abstract int mo13305l(long j);

    @Query("SELECT MIN(commitId) FROM events WHERE timestamp < (:time)")
    /* renamed from: m */
    public abstract long mo13304m(long j);

    @Query("SELECT MAX(commitId) FROM event_property")
    /* renamed from: n */
    public abstract long mo13303n();

    @Query("SELECT MAX(commitId) FROM events")
    /* renamed from: o */
    public abstract long mo13302o();

    @Query("SELECT MAX(commitId) FROM dynamic_property")
    /* renamed from: p */
    public abstract long mo13301p();

    @Query("SELECT MAX(commitId) FROM user_property")
    /* renamed from: q */
    public abstract long mo13300q();

    @Query("SELECT MIN(commitId) FROM events")
    /* renamed from: r */
    public abstract long mo13299r();

    @Query("SELECT MIN(commitId) FROM events WHERE timestamp >= (:time)")
    /* renamed from: s */
    public abstract long mo13298s(long j);

    @Query("SELECT * FROM dynamic_property Order by commitId")
    @Transaction
    /* renamed from: t */
    public abstract PublicPropertiesEntity[] mo13297t();

    @Query("SELECT * FROM user_property Order by commitId")
    @Transaction
    /* renamed from: u */
    public abstract UserPropertiesEntity[] mo13296u();
}
