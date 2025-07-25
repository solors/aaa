package com.bytedance.sdk.openadsdk.p358vb.p361bg;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.p358vb.C9570IL;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bytedance.sdk.openadsdk.vb.bg.VB */
/* loaded from: classes3.dex */
public class C9578VB extends SQLiteOpenHelper {

    /* renamed from: IL */
    private static volatile C9578VB f21364IL;

    /* renamed from: bg */
    final Context f21365bg;

    private C9578VB(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f21365bg = context;
    }

    /* renamed from: IL */
    public static SQLiteDatabase m82344IL() {
        try {
            C9578VB m82342bX = m82342bX();
            if (m82342bX != null) {
                SQLiteDatabase readableDatabase = m82342bX.getReadableDatabase();
                if (readableDatabase.isOpen()) {
                    return readableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    /* renamed from: bX */
    private static C9578VB m82342bX() {
        if (f21364IL == null) {
            synchronized (C9578VB.class) {
                if (f21364IL == null) {
                    f21364IL = new C9578VB(C9570IL.m82377bg());
                }
            }
        }
        return f21364IL;
    }

    /* renamed from: bg */
    public static SQLiteDatabase m82341bg() {
        try {
            C9578VB m82342bX = m82342bX();
            if (m82342bX != null) {
                SQLiteDatabase writableDatabase = m82342bX.getWritableDatabase();
                if (writableDatabase.isOpen()) {
                    return writableDatabase;
                }
                return null;
            }
            return null;
        } catch (Throwable th) {
            Log.i("MonitorSQLiteOpenHelper", th.getMessage());
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(new StringBuilder("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )").toString());
        } catch (Throwable th) {
            Log.e("MonitorSQLiteOpenHelper", th.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                m82340bg(sQLiteDatabase);
                onCreate(sQLiteDatabase);
                return;
            }
            onCreate(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    private ArrayList<String> m82343IL(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (rawQuery != null) {
                while (rawQuery.moveToNext()) {
                    String string = rawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                rawQuery.close();
            }
        } catch (Exception e) {
            C7741PX.m87873bg("MonitorSQLiteOpenHelper", e.getMessage());
        }
        return arrayList;
    }

    /* renamed from: bg */
    private void m82340bg(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> m82343IL = m82343IL(sQLiteDatabase);
        if (m82343IL == null || m82343IL.size() <= 0) {
            return;
        }
        Iterator<String> it = m82343IL.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
