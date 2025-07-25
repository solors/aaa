package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.v3 */
/* loaded from: classes6.dex */
public class C21109v3 {
    /* renamed from: a */
    public static int m54527a(Activity activity) {
        return activity.getRequestedOrientation();
    }

    /* renamed from: b */
    public static String m54523b(Context context) {
        try {
            return m54526a(context).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* renamed from: c */
    public static String m54521c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            return cacheDir.getPath();
        }
        return null;
    }

    /* renamed from: d */
    public static long m54519d(Context context) {
        try {
            return m54526a(context).firstInstallTime;
        } catch (PackageManager.NameNotFoundException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* renamed from: e */
    public static String m54517e(Context context) {
        String str;
        try {
            str = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: f */
    public static long m54516f(Context context) {
        try {
            return m54526a(context).lastUpdateTime;
        } catch (PackageManager.NameNotFoundException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1L;
        }
    }

    /* renamed from: g */
    public static String m54515g(Context context) {
        return context.getPackageName();
    }

    /* renamed from: a */
    static PackageInfo m54526a(Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(m54515g(context), 0);
    }

    /* renamed from: b */
    public static String m54522b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            return "";
        }
    }

    /* renamed from: c */
    public static boolean m54520c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: d */
    public static boolean m54518d(Context context, String str) {
        boolean z = false;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            if (packageInfo.requestedPermissions != null) {
                boolean z2 = false;
                while (true) {
                    try {
                        String[] strArr = packageInfo.requestedPermissions;
                        if (i >= strArr.length || z2) {
                            break;
                        }
                        z2 = str.equals(strArr[i]);
                        i++;
                    } catch (Exception e) {
                        e = e;
                        z = z2;
                        C20086i9.m57997d().m58003a(e);
                        IronLog.INTERNAL.error(e.toString());
                        return z;
                    }
                }
                return z2;
            }
            return false;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    public static String m54525a(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && !TextUtils.isEmpty(str)) {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
        return null;
    }

    /* renamed from: a */
    public static JSONObject m54524a(Context context, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            int i = 0;
            if (jSONArray.length() == 0) {
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    jSONObject.put(strArr[i], (packageInfo.requestedPermissionsFlags[i] & 2) != 0 ? "Granted" : "Rejected");
                    i++;
                }
            } else {
                List asList = Arrays.asList(packageInfo.requestedPermissions);
                while (i < jSONArray.length()) {
                    String string = jSONArray.getString(i);
                    int indexOf = asList.indexOf(string);
                    if (indexOf != -1) {
                        jSONObject.put(string, (packageInfo.requestedPermissionsFlags[indexOf] & 2) != 0 ? "Granted" : "Rejected");
                    } else {
                        jSONObject.put(string, "notFoundInManifest");
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m54528a() {
        return true;
    }
}
