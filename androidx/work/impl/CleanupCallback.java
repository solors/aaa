package androidx.work.impl;

import androidx.room.RoomDatabase;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: WorkDatabase.kt */
@Metadata
/* loaded from: classes2.dex */
public final class CleanupCallback extends RoomDatabase.Callback {
    @NotNull
    public static final CleanupCallback INSTANCE = new CleanupCallback();

    private CleanupCallback() {
    }

    private final String getPruneSQL() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < " + getPruneDate() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public final long getPruneDate() {
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        j = WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS;
        return currentTimeMillis - j;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public void onOpen(@NotNull SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.onOpen(db);
        db.beginTransaction();
        try {
            db.execSQL(getPruneSQL());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
