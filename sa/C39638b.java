package sa;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: Assert.java */
/* renamed from: sa.b */
/* loaded from: classes8.dex */
public class C39638b {
    @NonNull

    /* renamed from: a */
    private static AssertionErrorHandler f104121a = new AssertionErrorHandler() { // from class: sa.a
        @Override // sa.AssertionErrorHandler
        /* renamed from: a */
        public final void mo11992a(AssertionError assertionError) {
            C39638b.m12011a(assertionError);
        }
    };

    /* renamed from: b */
    private static volatile boolean f104122b = false;

    /* renamed from: a */
    public static /* synthetic */ void m12011a(AssertionError assertionError) {
        m11994r(assertionError);
    }

    /* renamed from: b */
    public static void m12010b(int i, int i2) {
        m12009c(null, i, i2);
    }

    /* renamed from: c */
    public static void m12009c(@Nullable String str, long j, long j2) {
        m12008d(str, Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: d */
    public static void m12008d(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj != null && obj.equals(obj2)) {
            return;
        }
        if ((obj instanceof String) && (obj2 instanceof String)) {
            if (str == null) {
                str = "";
            }
            m11993s(new ComparisonFailure(str, (String) obj, (String) obj2));
            return;
        }
        m11999m(str, obj, obj2);
    }

    /* renamed from: e */
    public static void m12007e() {
        m12004h("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
    }

    /* renamed from: f */
    public static void m12006f(@Nullable Object obj) {
        m12005g(null, obj);
    }

    /* renamed from: g */
    public static void m12005g(@Nullable String str, @Nullable Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        m12003i(str, z);
    }

    /* renamed from: h */
    public static void m12004h(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return;
        }
        m11998n(str, obj, obj2);
    }

    /* renamed from: i */
    public static void m12003i(@Nullable String str, boolean z) {
        if (!z) {
            m12001k(str);
        }
    }

    /* renamed from: j */
    public static void m12002j(boolean z) {
        m12003i(null, z);
    }

    /* renamed from: k */
    public static void m12001k(@Nullable String str) {
        if (f104122b) {
            if (str == null) {
                str = "";
            }
            m11993s(new AssertionError(str));
        }
    }

    /* renamed from: l */
    public static void m12000l(@Nullable String str, @Nullable Throwable th) {
        if (f104122b) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th);
            m11993s(assertionError);
        }
    }

    /* renamed from: m */
    private static void m11999m(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        m12001k(m11997o(str, obj, obj2));
    }

    /* renamed from: n */
    private static void m11998n(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        m12001k(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    /* renamed from: o */
    public static String m11997o(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str + " ";
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        if (valueOf.equals(valueOf2)) {
            return str2 + "expected: " + m11996p(obj, valueOf) + " but was: " + m11996p(obj2, valueOf2);
        }
        return str2 + "expected:<" + valueOf + "> but was:<" + valueOf2 + ">";
    }

    /* renamed from: p */
    private static String m11996p(@Nullable Object obj, @Nullable String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        return name + "<" + str + ">";
    }

    /* renamed from: q */
    public static boolean m11995q() {
        return f104122b;
    }

    /* renamed from: s */
    private static void m11993s(@NonNull AssertionError assertionError) {
        if (!m11995q()) {
            return;
        }
        f104121a.mo11992a(assertionError);
    }

    /* renamed from: r */
    public static /* synthetic */ void m11994r(AssertionError assertionError) {
        throw assertionError;
    }
}
