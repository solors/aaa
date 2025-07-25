package com.google.android.exoplayer2.database;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes4.dex */
public final class DefaultDatabaseProvider implements DatabaseProvider {

    /* renamed from: b */
    private final SQLiteOpenHelper f32681b;

    public DefaultDatabaseProvider(SQLiteOpenHelper sQLiteOpenHelper) {
        this.f32681b = sQLiteOpenHelper;
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public SQLiteDatabase getReadableDatabase() {
        return this.f32681b.getReadableDatabase();
    }

    @Override // com.google.android.exoplayer2.database.DatabaseProvider
    public SQLiteDatabase getWritableDatabase() {
        return this.f32681b.getWritableDatabase();
    }
}
