package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.database.Cursor;
import com.amazon.p047a.p048a.p059h.Metric;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.FqInfo;

/* renamed from: com.mbridge.msdk.foundation.db.i */
/* loaded from: classes6.dex */
public final class FqInfoDao extends BaseDao<FqInfo> {

    /* renamed from: a */
    private static FqInfoDao f56246a;

    private FqInfoDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static synchronized FqInfoDao m52581a(CommonAbsDBHelper commonAbsDBHelper) {
        FqInfoDao fqInfoDao;
        synchronized (FqInfoDao.class) {
            if (f56246a == null) {
                f56246a = new FqInfoDao(commonAbsDBHelper);
            }
            fqInfoDao = f56246a;
        }
        return fqInfoDao;
    }

    /* renamed from: a */
    public final synchronized void m52579a(String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 86400000), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", "time< ? and unitId=?", strArr);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final synchronized void m52580a(FqInfo fqInfo) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (getWritableDatabase() == null) {
            return;
        }
        if (fqInfo != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", fqInfo.m52473a());
            contentValues.put(Metric.f2405b, Long.valueOf(fqInfo.m52469b()));
            contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, fqInfo.m52466d());
            contentValues.put("type", Integer.valueOf(fqInfo.m52467c()));
            if (m52578a(fqInfo.m52466d(), fqInfo.m52473a())) {
                getWritableDatabase().update("fq_info", contentValues, "id = ? AND unitId = ? ", new String[]{fqInfo.m52473a(), fqInfo.m52466d()});
            } else {
                getWritableDatabase().insert("fq_info", null, contentValues);
            }
        }
    }

    /* renamed from: a */
    private synchronized boolean m52578a(String str, String str2) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId= ?  and id= ? ", new String[]{str, str2});
            if (rawQuery != null && rawQuery.getCount() > 0) {
                rawQuery.close();
                return true;
            }
            if (rawQuery != null) {
                rawQuery.close();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
