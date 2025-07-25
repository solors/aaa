package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.c2ccocci */
/* loaded from: classes8.dex */
public class C32446c2ccocci {
    private static final String c2oc2i = "Mozilla/5.0 (Linux; Android ";
    private static final String c2oc2o = " Mobile Safari/537.36";
    private static String cco22 = null;
    private static String cii2c2 = null;
    private static final String cioccoiococ = "; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/";
    private static final String coi222o222 = "61.0.3163.128";
    private static final String coo2iico = "4.0.4";

    private C32446c2ccocci() {
    }

    public static String coi222o222(Context context) {
        if (!TextUtils.isEmpty(cii2c2)) {
            return cii2c2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c2oc2i);
        String str = Build.VERSION.RELEASE;
        if (str.length() > 0) {
            if (Character.isDigit(str.charAt(0))) {
                stringBuffer.append(str);
            } else {
                stringBuffer.append(coo2iico);
            }
        } else {
            stringBuffer.append("1.0");
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
        stringBuffer.append(cioccoiococ);
        stringBuffer.append(coo2iico(context));
        stringBuffer.append(c2oc2o);
        String stringBuffer2 = stringBuffer.toString();
        cii2c2 = stringBuffer2;
        return stringBuffer2;
    }

    private static String coo2iico(Context context) {
        if (TextUtils.isEmpty(cco22)) {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            cco22 = coi222o222;
            try {
                cco22 = packageManager.getPackageInfo("com.google.android.webview", 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return cco22;
    }
}
