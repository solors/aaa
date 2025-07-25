package com.smaato.sdk.core.kpi;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.preference.PreferenceManager;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C21114v8;
import com.smaato.sdk.core.gdpr.IabCmpV2DataStorage;
import com.smaato.sdk.core.kpi.KpiData;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import java.util.HashMap;

/* loaded from: classes7.dex */
public class KpiDBHelper extends SQLiteOpenHelper {
    @VisibleForTesting
    static final String DATABASE_NAME = "KPI_DATABASE.db";

    /* renamed from: db */
    private final SQLiteDatabase f71577db;
    private final IabCmpV2DataStorage iabCmpV2DataStorage;
    private final Logger logger;
    private final boolean sessionTrackingDisabled;
    @VisibleForTesting
    HashMap<String, Integer> session_depth_map;

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.smaato.sdk.core.kpi.KpiDBHelper$a */
    /* loaded from: classes7.dex */
    public static class C27118a {

        /* renamed from: a */
        private String f71578a;

        /* renamed from: b */
        private String f71579b;

        /* renamed from: c */
        private int f71580c;

        /* renamed from: d */
        private long f71581d;

        C27118a() {
        }

        /* renamed from: a */
        public int m39545a() {
            return this.f71580c;
        }

        /* renamed from: b */
        public String m39544b() {
            return this.f71579b;
        }

        /* renamed from: c */
        public long m39543c() {
            return this.f71581d;
        }

        /* renamed from: d */
        public void m39542d(String str) {
            this.f71578a = str;
        }

        /* renamed from: e */
        public void m39541e(int i) {
            this.f71580c = i;
        }

        /* renamed from: f */
        public void m39540f(String str) {
            this.f71579b = str;
        }

        /* renamed from: g */
        public void m39539g(long j) {
            this.f71581d = j;
        }
    }

    public KpiDBHelper(@NonNull Logger logger, @NonNull Context context, boolean z) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        this.session_depth_map = new HashMap<>();
        this.logger = logger;
        this.sessionTrackingDisabled = z;
        this.iabCmpV2DataStorage = new IabCmpV2DataStorage(PreferenceManager.getDefaultSharedPreferences(context));
        this.f71577db = getWritableDatabase();
    }

    @VisibleForTesting
    C27118a fetchAdSpaceDetail(String str) {
        C27118a c27118a;
        if (str == null) {
            return null;
        }
        try {
            Cursor rawQuery = this.f71577db.rawQuery("SELECT * FROM Kpidata WHERE adspaceid=?", new String[]{str});
            int columnIndex = rawQuery.getColumnIndex(C21114v8.C21122h.f54075l);
            int columnIndex2 = rawQuery.getColumnIndex("fillrate");
            int columnIndex3 = rawQuery.getColumnIndex("fills");
            if (rawQuery.getCount() == 1) {
                rawQuery.moveToFirst();
                c27118a = new C27118a();
                c27118a.m39542d(str);
                c27118a.m39540f(rawQuery.getString(columnIndex3));
                c27118a.m39539g(rawQuery.getInt(columnIndex));
                c27118a.m39541e(rawQuery.getInt(columnIndex2));
            } else {
                c27118a = null;
            }
            rawQuery.close();
            return c27118a;
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, C27118a.class.getName() + e.getMessage(), new Object[0]);
            return null;
        }
    }

    @VisibleForTesting
    int getFillRate(String str) {
        return (int) ((str.replaceAll("0", "").length() * 1000.0d) / str.length());
    }

    @VisibleForTesting
    String getFills(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        if (str != null && !str.isEmpty()) {
            if (str.length() < 50) {
                return str + str2;
            }
            return str.substring(1, 50) + str2;
        }
        return str2;
    }

    public synchronized KpiData getKpiValuesForAdSpace(String str) {
        String str2;
        String str3;
        if (!this.sessionTrackingDisabled && str != null) {
            C27118a fetchAdSpaceDetail = fetchAdSpaceDetail(str);
            KpiData.Builder builder = KpiData.builder();
            if (fetchAdSpaceDetail != null) {
                str2 = String.valueOf(fetchAdSpaceDetail.m39545a());
            } else {
                str2 = "0";
            }
            KpiData.Builder sessionDepthPerAdSpace = builder.setRollingFillRatePerAdSpace(str2).setSessionDepthPerAdSpace(String.valueOf(getSessionDepth(str)));
            if (fetchAdSpaceDetail != null) {
                str3 = String.valueOf(fetchAdSpaceDetail.m39543c());
            } else {
                str3 = "0";
            }
            return sessionDepthPerAdSpace.setTotalAdRequests(str3).setTotalFillRate(String.valueOf(getTotalFillRate())).build();
        }
        return null;
    }

    @VisibleForTesting
    int getSessionDepth(String str) {
        Integer num = this.session_depth_map.get(str);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    @VisibleForTesting
    int getTotalFillRate() {
        int i;
        try {
            Cursor rawQuery = this.f71577db.rawQuery("SELECT * FROM Kpidata", null);
            int columnIndex = rawQuery.getColumnIndex("fills");
            if (rawQuery.getCount() > 0) {
                StringBuilder sb2 = new StringBuilder();
                rawQuery.moveToFirst();
                do {
                    sb2.append(rawQuery.getString(columnIndex));
                } while (rawQuery.moveToNext());
                i = getFillRate(sb2.toString());
            } else {
                i = 0;
            }
            rawQuery.close();
            return i;
        } catch (Exception e) {
            this.logger.error(LogDomain.CORE, C27118a.class.getName() + e.getMessage(), new Object[0]);
            return 0;
        }
    }

    public synchronized void incrementAdRequestCount(String str) {
        int intValue;
        if (!this.sessionTrackingDisabled && str != null) {
            try {
                ContentValues contentValues = new ContentValues();
                C27118a fetchAdSpaceDetail = fetchAdSpaceDetail(str);
                if (fetchAdSpaceDetail != null) {
                    contentValues.put(C21114v8.C21122h.f54075l, Long.valueOf(fetchAdSpaceDetail.m39543c() + 1));
                    this.f71577db.update("Kpidata", contentValues, "adspaceid=?", new String[]{str});
                } else {
                    contentValues.put("adspaceid", str);
                    contentValues.put(C21114v8.C21122h.f54075l, (Integer) 1);
                    contentValues.put("fillrate", (Integer) 0);
                    this.f71577db.insert("Kpidata", null, contentValues);
                }
                Integer num = this.session_depth_map.get(str);
                HashMap<String, Integer> hashMap = this.session_depth_map;
                if (num == null) {
                    intValue = 2;
                } else {
                    intValue = num.intValue() + 1;
                }
                hashMap.put(str, Integer.valueOf(intValue));
            } catch (Exception e) {
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger.error(logDomain, C27118a.class.getName() + e.getMessage(), new Object[0]);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE Kpidata(adspaceid TEXT PRIMARY KEY NOT NULL,total INTEGER,fillrate INTEGER,fills TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS Kpidata");
    }

    public synchronized void updateFillAndFillRate(String str, boolean z) {
        if (!this.sessionTrackingDisabled && str != null) {
            try {
                C27118a fetchAdSpaceDetail = fetchAdSpaceDetail(str);
                if (fetchAdSpaceDetail != null) {
                    ContentValues contentValues = new ContentValues();
                    String fills = getFills(fetchAdSpaceDetail.m39544b(), z);
                    contentValues.put("fills", fills);
                    contentValues.put("fillrate", Integer.valueOf(getFillRate(fills)));
                    this.f71577db.update("Kpidata", contentValues, "adspaceid=?", new String[]{str});
                }
            } catch (Exception e) {
                Logger logger = this.logger;
                LogDomain logDomain = LogDomain.CORE;
                logger.error(logDomain, C27118a.class.getName() + e.getMessage(), new Object[0]);
            }
        }
    }
}
