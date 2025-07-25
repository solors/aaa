package com.pgl.ssdk;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.pgl.ssdk.ces.C26614a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.pgl.ssdk.z */
/* loaded from: classes7.dex */
public class C26682z {

    /* renamed from: a */
    private static int f69994a = -1;

    /* renamed from: b */
    private static int f69995b = -1;

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    public static Application m40696a() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m40693b() {
        String str;
        try {
            str = Environment.getDataDirectory().getPath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: c */
    public static String m40691c() {
        String str;
        try {
            str = Environment.getExternalStorageDirectory().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: d */
    public static String m40689d(Context context) {
        String str;
        try {
            str = context.getFilesDir().getAbsolutePath();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str.trim();
    }

    /* renamed from: e */
    public static String m40688e(Context context) {
        String str;
        try {
            str = context.getPackageName();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str.trim();
    }

    /* renamed from: f */
    public static String m40687f(Context context) {
        String str;
        try {
            str = context.getPackageResourcePath();
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str.trim();
    }

    /* renamed from: g */
    public static int m40686g(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: h */
    public static boolean m40685h(Context context) {
        ResolveInfo resolveInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (queryIntentActivities == null || queryIntentActivities.isEmpty() || (resolveInfo = queryIntentActivities.get(0)) == null) {
                return false;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
            if (componentEnabledSetting == 0 || componentEnabledSetting == 1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: i */
    private static void m40684i(Context context) {
        String m40740a = C26667u0.m40740a(context, "hac_date", (String) null);
        if (!TextUtils.isEmpty(m40740a)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            if (m40740a.equals(simpleDateFormat.format(new Date()))) {
                int m40741a = C26667u0.m40741a(context, "hac", -1);
                int m40741a2 = C26667u0.m40741a(context, "tac", -1);
                if (m40741a != -1 && m40741a2 != -1) {
                    f69994a = m40741a;
                    f69995b = m40741a2;
                    return;
                }
            }
        }
        f69994a = 0;
        f69995b = 0;
    }

    /* renamed from: j */
    private static void m40683j(Context context) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        C26667u0.m40738b(context, "hac_date", simpleDateFormat.format(new Date()));
        C26667u0.m40739b(context, "hac", f69994a);
        C26667u0.m40739b(context, "tac", f69995b);
    }

    /* renamed from: a */
    private static boolean m40695a(Context context) {
        List<ActivityManager.AppTask> appTasks;
        Intent intent;
        if (context != null && (appTasks = ((ActivityManager) context.getSystemService("activity")).getAppTasks()) != null && !appTasks.isEmpty()) {
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo() != null) {
                    intent = appTask.getTaskInfo().baseIntent;
                    if (m40694a(intent)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m40692b(Context context) {
        try {
            if (f69994a == -1 || f69995b == -1) {
                m40684i(context);
            }
            if (m40695a(context)) {
                f69994a++;
            }
            f69995b++;
            if (f69994a != 0) {
                m40683j(context);
                C26614a.meta(160, null, new int[]{f69994a, f69995b});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static String m40690c(Context context) {
        String str;
        try {
            str = context.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    /* renamed from: a */
    private static boolean m40694a(Intent intent) {
        return (intent == null || (intent.getFlags() & 8388608) == 0) ? false : true;
    }
}
