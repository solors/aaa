package androidx.room.migration;

import androidx.annotation.NonNull;
import androidx.sqlite.p021db.SupportSQLiteDatabase;

/* loaded from: classes2.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
    }
}
