package p636d7;

import android.util.Log;

/* renamed from: d7.g */
/* loaded from: classes5.dex */
public class PushLogUtil {

    /* renamed from: a */
    private static boolean f89542a = false;

    /* renamed from: b */
    public static String f89543b = "pushLog";

    /* renamed from: a */
    public static void m25698a(String str) {
        if (!m25694e()) {
            return;
        }
        Log.i(f89543b, str);
    }

    /* renamed from: b */
    public static void m25697b(String str) {
        Log.e(f89543b, str);
    }

    /* renamed from: c */
    public static void m25696c(Throwable th) {
        StackTraceElement[] stackTrace;
        if (th == null) {
            return;
        }
        FirebaseCrashUtils.m25708a(th);
        if (f89542a) {
            Log.e(f89543b, "error" + th.getMessage());
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                if (stackTraceElement != null) {
                    Log.e(f89543b, stackTraceElement.toString());
                }
            }
        }
    }

    /* renamed from: d */
    public static void m25695d(boolean z) {
        f89542a = z;
    }

    /* renamed from: e */
    public static boolean m25694e() {
        return f89542a;
    }
}
