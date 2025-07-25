package p993u4;

import android.util.Log;
import p992u3.LogLevel;

/* compiled from: LogUtil.java */
/* renamed from: u4.l */
/* loaded from: classes6.dex */
public class C44433l {

    /* renamed from: a */
    private static LogLevel f116608a = LogLevel.SILENCE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LogUtil.java */
    /* renamed from: u4.l$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C44434a {

        /* renamed from: a */
        static final /* synthetic */ int[] f116609a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f116609a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f116609a[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f116609a[LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f116609a[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m2997a(String str, String str2) {
        m2993e(LogLevel.DEBUG, str, str2);
    }

    /* renamed from: b */
    public static void m2996b(String str, String str2) {
        m2993e(LogLevel.ERROR, str, str2);
    }

    /* renamed from: c */
    public static void m2995c(String str, String str2) {
        m2993e(LogLevel.INFO, str, str2);
    }

    /* renamed from: d */
    public static boolean m2994d() {
        if (f116608a.m3041b() != LogLevel.SILENCE.m3041b()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static void m2993e(LogLevel logLevel, String str, String str2) {
        if (logLevel.m3041b() > f116608a.m3041b()) {
            return;
        }
        int i = C44434a.f116609a[logLevel.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        Log.i("AnalyzeLog_learnings-" + str, str2);
                        return;
                    }
                    Log.e("AnalyzeLog_learnings-" + str, str2);
                    return;
                }
                Log.w("AnalyzeLog_learnings-" + str, str2);
                return;
            }
            Log.i("AnalyzeLog_learnings-" + str, str2);
            return;
        }
        Log.d("AnalyzeLog_learnings-" + str, str2);
    }

    /* renamed from: f */
    public static void m2992f(Exception exc) {
        m2993e(LogLevel.ERROR, "AnalyzeLog_learnings-Exception", exc.toString());
    }

    /* renamed from: g */
    public static void m2991g(LogLevel logLevel) {
        f116608a = logLevel;
    }

    /* renamed from: h */
    public static void m2990h(String str, String str2) {
        m2993e(LogLevel.WARN, str, str2);
    }
}
