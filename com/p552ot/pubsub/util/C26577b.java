package com.p552ot.pubsub.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.ot.pubsub.util.b */
/* loaded from: classes7.dex */
public class C26577b {

    /* renamed from: a */
    private static Context f69715a = null;

    /* renamed from: b */
    private static Context f69716b = null;

    /* renamed from: c */
    private static int f69717c = 0;

    /* renamed from: d */
    private static String f69718d = null;

    /* renamed from: e */
    private static String f69719e = null;

    /* renamed from: f */
    private static long f69720f = 0;

    /* renamed from: g */
    private static volatile boolean f69721g = false;

    /* renamed from: a */
    public static void m41120a(Context context) {
        if (f69721g) {
            return;
        }
        synchronized (C26577b.class) {
            if (f69721g) {
                return;
            }
            f69715a = context;
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f69715a.getPackageName(), 0);
                f69717c = packageInfo.versionCode;
                f69718d = packageInfo.versionName;
                f69720f = packageInfo.lastUpdateTime;
                f69719e = f69715a.getPackageName();
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            f69721g = true;
        }
    }

    /* renamed from: b */
    public static boolean m41115b(Context context, String str) {
        PackageInfo m41118a = m41118a(context, str, 0);
        return (m41118a == null || m41118a.applicationInfo == null) ? false : true;
    }

    /* renamed from: c */
    public static String m41113c(Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationInfo(str, 0).loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: d */
    public static int m41112d() {
        return f69717c;
    }

    /* renamed from: e */
    public static String m41111e() {
        return f69719e;
    }

    /* renamed from: f */
    public static long m41110f() {
        return f69720f;
    }

    /* renamed from: b */
    public static Context m41116b() {
        return f69715a;
    }

    /* renamed from: c */
    public static String m41114c() {
        return f69718d;
    }

    /* renamed from: a */
    public static boolean m41117a(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    /* renamed from: a */
    public static boolean m41119a(Context context, String str) {
        try {
            return m41117a(m41118a(context, str, 0).applicationInfo);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static PackageInfo m41118a(Context context, String str, int i) {
        try {
            return context.getPackageManager().getPackageInfo(str, i);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static Context m41121a() {
        if (C26581f.m41103b(f69715a)) {
            Context context = f69716b;
            if (context != null) {
                return context;
            }
            synchronized (C26577b.class) {
                if (f69716b == null) {
                    f69716b = C26581f.m41104a(f69715a);
                }
            }
            return f69716b;
        }
        return f69715a;
    }
}
