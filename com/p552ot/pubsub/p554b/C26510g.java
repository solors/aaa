package com.p552ot.pubsub.p554b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* renamed from: com.ot.pubsub.b.g */
/* loaded from: classes7.dex */
public class C26510g extends SQLiteOpenHelper {

    /* renamed from: a */
    public static final String f69335a = "pub_sub_cloud";

    /* renamed from: b */
    public static final String f69336b = "events_cloud";

    /* renamed from: c */
    public static final String f69337c = "_id";

    /* renamed from: d */
    public static final String f69338d = "app_id";

    /* renamed from: e */
    public static final String f69339e = "cloud_data";

    /* renamed from: f */
    public static final String f69340f = "data_hash";

    /* renamed from: g */
    public static final String f69341g = "timestamp";

    /* renamed from: h */
    static final String f69342h = "CREATE TABLE events_cloud (_id  INTEGER PRIMARY KEY AUTOINCREMENT,app_id TEXT,cloud_data TEXT,timestamp INTEGER,data_hash TEXT)";

    /* renamed from: i */
    private static final String f69343i = "ConfigDatabaseHelper";

    /* renamed from: j */
    private static final int f69344j = 1;

    public C26510g(Context context) {
        super(context, f69335a, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f69342h);
        Log.d(f69343i, "onCreate: ");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
