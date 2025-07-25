package com.p551my.target;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* renamed from: com.my.target.c5 */
/* loaded from: classes7.dex */
public abstract class AbstractC25679c5 {

    /* renamed from: a */
    public static final Integer f66695a = 1;

    /* renamed from: b */
    public static boolean f66696b;

    /* renamed from: a */
    public static boolean m44092a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            AbstractC25846ja.m43678b("LoggingUtils: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            AbstractC25846ja.m43678b("LoggingUtils: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            AbstractC25846ja.m43678b("LoggingUtils: case 2 failure");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m44091b(Context context) {
        if (String.valueOf(f66695a).equals(AbstractC25803ha.m43782a(String.format("%s_mytarget_debug", context.getPackageName())))) {
            AbstractC25846ja.m43680a("LoggingUtils: debug data in SystemProperties has been found");
            return true;
        }
        AbstractC25846ja.m43680a("LoggingUtils: no debug data in SystemProperties");
        return false;
    }

    /* renamed from: c */
    public static void m44090c(Context context) {
        if (!AbstractC25846ja.f67064a && !f66696b) {
            f66696b = true;
            try {
                if (m44092a(context)) {
                    AbstractC25846ja.f67064a = true;
                    AbstractC25846ja.m43680a("LoggingUtils: debug mode is enabled by device name");
                    return;
                }
                if (f66695a.equals((Integer) AbstractC25803ha.m43783a(context, "com.my.target.debugMode", Integer.class))) {
                    AbstractC25846ja.f67064a = true;
                    AbstractC25846ja.m43680a("LoggingUtils: debug mode is enabled by manifest metadata");
                } else if (m44091b(context)) {
                    AbstractC25846ja.f67064a = true;
                    AbstractC25846ja.m43680a("LoggingUtils: debug mode is enabled by system properties");
                }
            } catch (Throwable unused) {
            }
        }
    }
}
