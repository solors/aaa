package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.VideoReportData;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.VideoReportDataDao;
import com.mbridge.msdk.foundation.same.report.VideoDataReport;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.List;

/* renamed from: com.mbridge.msdk.mbnative.controller.e */
/* loaded from: classes6.dex */
public class NativeVideoTrackingReport {

    /* renamed from: a */
    private static final String f57593a = "com.mbridge.msdk.mbnative.controller.e";

    /* renamed from: a */
    public static void m51213a(Context context, String str) {
        if (context != null) {
            try {
                VideoReportDataDao m52545a = VideoReportDataDao.m52545a(CommonSDKDBHelper.m52593a(context));
                if (!TextUtils.isEmpty(str) && m52545a != null && m52545a.m52546a() > 0) {
                    List<VideoReportData> m52543a = m52545a.m52543a("m_download_end");
                    List<VideoReportData> m52543a2 = m52545a.m52543a("2000021");
                    List<VideoReportData> m52543a3 = m52545a.m52543a("m_download_end");
                    VideoDataReport.m51932e(m52543a2);
                    VideoDataReport.m51937a(m52543a);
                    VideoDataReport.m51935b(m52543a3);
                }
            } catch (Exception e) {
                SameLogTool.m51824b(f57593a, e.getMessage());
            }
        }
    }
}
