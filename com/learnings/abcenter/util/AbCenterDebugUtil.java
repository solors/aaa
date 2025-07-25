package com.learnings.abcenter.util;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class AbCenterDebugUtil {
    public static Map<String, String> sDebugMap = new HashMap();

    public static void addDebugData(String str, String str2) {
        sDebugMap.put(str, str2);
    }

    public static String getAppVersion() {
        return sDebugMap.get("app_version");
    }

    public static String getCampaignId() {
        return sDebugMap.get("campaign_id");
    }

    public static String getCountry() {
        return sDebugMap.get("country");
    }

    public static String getDebugValue(String str) {
        return sDebugMap.get(str);
    }

    public static String getDeviceCategory() {
        return sDebugMap.get("device_category");
    }

    public static double getDeviceRam() {
        try {
            return Double.parseDouble(sDebugMap.get("device_ram"));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    public static String getDeviceResolution() {
        return sDebugMap.get("device_resolution_type");
    }

    public static String getFirstAppVersion() {
        return sDebugMap.get("first_app_version");
    }

    public static long getFirstInstallTime() {
        try {
            return Long.parseLong(sDebugMap.get("first_install_time"));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static String getHasAdIdentify() {
        return sDebugMap.get("has_ad_identify");
    }

    public static int getLivingDays() {
        try {
            return Integer.parseInt(sDebugMap.get("living_days"));
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String getMediaSource() {
        return sDebugMap.get("media_source");
    }

    public static String getOsVersion() {
        return sDebugMap.get(CommonUrlParts.OS_VERSION);
    }
}
