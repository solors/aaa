package p738j5;

import android.util.Log;

/* renamed from: j5.e */
/* loaded from: classes6.dex */
public class LogUtils {

    /* renamed from: a */
    private static volatile boolean f98454a;

    /* renamed from: a */
    public static boolean m18538a() {
        return f98454a;
    }

    /* renamed from: b */
    public static void m18537b(String str, String str2) {
        if (f98454a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m18536c(boolean z) {
        f98454a = z;
    }
}
