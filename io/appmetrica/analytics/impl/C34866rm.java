package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections._Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.rm */
/* loaded from: classes9.dex */
public final class C34866rm implements TempCacheStorage {

    /* renamed from: a */
    public final InterfaceC35058z6 f95306a;

    /* renamed from: b */
    public final String f95307b;

    /* renamed from: c */
    public final SystemTimeProvider f95308c = new SystemTimeProvider();

    public C34866rm(@NotNull InterfaceC35058z6 interfaceC35058z6, @NotNull String str) {
        this.f95306a = interfaceC35058z6;
        this.f95307b = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @NotNull
    /* renamed from: a */
    public final List<TempCacheStorage.Entry> get(@NotNull String str, int i) {
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        C34918tm c34918tm;
        ArrayList arrayList = new ArrayList();
        Cursor cursor2 = null;
        try {
            sQLiteDatabase2 = this.f95306a.mo20727a();
            sQLiteDatabase = sQLiteDatabase2;
        } catch (Throwable unused) {
            cursor = null;
        }
        if (sQLiteDatabase2 != null) {
            try {
                cursor = sQLiteDatabase2.query(false, this.f95307b, null, "scope=?", new String[]{str}, null, null, "id", String.valueOf(i));
                if (cursor != null) {
                    while (cursor.moveToNext()) {
                        try {
                            try {
                                c34918tm = new C34918tm(cursor.getLong(cursor.getColumnIndexOrThrow("id")), cursor.getString(cursor.getColumnIndexOrThrow("scope")), cursor.getLong(cursor.getColumnIndexOrThrow("timestamp")), cursor.getBlob(cursor.getColumnIndexOrThrow("data")));
                            } catch (Throwable unused2) {
                                c34918tm = null;
                            }
                            if (c34918tm != null) {
                                arrayList.add(c34918tm);
                            }
                        } catch (Throwable unused3) {
                            cursor2 = sQLiteDatabase2;
                            sQLiteDatabase2 = cursor2;
                            cursor2 = cursor;
                            sQLiteDatabase = sQLiteDatabase2;
                            AbstractC34679kn.m21474a(cursor2);
                            this.f95306a.mo20726a(sQLiteDatabase);
                            return arrayList;
                        }
                    }
                }
            } catch (Throwable unused4) {
                cursor = null;
            }
            cursor2 = cursor;
            sQLiteDatabase = sQLiteDatabase2;
        }
        AbstractC34679kn.m21474a(cursor2);
        this.f95306a.mo20726a(sQLiteDatabase);
        return arrayList;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final long put(@NotNull String str, long j, @NotNull byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = this.f95306a.mo20727a();
            if (sQLiteDatabase != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("scope", str);
                    contentValues.put("timestamp", Long.valueOf(j));
                    contentValues.put("data", bArr);
                    long insertOrThrow = sQLiteDatabase.insertOrThrow(this.f95307b, null, contentValues);
                    this.f95306a.mo20726a(sQLiteDatabase);
                    return insertOrThrow;
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase = sQLiteDatabase2;
                    this.f95306a.mo20726a(sQLiteDatabase);
                    return -1L;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f95306a.mo20726a(sQLiteDatabase);
        return -1L;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void remove(long j) {
        m20997a("id=?", new String[]{String.valueOf(j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    public final void removeOlderThan(@NotNull String str, long j) {
        m20997a("scope=? AND timestamp<?", new String[]{str, String.valueOf(this.f95308c.currentTimeMillis() - j)});
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage
    @Nullable
    public final TempCacheStorage.Entry get(@NotNull String str) {
        Object m17529r0;
        m17529r0 = _Collections.m17529r0(get(str, 1));
        return (TempCacheStorage.Entry) m17529r0;
    }

    /* renamed from: a */
    public final void m20997a(String str, String[] strArr) {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f95306a.mo20727a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.delete(this.f95307b, str, strArr);
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        this.f95306a.mo20726a(sQLiteDatabase);
    }
}
