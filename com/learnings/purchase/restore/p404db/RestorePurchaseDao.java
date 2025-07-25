package com.learnings.purchase.restore.p404db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
/* renamed from: com.learnings.purchase.restore.db.RestorePurchaseDao */
/* loaded from: classes6.dex */
public interface RestorePurchaseDao {
    @Delete
    void delete(RestorePurchaseEntity restorePurchaseEntity);

    @Query("SELECT * FROM restore_purchase WHERE token = :token")
    RestorePurchaseEntity queryPurchase(String str);

    @Insert(onConflict = 1)
    void save(RestorePurchaseEntity restorePurchaseEntity);
}
