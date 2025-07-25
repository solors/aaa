package com.mbridge.msdk.p426e;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: com.mbridge.msdk.e.d */
/* loaded from: classes6.dex */
public final class MBridgeDatabaseUtils {
    /* renamed from: a */
    public static boolean m52899a(SQLiteDatabase sQLiteDatabase) {
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
}
