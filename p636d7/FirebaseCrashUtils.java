package p636d7;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import java.lang.reflect.Method;

/* renamed from: d7.d */
/* loaded from: classes5.dex */
public class FirebaseCrashUtils {

    /* renamed from: a */
    private static Object f89537a;

    /* renamed from: b */
    private static Method f89538b;

    /* renamed from: a */
    public static void m25708a(Throwable th) {
        try {
            if (f89537a == null) {
                f89537a = FirebaseCrashlytics.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                f89538b = FirebaseCrashlytics.class.getMethod("recordException", Throwable.class);
            }
            f89538b.invoke(f89537a, th);
        } catch (Throwable unused) {
            PushLogUtil.m25697b("no FirebaseCrashlytics");
        }
    }
}
