package p1002ue;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: ue.a */
/* loaded from: classes8.dex */
public final class BootstrapClass {

    /* renamed from: a */
    private static Object f116737a;

    /* renamed from: b */
    private static Method f116738b;

    static {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Method declaredMethod = Class.class.getDeclaredMethod("forName", String.class);
                Method declaredMethod2 = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                Class cls = (Class) declaredMethod.invoke(null, "dalvik.system.VMRuntime");
                f116738b = (Method) declaredMethod2.invoke(cls, "setHiddenApiExemptions", new Class[]{String[].class});
                f116737a = ((Method) declaredMethod2.invoke(cls, "getRuntime", null)).invoke(null, new Object[0]);
            } catch (Throwable th) {
                Log.w("BootstrapClass", "reflect bootstrap failed:", th);
            }
        }
    }

    /* renamed from: a */
    public static boolean m2858a(String... strArr) {
        Method method;
        Object obj = f116737a;
        if (obj != null && (method = f116738b) != null) {
            try {
                method.invoke(obj, strArr);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m2857b() {
        return m2858a("L");
    }
}
