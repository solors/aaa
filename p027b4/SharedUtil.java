package p027b4;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: b4.d */
/* loaded from: classes6.dex */
public class SharedUtil {

    /* renamed from: a */
    private static SharedPreferences f1589a;

    /* renamed from: a */
    public static int m103936a(Context context, String str, int i) {
        if (f1589a == null) {
            m103934c(context);
        }
        return f1589a.getInt(str, i);
    }

    /* renamed from: b */
    public static String m103935b(Context context, String str, String str2) {
        if (f1589a == null) {
            m103934c(context);
        }
        return f1589a.getString(str, str2);
    }

    /* renamed from: c */
    private static void m103934c(Context context) {
        f1589a = context.getSharedPreferences("meevii_analyze", 0);
    }

    /* renamed from: d */
    public static void m103933d(Context context, String str, int i) {
        if (f1589a == null) {
            m103934c(context);
        }
        f1589a.edit().putInt(str, i).apply();
    }

    /* renamed from: e */
    public static void m103932e(Context context, String str, String str2) {
        if (f1589a == null) {
            m103934c(context);
        }
        f1589a.edit().putString(str, str2).apply();
    }
}
