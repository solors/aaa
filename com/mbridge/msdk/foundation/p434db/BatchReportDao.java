package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.amazon.p047a.p048a.p059h.Metric;
import com.mbridge.msdk.foundation.same.report.BatchReportMessage;
import com.mbridge.msdk.p426e.MBridgeDatabaseUtils;
import com.mbridge.msdk.system.NoProGuard;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: com.mbridge.msdk.foundation.db.BatchReportDao */
/* loaded from: classes6.dex */
public class BatchReportDao extends BaseDao<BatchReportMessage> implements NoProGuard, Serializable {
    private static volatile BatchReportDao instance;
    private final Object lock;

    protected BatchReportDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
        this.lock = new Object();
    }

    public static BatchReportDao getInstance(CommonAbsDBHelper commonAbsDBHelper) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(commonAbsDBHelper);
                }
            }
        }
        return instance;
    }

    public void addReportMessage(String str, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!MBridgeDatabaseUtils.m52899a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_message", str);
                contentValues.put(Metric.f2405b, Long.valueOf(System.currentTimeMillis()));
                contentValues.put(CommonUrlParts.UUID, UUID.randomUUID().toString().replace("-", ""));
                contentValues.put("report_state", (Integer) 0);
                contentValues.put("type", Integer.valueOf(i));
                writableDatabase.insert("batch_report", null, contentValues);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteBatchReportMessagesByTimestamp(long j) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!MBridgeDatabaseUtils.m52899a(writableDatabase)) {
            return;
        }
        try {
            synchronized (this.lock) {
                writableDatabase.execSQL("delete from batch_report where " + Metric.f2405b + " <= ?", new Object[]{Long.valueOf(j)});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<BatchReportMessage> getBatchReportMessages(long j, int i) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        Cursor cursor = null;
        if (!MBridgeDatabaseUtils.m52899a(writableDatabase)) {
            return null;
        }
        ArrayList<BatchReportMessage> arrayList = new ArrayList<>();
        synchronized (this.lock) {
            try {
                try {
                    Cursor rawQuery = writableDatabase.rawQuery("SELECT * FROM batch_report WHERE " + Metric.f2405b + " <= ? AND report_state = 0 AND type = ? ORDER BY " + Metric.f2405b + " ASC ", new String[]{String.valueOf(j), String.valueOf(i)});
                    if (rawQuery != null) {
                        while (rawQuery.moveToNext()) {
                            try {
                                arrayList.add(new BatchReportMessage(rawQuery.getString(rawQuery.getColumnIndex(CommonUrlParts.UUID)), rawQuery.getString(rawQuery.getColumnIndex("report_message")), rawQuery.getLong(rawQuery.getColumnIndex(Metric.f2405b))));
                            } catch (Throwable th) {
                                th = th;
                                cursor = rawQuery;
                                if (cursor != null) {
                                    try {
                                        cursor.close();
                                    } catch (Exception unused) {
                                    }
                                }
                                throw th;
                            }
                        }
                    }
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                        } catch (Exception unused2) {
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", (Integer) 1);
                    writableDatabase.update("batch_report", contentValues, "time <= ?", new String[]{String.valueOf(j)});
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return arrayList;
    }

    public void updateMessagesReportState(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (arrayList != null && arrayList.size() != 0 && MBridgeDatabaseUtils.m52899a(writableDatabase)) {
            Iterator<BatchReportMessage> it = arrayList.iterator();
            while (it.hasNext()) {
                BatchReportMessage next = it.next();
                try {
                    synchronized (this.lock) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("report_state", (Integer) 0);
                        writableDatabase.update("batch_report", contentValues, "uuid = ?", new String[]{next.getUuid()});
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static BatchReportDao getInstance(Context context) {
        if (instance == null) {
            synchronized (BatchReportDao.class) {
                if (instance == null) {
                    instance = new BatchReportDao(CommonSDKDBHelper.m52593a(context));
                }
            }
        }
        return instance;
    }
}
