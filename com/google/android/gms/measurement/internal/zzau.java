package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzau {
    @WorkerThread
    private static Set<String> zza(SQLiteDatabase sQLiteDatabase, String str) {
        HashSet hashSet = new HashSet();
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
        try {
            Collections.addAll(hashSet, rawQuery.getColumnNames());
            return hashSet;
        } finally {
            rawQuery.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    public static void zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        String[] split;
        if (zzfwVar != null) {
            if (!zza(zzfwVar, sQLiteDatabase, str)) {
                sQLiteDatabase.execSQL(str2);
            }
            try {
                Set<String> zza = zza(sQLiteDatabase, str);
                for (String str4 : str3.split(",")) {
                    if (!zza.remove(str4)) {
                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                    }
                }
                if (strArr != null) {
                    for (int i = 0; i < strArr.length; i += 2) {
                        if (!zza.remove(strArr[i])) {
                            sQLiteDatabase.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (zza.isEmpty()) {
                    return;
                }
                zzfwVar.zzu().zza("Table has extra columns. table, columns", str, TextUtils.join(", ", zza));
                return;
            } catch (SQLiteException e) {
                zzfwVar.zzg().zza("Failed to verify columns on table that was just created", str);
                throw e;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase) {
        if (zzfwVar != null) {
            File file = new File(com.google.android.gms.internal.measurement.zzcf.zza().zza(sQLiteDatabase.getPath()));
            if (!file.setReadable(false, false)) {
                zzfwVar.zzu().zza("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                zzfwVar.zzu().zza("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                zzfwVar.zzu().zza("Failed to turn on database read permission for owner");
            }
            if (file.setWritable(true, true)) {
                return;
            }
            zzfwVar.zzu().zza("Failed to turn on database write permission for owner");
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    @WorkerThread
    private static boolean zza(zzfw zzfwVar, SQLiteDatabase sQLiteDatabase, String str) {
        if (zzfwVar != null) {
            Cursor cursor = null;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    boolean moveToFirst = cursor.moveToFirst();
                    cursor.close();
                    return moveToFirst;
                } catch (SQLiteException e) {
                    zzfwVar.zzu().zza("Error querying for table", str, e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
