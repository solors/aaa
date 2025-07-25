package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.AdInfoBean;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32793jujujpjjp;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32794puujujuupp;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.puujujuupp.jujujpjjp */
/* loaded from: classes8.dex */
public class C32790jujujpjjp {
    private static final String jjjjpjp = "show_cta";
    private static final String jjppjjupu = "com.xiaomi.market.service.AppDownloadService";
    private static final String jjuj = "senderPackageName";
    private static final int jjuuju = 1;
    public static final String jpjjjjp = "com.miui.hybrid";
    private static final String jujujpjjp = "AdJumpModule";
    public static final String jupppjuju = "com.xiaomi.mipicks";
    private static final String juupjpuppj = "packageName";
    private static final String juupuj = "ref";
    private static final String pppjujup = "com.android.providers.downloads";
    private static final int puujujuupp = 2;
    private static final String puuuuj = "appSignature";
    private static final String ujjuupp = "com.xiaomi.market.service.AppDownloadInstallService";
    private static final String ujpupujju = "nonce";
    private static final int uppj = 0;
    private static final int uppjpjj = 0;
    private static final int upupjjppj = 1914111;
    private static final String uujpuuupj = "appClientId";

    private C32790jujujpjjp() {
    }

    public static String jujujpjjp(Context context, String str, C32794puujujuupp c32794puujujuupp, AdInfoBean adInfoBean) {
        int jupppjuju2;
        int i = 0;
        if (c32794puujujuupp != null && 2 != (jupppjuju2 = c32794puujujuupp.jupppjuju())) {
            i = jupppjuju2;
        }
        if (i != 0) {
            if (i != 1) {
                MLog.m25879e(jujujpjjp, "No support the mi market mode!");
                return "No support the mi market mode!";
            }
            return uppjpjj(context, str, c32794puujujuupp);
        }
        return jujujpjjp(context, str, c32794puujujuupp);
    }

    private static String uppjpjj(Context context, String str, C32794puujujuupp c32794puujujuupp) {
        if (!uppjpjj(context, str)) {
            MLog.m25879e(jujujpjjp, "Mi market no support minicard!");
            return "Mi market no support minicard!";
        }
        return jujujpjjp(context, str, c32794puujujuupp);
    }

    private static boolean uppjpjj(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        MLog.m25881d(jujujpjjp, "useInternational");
        intent.setData(Uri.parse(str));
        intent.setPackage("com.xiaomi.mipicks");
        return context.getPackageManager().queryIntentActivities(intent, 0).size() > 0;
    }

    private static String jujujpjjp(Context context, String str, C32794puujujuupp c32794puujujuupp) {
        if (TextUtils.isEmpty(c32794puujujuupp.uppjpjj())) {
            return jujujpjjp(context, str, "com.xiaomi.mipicks");
        }
        return jujujpjjp(context, str, c32794puujujuupp.uppjpjj());
    }

    private static String jujujpjjp(Context context, String str, String str2) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            if (!TextUtils.isEmpty(str2)) {
                intent.setPackage(str2);
            }
            if (!C32793jujujpjjp.jujujpjjp(context, intent)) {
                intent.setPackage(null);
            }
            intent.setData(parse);
            context.startActivity(intent);
            return null;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "openMarket exception", e);
            return e.getMessage();
        }
    }

    private static String uppjpjj(String str) {
        String str2;
        String trim = str.trim();
        String[] split = trim.split("[?]");
        if (trim.length() <= 1 || split.length <= 1 || (str2 = split[1]) == null) {
            return null;
        }
        return str2;
    }

    private static Map<String, String> jujujpjjp(String str) {
        MLog.m25881d(jujujpjjp, "parseUrl->url=" + str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        String uppjpjj2 = uppjpjj(str);
        if (uppjpjj2 == null) {
            return hashMap;
        }
        for (String str2 : uppjpjj2.split("[&]")) {
            String[] split = str2.split("[=]");
            if (split.length > 1) {
                hashMap.put(split[0], split[1]);
            } else {
                String str3 = split[0];
                if (str3 != "") {
                    hashMap.put(str3, "");
                }
            }
        }
        return hashMap;
    }

    public static int jujujpjjp(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "getPackageVersionName", e);
            return 0;
        }
    }
}
