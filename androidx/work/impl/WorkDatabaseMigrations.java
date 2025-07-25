package androidx.work.impl;

import android.content.ContentValues;
import androidx.room.RenameColumn;
import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RenameColumn(fromColumnName = "period_start_time", tableName = "WorkSpec", toColumnName = "last_enqueue_time")
@Metadata
/* renamed from: androidx.work.impl.AutoMigration_14_15 */
/* loaded from: classes2.dex */
public final class WorkDatabaseMigrations implements AutoMigrationSpec {
    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL("UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0");
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("last_enqueue_time", Long.valueOf(System.currentTimeMillis()));
        db.update("WorkSpec", 3, contentValues, "last_enqueue_time = 0 AND interval_duration <> 0 ", new Object[0]);
    }
}
