package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.text.TextUtils;
import com.ironsource.C20517nb;
import com.learnings.abcenter.bridge.AbUserTagData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.same.report.VideoDataReport;
import com.mbridge.msdk.foundation.tools.C22047ap;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.net.URLEncoder;
import net.pubnative.lite.sdk.analytics.Reporting;

/* renamed from: com.mbridge.msdk.foundation.db.o */
/* loaded from: classes6.dex */
public class VideoReportDataDao extends BaseDao<VideoReportData> {

    /* renamed from: a */
    private static final String f56253a = "com.mbridge.msdk.foundation.db.o";

    /* renamed from: b */
    private static VideoReportDataDao f56254b;

    private VideoReportDataDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static VideoReportDataDao m52545a(CommonAbsDBHelper commonAbsDBHelper) {
        if (f56254b == null) {
            synchronized (VideoReportDataDao.class) {
                if (f56254b == null) {
                    f56254b = new VideoReportDataDao(commonAbsDBHelper);
                }
            }
        }
        return f56254b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0019, code lost:
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x001b, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r1 == null) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int m52546a() {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "select count(*) from reward_report"
            android.database.sqlite.SQLiteDatabase r3 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            android.database.Cursor r1 = r3.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r1 == 0) goto L19
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
            if (r2 == 0) goto L19
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L1f java.lang.Exception -> L21
        L19:
            if (r1 == 0) goto L28
        L1b:
            r1.close()     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L30
            goto L28
        L1f:
            r0 = move-exception
            goto L2a
        L21:
            r2 = move-exception
            r2.printStackTrace()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L28
            goto L1b
        L28:
            monitor-exit(r4)
            return r0
        L2a:
            if (r1 == 0) goto L2f
            r1.close()     // Catch: java.lang.Exception -> L2f java.lang.Throwable -> L30
        L2f:
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.VideoReportDataDao.m52546a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:240:0x0344 A[Catch: Exception -> 0x0350, all -> 0x0353, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x0350, blocks: (B:240:0x0344, B:232:0x032d), top: B:257:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x034c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.VideoReportData> m52543a(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.VideoReportDataDao.m52543a(java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final synchronized long m52544a(VideoReportData videoReportData) {
        if (videoReportData != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("key", videoReportData.m52362a());
                contentValues.put("networkType", Integer.valueOf(videoReportData.m52335k()));
                contentValues.put("network_str", videoReportData.m52333l());
                contentValues.put("isCompleteView", Integer.valueOf(videoReportData.m52308z()));
                contentValues.put("watchedMillis", Integer.valueOf(videoReportData.m52368A()));
                contentValues.put("videoLength", Integer.valueOf(videoReportData.m52325p()));
                if (!TextUtils.isEmpty(videoReportData.m52321r())) {
                    contentValues.put("offerUrl", videoReportData.m52321r());
                }
                if (!TextUtils.isEmpty(videoReportData.m52341h())) {
                    contentValues.put("reason", URLEncoder.encode(videoReportData.m52341h(), C20517nb.f52167N));
                }
                contentValues.put("result", Integer.valueOf(videoReportData.m52331m()));
                contentValues.put("duration", videoReportData.m52329n());
                contentValues.put("videoSize", Long.valueOf(videoReportData.m52327o()));
                contentValues.put("type", videoReportData.m52317t());
                String m52319s = videoReportData.m52319s();
                if (!TextUtils.isEmpty(m52319s)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, m52319s);
                }
                String m52323q = videoReportData.m52323q();
                if (!TextUtils.isEmpty(m52323q)) {
                    contentValues.put("video_url", m52323q);
                }
                String m52345f = videoReportData.m52345f();
                if (!TextUtils.isEmpty(m52345f)) {
                    contentValues.put("rid", m52345f);
                }
                String m52343g = videoReportData.m52343g();
                if (!TextUtils.isEmpty(m52343g)) {
                    contentValues.put("rid_n", m52343g);
                }
                String m52365D = videoReportData.m52365D();
                if (!TextUtils.isEmpty(m52365D)) {
                    contentValues.put("template_url", m52365D);
                }
                String m52309y = videoReportData.m52309y();
                if (!TextUtils.isEmpty(m52309y)) {
                    contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, m52309y);
                }
                String m52351d = videoReportData.m52351d();
                if (!TextUtils.isEmpty(m52351d)) {
                    contentValues.put("ad_type", URLEncoder.encode(m52351d, C20517nb.f52167N));
                }
                contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, videoReportData.m52354c());
                contentValues.put(AbUserTagData.AREA_CAMPAIGN_ID, videoReportData.m52348e());
                if ("2000039".equals(videoReportData.m52362a())) {
                    String m51938a = VideoDataReport.m51938a(videoReportData);
                    if (C22047ap.m51692b(m51938a)) {
                        contentValues.put("h5_click_data", m51938a);
                    }
                }
                String m52358b = videoReportData.m52358b();
                if (!TextUtils.isEmpty(m52358b)) {
                    contentValues.put("resource_type", URLEncoder.encode(m52358b, C20517nb.f52167N));
                }
                String m52337j = videoReportData.m52337j();
                if (!TextUtils.isEmpty(m52337j)) {
                    contentValues.put("device_id", URLEncoder.encode(m52337j, C20517nb.f52167N));
                }
                String m52339i = videoReportData.m52339i();
                if (!TextUtils.isEmpty(m52339i)) {
                    contentValues.put(Reporting.Key.CREATIVE, URLEncoder.encode(m52339i, C20517nb.f52167N));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(videoReportData.m52315u()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e) {
                SameLogTool.m51824b(f56253a, e.getMessage());
            }
        }
        return -1L;
    }
}
