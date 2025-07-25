package kotlin.jvm.internal;

import java.util.Arrays;
import p804nd.UninitializedPropertyAccessException;

/* loaded from: classes7.dex */
public class Intrinsics {

    /* renamed from: kotlin.jvm.internal.Intrinsics$a */
    /* loaded from: classes7.dex */
    public static class C37597a {
        private C37597a() {
        }
    }

    private Intrinsics() {
    }

    /* renamed from: a */
    public static boolean m17080a(float f, Float f2) {
        if (f2 != null && f == f2.floatValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m17079b(Double d, double d2) {
        if (d != null && d.doubleValue() == d2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m17078c(Double d, Double d2) {
        if (d == null) {
            if (d2 == null) {
                return true;
            }
        } else if (d2 != null && d.doubleValue() == d2.doubleValue()) {
            return true;
        }
        return false;
    }

    public static void checkNotNullExpressionValue(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m17066o(new NullPointerException(str + " must not be null")));
    }

    public static void checkNotNullParameter(Object obj, String str) {
        if (obj == null) {
            m17060u(str);
        }
    }

    /* renamed from: d */
    public static boolean m17077d(Float f, float f2) {
        if (f != null && f.floatValue() == f2) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m17076e(Float f, Float f2) {
        if (f == null) {
            if (f2 == null) {
                return true;
            }
        } else if (f2 != null && f.floatValue() == f2.floatValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m17075f(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: g */
    public static void m17074g(Object obj) {
        if (obj == null) {
            m17063r();
        }
    }

    /* renamed from: h */
    public static void m17073h(Object obj, String str) {
        if (obj == null) {
            m17062s(str);
        }
    }

    /* renamed from: i */
    public static void m17072i(Object obj, String str) {
        if (obj == null) {
            m17061t(str);
        }
    }

    /* renamed from: j */
    public static int m17071j(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: k */
    public static int m17070k(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: l */
    private static String m17069l(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = Intrinsics.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        return "Parameter specified as non-null is null: method " + className + "." + methodName + ", parameter " + str;
    }

    /* renamed from: m */
    public static void m17068m() {
        m17059v();
    }

    /* renamed from: n */
    public static void m17067n(int i, String str) {
        m17059v();
    }

    /* renamed from: o */
    private static <T extends Throwable> T m17066o(T t) {
        return (T) m17065p(t, Intrinsics.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public static <T extends Throwable> T m17065p(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: q */
    public static String m17064q(String str, Object obj) {
        return str + obj;
    }

    /* renamed from: r */
    public static void m17063r() {
        throw ((NullPointerException) m17066o(new NullPointerException()));
    }

    /* renamed from: s */
    public static void m17062s(String str) {
        throw ((NullPointerException) m17066o(new NullPointerException(str)));
    }

    /* renamed from: t */
    private static void m17061t(String str) {
        throw ((IllegalArgumentException) m17066o(new IllegalArgumentException(m17069l(str))));
    }

    /* renamed from: u */
    private static void m17060u(String str) {
        throw ((NullPointerException) m17066o(new NullPointerException(m17069l(str))));
    }

    /* renamed from: v */
    public static void m17059v() {
        m17058w("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: w */
    public static void m17058w(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: x */
    public static void m17057x(String str) {
        throw ((UninitializedPropertyAccessException) m17066o(new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: y */
    public static void m17056y(String str) {
        m17057x("lateinit property " + str + " has not been initialized");
    }
}
