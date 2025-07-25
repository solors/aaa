package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* renamed from: com.inmobi.media.R2 */
/* loaded from: classes6.dex */
public final class C19080R2 {

    /* renamed from: b */
    public static final SQLiteDatabase f47652b;

    /* renamed from: a */
    public static final C19080R2 f47651a = new C19080R2();

    /* renamed from: c */
    public static final Object f47653c = new Object();

    static {
        try {
            f47652b = new C19068Q2(C18954Ha.m61068d()).getWritableDatabase();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final int m60752a(@Nullable String str, @Nullable ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr) {
        synchronized (f47653c) {
            long m60753a = m60753a(str, contentValues);
            if (m60753a == -1) {
                return m60748b(str, contentValues, str2, strArr);
            }
            return (int) m60753a;
        }
    }

    /* renamed from: b */
    public static final int m60748b(@Nullable String str, @Nullable ContentValues contentValues, @Nullable String str2, @Nullable String[] strArr) {
        int i;
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            if (sQLiteDatabase != null) {
                i = sQLiteDatabase.updateWithOnConflict(str, contentValues, str2, strArr, 4);
            } else {
                Intrinsics.checkNotNullExpressionValue("R2", "TAG");
                i = -1;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final long m60753a(@Nullable String str, @Nullable ContentValues contentValues) {
        long j;
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            if (sQLiteDatabase != null) {
                j = sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 4);
            } else {
                Intrinsics.checkNotNullExpressionValue("R2", "TAG");
                j = -1;
            }
        }
        return j;
    }

    @NotNull
    /* renamed from: b */
    public static final List<ContentValues> m60747b(@Nullable String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Cursor query;
        List<ContentValues> m17166m;
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            query = sQLiteDatabase != null ? sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6) : null;
            Unit unit = Unit.f99208a;
        }
        if (query == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (query.moveToFirst()) {
                do {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query, contentValues);
                    arrayList.add(contentValues);
                } while (query.moveToNext());
                Closeable.m1220a(query, null);
                return arrayList;
            }
            Closeable.m1220a(query, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Closeable.m1220a(query, th);
                throw th2;
            }
        }
    }

    /* renamed from: a */
    public static final int m60750a(@Nullable String str, @Nullable String str2, @Nullable String[] strArr) {
        int i;
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            if (sQLiteDatabase != null) {
                i = sQLiteDatabase.delete(str, str2, strArr);
            } else {
                Intrinsics.checkNotNullExpressionValue("R2", "TAG");
                i = 0;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static final void m60754a(@NotNull String tableName) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        String str = "DROP TABLE IF EXISTS \"" + tableName + '\"';
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
                Unit unit = Unit.f99208a;
            }
        }
    }

    /* renamed from: a */
    public final void m60751a(@NotNull String tableName, @NotNull String tableSchema) {
        Intrinsics.checkNotNullParameter(tableName, "tableName");
        Intrinsics.checkNotNullParameter(tableSchema, "tableSchema");
        String str = "CREATE TABLE IF NOT EXISTS " + tableName + tableSchema + ';';
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
                Unit unit = Unit.f99208a;
            }
        }
    }

    /* renamed from: a */
    public static final int m60749a(@Nullable String str, @Nullable String[] strArr, @Nullable String str2, @Nullable String[] strArr2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        Cursor query;
        synchronized (f47653c) {
            SQLiteDatabase sQLiteDatabase = f47652b;
            query = sQLiteDatabase != null ? sQLiteDatabase.query(str, new String[]{"COUNT(*) AS count"}, str2, strArr2, str3, str4, str5, str6) : null;
            Unit unit = Unit.f99208a;
        }
        if (query != null) {
            try {
                r1 = query.moveToFirst() ? query.getInt(query.getColumnIndex("count")) : 0;
                Closeable.m1220a(query, null);
            } catch (Exception unused) {
            }
        }
        return r1;
    }
}
