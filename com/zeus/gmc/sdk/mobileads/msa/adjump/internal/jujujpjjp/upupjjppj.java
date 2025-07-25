package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp.C32791uppjpjj;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32793jujujpjjp;
import java.util.Locale;

/* loaded from: classes8.dex */
public final class upupjjppj {
    private static final String jujujpjjp = "Utils";
    private static final int uppjpjj = 1000;

    private upupjjppj() {
    }

    public static int jjuuju(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 1).uid;
        } catch (Exception e) {
            Log.e(jujujpjjp, "getUid : ", e);
            return -1;
        }
    }

    public static boolean jujujpjjp(Context context) {
        return jjuuju(context) == 1000;
    }

    public static Context uppjpjj(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    public static String jujujpjjp() {
        String jujujpjjp2 = com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.jupppjuju.jujujpjjp("ro.miui.region", "");
        try {
            if (TextUtils.isEmpty(jujujpjjp2)) {
                Object invoke = Class.forName("android.os.LocaleList").getMethod("getDefault", new Class[0]).invoke(null, new Object[0]);
                Object invoke2 = invoke.getClass().getMethod("size", new Class[0]).invoke(invoke, new Object[0]);
                if ((invoke2 instanceof Integer) && ((Integer) invoke2).intValue() > 0) {
                    Object invoke3 = invoke.getClass().getMethod(KiwiConstants.f2714as, Integer.TYPE).invoke(invoke, 0);
                    Object invoke4 = invoke3.getClass().getMethod("getCountry", new Class[0]).invoke(invoke3, new Object[0]);
                    if (invoke4 instanceof String) {
                        jujujpjjp2 = (String) invoke4;
                    }
                }
                return TextUtils.isEmpty(jujujpjjp2) ? Locale.getDefault().getCountry() : jujujpjjp2;
            }
            return jujujpjjp2;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "getRegion e : ", e);
            return jujujpjjp2;
        }
    }

    public static boolean uppjpjj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(ApsAdWebViewSupportClient.MARKET_SCHEME) || str.startsWith("https://play.google.com") || str.startsWith("http://play.google.com");
    }

    public static boolean uppjpjj(Context context, String str) {
        return uppjpjj(str) && C32793jujujpjjp.jujujpjjp(context, "com.android.vending") > 0;
    }

    public static boolean jujujpjjp(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C32791uppjpjj.ujjuupp);
    }

    public static boolean jujujpjjp(Context context, String str) {
        return jujujpjjp(str) && C32793jujujpjjp.jujujpjjp(context, "com.xiaomi.mipicks") > 0;
    }
}
