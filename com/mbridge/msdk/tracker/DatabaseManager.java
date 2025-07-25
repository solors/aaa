package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.mbridge.msdk.tracker.c */
/* loaded from: classes6.dex */
public final class DatabaseManager {

    /* renamed from: a */
    private final Database f59653a;

    /* renamed from: b */
    private final String f59654b;

    /* renamed from: c */
    private final Object f59655c = new Object();

    public DatabaseManager(Database database, String str) {
        this.f59653a = database;
        this.f59654b = str;
    }

    /* renamed from: a */
    private static boolean m49617a(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    /* renamed from: d */
    private static void m49608d(SQLiteDatabase sQLiteDatabase) {
        if (C22949y.m49289a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "beginTransaction: ", e);
            }
        }
    }

    /* renamed from: b */
    public final void m49612b(List<EventTable> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            if (C22949y.m49289a(this.f59653a) || C22949y.m49288a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return;
            }
            try {
                m49608d(sQLiteDatabase);
                Iterator<EventTable> it = list.iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 2);
                    sQLiteDatabase.update(this.f59654b, contentValues, "uuid = ?", new String[]{it.next().m49569f()});
                }
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateSuccess: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
        }
    }

    /* renamed from: c */
    public final void m49609c(List<EventTable> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            if (C22949y.m49289a(this.f59653a) || C22949y.m49288a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return;
            }
            try {
                m49608d(sQLiteDatabase);
                for (EventTable eventTable : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(eventTable.m49570e()));
                    contentValues.put("report_count", Integer.valueOf(eventTable.m49571d()));
                    sQLiteDatabase.update(this.f59654b, contentValues, "uuid = ?", new String[]{eventTable.m49569f()});
                }
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateFailed: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public final long m49616a(EventTable eventTable) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            long j = -1;
            if (C22949y.m49289a(this.f59653a)) {
                return -1L;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return -1L;
            }
            try {
                m49608d(sQLiteDatabase);
                ContentValues contentValues = new ContentValues(16);
                C22885e m49572c = eventTable.m49572c();
                contentValues.put("name", m49572c.m49606a());
                contentValues.put("type", Integer.valueOf(m49572c.m49599b()));
                contentValues.put("time_stamp", Long.valueOf(m49572c.m49592f()));
                contentValues.put(Constants.KEY_PROPERTIES, m49572c.m49594d().toString());
                contentValues.put("priority", Integer.valueOf(m49572c.m49596c()));
                contentValues.put("state", Integer.valueOf(eventTable.m49570e()));
                contentValues.put("report_count", Integer.valueOf(eventTable.m49571d()));
                contentValues.put(CommonUrlParts.UUID, m49572c.m49593e());
                int i = 0;
                contentValues.put("ignore_max_timeout", Integer.valueOf(m49572c.m49588j() ? 0 : 1));
                if (!m49572c.m49587k()) {
                    i = 1;
                }
                contentValues.put("ignore_max_retry_times", Integer.valueOf(i));
                contentValues.put("invalid_time", Long.valueOf(eventTable.m49568g()));
                j = sQLiteDatabase.insert(this.f59654b, null, contentValues);
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "insert: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
            return j;
        }
    }

    /* renamed from: b */
    public final int m49614b() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            int i = -1;
            if (C22949y.m49289a(this.f59653a)) {
                return -1;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return -1;
            }
            try {
                m49608d(sQLiteDatabase);
                i = sQLiteDatabase.delete(this.f59654b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "deleteInvalidEvents: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
            return i;
        }
    }

    /* renamed from: c */
    public final void m49611c() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            if (C22949y.m49289a(this.f59653a)) {
                return;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return;
            }
            try {
                m49608d(sQLiteDatabase);
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", (Integer) 3);
                sQLiteDatabase.update(this.f59654b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateForReporting: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
        }
    }

    /* renamed from: a */
    public final List<EventTable> m49618a(int i) {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        Cursor cursor;
        List<EventTable> list;
        synchronized (this.f59655c) {
            Cursor cursor2 = null;
            List<EventTable> list2 = null;
            cursor2 = null;
            if (C22949y.m49289a(this.f59653a)) {
                return null;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return null;
            }
            try {
                try {
                    m49608d(sQLiteDatabase);
                    cursor = sQLiteDatabase.query(this.f59654b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i));
                    try {
                        list2 = C22949y.m49287b(cursor);
                        m49610c(sQLiteDatabase);
                        m49613b(sQLiteDatabase);
                        C22949y.m49290a(cursor);
                    } catch (Exception e2) {
                        e = e2;
                        List<EventTable> list3 = list2;
                        cursor2 = cursor;
                        list = list3;
                        if (Common.f59651a) {
                            Log.e("TrackManager", "getAvailable: " + e.getMessage());
                        }
                        m49613b(sQLiteDatabase);
                        C22949y.m49290a(cursor2);
                        list2 = list;
                        return list2;
                    } catch (Throwable th2) {
                        th = th2;
                        m49613b(sQLiteDatabase);
                        C22949y.m49290a(cursor);
                        throw th;
                    }
                } catch (Throwable th3) {
                    Cursor cursor3 = cursor2;
                    th = th3;
                    cursor = cursor3;
                }
            } catch (Exception e3) {
                e = e3;
                list = null;
            }
            return list2;
        }
    }

    /* renamed from: b */
    private static void m49613b(SQLiteDatabase sQLiteDatabase) {
        if (C22949y.m49289a(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "endTransaction: ", e);
            }
        }
    }

    /* renamed from: c */
    private static void m49610c(SQLiteDatabase sQLiteDatabase) {
        if (C22949y.m49289a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "transactionSuccess: ", e);
            }
        }
    }

    /* renamed from: a */
    public final int m49619a() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            int i = 0;
            if (C22949y.m49289a(this.f59653a)) {
                return 0;
            }
            Cursor cursor = null;
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return 0;
            }
            try {
                m49608d(sQLiteDatabase);
                cursor = sQLiteDatabase.query(this.f59654b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                if (cursor != null && cursor.moveToNext()) {
                    i = Math.max(cursor.getCount(), 0);
                }
                m49610c(sQLiteDatabase);
                m49613b(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "getAvailableCount: " + e2.getMessage());
                }
                m49613b(sQLiteDatabase);
            }
            C22949y.m49290a(cursor);
            return i;
        }
    }

    /* renamed from: a */
    public final void m49615a(List<EventTable> list) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (this.f59655c) {
            if (C22949y.m49289a(this.f59653a) || C22949y.m49288a((List<?>) list)) {
                return;
            }
            try {
                sQLiteDatabase = this.f59653a.getWritableDatabase();
            } catch (Exception e) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e.getMessage());
                }
                sQLiteDatabase = null;
            }
            if (m49617a(sQLiteDatabase)) {
                return;
            }
            try {
                m49608d(sQLiteDatabase);
                Iterator<EventTable> it = list.iterator();
                while (it.hasNext()) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 1);
                    sQLiteDatabase.update(this.f59654b, contentValues, "uuid = ?", new String[]{it.next().m49569f()});
                }
                m49610c(sQLiteDatabase);
            } catch (Exception e2) {
                if (Common.f59651a) {
                    Log.e("TrackManager", "updateReportStateReporting: " + e2.getMessage());
                }
            }
            m49613b(sQLiteDatabase);
        }
    }
}
