package io.appmetrica.analytics.coreutils.internal.p725db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreutils.internal.p726io.CloseableUtilsKt;

/* renamed from: io.appmetrica.analytics.coreutils.internal.db.DBUtils */
/* loaded from: classes9.dex */
public class DBUtils {
    public static void cursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        try {
            enhancedCursorRowToContentValues(cursor, contentValues);
        } catch (Throwable unused) {
        }
    }

    public static void enhancedCursorRowToContentValues(Cursor cursor, ContentValues contentValues) {
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        for (int i = 0; i < length; i++) {
            int type = cursor.getType(i);
            if (type != 0) {
                if (type != 1) {
                    if (type != 2) {
                        if (type != 3) {
                            if (type != 4) {
                                contentValues.put(columnNames[i], cursor.getString(i));
                            } else {
                                contentValues.put(columnNames[i], cursor.getBlob(i));
                            }
                        } else {
                            contentValues.put(columnNames[i], cursor.getString(i));
                        }
                    } else {
                        contentValues.put(columnNames[i], Double.valueOf(cursor.getDouble(i)));
                    }
                } else {
                    contentValues.put(columnNames[i], Long.valueOf(cursor.getLong(i)));
                }
            } else {
                contentValues.put(columnNames[i], cursor.getString(i));
            }
        }
    }

    public static long queryRowsCount(SQLiteDatabase sQLiteDatabase, String str) {
        long j;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            if (cursor.moveToFirst()) {
                j = cursor.getLong(0);
            } else {
                j = 0;
            }
            return j;
        } finally {
            CloseableUtilsKt.closeSafely(cursor);
        }
    }
}
