package com.mbridge.msdk.foundation.p434db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.VideoBean;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.Campaign;

/* renamed from: com.mbridge.msdk.foundation.db.n */
/* loaded from: classes6.dex */
public final class VideoDao extends BaseDao<Campaign> {

    /* renamed from: a */
    private static VideoDao f56252a;

    private VideoDao(CommonAbsDBHelper commonAbsDBHelper) {
        super(commonAbsDBHelper);
    }

    /* renamed from: a */
    public static synchronized VideoDao m52555a(CommonAbsDBHelper commonAbsDBHelper) {
        VideoDao videoDao;
        synchronized (VideoDao.class) {
            if (f56252a == null) {
                f56252a = new VideoDao(commonAbsDBHelper);
            }
            videoDao = f56252a;
        }
        return videoDao;
    }

    /* renamed from: b */
    public final synchronized void m52549b(String str) {
        String[] strArr;
        try {
            strArr = new String[]{str};
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("video", "video_url = ? ", strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /* renamed from: a */
    public final synchronized VideoBean m52553a(String str) {
        VideoBean videoBean;
        Exception e;
        Cursor cursor;
        ?? r1 = 0;
        r1 = null;
        VideoBean videoBean2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                cursor = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = ? ", new String[]{str});
                if (cursor != null) {
                    try {
                        if (cursor.getCount() > 0) {
                            videoBean = new VideoBean();
                            while (cursor.moveToNext()) {
                                try {
                                    videoBean.m52372b(cursor.getString(cursor.getColumnIndex("video_url")));
                                    videoBean.m52378a(cursor.getInt(cursor.getColumnIndex("video_state")));
                                    videoBean.m52373b(cursor.getLong(cursor.getColumnIndex("pregeress_size")));
                                    videoBean.m52374b(cursor.getInt(cursor.getColumnIndex("total_size")));
                                    videoBean.m52376a(cursor.getString(cursor.getColumnIndex("video_path")));
                                    videoBean.m52377a(cursor.getLong(cursor.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e2) {
                                    e = e2;
                                    if (MBridgeConstans.DEBUG) {
                                        SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
                                    }
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e3) {
                                            if (MBridgeConstans.DEBUG) {
                                                SameLogTool.m51824b("VideoDao", e3.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    videoBean2 = videoBean;
                                    return videoBean2;
                                }
                            }
                            videoBean2 = videoBean;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        videoBean = null;
                    }
                }
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Exception e5) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("VideoDao", e5.getLocalizedMessage());
                        }
                    }
                }
            } catch (Exception e6) {
                videoBean = null;
                e = e6;
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (r1 != 0) {
                    try {
                        r1.close();
                    } catch (Exception e7) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("VideoDao", e7.getLocalizedMessage());
                        }
                    }
                }
                throw th;
            }
            return videoBean2;
        } catch (Throwable th2) {
            th = th2;
            r1 = str;
        }
    }

    /* renamed from: b */
    private synchronized boolean m52547b(String str, String str2) {
        String str3;
        String[] strArr;
        if (TextUtils.isEmpty(str2)) {
            str3 = "SELECT id FROM video WHERE video_url = ? ";
            strArr = new String[]{str};
        } else {
            String[] strArr2 = {str, str2};
            str3 = "SELECT id FROM video WHERE video_url = ? AND id = ? ";
            strArr = strArr2;
        }
        Cursor rawQuery = getReadableDatabase().rawQuery(str3, strArr);
        if (rawQuery != null && rawQuery.getCount() > 0) {
            try {
                rawQuery.close();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
                }
            }
            return true;
        }
        if (rawQuery != null) {
            try {
                rawQuery.close();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    SameLogTool.m51824b("VideoDao", e2.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized long m52548b(String str, long j) {
        int i = -1;
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j));
        if (m52547b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        return r7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.foundation.entity.VideoBean m52550a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> Lb1
            r0 = 0
            if (r7 == 0) goto La
            monitor-exit(r5)
            return r0
        La:
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch: java.lang.Throwable -> Lb1
            r7.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = " WHERE video_url = ? "
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lb1
            r3 = 0
            r2[r3] = r6     // Catch: java.lang.Throwable -> Lb1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r6.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r3 = "SELECT * FROM video"
            r6.append(r3)     // Catch: java.lang.Throwable -> Lb1
            r6.append(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb1
            android.database.sqlite.SQLiteDatabase r1 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.Cursor r0 = r1.rawQuery(r6, r2)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r0 == 0) goto L90
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r6 <= 0) goto L90
        L38:
            boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r6 == 0) goto L90
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r7.m52372b(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r7.m52378a(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r7.m52373b(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r7.m52374b(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r7.m52376a(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.m52377a(r1)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            goto L38
        L90:
            if (r0 == 0) goto La9
        L92:
            r0.close()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb1
            goto La9
        L96:
            r6 = move-exception
            goto Lab
        L98:
            r6 = move-exception
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L96
            if (r1 == 0) goto La6
            java.lang.String r1 = "VideoDao"
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L96
            com.mbridge.msdk.foundation.tools.SameLogTool.m51824b(r1, r6)     // Catch: java.lang.Throwable -> L96
        La6:
            if (r0 == 0) goto La9
            goto L92
        La9:
            monitor-exit(r5)
            return r7
        Lab:
            if (r0 == 0) goto Lb0
            r0.close()     // Catch: java.lang.Exception -> Lb0 java.lang.Throwable -> Lb1
        Lb0:
            throw r6     // Catch: java.lang.Throwable -> Lb1
        Lb1:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.p434db.VideoDao.m52550a(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    /* renamed from: a */
    public final synchronized void m52552a(String str, long j) {
        if (j == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j / 1000));
            if (m52547b(str, "")) {
                getWritableDatabase().update("video", contentValues, "video_url = ? ", new String[]{str});
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
            }
        }
    }

    /* renamed from: a */
    public final synchronized long m52554a(CampaignEx campaignEx, long j, String str, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("unitid", campaignEx.getCampaignUnitId());
            contentValues.put("id", campaignEx.getId());
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
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
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
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put("video_url", campaignEx.getVideoUrlEncode());
            contentValues.put("total_size", Long.valueOf(j));
            contentValues.put("video_state", Integer.valueOf(i));
            contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("ad_bid_token", campaignEx.getBidToken());
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("video_path", str);
            }
            if (m52547b(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                return 0L;
            }
            return getWritableDatabase().insert("video", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    /* renamed from: a */
    public final synchronized long m52551a(String str, long j, int i) {
        int i2 = -1;
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j));
        contentValues.put("video_state", Integer.valueOf(i));
        if (m52547b(str, "")) {
            String[] strArr = {str};
            synchronized (new Object()) {
                i2 = getWritableDatabase().update("video", contentValues, "video_url = ? ", strArr);
            }
        }
        return i2;
    }
}
