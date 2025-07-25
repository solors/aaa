package com.learnings.purchase.restore.p404db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {RestorePurchaseEntity.class}, exportSchema = false, version = 1)
/* renamed from: com.learnings.purchase.restore.db.RestorePurchaseDataBase */
/* loaded from: classes6.dex */
public abstract class RestorePurchaseDataBase extends RoomDatabase {
    private static RestorePurchaseDataBase sDataBase;

    public static RestorePurchaseDataBase getDataBase() {
        return sDataBase;
    }

    public static RestorePurchaseDataBase init(Context context) {
        RestorePurchaseDataBase restorePurchaseDataBase = (RestorePurchaseDataBase) Room.databaseBuilder(context, RestorePurchaseDataBase.class, "restore_purchase_db").build();
        sDataBase = restorePurchaseDataBase;
        return restorePurchaseDataBase;
    }

    public abstract RestorePurchaseDao getDao();
}
