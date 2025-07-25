package p027b4;

import android.os.Bundle;
import android.util.Log;
import java.util.HashMap;
import p1020w3.C44574a;
import p992u3.LogLevel;

/* renamed from: b4.a */
/* loaded from: classes6.dex */
public class AnalyzeLog {

    /* renamed from: a */
    public static boolean f1583a;

    /* renamed from: b */
    public static LogLevel f1584b = LogLevel.SILENCE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnalyzeLog.java */
    /* renamed from: b4.a$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C3349a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1585a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f1585a = iArr;
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1585a[LogLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1585a[LogLevel.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1585a[LogLevel.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: a */
    public static void m103949a(LogLevel logLevel, String str) {
        if (f1583a && logLevel.m3041b() <= f1584b.m3041b()) {
            int i = C3349a.f1585a[logLevel.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            Log.e("AnalyzeLog", str);
                            return;
                        }
                        return;
                    }
                    Log.w("AnalyzeLog", str);
                    return;
                }
                Log.i("AnalyzeLog", str);
                return;
            }
            Log.d("AnalyzeLog", str);
        }
    }

    /* renamed from: b */
    public static void m103948b(LogLevel logLevel, String str, String str2, Bundle bundle) {
        if (!f1583a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                if (bundle.containsKey(str3)) {
                    try {
                        Object obj = bundle.get(str3);
                        sb2.append(str3);
                        sb2.append(":");
                        sb2.append(obj);
                        sb2.append(", ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (sb2.length() > 0) {
                sb2.delete(sb2.length() - 2, sb2.length());
            }
        }
        m103949a(logLevel, str + " send event:" + str2 + ", Bundle : {" + ((Object) sb2) + "}");
    }

    /* renamed from: c */
    public static void m103947c(LogLevel logLevel, String str, String str2, HashMap<String, Object> hashMap) {
        if (!f1583a) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                Object obj = hashMap.get(str3);
                sb2.append(str3);
                sb2.append(":");
                sb2.append(obj);
                sb2.append(", ");
            }
            if (sb2.length() > 0) {
                sb2.delete(sb2.length() - 2, sb2.length());
            }
        }
        m103949a(logLevel, str + " send event:" + str2 + ", Bundle : {" + ((Object) sb2) + "}");
    }

    /* renamed from: d */
    public static void m103946d(LogLevel logLevel, String str, C44574a c44574a) {
        if (!f1583a) {
            return;
        }
        String m2371g = c44574a.m2371g();
        StringBuilder sb2 = new StringBuilder();
        Bundle m2372f = c44574a.m2372f();
        if (m2372f != null) {
            for (String str2 : m2372f.keySet()) {
                if (m2372f.containsKey(str2)) {
                    try {
                        Object obj = m2372f.get(str2);
                        sb2.append(str2);
                        sb2.append(":");
                        sb2.append(obj);
                        sb2.append(", ");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            if (sb2.length() > 0) {
                sb2.delete(sb2.length() - 2, sb2.length());
            }
        }
        m103949a(logLevel, str + " send event:" + m2371g + ", valueToSum :" + c44574a.m2370i() + ", Bundle : {" + sb2.toString() + "}");
    }

    /* renamed from: e */
    public static void m103945e(boolean z) {
        f1583a = z;
    }

    /* renamed from: f */
    public static void m103944f(LogLevel logLevel) {
        f1584b = logLevel;
    }

    /* renamed from: g */
    public static boolean m103943g() {
        if (f1584b.m3041b() != LogLevel.SILENCE.m3041b()) {
            return true;
        }
        return false;
    }
}
