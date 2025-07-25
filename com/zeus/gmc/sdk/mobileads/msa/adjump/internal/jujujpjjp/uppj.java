package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jujujpjjp;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Locale;

/* loaded from: classes8.dex */
public class uppj {
    private static final String jjuuju = "61.0.3163.128";
    private static final String jujujpjjp = "UserAgentUtils";
    private static final String jupppjuju = " Mobile Safari/537.36";
    private static final String puujujuupp = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/";
    private static final String uppjpjj = "4.0.4";

    private uppj() {
    }

    private static String jujujpjjp(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return jjuuju;
        }
    }

    public static String uppjpjj(Context context) {
        Locale locale = Locale.getDefault();
        StringBuffer stringBuffer = new StringBuffer();
        String str = Build.VERSION.RELEASE;
        if (str.length() > 0) {
            if (Character.isDigit(str.charAt(0))) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(uppjpjj);
            }
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; ");
        String language = locale.getLanguage();
        if (language != null) {
            stringBuffer.append(jujujpjjp(language));
            String country = locale.getCountry();
            if (country != null) {
                stringBuffer.append("-");
                stringBuffer.append(country.toLowerCase());
            }
        } else {
            stringBuffer.append("en");
        }
        stringBuffer.append(";");
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                stringBuffer.append(" ");
                stringBuffer.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            stringBuffer.append(" Build/");
            stringBuffer.append(str3);
        }
        return String.format(puujujuupp + jujujpjjp(context) + jupppjuju, stringBuffer);
    }

    private static String jujujpjjp(String str) {
        if (str == null) {
            return null;
        }
        return "iw".equals(str) ? "he" : "in".equals(str) ? "id" : "ji".equals(str) ? "yi" : str;
    }
}
