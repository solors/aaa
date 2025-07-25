package com.zeus.gmc.sdk.mobileads.columbus.internal.cccccioi;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.analytic.AnalyticsInfo;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.common.SdkConfig;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32445c22o22co22i;
import com.zeus.gmc.sdk.mobileads.columbus.util.TrackUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cccccioi.coo2iico */
/* loaded from: classes8.dex */
public class C32512coo2iico {
    private static C32445c22o22co22i c2oc2i = null;
    public static int c2oc2o = 0;
    public static int cco22 = 1;
    public static int cii2c2 = 0;
    public static int ciii2coi2 = 0;
    public static final String cioccoiococ = "onDeviceScore";
    private static final String coi222o222 = "columbus_on_device_intelligence";
    private static final String coo2iico = "OdiUtils";

    public static boolean coi222o222() {
        return !TextUtils.isEmpty(coo2iico());
    }

    public static void coo2iico(Context context) {
        try {
            c2oc2i = new C32445c22o22co22i(coi222o222);
            C32511coi222o222 c32511coi222o222 = new C32511coi222o222(context, c2oc2i);
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = C32511coi222o222.c2oc2o;
            contentResolver.registerContentObserver(uri, true, c32511coi222o222);
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        String string = query.getString(query.getColumnIndex(cioccoiococ));
                        if (!TextUtils.isEmpty(string) || c2oc2i != null) {
                            c2oc2i.coi222o222(cioccoiococ, string);
                        }
                        coo2iico(c2oc2o, "", cii2c2);
                    }
                    query.close();
                } catch (Exception e) {
                    coo2iico(cco22, e.getMessage(), cii2c2);
                    query.close();
                }
            }
        } catch (Exception e2) {
            coo2iico(1, e2.getMessage(), cii2c2);
        }
    }

    public static String coo2iico() {
        C32445c22o22co22i c32445c22o22co22i = c2oc2i;
        return c32445c22o22co22i == null ? "" : c32445c22o22co22i.coo2iico(cioccoiococ, "");
    }

    public static void coo2iico(int i, String str, int i2) {
        AnalyticsInfo analyticsInfo = new AnalyticsInfo();
        analyticsInfo.adEvent = "COLUMBUS_GET_SCORE";
        analyticsInfo.error_code = i;
        analyticsInfo.error_info = str;
        analyticsInfo.getWhen = i2;
        analyticsInfo.configKey = SdkConfig.USE_STAGING ? "systemadsolution_globalnativestaging" : "systemadsolution_globalnative";
        TrackUtils.trackAction(GlobalHolder.getApplicationContext(), analyticsInfo);
    }
}
