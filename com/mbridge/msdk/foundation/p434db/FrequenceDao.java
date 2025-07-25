package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.Frequence;
import com.mbridge.msdk.foundation.p434db.p435a.FrequencyDaoMiddle;

/* renamed from: com.mbridge.msdk.foundation.db.j */
/* loaded from: classes6.dex */
public class FrequenceDao extends BaseDao<Frequence> {

    /* renamed from: a */
    private static FrequenceDao f56247a;

    private FrequenceDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static FrequenceDao m52576a(CommonAbsDBHelper commonAbsDBHelper) {
        if (f56247a == null) {
            synchronized (FrequenceDao.class) {
                if (f56247a == null) {
                    f56247a = new FrequenceDao(commonAbsDBHelper);
                }
            }
        }
        return f56247a;
    }

    /* renamed from: b */
    public final synchronized boolean m52572b(String str) {
        Cursor cursor = null;
        try {
            try {
                synchronized (str) {
                    Cursor rawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id= ?", new String[]{str});
                    if (rawQuery != null && rawQuery.getCount() > 0) {
                        rawQuery.close();
                        return true;
                    }
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (Exception unused) {
            if (0 != 0) {
                cursor.close();
            }
            return false;
        }
    }

    /* renamed from: a */
    public final synchronized void m52577a() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - 86400000;
            FrequencyDaoMiddle.m52673a().m52672a(currentTimeMillis);
            String[] strArr = {String.valueOf(currentTimeMillis)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", "ts< ? ", strArr);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void m52574a(String str) {
        FrequencyDaoMiddle.m52673a().m52670a(str);
        if (m52572b(str) && getReadableDatabase() != null) {
            getReadableDatabase().execSQL("UPDATE frequence Set impression_count=impression_count+1 WHERE id= ?", new Object[]{str});
        }
    }

    /* renamed from: b */
    private synchronized long m52573b(Frequence frequence) {
        try {
            FrequencyDaoMiddle.m52673a().m52671a(frequence);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", frequence.m52465a());
            contentValues.put("fc_a", Integer.valueOf(frequence.m52459c()));
            contentValues.put("fc_b", Integer.valueOf(frequence.m52457d()));
            contentValues.put("ts", Long.valueOf(frequence.m52454f()));
            contentValues.put("impression_count", Integer.valueOf(frequence.m52455e()));
            contentValues.put("click_count", Integer.valueOf(frequence.m52461b()));
            contentValues.put("ts", Long.valueOf(frequence.m52454f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* renamed from: a */
    public final synchronized void m52575a(Frequence frequence) {
        if (!m52572b(frequence.m52465a())) {
            m52573b(frequence);
        }
    }
}
