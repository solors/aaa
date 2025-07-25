package sa;

import androidx.annotation.NonNull;
import p701hb.Severity;

/* renamed from: sa.g */
/* loaded from: classes8.dex */
public class Log {

    /* renamed from: a */
    private static volatile boolean f104135a = false;

    /* renamed from: b */
    private static volatile Severity f104136b = Severity.VERBOSE;

    /* renamed from: a */
    public static void m11982a(@NonNull String str, @NonNull String str2) {
        if (m11979d(Severity.DEBUG)) {
            android.util.Log.d(str, str2);
        }
    }

    /* renamed from: b */
    public static void m11981b(@NonNull String str, @NonNull String str2) {
        if (m11979d(Severity.ERROR)) {
            android.util.Log.e(str, str2);
        }
    }

    /* renamed from: c */
    public static void m11980c(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (m11979d(Severity.ERROR)) {
            android.util.Log.e(str, str2, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m11979d(Severity severity) {
        if (!m11978e()) {
            return false;
        }
        return f104136b.m23624c(severity);
    }

    /* renamed from: e */
    public static boolean m11978e() {
        return f104135a;
    }

    /* renamed from: f */
    public static void m11977f(@NonNull String str, @NonNull String str2) {
        if (m11979d(Severity.WARNING)) {
            android.util.Log.w(str, str2);
        }
    }
}
