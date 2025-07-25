package com.meevii.push.local.data.p541db;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import p1023w6.PushDao;
import p1023w6.PushEntity;

@Database(entities = {PushEntity.class, NotificationContentEntity.class}, exportSchema = false, version = 4)
/* renamed from: com.meevii.push.local.data.db.PushDatabase */
/* loaded from: classes5.dex */
public abstract class PushDatabase extends RoomDatabase {

    /* renamed from: a */
    private static PushDatabase f61584a;

    /* renamed from: b */
    static final Migration f61585b = new C23323a(1, 2);

    /* renamed from: c */
    static final Migration f61586c = new C23324b(2, 3);

    /* renamed from: d */
    static final Migration f61587d = new C23325c(3, 4);

    /* renamed from: com.meevii.push.local.data.db.PushDatabase$a */
    /* loaded from: classes5.dex */
    class C23323a extends Migration {
        C23323a(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS push_tem (id INTEGER PRIMARY KEY NOT NULL,createTime INTEGER NOT NULL,pushTime INTEGER NOT NULL,randomDelayInterval INTEGER NOT NULL,eventId TEXT,repeatCount INTEGER NOT NULL,repeatTime INTEGER NOT NULL,status INTEGER NOT NULL,extension TEXT,contents TEXT)");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS push_content");
            supportSQLiteDatabase.execSQL("CREATE TABLE push_content (contentId TEXT PRIMARY KEY NOT NULL,title TEXT,content TEXT,largeIconRes INTEGER NOT NULL,largeIconFilePath TEXT,contentImageRes INTEGER NOT NULL,contentImageFilePath TEXT)");
            supportSQLiteDatabase.execSQL("INSERT INTO push_tem (id, createTime, pushTime, randomDelayInterval, eventId, repeatCount, repeatTime, status, extension, contents) SELECT id, createTime, pushTime, randomDelayInterval, eventId, repeatCount, repeatTime, status, extension, ('void+'||id) FROM push");
            supportSQLiteDatabase.execSQL("INSERT INTO push_content (contentId, title, content, largeIconRes, contentImageRes)SELECT ('void+'||id), title, content, 0, 0 FROM push");
            supportSQLiteDatabase.execSQL("DROP TABLE push");
            supportSQLiteDatabase.execSQL("ALTER  TABLE push_tem RENAME TO push");
        }
    }

    /* renamed from: com.meevii.push.local.data.db.PushDatabase$b */
    /* loaded from: classes5.dex */
    class C23324b extends Migration {
        C23324b(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN largeIconResName TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN contentImageResName TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN sound TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN vibration INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN normalFloat INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN bgImageRes INTEGER NOT NULL DEFAULT 0");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN bgImageResName TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN bgImageFilePath TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN bgColor TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN btnBgColor TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE push_content ADD COLUMN btnContent TEXT");
        }
    }

    /* renamed from: com.meevii.push.local.data.db.PushDatabase$c */
    /* loaded from: classes5.dex */
    class C23325c extends Migration {
        C23325c(int i, int i2) {
            super(i, i2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("ALTER TABLE push ADD COLUMN disturbType INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: b */
    public static PushDatabase m47914b() {
        return f61584a;
    }

    /* renamed from: c */
    public static void m47913c(Context context) {
        if (f61584a != null) {
            return;
        }
        f61584a = (PushDatabase) Room.databaseBuilder(context, PushDatabase.class, "meevii_push_db").addMigrations(f61585b, f61586c, f61587d).fallbackToDestructiveMigrationOnDowngrade().build();
    }

    /* renamed from: a */
    public abstract PushDao mo47912a();
}
