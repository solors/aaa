package com.learnings.purchase.event.p403db;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.p021db.SupportSQLiteDatabase;

@Database(entities = {EventEntity.class}, exportSchema = false, version = 2)
/* renamed from: com.learnings.purchase.event.db.EventDataBase */
/* loaded from: classes6.dex */
public abstract class EventDataBase extends RoomDatabase {
    private static EventDataBase sDataBase;

    public static EventDataBase getDataBase() {
        return sDataBase;
    }

    public static EventDataBase init(Context context) {
        EventDataBase eventDataBase = (EventDataBase) Room.databaseBuilder(context, EventDataBase.class, "purchase_db").addMigrations(new Migration(1, 2) { // from class: com.learnings.purchase.event.db.EventDataBase.1
            @Override // androidx.room.migration.Migration
            public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS purchase_event (eventId TEXT PRIMARY KEY NOT NULL,eventJson TEXT)");
            }
        }).build();
        sDataBase = eventDataBase;
        return eventDataBase;
    }

    public abstract EventDao getDao();
}
