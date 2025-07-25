package com.p551my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.tracker.obfuscated.g0 */
/* loaded from: classes7.dex */
public final class C26328g0 {

    /* renamed from: a */
    private static final Integer f68596a = 1;

    /* renamed from: b */
    private static final AtomicBoolean f68597b = new AtomicBoolean();

    /* renamed from: a */
    static boolean m42068a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            C26468z0.m41525b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            C26468z0.m41525b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            C26468z0.m41525b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    /* renamed from: b */
    static boolean m42067b(Context context) {
        if (String.valueOf(f68596a).equals(C26456x0.m41541a(String.format("%s_mytracker_debug", context.getPackageName())))) {
            C26468z0.m41528a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        C26468z0.m41528a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    /* renamed from: c */
    public static void m42066c(final Context context) {
        if (!f68597b.compareAndSet(false, true)) {
            C26468z0.m41528a("LoggingHandler: instance has already been initialized");
        } else if (C26468z0.m41529a()) {
            C26468z0.m41528a("LoggingHandler: tracing has already been enabled");
        } else {
            C26325g.m42073a(new Runnable() { // from class: com.my.tracker.obfuscated.v1
                @Override // java.lang.Runnable
                public final void run() {
                    C26328g0.m42064e(context);
                }
            });
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m42065d(Context context) {
        String str;
        if (m42068a(context)) {
            C26468z0.m41526a(true);
            str = "LoggingHandler: debug mode is enabled by device name";
        } else {
            if (f68596a.equals((Integer) C26456x0.m41542a(context, "com.my.tracker.debugMode", Integer.class))) {
                C26468z0.m41526a(true);
                str = "LoggingHandler: debug mode is enabled by manifest metadata";
            } else if (m42067b(context)) {
                C26468z0.m41526a(true);
                C26468z0.m41528a("LoggingHandler: debug mode is enabled by system properties");
                return;
            } else {
                return;
            }
        }
        C26468z0.m41528a(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m42064e(Context context) {
        m42065d(context);
    }
}
