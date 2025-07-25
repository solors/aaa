package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.db.b */
/* loaded from: classes6.dex */
public class BidReplaceCampignDao extends BaseDao {

    /* renamed from: a */
    private static volatile BidReplaceCampignDao f56214a;

    private BidReplaceCampignDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static BidReplaceCampignDao m52658a(Context context) {
        if (f56214a == null) {
            synchronized (BidReplaceCampignDao.class) {
                if (f56214a == null) {
                    f56214a = new BidReplaceCampignDao(CommonSDKDBHelper.m52593a(context));
                }
            }
        }
        return f56214a;
    }

    /* renamed from: b */
    public final int m52653b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_replace", (Integer) 1);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    public final void m52654a(String str, List<CampaignEx> list) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        try {
            String requestId = list.get(0).getRequestId();
            String encryptPrice = list.get(0).getEncryptPrice();
            String campaignUnitId = list.get(0).getCampaignUnitId();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("bid_unit_id", campaignUnitId);
            contentValues.put("expect_bid_token", str);
            contentValues.put("expect_encrypt_price", "");
            contentValues.put("real_request_id", requestId);
            contentValues.put("real_encrypt_price", encryptPrice);
            contentValues.put("real_token_rule", (Integer) 1);
            contentValues.put("is_replace", (Integer) 0);
            writableDatabase.insert("bid_replace_campaign", null, contentValues);
            SameLogTool.m51824b("HBOPTIMIZE", "插入数据到对应关系表 期望 bidToken 值" + str + "+ 用于替换期望Offer 的RequestId " + requestId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c0, code lost:
        if (r2 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
        if (0 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d7, code lost:
        return r0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.mbridge.msdk.foundation.entity.BidTokenRuleBean> m52656a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 == 0) goto L13
            return r0
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "SELECT * FROM bid_replace_campaign WHERE "
            r1.append(r2)
            java.lang.String r2 = "bid_unit_id"
            r1.append(r2)
            java.lang.String r2 = " = ? AND "
            r1.append(r2)
            java.lang.String r2 = "real_request_id"
            r1.append(r2)
            java.lang.String r2 = " = ?"
            r1.append(r2)
            r2 = 0
            java.lang.Object r3 = new java.lang.Object     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r3.<init>()     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            monitor-enter(r3)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            android.database.sqlite.SQLiteDatabase r4 = r8.getReadableDatabase()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc3
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> Lc3
            r6 = 0
            r5[r6] = r9     // Catch: java.lang.Throwable -> Lc3
            r9 = 1
            r5[r9] = r10     // Catch: java.lang.Throwable -> Lc3
            android.database.Cursor r2 = r4.rawQuery(r1, r5)     // Catch: java.lang.Throwable -> Lc3
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc3
            if (r2 == 0) goto Lc0
            int r9 = r2.getCount()     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            if (r9 <= 0) goto Lc0
        L56:
            boolean r9 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            if (r9 == 0) goto Lc0
            com.mbridge.msdk.foundation.entity.d r9 = new com.mbridge.msdk.foundation.entity.d     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.<init>()     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r10 = "bid_unit_id"
            int r10 = r2.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r10 = r2.getString(r10)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r1 = "expect_bid_token"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r3 = "expect_encrypt_price"
            int r3 = r2.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r4 = "real_request_id"
            int r4 = r2.getColumnIndex(r4)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r5 = "real_encrypt_price"
            int r5 = r2.getColumnIndex(r5)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r5 = r2.getString(r5)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r6 = "real_token_rule"
            int r6 = r2.getColumnIndex(r6)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            int r6 = r2.getInt(r6)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            java.lang.String r7 = "is_replace"
            int r7 = r2.getColumnIndex(r7)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            int r7 = r2.getInt(r7)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52501a(r10)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52498b(r1)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52496c(r3)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52493e(r4)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52494d(r5)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52499b(r6)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r9.m52502a(r7)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            r0.add(r9)     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
            goto L56
        Lc0:
            if (r2 == 0) goto Ld7
            goto Ld4
        Lc3:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc3
            throw r9     // Catch: java.lang.Throwable -> Lc6 java.lang.Exception -> Lc8
        Lc6:
            r9 = move-exception
            goto Ld8
        Lc8:
            r9 = move-exception
            java.lang.String r10 = "BidReplaceCampaignDao"
            java.lang.String r9 = r9.getLocalizedMessage()     // Catch: java.lang.Throwable -> Lc6
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r10, r9)     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto Ld7
        Ld4:
            r2.close()
        Ld7:
            return r0
        Ld8:
            if (r2 == 0) goto Ldd
            r2.close()
        Ldd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.BidReplaceCampignDao.m52656a(java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final int m52659a() {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "is_replace = 0", null);
        } catch (Exception e) {
            SameLogTool.m51824b("BidReplaceCampaignDao", e.getLocalizedMessage());
            return 0;
        }
    }

    /* renamed from: a */
    public final int m52657a(String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return 0;
            }
            return writableDatabase.delete("bid_replace_campaign", "real_request_id = ? AND is_replace = 1", new String[]{str});
        } catch (Exception e) {
            SameLogTool.m51824b("BidReplaceCampaignDao", e.getLocalizedMessage());
            return 0;
        }
    }

    /* renamed from: a */
    public final int m52655a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || getWritableDatabase() == null) {
            return 0;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("expect_encrypt_price", str3);
            return getWritableDatabase().update("bid_replace_campaign", contentValues, "bid_unit_id = ? AND expect_bid_token = ?", new String[]{str2, str});
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
