package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

/* loaded from: classes8.dex */
public class ConstantsUtil {
    public static final String AD_SWITCH_URL = "content://com.miui.systemAdSolution.adSwitch/adSwitch/";
    public static final String GMC = "mimarket://details?";
    public static final String GMCNICARD = "mimarket://details/detailmimi?";
    public static final String GMC_INTERSTITIAL_FINISH_LOAD = "";
    public static final String GMC_MARKET_VERSION = "mimarketVersion";
    public static final String GMC_VERSION = "miuiVersion";
    public static final String HOST = "mi";
    public static final String HTTP = "http";
    public static final String HTTPS = "https";
    public static final String PCK_GMC = "com.xiaomi.mipicks";
    public static final String PCK_HYBR = "com.miui.hybrid";
    public static final String PCK_NEW_BROWSER = "com.mi.globalbrowser";
    public static final String SYS_COTA_CARRIER = "persist.sys.cota.carrier";
    public static final String SYS_CUSTOMIZAD_REGION = "ro.miui.customized.region";
    public static final String SYS_GMC_BUILD = "miui.os.Build";
    public static final String SYS_GMC_INIT = "miui.os.MiuiInit";
    public static final String SYS_GMC_SETTING_AD = "android.provider.MiuiSettings$Ad";
    public static final String SYS_REGION = "ro.miui.region";
    public static final String URL_PICKS = "com.xiaomi.mipicks";

    private ConstantsUtil() {
    }

    public static String getSafeString(String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
