package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.s9 */
/* loaded from: classes6.dex */
public class C20794s9 extends SQLiteOpenHelper {

    /* renamed from: a */
    private static C20748r9 f52883a = new C20748r9();

    public C20794s9(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* renamed from: a */
    public static Cursor m55373a(int i) {
        SQLiteDatabase m55533a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            m55533a = f52883a.m55533a(new C20794s9(C20086i9.m57997d().m58008a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = m55533a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
            m55533a.close();
            return rawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = m55533a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static C21173wb m55370b(int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase m55533a = f52883a.m55533a(new C20794s9(C20086i9.m57997d().m58008a()));
            try {
                Cursor rawQuery = m55533a.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = rawQuery.getInt(0);
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(2);
                String string3 = rawQuery.getString(3);
                rawQuery.close();
                C21173wb c21173wb = new C21173wb(i2, string, string2, string3);
                m55533a.close();
                return c21173wb;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = m55533a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: c */
    public static Cursor m55369c() {
        SQLiteDatabase m55533a;
        C20794s9 c20794s9 = new C20794s9(C20086i9.m57997d().m58008a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            m55533a = f52883a.m55533a(c20794s9);
        } catch (Throwable th) {
            th = th;
        }
        try {
            Cursor rawQuery = m55533a.rawQuery("SELECT * FROM REPORTS;", null);
            m55533a.close();
            return rawQuery;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = m55533a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    /* renamed from: a */
    public static void m55374a() {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f52883a.m55531a(true, new C20794s9(C20086i9.m57997d().m58008a()));
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* renamed from: b */
    public static List<C21173wb> m55371b() {
        C20794s9 c20794s9 = new C20794s9(C20086i9.m57997d().m58008a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase m55533a = f52883a.m55533a(c20794s9);
            try {
                Cursor rawQuery = m55533a.rawQuery("SELECT * FROM REPORTS ;", null);
                if (!rawQuery.moveToFirst()) {
                    rawQuery.close();
                    m55533a.close();
                    return arrayList;
                }
                do {
                    arrayList.add(new C21173wb(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                m55533a.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = m55533a;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m55372a(C21173wb c21173wb) {
        SQLiteDatabase m55531a;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            m55531a = f52883a.m55531a(true, new C20794s9(C20086i9.m57997d().m58008a()));
        } catch (Throwable th) {
            th = th;
        }
        try {
            m55531a.beginTransaction();
            ContentValues contentValues = new ContentValues();
            String m54355e = c21173wb.m54355e();
            String m54358b = c21173wb.m54358b();
            String m54356d = c21173wb.m54356d();
            contentValues.put("stack_trace", m54355e);
            contentValues.put("crash_date", m54358b);
            contentValues.put("crashType", m54356d);
            m55531a.insert("REPORTS", null, contentValues);
            m55531a.setTransactionSuccessful();
            m55531a.endTransaction();
            m55531a.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = m55531a;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
