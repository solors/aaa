package com.mbridge.msdk.foundation.p434db;

import android.database.Cursor;

/* renamed from: com.mbridge.msdk.foundation.db.l */
/* loaded from: classes6.dex */
public class ReportErrorDao extends BaseDao {

    /* renamed from: a */
    private static ReportErrorDao f56250a;

    private ReportErrorDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static ReportErrorDao m52564a(CommonAbsDBHelper commonAbsDBHelper) {
        if (f56250a == null) {
            synchronized (ReportErrorDao.class) {
                if (f56250a == null) {
                    f56250a = new ReportErrorDao(commonAbsDBHelper);
                }
            }
        }
        return f56250a;
    }

    /* renamed from: b */
    private synchronized int m52560b(int i) {
        try {
        } catch (Exception unused) {
            return -1;
        }
        return getWritableDatabase().rawQuery("DELETE FROM reporterror WHERE count >= ?", new String[]{String.valueOf(i)}).getCount();
    }

    /* renamed from: b */
    public final synchronized int m52561b() {
        int i;
        Cursor cursor = null;
        try {
            cursor = getReadableDatabase().query("reporterror", new String[]{" count(*) "}, null, null, null, null, null, null);
            i = cursor.getCount();
            cursor.close();
        } catch (Exception e) {
            e.printStackTrace();
            if (cursor != null) {
                cursor.close();
            }
            i = 0;
        }
        return i;
    }

    /* renamed from: a */
    public final synchronized void m52562a(String str, String str2, long j) {
        if (str == null) {
            str = "";
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().execSQL("DELETE from reporterror where url= ? and data= ? and time_stamp= ? or count > ?", new Object[]{str2, str, String.valueOf(j), 5});
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
        if (r9 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r9 == null) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int m52566a() {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = " count(*) "
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3b
            r0 = 0
            r9 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            java.lang.String r2 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r9 == 0) goto L24
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            if (r1 == 0) goto L24
            int r0 = r9.getInt(r0)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
        L24:
            if (r9 == 0) goto L33
        L26:
            r9.close()     // Catch: java.lang.Throwable -> L3b
            goto L33
        L2a:
            r0 = move-exception
            goto L35
        L2c:
            r1 = move-exception
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L2a
            if (r9 == 0) goto L33
            goto L26
        L33:
            monitor-exit(r10)
            return r0
        L35:
            if (r9 == 0) goto L3a
            r9.close()     // Catch: java.lang.Throwable -> L3b
        L3a:
            throw r0     // Catch: java.lang.Throwable -> L3b
        L3b:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.ReportErrorDao.m52566a():int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #5 {, blocks: (B:27:0x00a1, B:19:0x0092, B:34:0x00ab, B:35:0x00ae), top: B:44:0x0003 }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List<com.mbridge.msdk.foundation.entity.l>] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.ReportData> m52565a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 5
            r1 = 0
            r12.m52560b(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r3 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r13 = ""
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r13 == 0) goto L90
            int r0 = r13.getCount()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            if (r0 <= 0) goto L90
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
        L34:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            if (r1 == 0) goto L87
            java.lang.String r1 = "url"
            int r1 = r13.getColumnIndex(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r1 = r13.getString(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = "method"
            int r3 = r13.getColumnIndex(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = "unitId"
            int r4 = r13.getColumnIndex(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r5 = "count"
            int r5 = r13.getColumnIndex(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r13.getInt(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r6 = "time_stamp"
            int r6 = r13.getColumnIndex(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            long r6 = r13.getLong(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            com.mbridge.msdk.foundation.entity.l r8 = new com.mbridge.msdk.foundation.entity.l     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.<init>(r1, r3, r2, r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r5 + 1
            r8.m52384a(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.m52383a(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r0.add(r8)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            goto L34
        L87:
            r1 = r0
            goto L90
        L89:
            r1 = move-exception
            goto L9c
        L8b:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L9c
        L90:
            if (r13 == 0) goto La5
            r13.close()     // Catch: java.lang.Throwable -> Laf
            goto La5
        L96:
            r0 = move-exception
            goto La9
        L98:
            r13 = move-exception
            r0 = r1
            r1 = r13
            r13 = r0
        L9c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> La7
            if (r13 == 0) goto La4
            r13.close()     // Catch: java.lang.Throwable -> Laf
        La4:
            r1 = r0
        La5:
            monitor-exit(r12)
            return r1
        La7:
            r0 = move-exception
            r1 = r13
        La9:
            if (r1 == 0) goto Lae
            r1.close()     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.ReportErrorDao.m52565a(int):java.util.List");
    }

    /* renamed from: a */
    public final synchronized int m52563a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
                return -1;
            }
            return getWritableDatabase().delete("reporterror", "url=?", strArr);
        } catch (Exception unused) {
            return -1;
        }
    }
}
