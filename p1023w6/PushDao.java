package p1023w6;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import java.util.List;

@Dao
/* renamed from: w6.c */
/* loaded from: classes5.dex */
public interface PushDao {
    @Query("SELECT * FROM push WHERE (repeatCount != 0) and status != 1")
    /* renamed from: a */
    List<PushEntity> mo2340a();

    @Insert(onConflict = 1)
    /* renamed from: b */
    void mo2339b(List<NotificationContentEntity> list);

    @Query("DELETE FROM push_content WHERE contentId = :contentId")
    /* renamed from: c */
    void mo2338c(String str);

    @Insert(onConflict = 1)
    /* renamed from: d */
    void mo2337d(List<PushEntity> list);

    @Query("SELECT * FROM push_content WHERE contentId = :contentId")
    /* renamed from: e */
    NotificationContentEntity mo2336e(String str);

    @Query("SELECT * FROM push WHERE repeatCount == -1")
    /* renamed from: f */
    List<PushEntity> mo2335f();

    @Query("SELECT * FROM push WHERE id = :entityId")
    /* renamed from: g */
    PushEntity mo2334g(int i);

    @Delete
    /* renamed from: h */
    void mo2333h(PushEntity pushEntity);

    @Insert(onConflict = 1)
    /* renamed from: i */
    long mo2332i(PushEntity pushEntity);

    @Query("SELECT * FROM push WHERE eventId = :eventId")
    PushEntity query(String str);
}
