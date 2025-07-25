package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.uj */
/* loaded from: classes9.dex */
public final class C34941uj extends DatabaseScript {
    @Override // io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS temp_cache (id INTEGER PRIMARY KEY,scope TEXT,data BLOB,timestamp INTEGER)");
    }
}
