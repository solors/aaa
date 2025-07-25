package com.amazon.device.ads;

import com.google.firebase.sessions.settings.RemoteSettings;

/* loaded from: classes2.dex */
public class WebResourceOptions {
    private static String cdnHost = null;
    private static String[] jsNames = {"aps-mraid.js", "dtb-m.js", "omsdk-v1.js"};
    private static boolean useLocalOnly = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getCDNHost(String str) {
        String str2 = cdnHost;
        if (str2 == null) {
            str2 = DtbConstants.DTB_WEB_RESOURCES;
        }
        if ("omsdk-v1.js".equals(str)) {
            str2 = "video-player.aps.amazon-adsystem.com/static/omsdk/" + DtbConstants.INTEGRATED_OM_VERSION;
        }
        if (!str2.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str2 + RemoteSettings.FORWARD_SLASH_STRING;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] getCDNResources() {
        return jsNames;
    }

    public static boolean isLocalSourcesOnly() {
        return useLocalOnly;
    }

    static void setCDNHost(String str) {
        if (!str.equals(cdnHost)) {
            cdnHost = str;
            DtbSharedPreferences.getInstance().resetWebResoucesLastPing();
            WebResourceService.getInstance().deleteWebDirContent();
        }
    }

    static void setCDNResources(String[] strArr) {
        jsNames = strArr;
    }

    static void setLocalSourcesOnly(boolean z) {
        useLocalOnly = z;
    }
}
