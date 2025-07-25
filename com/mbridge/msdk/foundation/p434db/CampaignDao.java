package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.AabEntity;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.mbridge.msdk.foundation.db.e */
/* loaded from: classes6.dex */
public class CampaignDao extends BaseDao<Campaign> {

    /* renamed from: a */
    private static final String f56219a = "com.mbridge.msdk.foundation.db.e";

    /* renamed from: b */
    private static CampaignDao f56220b;

    /* renamed from: c */
    private final String f56221c;

    /* renamed from: d */
    private final String f56222d;

    /* renamed from: e */
    private final String f56223e;

    /* renamed from: f */
    private final String f56224f;

    /* renamed from: g */
    private final String f56225g;

    /* renamed from: h */
    private final String f56226h;

    /* renamed from: i */
    private final String f56227i;

    /* renamed from: j */
    private final String f56228j;

    /* renamed from: k */
    private final String f56229k;

    /* renamed from: l */
    private final String f56230l;

    /* renamed from: m */
    private final String f56231m;

    /* renamed from: n */
    private final String f56232n;

    /* renamed from: o */
    private final String f56233o;

    /* renamed from: p */
    private final String f56234p;

    /* renamed from: q */
    private final String f56235q;

    /* renamed from: r */
    private final String f56236r;

    /* renamed from: s */
    private final String f56237s;

    private CampaignDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
        this.f56221c = "rid";
        this.f56222d = "lrid";
        this.f56223e = "cid";
        this.f56224f = CampaignEx.JSON_KEY_PLCT;
        this.f56225g = CampaignEx.JSON_KEY_PLCTB;
        this.f56226h = "timestamp";
        this.f56227i = "ridCount";
        this.f56228j = " WHERE ";
        this.f56229k = " AND ";
        this.f56230l = "SELECT ";
        this.f56231m = ProxyConfig.MATCH_ALL_SCHEMES;
        this.f56232n = " FROM ";
        this.f56233o = " AND readyState = '0'";
        this.f56234p = " AND is_bid_campaign = 1";
        this.f56235q = " order by ts ASC";
        this.f56236r = " group by request_id";
        this.f56237s = " group by bid_token";
    }

    /* renamed from: a */
    public static synchronized CampaignDao m52635a(CommonAbsDBHelper commonAbsDBHelper) {
        CampaignDao campaignDao;
        synchronized (CampaignDao.class) {
            if (f56220b == null) {
                f56220b = new CampaignDao(commonAbsDBHelper);
            }
            campaignDao = f56220b;
        }
        return campaignDao;
    }

    /* renamed from: b */
    public final synchronized void m52606b(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 0);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void m52604c(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? ", strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f8, code lost:
        if (r11 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010e, code lost:
        if (0 != 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0110, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0113, code lost:
        return r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.BidCacheBean> m52602d(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.CampaignDao.m52602d(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
        if (r2 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x009e, code lost:
        if (0 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a0, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a3, code lost:
        return r0;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.String> m52600e(java.lang.String r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT "
            r1.append(r2)
            java.lang.String r2 = "local_request_id"
            r1.append(r2)
            java.lang.String r2 = " as "
            r1.append(r2)
            java.lang.String r2 = "lrid"
            r1.append(r2)
            java.lang.String r2 = " FROM "
            r1.append(r2)
            java.lang.String r2 = "campaign"
            r1.append(r2)
            java.lang.String r2 = " WHERE "
            r1.append(r2)
            java.lang.String r2 = "unitid"
            r1.append(r2)
            java.lang.String r2 = " = ? AND "
            r1.append(r2)
            java.lang.String r2 = "readyState"
            r1.append(r2)
            java.lang.String r2 = " = ?"
            r1.append(r2)
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            r3.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            android.database.sqlite.SQLiteDatabase r4 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8f
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L8f
            r7 = 0
            r6[r7] = r9     // Catch: java.lang.Throwable -> L8f
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L8f
            r5 = 1
            r6[r5] = r9     // Catch: java.lang.Throwable -> L8f
            android.database.Cursor r2 = r4.rawQuery(r1, r6)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8c
            int r9 = r2.getCount()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r9 <= 0) goto L8c
        L71:
            boolean r9 = r2.moveToNext()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r9 == 0) goto L8c
            java.lang.String r9 = "lrid"
            int r9 = r2.getColumnIndex(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            java.lang.String r9 = r2.getString(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            if (r1 == 0) goto L88
            goto L71
        L88:
            r0.add(r9)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
            goto L71
        L8c:
            if (r2 == 0) goto La3
            goto La0
        L8f:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8f
            throw r9     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L94
        L92:
            r9 = move-exception
            goto La4
        L94:
            r9 = move-exception
            java.lang.String r1 = "CampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> L92
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r9)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto La3
        La0:
            r2.close()
        La3:
            return r0
        La4:
            if (r2 == 0) goto La9
            r2.close()
        La9:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.CampaignDao.m52600e(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d8, code lost:
        if (r2 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00ee, code lost:
        if (0 != 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f0, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f3, code lost:
        return r0;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, com.mbridge.msdk.foundation.entity.BidCacheBean> m52598f(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = " WHERE unitid = ? AND level = 0 AND adSource = 1"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = 0
            r1[r2] = r11
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r0 = " AND is_bid_campaign = 1"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = " AND readyState = '0'"
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT request_id as rid, id as cid, plct as plct, plctb as plctb, ts as timestamp FROM campaign"
            r0.append(r2)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r3.<init>()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            android.database.sqlite.SQLiteDatabase r4 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> Ldb
            android.database.Cursor r2 = r4.rawQuery(r11, r1)     // Catch: java.lang.Throwable -> Ldb
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ldb
            if (r2 == 0) goto Ld8
            int r11 = r2.getCount()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            if (r11 <= 0) goto Ld8
        L58:
            boolean r11 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            if (r11 == 0) goto Ld8
            java.lang.String r11 = "rid"
            int r11 = r2.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r11 = r2.getString(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r1 = "cid"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r3 = "plct"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r5 = "plctb"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            long r5 = r2.getLong(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.lang.String r7 = "timestamp"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            long r7 = r2.getLong(r7)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            boolean r9 = r0.containsKey(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            if (r9 == 0) goto Lb8
            java.lang.Object r9 = r0.get(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            com.mbridge.msdk.foundation.entity.c r9 = (com.mbridge.msdk.foundation.entity.BidCacheBean) r9     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            if (r9 == 0) goto L58
            r9.m52516a(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52517a(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52512b(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52508c(r7)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.util.List r11 = r9.m52510c()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            if (r11 == 0) goto L58
            java.util.List r11 = r9.m52510c()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r11.add(r1)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            goto L58
        Lb8:
            com.mbridge.msdk.foundation.entity.c r9 = new com.mbridge.msdk.foundation.entity.c     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.<init>()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52516a(r11)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52517a(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52512b(r5)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52508c(r7)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r3.<init>()     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r3.add(r1)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r9.m52515a(r3)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            r0.put(r11, r9)     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
            goto L58
        Ld8:
            if (r2 == 0) goto Lf3
            goto Lf0
        Ldb:
            r11 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Ldb
            throw r11     // Catch: java.lang.Throwable -> Lde java.lang.Exception -> Le0
        Lde:
            r11 = move-exception
            goto Lf4
        Le0:
            r11 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> Lde
            if (r1 == 0) goto Lee
            java.lang.String r1 = "CampaignDao"
            java.lang.String r11 = r11.getLocalizedMessage()     // Catch: java.lang.Throwable -> Lde
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r11)     // Catch: java.lang.Throwable -> Lde
        Lee:
            if (r2 == 0) goto Lf3
        Lf0:
            r2.close()
        Lf3:
            return r0
        Lf4:
            if (r2 == 0) goto Lf9
            r2.close()
        Lf9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.CampaignDao.m52598f(java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }

    /* renamed from: a */
    public final synchronized void m52631a(String str, int i, int i2) {
        String[] strArr;
        try {
            strArr = new String[]{str, String.valueOf(i), String.valueOf(i2)};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "unitid = ? AND level = ? AND adSource = ? ", strArr);
    }

    /* renamed from: c */
    public final int m52603c(String str, String str2) {
        String[] strArr;
        String str3;
        if (TextUtils.isEmpty(str)) {
            strArr = new String[]{str2};
            str3 = "unitid = ?  AND is_bid_campaign = 1";
        } else {
            strArr = new String[]{str2, str};
            str3 = "unitid = ?  AND request_id = ?  AND is_bid_campaign = 1";
        }
        String str4 = str3 + " AND readyState = '0'";
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            return getWritableDatabase().update("campaign", contentValues, str4, strArr);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                return 0;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final synchronized void m52627a(String str, int i, int i2, boolean z) {
        String str2;
        String[] strArr;
        try {
            str2 = "unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = ? ";
            strArr = new String[4];
            strArr[0] = str;
            strArr[1] = String.valueOf(i);
            strArr[2] = String.valueOf(i2);
            strArr[3] = String.valueOf(z ? 1 : 0);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, strArr);
    }

    /* renamed from: b */
    public final synchronized List<CampaignEx> m52610b(String str) {
        try {
            try {
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE unitid = ? AND readyState = 2", new String[]{str});
                if (rawQuery == null || rawQuery.getCount() <= 0) {
                    if (rawQuery != null) {
                        rawQuery.close();
                    }
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (rawQuery.moveToNext()) {
                    arrayList.add(m52636a(rawQuery));
                }
                rawQuery.close();
                return arrayList;
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                }
                return null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52619a(String str, List<CampaignEx> list) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", (Integer) 2);
                    String str2 = "id = ? AND unitid = ? AND request_id = ?  AND is_bid_campaign = ? ";
                    String[] strArr = new String[4];
                    strArr[0] = campaignEx.getId();
                    strArr[1] = str;
                    strArr[2] = campaignEx.getRequestId();
                    strArr[3] = campaignEx.isBidCampaign() ? "1" : "0";
                    try {
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, str2, strArr);
                        }
                    } catch (SQLException e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final synchronized void m52599e(String str, String str2) {
        try {
        } catch (Exception e) {
            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String str3 = "";
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            str3 = "unitid = ? AND ";
            arrayList.add(str);
        }
        arrayList.add(str2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, str3 + "n_local_request_id = ? AND bid_token IS NOT NULL AND n_local_request_id IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: b */
    public final synchronized void m52607b(String str, String str2) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        String[] strArr = {str, str2};
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, "id = ? AND request_id = ? ", strArr);
    }

    /* renamed from: a */
    public final synchronized void m52623a(String str, CampaignEx campaignEx, boolean z, String str2) {
        try {
            StringBuilder sb2 = new StringBuilder();
            if (campaignEx == null && !TextUtils.isEmpty(str2)) {
                sb2.append("unitid");
                sb2.append(" = ? AND ");
                sb2.append("request_id");
                sb2.append(" = ?");
            } else if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                sb2.append("unitid");
                sb2.append(" = ? AND ");
                sb2.append("id");
                sb2.append(" = ? AND ");
                sb2.append("request_id");
                sb2.append(" = ?");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            if (campaignEx != null && campaignEx.getLoadTimeoutState() == 0) {
                arrayList.add(String.valueOf(campaignEx.getId()));
                arrayList.add(campaignEx.getRequestId());
            } else {
                arrayList.add(str2);
            }
            if (!TextUtils.isEmpty(sb2)) {
                if (SameOptimizedController.m51814a().m51810a("c_n_c_s", true)) {
                    sb2.append(" AND readyState");
                    sb2.append(" != 0");
                }
                if (z) {
                    sb2.append(" AND is_bid_campaign = 1");
                } else {
                    sb2.append(" AND is_bid_campaign = 0");
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("readyState", (Integer) 2);
                SQLiteDatabase writableDatabase = getWritableDatabase();
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                if (writableDatabase != null) {
                    writableDatabase.update("campaign", contentValues, sb2.toString(), strArr);
                }
            }
        } catch (SQLException e) {
            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
        }
    }

    /* renamed from: b */
    public final synchronized void m52611b(long j, String str) {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - j), str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? and unitid= ? ", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: d */
    public final synchronized void m52601d(String str, String str2) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str3 = "unitid = ?";
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        if (!TextUtils.isEmpty(str2)) {
            str3 = "unitid = ? AND bid_token != ?";
            arrayList.add(str2);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, (str3 + " AND is_bid_campaign = 1") + " AND bid_token IS NOT NULL", (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: f */
    public final synchronized void m52597f(String str, String str2) {
        try {
        } catch (Exception e) {
            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String[] strArr = {str, str2};
            ContentValues contentValues = new ContentValues();
            contentValues.put("readyState", (Integer) 2);
            getWritableDatabase().update("campaign", contentValues, "unitid = ? AND bid_token = ? AND bid_token IS NOT NULL", strArr);
        }
    }

    /* renamed from: b */
    public final synchronized void m52605b(final List<CampaignEx> list, final String str) {
        if (list != null) {
            if (list.size() != 0) {
                new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.db.e.1
                    {
                        CampaignDao.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        for (CampaignEx campaignEx : list) {
                            CampaignDao.this.m52634a(campaignEx, str, 0);
                        }
                    }
                }).start();
            }
        }
    }

    /* renamed from: b */
    public final synchronized List<CampaignEx> m52609b(String str, int i, int i2, int i3) {
        ArrayList arrayList;
        String str2;
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        str2 = "";
        if (i > 0) {
            str2 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return m52614a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?" + str2, (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: a */
    public final synchronized void m52615a(String str, List<CampaignEx> list, boolean z) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    m52623a(str, campaignEx, z, campaignEx.getRequestId());
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52617a(String str, List<CampaignEx> list, String str2, int i) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                for (CampaignEx campaignEx : list) {
                    if (campaignEx != null) {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(str2, Integer.valueOf(i));
                        writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                    }
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: b */
    public final List<CampaignEx> m52608b(String str, int i, boolean z) {
        ArrayList arrayList;
        String str2;
        String[] strArr;
        Cursor cursor = null;
        r2 = null;
        ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                if (z) {
                    str2 = "placement_id = ? AND ad_type = ? ";
                    strArr = new String[]{str, String.valueOf(i)};
                } else {
                    str2 = "ad_type = ? ";
                    strArr = new String[]{String.valueOf(i)};
                }
                Cursor rawQuery = getReadableDatabase().rawQuery("SELECT * FROM campaign WHERE " + str2, strArr);
                if (rawQuery != null) {
                    try {
                        try {
                            if (rawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                while (rawQuery.moveToNext()) {
                                    try {
                                        arrayList.add(m52636a(rawQuery));
                                    } catch (Exception e) {
                                        cursor = rawQuery;
                                        e = e;
                                        SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        return arrayList;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Throwable th) {
                            cursor = rawQuery;
                            th = th;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        cursor = rawQuery;
                        e = e2;
                        arrayList = null;
                    }
                }
                if (rawQuery != null) {
                    rawQuery.close();
                    return arrayList2;
                }
                return arrayList2;
            } catch (Exception e3) {
                e = e3;
                arrayList = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public final synchronized void m52616a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        if (getWritableDatabase() == null) {
            return;
        }
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (CampaignEx campaignEx : list) {
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("readyState", (Integer) 0);
                            String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                            getWritableDatabase().update("campaign", contentValues, z ? "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 1" : "unitid = ? AND id = ? AND request_id = ?  AND is_bid_campaign = 0", strArr);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("CampaignDao", e2.getLocalizedMessage());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx2 : list2) {
                try {
                    if (campaignEx2.getLoadTimeoutState() == 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unitid");
                        sb2.append(" = ? AND ");
                        sb2.append("id");
                        sb2.append(" = ? AND ");
                        sb2.append("request_id");
                        sb2.append(" = ? ");
                        String[] strArr2 = {str, campaignEx2.getId(), campaignEx2.getRequestId()};
                        if (z) {
                            sb2.append(" AND is_bid_campaign = 1");
                        } else {
                            sb2.append(" AND is_bid_campaign = 0");
                        }
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("readyState", (Integer) 2);
                        getWritableDatabase().update("campaign", contentValues2, sb2.toString(), strArr2);
                    }
                } catch (SQLException e3) {
                    if (MBridgeConstans.DEBUG) {
                        SameLogTool.m51824b("CampaignDao", e3.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52618a(String str, List<CampaignEx> list, String str2) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("local_request_id", str2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", new String[]{str, campaignEx.getId(), campaignEx.getRequestId()});
                        }
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52622a(String str, String str2) {
        String[] strArr;
        try {
            strArr = new String[]{str, str2};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", "id = ? AND unitid = ? ", strArr);
    }

    /* renamed from: a */
    public final synchronized void m52632a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArr = {str};
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("campaign", "unitid = ? AND readyState = 2", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52613a(List<CampaignEx> list, String str) {
        if (list != null) {
            if (list.size() > 0) {
                for (CampaignEx campaignEx : list) {
                    try {
                        String[] strArr = {str, campaignEx.getId(), campaignEx.getRequestId()};
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", (Integer) 2);
                        SQLiteDatabase writableDatabase = getWritableDatabase();
                        if (writableDatabase != null) {
                            writableDatabase.update("campaign", contentValues, "unitid = ? AND id = ? AND request_id = ? ", strArr);
                        }
                    } catch (SQLException e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52620a(String str, String str2, boolean z, String str3) {
        String[] strArr;
        try {
            strArr = new String[4];
            strArr[0] = str;
            strArr[1] = str2;
            strArr[2] = z ? "1" : "0";
            strArr[3] = str3;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", (Integer) 2);
        getWritableDatabase().update("campaign", contentValues, "id = ? AND unitid = ? AND is_bid_campaign = ? AND request_id = ? ", strArr);
    }

    /* renamed from: a */
    public final synchronized void m52621a(String str, String str2, int i, int i2, boolean z) {
        String[] strArr;
        String str3;
        try {
            strArr = new String[]{str, str2, String.valueOf(i), String.valueOf(i2)};
            if (z) {
                str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 1";
            } else {
                str3 = "id = ? AND unitid = ? AND level = ? AND adSource = ?  AND is_bid_campaign = 0";
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str3, strArr);
    }

    /* renamed from: a */
    public final synchronized void m52625a(String str, int i, boolean z) {
        String str2;
        String[] strArr;
        try {
            if (z) {
                str2 = "placement_id = ? AND ad_type = ? ";
                strArr = new String[]{str, String.valueOf(i)};
            } else {
                str2 = "ad_type = " + i;
                strArr = new String[]{String.valueOf(i)};
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("campaign", str2, strArr);
    }

    /* renamed from: a */
    public final synchronized void m52638a() {
        try {
            String[] strArr = {String.valueOf(System.currentTimeMillis() - 3600000)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", "ts< ? AND ts>0", strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52637a(long j, String str) {
        long currentTimeMillis;
        try {
            String str2 = "(plctb>0 and (plctb* 1000+ts)< " + System.currentTimeMillis() + " ) or (" + CampaignEx.JSON_KEY_PLCTB + "<=0 and ts< " + (currentTimeMillis - j) + " ) and unitid=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("campaign", str2, strArr);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52612a(List<CampaignEx> list, String str, String str2, int i) {
        if (list != null) {
            if (list.size() != 0) {
                if (getWritableDatabase() == null) {
                    return;
                }
                for (CampaignEx campaignEx : list) {
                    m52633a(campaignEx, str, str2, i);
                }
            }
        }
    }

    /* renamed from: a */
    private synchronized long m52633a(CampaignEx campaignEx, String str, String str2, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str3 : campaignEx.getPv_urls()) {
                    jSONArray.put(str3);
                }
                contentValues.put("pv_urls", jSONArray.toString());
            }
            contentValues.put("id", campaignEx.getId());
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            contentValues.put("placement_id", str);
            contentValues.put("unitid", str2);
            contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
            contentValues.put("package_name", campaignEx.getPackageName());
            contentValues.put("app_name", campaignEx.getAppName());
            contentValues.put("app_desc", campaignEx.getAppDesc());
            contentValues.put("app_size", campaignEx.getSize());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
            contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
            contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
            contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put(BaseCampaignUnit.JSON_KEY_C_I, campaignEx.getNetAddress());
            contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
            contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
            contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
            contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
            contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put("video_url", campaignEx.getVideoUrlEncode());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
            contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
            contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
            contentValues.put("advImp", campaignEx.getAdvImp());
            contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
            contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
            contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
            contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
            contentValues.put(BaseCampaignUnit.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
            contentValues.put(BaseCampaignUnit.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
            contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
            contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
            contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
            contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
            contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
            contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
            contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
            contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
            contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
            contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
            contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
            if (campaignEx.getRewardTemplateMode() != null) {
                contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().m52524d());
            }
            contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
            contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
            contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
            contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
            contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
            contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
            contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
            contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
            contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
            contentValues.put("ia_url", campaignEx.getKeyIaUrl());
            contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
            contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
            contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
            contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
            contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
            contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
            contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
            contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
            contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
            contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
            CampaignEx.C21959a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.m52542a());
                contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.m52533e()));
                contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.m52532f()));
            }
            contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
            contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
            contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
            contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
            contentValues.put("ad_zip", campaignEx.getAdZip());
            contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
            contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
            contentValues.put("creative_id", Long.valueOf(campaignEx.getCreativeId()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
            contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
            contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
            contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
            contentValues.put("bid_token", campaignEx.getBidToken());
            contentValues.put("mraid", campaignEx.getMraid());
            contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
            contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
            contentValues.put(BaseCampaignUnit.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
            contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
            contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
            contentValues.put(BaseCampaignUnit.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
            contentValues.put(BaseCampaignUnit.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
            contentValues.put(BaseCampaignUnit.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
            contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
            contentValues.put("request_id", campaignEx.getRequestId());
            contentValues.put("n_request_id", campaignEx.getNRid());
            contentValues.put("local_request_id", campaignEx.getLocalRequestId());
            contentValues.put("n_local_request_id", campaignEx.getNLRid());
            contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
            contentValues.put("err_reason_default_ad", campaignEx.getReasond());
            contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
            contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
            contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
            contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
            contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
            contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
            contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
            contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
            contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
            contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
            contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
            contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
            contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
            if (campaignEx.getAabEntity() != null) {
                contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
            }
            contentValues.put("privacy_url", campaignEx.getPrivacyUrl());
            contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
            contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
            contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
            contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
            return getWritableDatabase().insert("campaign", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    /* renamed from: a */
    public final synchronized long m52634a(CampaignEx campaignEx, String str, int i) {
        String str2;
        String[] strArr;
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", campaignEx.getId());
            if (campaignEx.getPv_urls() != null && campaignEx.getPv_urls().size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String str3 : campaignEx.getPv_urls()) {
                    jSONArray.put(str3);
                }
                contentValues.put("pv_urls", jSONArray.toString());
            }
            contentValues.put("unitid", str);
            contentValues.put("request_id", campaignEx.getRequestId());
            contentValues.put("n_request_id", campaignEx.getNRid());
            contentValues.put("local_request_id", campaignEx.getLocalRequestId());
            contentValues.put("n_local_request_id", campaignEx.getNLRid());
            contentValues.put("err_type_default_ad", Integer.valueOf(campaignEx.getTyped()));
            contentValues.put("err_reason_default_ad", campaignEx.getReasond());
            contentValues.put("tab", Integer.valueOf(campaignEx.getTab()));
            contentValues.put("package_name", campaignEx.getPackageName());
            contentValues.put("app_name", campaignEx.getAppName());
            contentValues.put("app_desc", campaignEx.getAppDesc());
            contentValues.put("app_size", campaignEx.getSize());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
            contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK, Integer.valueOf(campaignEx.getWtick()));
            contentValues.put("deeplink_url", campaignEx.getDeepLinkURL());
            contentValues.put(CampaignEx.JSON_KEY_USER_ACTIVATION, Boolean.toString(campaignEx.getUserActivation()));
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put(BaseCampaignUnit.JSON_KEY_C_I, campaignEx.getNetAddress());
            contentValues.put(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH, Integer.valueOf(campaignEx.getAc_s()));
            contentValues.put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, campaignEx.getAc());
            contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
            contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
            contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put("fc_b", Integer.valueOf(campaignEx.getFcb()));
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put("video_url", campaignEx.getVideoUrlEncode());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Integer.valueOf(campaignEx.getVideoSize()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_LENGTHL, Integer.valueOf(campaignEx.getVideoLength()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, campaignEx.getVideoResolution());
            contentValues.put(CampaignEx.JSON_KEY_ENDCARD_CLICK, Integer.valueOf(campaignEx.getEndcard_click_result()));
            contentValues.put(CampaignEx.JSON_KEY_WATCH_MILE, Integer.valueOf(campaignEx.getWatchMile()));
            contentValues.put("advImp", campaignEx.getAdvImp());
            contentValues.put("bty", Integer.valueOf(campaignEx.getBty()));
            contentValues.put(CampaignEx.JSON_KEY_T_IMP, Integer.valueOf(campaignEx.getTImp()));
            contentValues.put(CampaignEx.JSON_KEY_GUIDELINES, campaignEx.getGuidelines());
            contentValues.put(CampaignEx.JSON_KEY_OFFER_TYPE, Integer.valueOf(campaignEx.getOfferType()));
            contentValues.put(BaseCampaignUnit.JSON_KEY_HTML_URL, campaignEx.getHtmlUrl());
            contentValues.put(BaseCampaignUnit.JSON_KEY_END_SCREEN_URL, campaignEx.getEndScreenUrl());
            contentValues.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, Integer.valueOf(campaignEx.getRewardAmount()));
            contentValues.put(CampaignEx.JSON_KEY_REWARD_NAME, campaignEx.getRewardName());
            contentValues.put("reward_play_status", Integer.valueOf(campaignEx.getRewardPlayStatus()));
            contentValues.put("retarget", Integer.valueOf(campaignEx.getRetarget_offer()));
            contentValues.put("native_ad_tracking", campaignEx.getNativeVideoTrackingString());
            contentValues.put(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO, Integer.valueOf(campaignEx.getPlayable_ads_without_video()));
            contentValues.put(CampaignEx.ENDCARD_URL, campaignEx.getendcard_url());
            contentValues.put(CampaignEx.VIDEO_END_TYPE, Integer.valueOf(campaignEx.getVideo_end_type()));
            contentValues.put(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5, campaignEx.getVideoMD5Value());
            contentValues.put(CampaignEx.JSON_KEY_NV_T2, Integer.valueOf(campaignEx.getNvT2()));
            contentValues.put(CampaignEx.JSON_KEY_GIF_URL, campaignEx.getGifUrl());
            if (campaignEx.getRewardTemplateMode() != null) {
                contentValues.put("reward_teamplate", campaignEx.getRewardTemplateMode().m52524d());
            }
            contentValues.put("c_coi", Integer.valueOf(campaignEx.getClickTimeOutInterval()));
            contentValues.put(CampaignEx.JSON_KEY_C_UA, Integer.valueOf(campaignEx.getcUA()));
            contentValues.put(CampaignEx.JSON_KEY_IMP_UA, Integer.valueOf(campaignEx.getImpUA()));
            contentValues.put(CampaignEx.JSON_KEY_JM_PD, Integer.valueOf(campaignEx.getJmPd()));
            contentValues.put("is_deleted", Integer.valueOf(campaignEx.getIsDeleted()));
            contentValues.put("is_click", Integer.valueOf(campaignEx.getIsClick()));
            contentValues.put("is_add_sucesful", Integer.valueOf(campaignEx.getIsAddSuccesful()));
            contentValues.put("short_ctime", String.valueOf(System.currentTimeMillis()));
            contentValues.put("ia_icon", campaignEx.getKeyIaIcon());
            contentValues.put("ia_url", campaignEx.getKeyIaUrl());
            contentValues.put("ia_rst", Integer.valueOf(campaignEx.getKeyIaRst()));
            contentValues.put("ia_ori", Integer.valueOf(campaignEx.getKeyIaOri()));
            contentValues.put("ad_type", Integer.valueOf(campaignEx.getAdType()));
            contentValues.put(CampaignEx.KEY_IA_EXT1, campaignEx.getIa_ext1());
            contentValues.put(CampaignEx.KEY_IA_EXT2, campaignEx.getIa_ext2());
            contentValues.put(CampaignEx.KEY_IS_DOWNLOAD, Integer.valueOf(campaignEx.getIsDownLoadZip()));
            contentValues.put(CampaignEx.KEY_IA_CACHE, campaignEx.getInteractiveCache());
            contentValues.put(CampaignEx.KEY_OC_TIME, Integer.valueOf(campaignEx.getOc_time()));
            contentValues.put(CampaignEx.KEY_OC_TYPE, Integer.valueOf(campaignEx.getOc_type()));
            contentValues.put(CampaignEx.KEY_T_LIST, campaignEx.getT_list());
            CampaignEx.C21959a adchoice = campaignEx.getAdchoice();
            if (adchoice != null) {
                contentValues.put(CampaignEx.KEY_ADCHOICE, adchoice.m52542a());
                contentValues.put("adchoice_size_height", Integer.valueOf(adchoice.m52533e()));
                contentValues.put("adchoice_size_width", Integer.valueOf(adchoice.m52532f()));
            }
            contentValues.put(CampaignEx.JSON_KEY_PLCT, Long.valueOf(campaignEx.getPlct()));
            contentValues.put(CampaignEx.JSON_KEY_PLCTB, Long.valueOf(campaignEx.getPlctb()));
            contentValues.put(CampaignEx.JSON_KEY_C_C_TIME, Long.valueOf(campaignEx.getCandidateCacheTime()));
            contentValues.put(CampaignEx.JSON_KEY_AD_HTML, campaignEx.getAdHtml());
            contentValues.put("ad_zip", campaignEx.getAdZip());
            contentValues.put(CampaignEx.JSON_KEY_BANNER_URL, campaignEx.getBannerUrl());
            contentValues.put(CampaignEx.JSON_KEY_BANNER_HTML, campaignEx.getBannerHtml());
            contentValues.put("creative_id", Long.valueOf(campaignEx.getCreativeId()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID, Long.valueOf(campaignEx.getVidCrtvId()));
            contentValues.put(CampaignEx.JSON_KEY_EC_CREATIVE_ID, Long.valueOf(campaignEx.getEcCrtvId()));
            contentValues.put(CampaignEx.JSON_KEY_EC_TEMP_ID, Long.valueOf(campaignEx.getEcTemplateId()));
            contentValues.put("is_bid_campaign", Boolean.valueOf(campaignEx.isBidCampaign()));
            contentValues.put("bid_token", campaignEx.getBidToken());
            contentValues.put("mraid", campaignEx.getMraid());
            contentValues.put("is_mraid_campaign", Boolean.valueOf(campaignEx.isMraid()));
            contentValues.put(CampaignEx.KEY_OMID, campaignEx.getOmid());
            contentValues.put(BaseCampaignUnit.JSON_KEY_MOF_TPLID, Integer.valueOf(campaignEx.getMof_tplid()));
            contentValues.put(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(campaignEx.getReady_rate()));
            contentValues.put(CampaignEx.JSON_KEY_EXT_DATA, campaignEx.getExt_data());
            contentValues.put(BaseCampaignUnit.JSON_KEY_NSCPT, Integer.valueOf(campaignEx.getNscpt()));
            contentValues.put(BaseCampaignUnit.JSON_KEY_MOF_TEMPLATE_URL, campaignEx.getMof_template_url());
            contentValues.put(BaseCampaignUnit.JSON_KEY_REQ_EXT_DATA, campaignEx.getReq_ext_data());
            contentValues.put("readyState", Integer.valueOf(campaignEx.getReadyState()));
            contentValues.put("load_timeout", Integer.valueOf(campaignEx.getLoadTimeoutState()));
            contentValues.put("placement_id", campaignEx.getPlacementId());
            contentValues.put(CampaignEx.JSON_KEY_MAITVE, Integer.valueOf(campaignEx.getMaitve()));
            contentValues.put(CampaignEx.JSON_KEY_MAITVESRC, campaignEx.getMaitve_src());
            contentValues.put(CampaignEx.JSON_KEY_FLB, Integer.valueOf(campaignEx.getFlb()));
            contentValues.put(CampaignEx.JSON_KEY_FLB_SKIP_TIME, Integer.valueOf(campaignEx.getFlbSkipTime()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(campaignEx.getAdSpaceT()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD, Integer.valueOf(campaignEx.getCbd()));
            contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, Integer.valueOf(campaignEx.getVst()));
            contentValues.put(CampaignEx.JSON_KEY_USE_SKIP_TIME, Integer.valueOf(campaignEx.getUseSkipTime()));
            contentValues.put(CampaignEx.JSON_KEY_PROG_BAR, Integer.valueOf(campaignEx.getProgressBarShow()));
            contentValues.put("vcn", Integer.valueOf(campaignEx.getVcn()));
            contentValues.put("token_r", Integer.valueOf(campaignEx.getTokenRule()));
            contentValues.put("encrypt_p", campaignEx.getEncryptPrice());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE, Integer.valueOf(campaignEx.getVideoCheckType()));
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE, Integer.valueOf(campaignEx.getVideoCtnType()));
            contentValues.put(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE, campaignEx.getRsIgnoreCheckRuleString());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME, Integer.valueOf(campaignEx.getVideoCompleteTime()));
            contentValues.put(CampaignEx.JSON_KEY_TP_OFFER, Integer.valueOf(campaignEx.getTpOffer()));
            contentValues.put(CampaignEx.JSON_KEY_FAC, Integer.valueOf(campaignEx.getFac()));
            contentValues.put("privacy_url", campaignEx.getPrivacyUrl());
            contentValues.put("privacy_button_video", Integer.valueOf(campaignEx.getPrivacyButtonTemplateVisibility()));
            contentValues.put(CampaignEx.JSON_KEY_IMP_REPORT_TYPE, Integer.valueOf(campaignEx.getImpReportType()));
            if (campaignEx.getAabEntity() != null) {
                contentValues.put(CampaignEx.JSON_KEY_AAB, campaignEx.getAabEntity().toJson().toString());
            }
            contentValues.put("auto_minicard", Integer.valueOf(campaignEx.getAutoShowStoreMiniCard()));
            contentValues.put("mincard_trigger_time", Integer.valueOf(campaignEx.getShowStoreMiniCardDelayTime()));
            if (m52626a(campaignEx.getId(), campaignEx.getTab(), str, i, campaignEx.getType(), campaignEx.isBidCampaign())) {
                if (campaignEx.isBidCampaign()) {
                    str2 = "unitid = ? AND is_bid_campaign = 1";
                    strArr = new String[]{str};
                } else {
                    String[] strArr2 = {campaignEx.getId(), str};
                    str2 = "id = ? AND unitid = ? AND is_bid_campaign = 0";
                    strArr = strArr2;
                }
                return getWritableDatabase().update("campaign", contentValues, str2, strArr);
            }
            return getWritableDatabase().insert("campaign", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    /* renamed from: a */
    public final synchronized int m52624a(String str, long j) {
        try {
            Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
            if (m53279b == null) {
                SettingManager.m53286a();
                m53279b = SettingManagerDiff.m53265a();
            }
            long m53459ad = m53279b.m53459ad() * 1000;
            m52637a(m53459ad, str);
            List<CampaignEx> m52628a = m52628a(str, 0, 0, 1, false);
            if (m52628a != null && !m52628a.isEmpty()) {
                for (CampaignEx campaignEx : m52628a) {
                    if (!campaignEx.isSpareOffer(j, m53459ad)) {
                        return 0;
                    }
                }
                return 1;
            }
            return -1;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
            return 0;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m52626a(String str, int i, String str2, int i2, int i3, boolean z) {
        String str3;
        String[] strArr;
        if (z) {
            str3 = "SELECT id FROM campaign WHERE unitid = ? AND is_bid_campaign = 1";
            strArr = new String[]{str2};
        } else {
            String[] strArr2 = {str, String.valueOf(i), str2, String.valueOf(i2), String.valueOf(i3)};
            str3 = "SELECT id FROM campaign WHERE id= ? AND tab= ? AND unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
            strArr = strArr2;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            rawQuery.close();
            return true;
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return false;
    }

    /* renamed from: a */
    public final List<CampaignEx> m52630a(String str, int i, int i2, int i3) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (i > 0) {
            arrayList.add(String.valueOf(i));
            str2 = " LIMIT ?";
        } else {
            str2 = "";
        }
        return m52614a("SELECT * FROM campaign WHERE unitid = ? AND level = ? AND adSource = ?" + str2, (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: a */
    public final synchronized List<CampaignEx> m52628a(String str, int i, int i2, int i3, boolean z) {
        ArrayList arrayList;
        String str2;
        String str3;
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (z) {
            str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 1";
        } else {
            str2 = " WHERE unitid = ? AND level = ? AND adSource = ? AND is_bid_campaign = 0";
        }
        str3 = "";
        if (i > 0) {
            str3 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return m52614a("SELECT * FROM campaign" + str2 + str3, (String[]) arrayList.toArray(new String[0]));
    }

    /* renamed from: a */
    public final synchronized List<CampaignEx> m52629a(String str, int i, int i2, int i3, String str2) {
        String str3;
        ArrayList arrayList;
        String str4;
        str3 = (" WHERE unitid = ?  AND level = ?  AND adSource = ?  AND is_bid_campaign = 1") + " AND readyState = '0'";
        arrayList = new ArrayList();
        arrayList.add(str);
        arrayList.add(String.valueOf(i2));
        arrayList.add(String.valueOf(i3));
        if (!TextUtils.isEmpty(str2)) {
            str3 = str3 + " AND request_id = ? ";
            arrayList.add(str2);
        }
        str4 = "";
        if (i > 0) {
            str4 = " LIMIT ?";
            arrayList.add(String.valueOf(i));
        }
        return m52614a("SELECT * FROM campaign" + (str3 + " order by ts ASC") + str4, (String[]) arrayList.toArray(new String[0]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x06ef, code lost:
        if (r8 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x06f1, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0706, code lost:
        if (r8 != null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x070a, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x070f A[Catch: all -> 0x0713, TRY_ENTER, TryCatch #0 {, blocks: (B:96:0x06e8, B:102:0x06f1, B:118:0x070f, B:119:0x0712), top: B:123:0x0002 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private synchronized java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> m52614a(java.lang.String r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.CampaignDao.m52614a(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: a */
    private CampaignEx m52636a(Cursor cursor) {
        if (cursor == null || cursor.getCount() <= 0) {
            return null;
        }
        CampaignEx campaignEx = new CampaignEx();
        try {
            String string = cursor.getString(cursor.getColumnIndex("pv_urls"));
            if (!TextUtils.isEmpty(string)) {
                JSONArray jSONArray = new JSONArray(string);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                campaignEx.setPv_urls(arrayList);
            }
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("CampaignDao", e.getLocalizedMessage());
            }
        }
        campaignEx.setId(cursor.getString(cursor.getColumnIndex("id")));
        campaignEx.setTab(cursor.getInt(cursor.getColumnIndex("tab")));
        campaignEx.setPackageName(cursor.getString(cursor.getColumnIndex("package_name")));
        campaignEx.setAppName(cursor.getString(cursor.getColumnIndex("app_name")));
        campaignEx.setAppDesc(cursor.getString(cursor.getColumnIndex("app_desc")));
        campaignEx.setSize(cursor.getString(cursor.getColumnIndex("app_size")));
        campaignEx.setImageSize(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_SIZE)));
        campaignEx.setIconUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_ICON_URL)));
        campaignEx.setImageUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMAGE_URL)));
        campaignEx.setImpressionURL(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMPRESSION_URL)));
        campaignEx.setNoticeUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_NOTICE_URL)));
        campaignEx.setClickURL(cursor.getString(cursor.getColumnIndex(DownloadModel.DOWNLOAD_URL)));
        campaignEx.setWtick(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WITHOUT_INSTALL_CHECK)));
        campaignEx.setDeepLinkUrl(cursor.getString(cursor.getColumnIndex("deeplink_url")));
        campaignEx.setUserActivation(Boolean.parseBoolean(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_USER_ACTIVATION))));
        campaignEx.setOnlyImpressionURL(cursor.getString(cursor.getColumnIndex("only_impression")));
        campaignEx.setNetAddress(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_C_I)));
        campaignEx.setAc(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)));
        campaignEx.setAc_s(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_ACTIVITY_CHECK_SWITCH)));
        campaignEx.setTemplate(cursor.getInt(cursor.getColumnIndex("template")));
        campaignEx.setLandingType(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_LANDING_TYPE)));
        campaignEx.setLinkType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_LINK_TYPE)));
        campaignEx.setClick_mode(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_CLICK_MODE)));
        campaignEx.setRating(Double.parseDouble(cursor.getString(cursor.getColumnIndex("star"))));
        campaignEx.setNumberRating(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NUMBER_RATING)));
        campaignEx.setClickInterval(cursor.getInt(cursor.getColumnIndex("cti")));
        campaignEx.setTimestamp(cursor.getLong(cursor.getColumnIndex("ts")));
        campaignEx.setCacheLevel(cursor.getInt(cursor.getColumnIndex("level")));
        campaignEx.setAdCall(cursor.getString(cursor.getColumnIndex("ad_call")));
        campaignEx.setFcb(cursor.getInt(cursor.getColumnIndex("fc_b")));
        campaignEx.setAd_url_list(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_URL_LIST)));
        campaignEx.setVideoLength(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_LENGTHL)));
        campaignEx.setVideoSize(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_SIZE)));
        campaignEx.setVideoResolution(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_RESOLUTION)));
        campaignEx.setEndcard_click_result(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_ENDCARD_CLICK)));
        campaignEx.setVideoUrlEncode(cursor.getString(cursor.getColumnIndex("video_url")));
        campaignEx.setWatchMile(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_WATCH_MILE)));
        campaignEx.setTImp(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_T_IMP)));
        campaignEx.setBty(cursor.getInt(cursor.getColumnIndex("bty")));
        campaignEx.setAdvImp(cursor.getString(cursor.getColumnIndex("advImp")));
        campaignEx.setLocalRequestId(cursor.getString(cursor.getColumnIndex("local_request_id")));
        campaignEx.setNRid(cursor.getString(cursor.getColumnIndex("n_request_id")));
        campaignEx.setNLRid(cursor.getString(cursor.getColumnIndex("n_local_request_id")));
        campaignEx.setTyped(cursor.getInt(cursor.getColumnIndex("err_type_default_ad")));
        campaignEx.setReasond(cursor.getString(cursor.getColumnIndex("err_reason_default_ad")));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setOfferType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_OFFER_TYPE)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_HTML_URL)));
        campaignEx.setGuidelines(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GUIDELINES)));
        campaignEx.setHtmlUrl(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_HTML_URL)));
        campaignEx.setEndScreenUrl(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_END_SCREEN_URL)));
        campaignEx.setRewardName(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_NAME)));
        campaignEx.setRewardAmount(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_AMOUNT)));
        campaignEx.setRewardPlayStatus(cursor.getInt(cursor.getColumnIndex("reward_play_status")));
        campaignEx.setRetarget_offer(cursor.getInt(cursor.getColumnIndex("retarget")));
        campaignEx.setCampaignUnitId(cursor.getString(cursor.getColumnIndex("unitid")));
        campaignEx.setNativeVideoTracking(CampaignEx.TrackingStr2Object(cursor.getString(cursor.getColumnIndex("native_ad_tracking"))));
        campaignEx.setNativeVideoTrackingString(cursor.getString(cursor.getColumnIndex("native_ad_tracking")));
        campaignEx.setVideo_end_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.VIDEO_END_TYPE)));
        campaignEx.setendcard_url(cursor.getString(cursor.getColumnIndex(CampaignEx.ENDCARD_URL)));
        campaignEx.setPlayable_ads_without_video(cursor.getInt(cursor.getColumnIndex(CampaignEx.PLAYABLE_ADS_WITHOUT_VIDEO)));
        campaignEx.setMof_template_url(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_MOF_TEMPLATE_URL)));
        campaignEx.setMof_tplid(cursor.getInt(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_MOF_TPLID)));
        campaignEx.setRewardTemplateMode(CampaignEx.C21961c.m52529a(cursor.getString(cursor.getColumnIndex("reward_teamplate"))));
        campaignEx.setVideoMD5Value(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_REWARD_VIDEO_MD5)));
        campaignEx.setGifUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_GIF_URL)));
        campaignEx.setNvT2(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NV_T2)));
        campaignEx.setClickTimeOutInterval(cursor.getInt(cursor.getColumnIndex("c_coi")));
        campaignEx.setcUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_UA)));
        campaignEx.setImpUA(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_UA)));
        campaignEx.setJmPd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_JM_PD)));
        campaignEx.setIsDeleted(cursor.getInt(cursor.getColumnIndex("is_deleted")));
        campaignEx.setIsClick(cursor.getInt(cursor.getColumnIndex("is_click")));
        campaignEx.setIsAddSuccesful(cursor.getInt(cursor.getColumnIndex("is_add_sucesful")));
        campaignEx.setIsDownLoadZip(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_IS_DOWNLOAD)));
        campaignEx.setInteractiveCache(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_CACHE)));
        campaignEx.setKeyIaOri(cursor.getInt(cursor.getColumnIndex("ia_ori")));
        campaignEx.setAdType(cursor.getInt(cursor.getColumnIndex("ad_type")));
        campaignEx.setFac(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FAC)));
        campaignEx.setTpOffer(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_TP_OFFER)));
        campaignEx.setIa_ext1(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT1)));
        campaignEx.setIa_ext2(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_IA_EXT2)));
        campaignEx.setKeyIaRst(cursor.getInt(cursor.getColumnIndex("ia_rst")));
        campaignEx.setKeyIaUrl(cursor.getString(cursor.getColumnIndex("ia_url")));
        campaignEx.setKeyIaIcon(cursor.getString(cursor.getColumnIndex("ia_icon")));
        campaignEx.setOc_time(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TIME)));
        campaignEx.setOc_type(cursor.getInt(cursor.getColumnIndex(CampaignEx.KEY_OC_TYPE)));
        campaignEx.setT_list(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_T_LIST)));
        campaignEx.setGhId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_ID)));
        campaignEx.setGhPath(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_GH_PATH)));
        campaignEx.setBindId(cursor.getString(cursor.getColumnIndex(DomainCampaignEx.KEY_BIND_ID)));
        String string2 = cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_ADCHOICE));
        if (!TextUtils.isEmpty(string2)) {
            campaignEx.setAdchoice(CampaignEx.C21959a.m52541a(string2));
        }
        campaignEx.setAdchoiceSizeHeight(cursor.getInt(cursor.getColumnIndex("adchoice_size_height")));
        campaignEx.setAdchoiceSizeWidth(cursor.getInt(cursor.getColumnIndex("adchoice_size_width")));
        campaignEx.setPlct(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCT)));
        campaignEx.setPlctb(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_PLCTB)));
        campaignEx.setCandidateCacheTime(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_C_C_TIME)));
        campaignEx.setAdZip(cursor.getString(cursor.getColumnIndex("ad_zip")));
        campaignEx.setAdHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AD_HTML)));
        campaignEx.setBannerUrl(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_URL)));
        campaignEx.setBannerHtml(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_BANNER_HTML)));
        campaignEx.setCreativeId(cursor.getLong(cursor.getColumnIndex("creative_id")));
        campaignEx.setVidCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CREATIVE_ID)));
        campaignEx.setEcCrtvId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_CREATIVE_ID)));
        campaignEx.setEcTemplateId(cursor.getLong(cursor.getColumnIndex(CampaignEx.JSON_KEY_EC_TEMP_ID)));
        campaignEx.setIsBidCampaign(cursor.getInt(cursor.getColumnIndex("is_bid_campaign")) == 1);
        campaignEx.setBidToken(cursor.getString(cursor.getColumnIndex("bid_token")));
        campaignEx.setMraid(cursor.getString(cursor.getColumnIndex("mraid")));
        campaignEx.setIsMraid(cursor.getInt(cursor.getColumnIndex("is_mraid_campaign")) == 1);
        campaignEx.setOmid(cursor.getString(cursor.getColumnIndex(CampaignEx.KEY_OMID)));
        campaignEx.setReady_rate(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_READY_RATE)));
        campaignEx.setExt_data(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_EXT_DATA)));
        campaignEx.setNscpt(cursor.getInt(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_NSCPT)));
        campaignEx.setReq_ext_data(cursor.getString(cursor.getColumnIndex(BaseCampaignUnit.JSON_KEY_REQ_EXT_DATA)));
        campaignEx.setReadyState(cursor.getInt(cursor.getColumnIndex("readyState")));
        campaignEx.setLoadTimeoutState(cursor.getInt(cursor.getColumnIndex("load_timeout")));
        campaignEx.setPlacementId(cursor.getString(cursor.getColumnIndex("placement_id")));
        campaignEx.setMaitve(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVE)));
        campaignEx.setMaitve_src(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_MAITVESRC)));
        campaignEx.setFlb(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB)));
        campaignEx.setFlbSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_FLB_SKIP_TIME)));
        campaignEx.setCbd(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_CBD)));
        campaignEx.setVst(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST)));
        campaignEx.setUseSkipTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_USE_SKIP_TIME)));
        campaignEx.setProgressBarShow(cursor.getColumnIndex(CampaignEx.JSON_KEY_PROG_BAR));
        campaignEx.setAdSpaceT(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T)));
        campaignEx.setVcn(cursor.getInt(cursor.getColumnIndex("vcn")));
        campaignEx.setTokenRule(cursor.getInt(cursor.getColumnIndex("token_r")));
        campaignEx.setEncryptPrice(cursor.getString(cursor.getColumnIndex("encrypt_p")));
        campaignEx.setVideoCheckType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CHECK_TYPE)));
        campaignEx.setVideoCtnType(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_CTN_TYPE)));
        campaignEx.setRsIgnoreCheckRuleByString(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_RS_IGNORE_CHECK_RULE)));
        campaignEx.setVideoCompleteTime(cursor.getInt(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_COMPLETE_TIME)));
        campaignEx.setAabEntity(AabEntity.parser(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_AAB))));
        campaignEx.setPrivacyUrl(cursor.getString(cursor.getColumnIndex("privacy_url")));
        campaignEx.setPrivacyButtonTemplateVisibility(cursor.getInt(cursor.getColumnIndex("privacy_button_video")));
        campaignEx.setImpReportType(cursor.getColumnIndex(CampaignEx.JSON_KEY_IMP_REPORT_TYPE));
        campaignEx.setAutoShowStoreMiniCard(cursor.getInt(cursor.getColumnIndex("auto_minicard")));
        campaignEx.setShowStoreMiniCardDelayTime(cursor.getInt(cursor.getColumnIndex("mincard_trigger_time")));
        return campaignEx;
    }
}
