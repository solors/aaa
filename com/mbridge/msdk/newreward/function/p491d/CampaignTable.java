package com.mbridge.msdk.newreward.function.p491d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.JSONUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign;
import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.newreward.function.d.a */
/* loaded from: classes6.dex */
public final class CampaignTable {

    /* renamed from: a */
    private SQLiteDatabase f58598a;

    /* renamed from: b */
    private final Object f58599b = new Object();

    public CampaignTable(SQLiteDatabase sQLiteDatabase) {
        this.f58598a = sQLiteDatabase;
    }

    /* renamed from: a */
    public final void m50359a(final MBridgeCampaigns mBridgeCampaigns) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.2
            @Override // java.lang.Runnable
            public final void run() {
                CampaignTable.this.m50354b(mBridgeCampaigns);
            }
        });
    }

    /* renamed from: b */
    public final void m50355b(int i, String str, String str2, String str3, boolean z, String str4, long j) {
        SQLiteDatabase sQLiteDatabase;
        int i2;
        Cursor query;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double m50253d = MBridgeCommonUtils.m50253d(str4);
        synchronized (this.f58599b) {
            try {
                i2 = 1;
                query = this.f58598a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2, str3}, null, null, null);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CampaignTable", "insert: ", e);
                }
                sQLiteDatabase = this.f58598a;
            }
            if (query != null && query.getCount() > 0) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51827a("CampaignTable", "insert:  already exist");
                }
                DatabaseUtils.closeCursor(query);
                DatabaseUtils.endTransaction(this.f58598a);
                return;
            }
            DatabaseUtils.beginTransaction(this.f58598a);
            ContentValues contentValues = new ContentValues();
            contentValues.put("ad_type", Integer.valueOf(i));
            contentValues.put("app_id", MBSDKContext.m52746m().m52779k());
            contentValues.put("placement_id", str);
            contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
            contentValues.put("local_id", str3);
            contentValues.put("state", (Integer) 0);
            contentValues.put("bid_token", str4);
            contentValues.put("invalid_time", Long.valueOf(j));
            if (!z) {
                i2 = 0;
            }
            contentValues.put("header_bidding", Integer.valueOf(i2));
            contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("ecppv", Double.valueOf(m50253d));
            contentValues.put(BaseCampaignUnit.JSON_KEY_SECOND_SHOW_INDEX, (Integer) 0);
            contentValues.put(BaseCampaignUnit.JSON_KEY_SECOND_REQUEST_INDEX, (Integer) 0);
            long insert = this.f58598a.insert("campaign", null, contentValues);
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("CampaignTable", "insert result:  " + insert);
            }
            DatabaseUtils.setTransactionSuccessful(this.f58598a);
            sQLiteDatabase = this.f58598a;
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    /* renamed from: c */
    public final void m50353c(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f58599b) {
            try {
                DatabaseUtils.beginTransaction(this.f58598a);
                int delete = this.f58598a.delete("campaign", "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);", new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2});
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51827a("CampaignTable", "clearLoadCheckCampaigns result:  " + delete);
                }
                DatabaseUtils.setTransactionSuccessful(this.f58598a);
                sQLiteDatabase = this.f58598a;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CampaignTable", "clearLoadCheckCampaigns: ", e);
                }
                sQLiteDatabase = this.f58598a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    /* renamed from: d */
    public final void m50352d(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f58599b) {
            try {
                DatabaseUtils.beginTransaction(this.f58598a);
                int delete = this.f58598a.delete("campaign", m50369a(), new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2, String.valueOf(System.currentTimeMillis())});
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51827a("CampaignTable", "clearUnInvalidCampaign result:  " + delete);
                }
                DatabaseUtils.setTransactionSuccessful(this.f58598a);
                sQLiteDatabase = this.f58598a;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CampaignTable", "clearUnInvalidCampaign: ", e);
                }
                sQLiteDatabase = this.f58598a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    /* renamed from: e */
    public final List<String> m50351e(int i, String str, String str2) {
        Cursor query;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f58599b) {
            try {
                try {
                    query = this.f58598a.query("campaign", null, m50369a(), new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                } catch (Exception e) {
                    e = e;
                }
                if (query != null) {
                    try {
                    } catch (Exception e2) {
                        e = e2;
                        cursor = query;
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51823b("CampaignTable", "find: ", e);
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        DatabaseUtils.closeCursor(cursor);
                        throw th;
                    }
                    if (query.getCount() > 0) {
                        int columnIndex = query.getColumnIndex("local_id");
                        while (query.moveToNext()) {
                            String string = query.getString(columnIndex);
                            if (!TextUtils.isEmpty(string)) {
                                arrayList.add(string);
                            }
                        }
                        DatabaseUtils.closeCursor(query);
                        return arrayList;
                    }
                }
                DatabaseUtils.closeCursor(query);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: a */
    public final void m50361a(final int i, final String str, final String str2, final boolean z, final CampaignTableListener campaignTableListener) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.3
            @Override // java.lang.Runnable
            public final void run() {
                List<MBridgeCampaigns> m50364a = CampaignTable.this.m50364a(i, str, str2, z);
                if (m50364a != null && !m50364a.isEmpty()) {
                    CampaignTableListener campaignTableListener2 = campaignTableListener;
                    if (campaignTableListener2 != null) {
                        campaignTableListener2.mo50327a(m50364a);
                        return;
                    }
                    return;
                }
                CampaignTableListener campaignTableListener3 = campaignTableListener;
                if (campaignTableListener3 != null) {
                    campaignTableListener3.mo50328a();
                }
            }
        });
    }

    /* renamed from: a */
    public final List<MBridgeCampaigns> m50364a(int i, String str, String str2, boolean z) {
        Cursor cursor;
        Cursor cursor2 = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f58599b) {
            try {
                cursor = this.f58598a.query("campaign", null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2, String.valueOf(z ? 1 : 0)}, null, null, "load_start_time desc");
            } catch (Exception e) {
                e = e;
                cursor = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                try {
                    List<MBridgeCampaigns> m50360a = m50360a(cursor);
                    if ((m50360a == null || m50360a.size() == 0) && MBridgeConstans.DEBUG) {
                        SameLogTool.m51824b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return m50360a;
                } catch (Exception e2) {
                    e = e2;
                    if (MBridgeConstans.DEBUG) {
                        SameLogTool.m51823b("CampaignTable", "find: ", e);
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                DatabaseUtils.closeCursor(cursor2);
                throw th;
            }
        }
    }

    /* renamed from: a */
    public final List<MBridgeCampaigns> m50362a(int i, String str, String str2, boolean z, int i2, String str3) {
        String str4;
        String[] strArr;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.f58599b) {
            try {
                String valueOf = String.valueOf(z ? 1 : 0);
                long currentTimeMillis = System.currentTimeMillis();
                String m52779k = MBSDKContext.m52746m().m52779k();
                if (TextUtils.isEmpty(str3)) {
                    try {
                        try {
                            str4 = "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?";
                            strArr = new String[]{String.valueOf(i), m52779k, str, str2, valueOf, String.valueOf(3), String.valueOf(currentTimeMillis)};
                        } catch (Throwable th) {
                            th = th;
                            DatabaseUtils.closeCursor(cursor);
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51823b("CampaignTable", "find: ", e);
                        }
                        DatabaseUtils.closeCursor(cursor);
                        return null;
                    }
                } else {
                    strArr = new String[]{str3, String.valueOf(i), m52779k, str, str2, valueOf, String.valueOf(3), String.valueOf(currentTimeMillis)};
                    str4 = "local_id=? and ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?";
                }
                Cursor query = this.f58598a.query("campaign", null, str4, strArr, null, null, "load_start_time desc", String.valueOf(i2 <= 0 ? Integer.MAX_VALUE : i2));
                List<MBridgeCampaigns> m50360a = m50360a(query);
                if ((m50360a == null || m50360a.size() == 0) && MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                }
                DatabaseUtils.closeCursor(query);
                return m50360a;
            } catch (Exception e2) {
                e = e2;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                cursor = null;
                DatabaseUtils.closeCursor(cursor);
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m50354b(MBridgeCampaigns mBridgeCampaigns) {
        SQLiteDatabase sQLiteDatabase;
        if (mBridgeCampaigns == null) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "insert: mBridgeCampaigns is null");
                return;
            }
            return;
        }
        List<MBridgeCampaign> m50558u = mBridgeCampaigns.m50558u();
        if (m50558u != null && !m50558u.isEmpty()) {
            if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("CampaignTable", "insert: database is not available");
                    return;
                }
                return;
            }
            synchronized (this.f58599b) {
                try {
                    DatabaseUtils.beginTransaction(this.f58598a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("request_id", mBridgeCampaigns.m50583f());
                    contentValues.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mBridgeCampaigns.m50569k());
                    contentValues.put("system_id", mBridgeCampaigns.m50567l());
                    contentValues.put("backup_id", mBridgeCampaigns.m50566m());
                    contentValues.put("state", Integer.valueOf(mBridgeCampaigns.m50571j()));
                    contentValues.put("template", Integer.valueOf(mBridgeCampaigns.m50564o()));
                    contentValues.put("invalid_time", Long.valueOf(mBridgeCampaigns.m50563p()));
                    contentValues.put("invalid_time_2", Long.valueOf(mBridgeCampaigns.m50562q()));
                    contentValues.put("invalid_time_backup", Long.valueOf(mBridgeCampaigns.m50561r()));
                    contentValues.put("show_count", Integer.valueOf(mBridgeCampaigns.m50559t()));
                    contentValues.put(BaseCampaignUnit.JSON_KEY_PARENT_SESSION_ID, mBridgeCampaigns.m50565n());
                    contentValues.put("token_rule", Integer.valueOf(mBridgeCampaigns.m50614G()));
                    contentValues.put(BaseCampaignUnit.JSON_KEY_SECOND_SHOW_INDEX, Integer.valueOf(mBridgeCampaigns.m50601b()));
                    contentValues.put(BaseCampaignUnit.JSON_KEY_SECOND_REQUEST_INDEX, Integer.valueOf(mBridgeCampaigns.m50609a()));
                    contentValues.put("data", mBridgeCampaigns.m50557v().toString());
                    long update = this.f58598a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(mBridgeCampaigns.m50595c()), MBSDKContext.m52746m().m52779k(), mBridgeCampaigns.m50591d(), mBridgeCampaigns.m50587e(), mBridgeCampaigns.m50580g()});
                    if (MBridgeConstans.DEBUG) {
                        SameLogTool.m51827a("CampaignTable", "updateCampaign result:  " + update);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f58598a);
                    sQLiteDatabase = this.f58598a;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        SameLogTool.m51823b("CampaignTable", "updateCampaign: ", e);
                    }
                    sQLiteDatabase = this.f58598a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            }
        } else if (MBridgeConstans.DEBUG) {
            SameLogTool.m51824b("CampaignTable", "insert: campaignList is null or empty");
        }
    }

    /* renamed from: a */
    public final void m50367a(int i, String str, String str2, String str3, int i2) {
        MBridgeTaskManager.campaignTableExecute(m50356b(i, str, str2, str3, i2, null));
    }

    /* renamed from: a */
    public final void m50366a(int i, String str, String str2, String str3, int i2, MBridgeCampaigns mBridgeCampaigns) {
        MBridgeTaskManager.campaignTableExecute(m50356b(i, str, str2, str3, i2, mBridgeCampaigns));
    }

    /* renamed from: a */
    private static String m50369a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    /* renamed from: a */
    private static List<MBridgeCampaigns> m50360a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor.getCount() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int columnIndex = cursor2.getColumnIndex("ad_type");
            int columnIndex2 = cursor2.getColumnIndex("app_id");
            int columnIndex3 = cursor2.getColumnIndex("placement_id");
            int columnIndex4 = cursor2.getColumnIndex(MBridgeConstans.PROPERTIES_UNIT_ID);
            int columnIndex5 = cursor2.getColumnIndex("request_id");
            int columnIndex6 = cursor2.getColumnIndex("local_id");
            int columnIndex7 = cursor2.getColumnIndex("bid_token");
            int columnIndex8 = cursor2.getColumnIndex("header_bidding");
            int columnIndex9 = cursor2.getColumnIndex("load_start_time");
            int columnIndex10 = cursor2.getColumnIndex("backup_id");
            int columnIndex11 = cursor2.getColumnIndex("state");
            int columnIndex12 = cursor2.getColumnIndex("template");
            int columnIndex13 = cursor2.getColumnIndex("invalid_time");
            int columnIndex14 = cursor2.getColumnIndex("invalid_time_2");
            ArrayList arrayList2 = arrayList;
            int columnIndex15 = cursor2.getColumnIndex("invalid_time_backup");
            int columnIndex16 = cursor2.getColumnIndex("ecppv");
            int columnIndex17 = cursor2.getColumnIndex(SDKAnalyticsEvents.PARAMETER_SESSION_ID);
            int i = columnIndex14;
            int columnIndex18 = cursor2.getColumnIndex("system_id");
            int i2 = columnIndex13;
            int columnIndex19 = cursor2.getColumnIndex("show_count");
            int columnIndex20 = cursor2.getColumnIndex(BaseCampaignUnit.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor2.getColumnIndex("data");
            int columnIndex22 = cursor2.getColumnIndex("token_rule");
            int columnIndex23 = cursor2.getColumnIndex(BaseCampaignUnit.JSON_KEY_SECOND_SHOW_INDEX);
            int columnIndex24 = cursor2.getColumnIndex(BaseCampaignUnit.JSON_KEY_SECOND_REQUEST_INDEX);
            while (cursor.moveToNext()) {
                int i3 = columnIndex24;
                int i4 = columnIndex;
                int i5 = columnIndex2;
                int i6 = columnIndex3;
                int i7 = columnIndex4;
                MBridgeCampaigns mBridgeCampaigns = new MBridgeCampaigns(cursor2.getInt(columnIndex), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getString(columnIndex4));
                mBridgeCampaigns.m50605a(cursor2.getString(columnIndex5));
                mBridgeCampaigns.m50598b(cursor2.getString(columnIndex6));
                String string = cursor2.getString(columnIndex7);
                mBridgeCampaigns.m50592c(string);
                boolean z = true;
                if (cursor2.getInt(columnIndex8) != 1) {
                    z = false;
                }
                mBridgeCampaigns.m50602a(z);
                mBridgeCampaigns.m50585e(cursor2.getLong(columnIndex9));
                mBridgeCampaigns.m50588d(cursor2.getString(columnIndex17));
                mBridgeCampaigns.m50584e(cursor2.getString(columnIndex18));
                mBridgeCampaigns.m50581f(cursor2.getString(columnIndex10));
                mBridgeCampaigns.m50594c(cursor2.getInt(columnIndex11));
                mBridgeCampaigns.m50590d(cursor2.getInt(columnIndex12));
                int i8 = columnIndex18;
                int i9 = columnIndex17;
                int i10 = i2;
                mBridgeCampaigns.m50599b(cursor2.getLong(i10));
                i2 = i10;
                int i11 = i;
                mBridgeCampaigns.m50593c(cursor2.getLong(i11));
                i = i11;
                int i12 = columnIndex15;
                mBridgeCampaigns.m50589d(cursor2.getLong(i12));
                columnIndex15 = i12;
                int i13 = columnIndex16;
                mBridgeCampaigns.m50608a(cursor2.getDouble(i13));
                int i14 = columnIndex19;
                mBridgeCampaigns.m50586e(cursor2.getInt(i14));
                columnIndex16 = i13;
                int i15 = columnIndex20;
                mBridgeCampaigns.m50578g(cursor2.getString(i15));
                int i16 = columnIndex22;
                mBridgeCampaigns.m50568k(cursor2.getInt(i16));
                columnIndex22 = i16;
                int i17 = columnIndex23;
                mBridgeCampaigns.m50600b(cursor2.getInt(i17));
                columnIndex23 = i17;
                mBridgeCampaigns.m50607a(cursor2.getInt(i3));
                int i18 = columnIndex21;
                JSONObject parse = JSONUtils.parse(cursor2.getString(i18));
                mBridgeCampaigns.m50603a(parse);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(mBridgeCampaigns);
                CampaignUnit parseCampaignUnit = BaseCampaignUnit.parseCampaignUnit(parse, string);
                if (parseCampaignUnit != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<CampaignEx> ads = parseCampaignUnit.getAds();
                    if (ads != null) {
                        columnIndex21 = i18;
                        MBridgeGlobalCommon.handlerCampaigns(mBridgeCampaigns.m50580g(), mBridgeCampaigns, ads, arrayList4);
                        mBridgeCampaigns.m50597b(ads);
                        mBridgeCampaigns.m50604a(arrayList4);
                        cursor2 = cursor;
                        arrayList2 = arrayList3;
                        columnIndex20 = i15;
                        columnIndex18 = i8;
                        columnIndex17 = i9;
                        columnIndex24 = i3;
                        columnIndex = i4;
                        columnIndex3 = i6;
                        columnIndex4 = i7;
                        columnIndex19 = i14;
                        columnIndex2 = i5;
                    }
                }
                cursor2 = cursor;
                arrayList2 = arrayList3;
                columnIndex21 = i18;
                columnIndex20 = i15;
                columnIndex18 = i8;
                columnIndex17 = i9;
                columnIndex24 = i3;
                columnIndex = i4;
                columnIndex3 = i6;
                columnIndex4 = i7;
                columnIndex19 = i14;
                columnIndex2 = i5;
            }
            return arrayList2;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("CampaignTable", "parseCampaignTable: ", e);
                return null;
            }
            return null;
        }
    }

    /* renamed from: b */
    private Runnable m50356b(final int i, final String str, final String str2, final String str3, final int i2, final MBridgeCampaigns mBridgeCampaigns) {
        return new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.5
            @Override // java.lang.Runnable
            public final void run() {
                MBridgeCampaigns mBridgeCampaigns2 = mBridgeCampaigns;
                if (mBridgeCampaigns2 != null) {
                    List<MBridgeCampaigns> m50362a = CampaignTable.this.m50362a(mBridgeCampaigns2.m50595c(), mBridgeCampaigns.m50591d(), mBridgeCampaigns.m50587e(), mBridgeCampaigns.m50574i(), 0, mBridgeCampaigns.m50580g());
                    if (mBridgeCampaigns.m50609a() <= 0 || m50362a == null || m50362a.isEmpty()) {
                        if (mBridgeCampaigns.m50609a() == 0 && m50362a != null && !m50362a.isEmpty() && m50362a.get(0).m50559t() > 0) {
                            return;
                        }
                        CampaignTable.this.m50357b(i, str, str2, str3, i2);
                        return;
                    }
                    return;
                }
                CampaignTable.this.m50357b(i, str, str2, str3, i2);
            }
        };
    }

    /* renamed from: b */
    public final void m50357b(int i, String str, String str2, String str3, int i2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f58598a)) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.f58599b) {
            try {
                DatabaseUtils.beginTransaction(this.f58598a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", Integer.valueOf(i2));
                int update = this.f58598a.update("campaign", contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), MBSDKContext.m52746m().m52779k(), str, str2, str3});
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51827a("CampaignTable", "updateState result:  " + update);
                }
                DatabaseUtils.setTransactionSuccessful(this.f58598a);
                sQLiteDatabase = this.f58598a;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51823b("CampaignTable", "updateState: ", e);
                }
                sQLiteDatabase = this.f58598a;
            }
            DatabaseUtils.endTransaction(sQLiteDatabase);
        }
    }

    /* renamed from: b */
    public final void m50358b(final int i, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.7
            @Override // java.lang.Runnable
            public final void run() {
                CampaignTable.this.m50353c(i, str, str2);
            }
        });
    }

    /* renamed from: a */
    public final void m50365a(final int i, final String str, final String str2, final String str3, final boolean z, final String str4, final long j) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.1
            @Override // java.lang.Runnable
            public final void run() {
                CampaignTable.this.m50355b(i, str, str2, str3, z, str4, j);
            }
        });
    }

    /* renamed from: a */
    public final void m50363a(final int i, final String str, final String str2, final boolean z, final int i2, final CampaignTableListener campaignTableListener) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.4
            @Override // java.lang.Runnable
            public final void run() {
                List<MBridgeCampaigns> m50362a = CampaignTable.this.m50362a(i, str, str2, z, i2, "");
                if (m50362a != null && m50362a.size() != 0) {
                    CampaignTableListener campaignTableListener2 = campaignTableListener;
                    if (campaignTableListener2 != null) {
                        campaignTableListener2.mo50327a(m50362a);
                        return;
                    }
                    return;
                }
                CampaignTableListener campaignTableListener3 = campaignTableListener;
                if (campaignTableListener3 != null) {
                    campaignTableListener3.mo50328a();
                }
            }
        });
    }

    /* renamed from: a */
    public final void m50368a(final int i, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.d.a.6
            @Override // java.lang.Runnable
            public final void run() {
                CampaignTable.this.m50352d(i, str, str2);
            }
        });
    }
}
