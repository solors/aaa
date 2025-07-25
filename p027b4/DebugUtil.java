package p027b4;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: b4.b */
/* loaded from: classes6.dex */
public class DebugUtil {

    /* renamed from: a */
    public static int f1586a = 0;

    /* renamed from: b */
    public static int f1587b = 1800000;

    /* renamed from: c */
    public static int f1588c = 300000;

    /* renamed from: a */
    public static int m103942a() {
        int i = f1586a;
        if (i != 0) {
            return i;
        }
        return f1588c;
    }

    /* renamed from: b */
    public static int m103941b() {
        int i = f1586a;
        if (i != 0) {
            return i;
        }
        return f1587b;
    }

    /* renamed from: c */
    public static void m103940c(Context context) {
        if (TextUtils.equals(SharedUtil.m103935b(context, "key_analyze_debug_time", ""), "1")) {
            f1586a = 60000;
        }
    }
}
