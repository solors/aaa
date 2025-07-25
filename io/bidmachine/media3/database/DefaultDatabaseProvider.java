package io.bidmachine.media3.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class DefaultDatabaseProvider implements DatabaseProvider {
    private final SQLiteOpenHelper sqliteOpenHelper;

    public DefaultDatabaseProvider(SQLiteOpenHelper sQLiteOpenHelper) {
        this.sqliteOpenHelper = sQLiteOpenHelper;
    }

    @Override // io.bidmachine.media3.database.DatabaseProvider
    public SQLiteDatabase getReadableDatabase() {
        return this.sqliteOpenHelper.getReadableDatabase();
    }

    @Override // io.bidmachine.media3.database.DatabaseProvider
    public SQLiteDatabase getWritableDatabase() {
        return this.sqliteOpenHelper.getWritableDatabase();
    }
}
