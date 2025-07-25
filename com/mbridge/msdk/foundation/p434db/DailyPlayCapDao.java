package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Campaign;

/* renamed from: com.mbridge.msdk.foundation.db.h */
/* loaded from: classes6.dex */
public class DailyPlayCapDao extends BaseDao<Campaign> {

    /* renamed from: a */
    private static final String f56244a = "com.mbridge.msdk.foundation.db.h";

    /* renamed from: b */
    private static DailyPlayCapDao f56245b;

    private DailyPlayCapDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static DailyPlayCapDao m52586a(CommonAbsDBHelper commonAbsDBHelper) {
        if (f56245b == null) {
            synchronized (DailyPlayCapDao.class) {
                if (f56245b == null) {
                    f56245b = new DailyPlayCapDao(commonAbsDBHelper);
                }
            }
        }
        return f56245b;
    }

    /* renamed from: b */
    private synchronized boolean m52583b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id= ?", new String[]{str});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: c */
    private synchronized void m52582c(String str) {
        try {
        } catch (Throwable unused) {
            SameLogTool.m51822c(f56244a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = ?", new String[]{str});
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
        if (r1 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a9, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
        if (0 == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        return;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void m52585a(java.lang.String r19) {
        /*
            r18 = this;
            r0 = r19
            monitor-enter(r18)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            if (r2 != 0) goto Lc
            monitor-exit(r18)
            return
        Lc:
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            boolean r5 = r18.m52583b(r19)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r6 = 1
            if (r5 == 0) goto L87
            java.lang.String r5 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r8 = r18.getReadableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r9 = 1
            java.lang.String[] r10 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r11 = 0
            r10[r11] = r0     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            android.database.Cursor r1 = r8.rawQuery(r5, r10)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r12 = 0
            if (r1 == 0) goto L5d
            int r5 = r1.getCount()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            if (r5 <= 0) goto L5d
            r1.moveToFirst()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "first_insert_timestamp"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r14 = r1.getLong(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "play_time"
            int r5 = r1.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            int r5 = r1.getInt(r5)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            long r9 = (long) r5     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r16 = 86400000(0x5265c00, double:4.2687272E-316)
            long r16 = r3 - r16
            int r5 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r5 <= 0) goto L5f
            r18.m52582c(r19)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r9 = r12
            goto L5f
        L5d:
            r9 = r12
            r14 = r9
        L5f:
            int r5 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
        L6c:
            java.lang.String r3 = "play_time"
            long r9 = r9 + r6
            java.lang.Long r4 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "unit_id = ?"
            android.database.sqlite.SQLiteDatabase r4 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r5 = "dailyplaycap"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r6[r11] = r0     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r4.update(r5, r2, r3, r6)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            goto La7
        L87:
            java.lang.String r5 = "first_insert_timestamp"
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r5, r3)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "play_time"
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "unit_id"
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            android.database.sqlite.SQLiteDatabase r0 = r18.getWritableDatabase()     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
            java.lang.String r3 = "dailyplaycap"
            r0.insert(r3, r1, r2)     // Catch: java.lang.Throwable -> Lad java.lang.Exception -> Laf
        La7:
            if (r1 == 0) goto Lb6
        La9:
            r1.close()     // Catch: java.lang.Throwable -> Lb6
            goto Lb6
        Lad:
            r0 = move-exception
            goto Lb8
        Laf:
            r0 = move-exception
            r0.printStackTrace()     // Catch: java.lang.Throwable -> Lad
            if (r1 == 0) goto Lb6
            goto La9
        Lb6:
            monitor-exit(r18)
            return
        Lb8:
            if (r1 == 0) goto Lbd
            r1.close()     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            throw r0     // Catch: java.lang.Throwable -> Lbe
        Lbe:
            r0 = move-exception
            r1 = r0
            monitor-exit(r18)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.DailyPlayCapDao.m52585a(java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r0 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        return r1;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m52584a(java.lang.String r12, int r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            java.lang.String r2 = "SELECT * FROM dailyplaycap where unit_id = ?"
            android.database.sqlite.SQLiteDatabase r3 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L58
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L58
            r5[r1] = r12     // Catch: java.lang.Throwable -> L58
            android.database.Cursor r0 = r3.rawQuery(r2, r5)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L52
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L58
            if (r2 <= 0) goto L52
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L52
            java.lang.String r2 = "first_insert_timestamp"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L58
            long r2 = r0.getLong(r2)     // Catch: java.lang.Throwable -> L58
            java.lang.String r5 = "play_time"
            int r5 = r0.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L58
            int r5 = r0.getInt(r5)     // Catch: java.lang.Throwable -> L58
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L58
            r7 = 0
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 == 0) goto L52
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L58
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 - r9
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L4a
            r11.m52582c(r12)     // Catch: java.lang.Throwable -> L58
            goto L52
        L4a:
            if (r13 <= 0) goto L52
            long r12 = (long) r13
            int r12 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r12 < 0) goto L52
            r1 = r4
        L52:
            if (r0 == 0) goto L72
        L54:
            r0.close()     // Catch: java.lang.Throwable -> L72
            goto L72
        L58:
            r12 = move-exception
            java.lang.String r13 = com.mbridge.msdk.foundation.p434db.DailyPlayCapDao.f56244a     // Catch: java.lang.Throwable -> L73
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L73
            r2.<init>()     // Catch: java.lang.Throwable -> L73
            java.lang.String r3 = "isOverCap is error"
            r2.append(r3)     // Catch: java.lang.Throwable -> L73
            r2.append(r12)     // Catch: java.lang.Throwable -> L73
            java.lang.String r12 = r2.toString()     // Catch: java.lang.Throwable -> L73
            com.mbridge.msdk.foundation.tools.SameLogTool.m51822c(r13, r12)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L72
            goto L54
        L72:
            return r1
        L73:
            r12 = move-exception
            if (r0 == 0) goto L79
            r0.close()     // Catch: java.lang.Throwable -> L79
        L79:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.DailyPlayCapDao.m52584a(java.lang.String, int):boolean");
    }
}
