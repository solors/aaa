package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.p552ot.pubsub.p553a.C26484a;

/* loaded from: classes8.dex */
public final class w52 {

    /* renamed from: a */
    public static final /* synthetic */ int f87134a = 0;

    static {
        i40.m33371a("goog.exo.database");
    }

    /* renamed from: a */
    public static int m28026a(SQLiteDatabase sQLiteDatabase, int i, String str) throws C31064ou {
        try {
            if (y32.m27086a(sQLiteDatabase, "ExoPlayerVersions")) {
                Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                query.close();
                return i2;
            }
            return -1;
        } catch (SQLException e) {
            throw new C31064ou(e);
        }
    }

    /* renamed from: a */
    public static void m28025a(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws C31064ou {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put(C26484a.f69231n, Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C31064ou(e);
        }
    }
}
