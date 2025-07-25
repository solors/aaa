package com.mbridge.msdk.tracker;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* renamed from: com.mbridge.msdk.tracker.b */
/* loaded from: classes6.dex */
final class Database extends SQLiteOpenHelper {

    /* renamed from: a */
    private final String f59652a;

    public Database(Context context, String str, String str2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f59652a = str2;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (C22949y.m49289a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(EventTable.f59675a, this.f59652a));
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "create table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C22949y.m49289a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(EventTable.f59676b, this.f59652a));
            sQLiteDatabase.execSQL(String.format(EventTable.f59675a, this.f59652a));
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "downgrade table error", e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (C22949y.m49289a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.execSQL(String.format(EventTable.f59676b, this.f59652a));
            sQLiteDatabase.execSQL(String.format(EventTable.f59675a, this.f59652a));
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "upgrade table error", e);
            }
        }
    }
}
