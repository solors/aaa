package com.learnings.purchase.event.p403db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;

@Dao
/* renamed from: com.learnings.purchase.event.db.EventDao */
/* loaded from: classes6.dex */
public interface EventDao {
    @Delete
    void delete(List<EventEntity> list);

    @Query("select * from purchase_event")
    List<EventEntity> queryUnUploadData();

    @Insert(onConflict = 1)
    void save(EventEntity eventEntity);
}
