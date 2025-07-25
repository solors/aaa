package com.taurusx.tax.p597g.p599b.p602t;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.taurusx.tax.p578b.C28207b;
import com.taurusx.tax.p597g.p599b.C28414p;

/* renamed from: com.taurusx.tax.g.b.t.a */
/* loaded from: classes7.dex */
public class C28427a extends SQLiteOpenHelper implements InterfaceC28429c {

    /* renamed from: a */
    public static final String[] f73850a = {"_id", "url", "length", "mime"};

    public C28427a(Context context) {
        super(context, "AndroidVideoCache.db", (SQLiteDatabase.CursorFactory) null, 1);
        C28207b.m38455a(context);
    }

    @Override // com.taurusx.tax.p597g.p599b.p602t.InterfaceC28429c
    /* renamed from: a */
    public C28414p mo38097a(String str) {
        Throwable th;
        Cursor cursor;
        str.getClass();
        C28414p c28414p = null;
        try {
            cursor = getReadableDatabase().query("SourceInfo", f73850a, "url=?", new String[]{str}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        c28414p = new C28414p(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return c28414p;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }

    @Override // com.taurusx.tax.p597g.p599b.p602t.InterfaceC28429c
    /* renamed from: a */
    public void mo38096a(String str, C28414p c28414p) {
        Object[] objArr = {str, c28414p};
        for (int i = 0; i < 2; i++) {
            objArr[i].getClass();
        }
        boolean z = mo38097a(str) != null;
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", c28414p.f73836a);
        contentValues.put("length", Long.valueOf(c28414p.f73837b));
        contentValues.put("mime", c28414p.f73838c);
        if (z) {
            getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[]{str});
        } else {
            getWritableDatabase().insert("SourceInfo", null, contentValues);
        }
    }
}
