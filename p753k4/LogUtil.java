package p753k4;

import android.util.Log;

/* renamed from: k4.c */
/* loaded from: classes6.dex */
public class LogUtil {

    /* renamed from: a */
    private static volatile boolean f98669a;

    /* renamed from: a */
    public static boolean m18217a() {
        return f98669a;
    }

    /* renamed from: b */
    public static void m18216b(String str, String str2) {
        if (f98669a) {
            Log.i(str, str2);
        }
    }

    /* renamed from: c */
    public static void m18215c(boolean z) {
        f98669a = z;
    }
}
