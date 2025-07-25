package com.mbridge.msdk.newreward.function.common;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public final class DatabaseUtils {
    private DatabaseUtils() {
    }

    public static void beginTransaction(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("DatabaseUtils", "beginTransaction", e);
            }
        }
    }

    public static void closeCursor(Cursor cursor) {
        if (cursor == null) {
            return;
        }
        try {
            cursor.close();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("DatabaseUtils", "closeCursor", e);
            }
        }
    }

    public static void endTransaction(SQLiteDatabase sQLiteDatabase) {
        if (isDatabaseAvailable(sQLiteDatabase) && sQLiteDatabase.inTransaction()) {
            try {
                sQLiteDatabase.endTransaction();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("DatabaseUtils", "endTransaction", e);
                }
            }
        }
    }

    public static boolean isDatabaseAvailable(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase == null) {
            return false;
        }
        try {
            if (!sQLiteDatabase.isOpen()) {
                return false;
            }
            if (sQLiteDatabase.isReadOnly()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setTransactionSuccessful(SQLiteDatabase sQLiteDatabase) {
        if (!isDatabaseAvailable(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("DatabaseUtils", "setTransactionSuccessful", e);
            }
        }
    }
}
