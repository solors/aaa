package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.mobile.ads.impl.am */
/* loaded from: classes8.dex */
final class C29947am {

    /* renamed from: c */
    private static final String[] f76827c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final InterfaceC31154pu f76828a;

    /* renamed from: b */
    private String f76829b;

    public C29947am(z30 z30Var) {
        this.f76828a = z30Var;
    }

    @WorkerThread
    /* renamed from: a */
    public final HashMap m35834a() throws C31064ou {
        try {
            this.f76829b.getClass();
            Cursor query = this.f76828a.getReadableDatabase().query(this.f76829b, f76827c, null, null, null, null, null);
            HashMap hashMap = new HashMap(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(0);
                string.getClass();
                hashMap.put(string, new C31997zl(query.getLong(1), query.getLong(2)));
            }
            query.close();
            return hashMap;
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m35833a(long j) throws C31064ou {
        try {
            String hexString = Long.toHexString(j);
            this.f76829b = "ExoPlayerCacheFileMetadata" + hexString;
            if (w52.m28026a(this.f76828a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f76828a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                w52.m28025a(writableDatabase, 2, hexString, 1);
                String str = this.f76829b;
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                writableDatabase.execSQL("CREATE TABLE " + this.f76829b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m35832a(String str) throws C31064ou {
        this.f76829b.getClass();
        try {
            this.f76828a.getWritableDatabase().delete(this.f76829b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m35830a(Set<String> set) throws C31064ou {
        this.f76829b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f76828a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f76829b, "name = ?", new String[]{it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    @WorkerThread
    /* renamed from: a */
    public final void m35831a(String str, long j, long j2) throws C31064ou {
        this.f76829b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f76828a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f76829b, null, contentValues);
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }
}
