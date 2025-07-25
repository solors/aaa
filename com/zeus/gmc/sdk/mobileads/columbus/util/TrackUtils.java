package com.zeus.gmc.sdk.mobileads.columbus.util;

import android.content.Context;
import android.text.TextUtils;
import com.maticoo.sdk.utils.constant.CommonConstants;
import com.zeus.gmc.sdk.mobileads.columbus.analytic.AnalyticsInfo;
import com.zeus.gmc.sdk.mobileads.columbus.analytics.AnalyticsUtilHelper;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.C32646coi222o222;
import com.zeus.gmc.sdk.mobileads.msa.analytics.C32805atnntnannta;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class TrackUtils {
    private static final String coo2iico = "TrackUtils";

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.util.TrackUtils$coo2iico */
    /* loaded from: classes8.dex */
    public class RunnableC32756coo2iico implements Runnable {
        final /* synthetic */ AnalyticsInfo coi222o222;
        final /* synthetic */ Context coo2iico;

        RunnableC32756coo2iico(Context context, AnalyticsInfo analyticsInfo) {
            this.coo2iico = context;
            this.coi222o222 = analyticsInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            TrackUtils.coi222o222(this.coo2iico, this.coi222o222);
        }
    }

    private TrackUtils() {
    }

    public static boolean coi222o222(Context context, AnalyticsInfo analyticsInfo) {
        try {
            String str = analyticsInfo.adEvent;
            if (!TextUtils.isEmpty(str) && C32646coi222o222.coi222o222(str)) {
                HashMap<String, Object> hashMap = new HashMap<>();
                coo2iico(hashMap, "configKey", analyticsInfo.configKey);
                coo2iico(hashMap, "e", analyticsInfo.adEvent);
                coo2iico(hashMap, "t", Long.valueOf(System.currentTimeMillis()));
                coo2iico(hashMap, "tagId", analyticsInfo.mTagId);
                coo2iico(hashMap, "ile", analyticsInfo.installPackage);
                coo2iico(hashMap, "ex", analyticsInfo.f89358ex);
                coo2iico(hashMap, "track_duration", analyticsInfo.track_duration);
                coo2iico(hashMap, "aarea", analyticsInfo.clickArea);
                coo2iico(hashMap, CommonConstants.KEY_REQUEST_TIME, Long.valueOf(analyticsInfo.request_time));
                coo2iico(hashMap, "error_code", Integer.valueOf(analyticsInfo.error_code));
                coo2iico(hashMap, "fill_time", Long.valueOf(analyticsInfo.fill_time));
                coo2iico(hashMap, "fill_state", Integer.valueOf(analyticsInfo.fill_state));
                coo2iico(hashMap, "fill_cost", Long.valueOf(analyticsInfo.fill_cost));
                coo2iico(hashMap, "reason", analyticsInfo.reason);
                coo2iico(hashMap, "click_time", analyticsInfo.click_time);
                coo2iico(hashMap, "close_time", analyticsInfo.close_time);
                coo2iico(hashMap, "ext_param", analyticsInfo.getExtraValue());
                coo2iico(hashMap, "parallelism", Integer.valueOf(analyticsInfo.parallelism));
                coo2iico(hashMap, C32805atnntnannta.atnattat, C32646coi222o222.coo2iico("TRIGGER_FAIED"));
                AnalyticsUtilHelper.getInstance(context).trackAction(hashMap, analyticsInfo.monitors);
                return true;
            }
            MLog.m25887i(coo2iico, "This event 【" + str + "】 ban report！");
            return false;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "trackAction()", e);
            return false;
        }
    }

    public static boolean trackAction(Context context, AnalyticsInfo analyticsInfo) {
        if (AndroidUtils.isMainThread()) {
            C32465cioc2.c2oc2i.execute(new RunnableC32756coo2iico(context, analyticsInfo));
            return true;
        }
        return coi222o222(context, analyticsInfo);
    }

    private static void coo2iico(HashMap<String, Object> hashMap, String str, Object obj) {
        if (hashMap == null || TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        if ((obj instanceof Integer) && ((Integer) obj).intValue() == -1) {
            return;
        }
        if ((obj instanceof Long) && ((Long) obj).longValue() == -1) {
            return;
        }
        if ((obj instanceof String) && TextUtils.isEmpty((String) obj)) {
            return;
        }
        hashMap.put(str, obj);
    }
}
