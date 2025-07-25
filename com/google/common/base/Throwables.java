package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Throwables {
    @GwtIncompatible

    /* renamed from: a */
    private static final Object f39482a;
    @GwtIncompatible

    /* renamed from: b */
    private static final Method f39483b;
    @GwtIncompatible

    /* renamed from: c */
    private static final Method f39484c;

    static {
        Method m69996e;
        Object m69995f = m69995f();
        f39482a = m69995f;
        Method method = null;
        if (m69995f == null) {
            m69996e = null;
        } else {
            m69996e = m69996e();
        }
        f39483b = m69996e;
        if (m69995f != null) {
            method = m69993h(m69995f);
        }
        f39484c = method;
    }

    private Throwables() {
    }

    @GwtIncompatible
    /* renamed from: e */
    private static Method m69996e() {
        return m69994g("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @GwtIncompatible
    /* renamed from: f */
    private static Object m69995f() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @GwtIncompatible
    /* renamed from: g */
    private static Method m69994g(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<Throwable> getCausalChain(Throwable th) {
        Preconditions.checkNotNull(th);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th != null) {
                arrayList.add(th);
                if (th != th2) {
                    if (z) {
                        th2 = th2.getCause();
                    }
                    z = !z;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", th);
                }
            } else {
                return Collections.unmodifiableList(arrayList);
            }
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th, Class<X> cls) {
        try {
            return cls.cast(th.getCause());
        } catch (ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    public static Throwable getRootCause(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause != null) {
                if (cause != th2) {
                    if (z) {
                        th2 = th2.getCause();
                    }
                    z = !z;
                    th = cause;
                } else {
                    throw new IllegalArgumentException("Loop in causal chain detected.", cause);
                }
            } else {
                return th;
            }
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @GwtIncompatible
    /* renamed from: h */
    private static Method m69993h(Object obj) {
        try {
            Method m69994g = m69994g("getStackTraceDepth", Throwable.class);
            if (m69994g == null) {
                return null;
            }
            m69994g.invoke(obj, new Throwable());
            return m69994g;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    /* renamed from: i */
    public static Object m69992i(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    @GwtIncompatible
    /* renamed from: j */
    private static List<StackTraceElement> m69991j(final Throwable th) {
        Preconditions.checkNotNull(th);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.f39484c;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.f39482a;
                java.util.Objects.requireNonNull(obj);
                return ((Integer) Throwables.m69992i(method, obj, th)).intValue();
            }

            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int i) {
                Method method = Throwables.f39483b;
                java.util.Objects.requireNonNull(method);
                Object obj = Throwables.f39482a;
                java.util.Objects.requireNonNull(obj);
                return (StackTraceElement) Throwables.m69992i(method, obj, th, Integer.valueOf(i));
            }
        };
    }

    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th) {
        if (lazyStackTraceIsLazy()) {
            return m69991j(th);
        }
        return Collections.unmodifiableList(Arrays.asList(th.getStackTrace()));
    }

    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        if (f39483b != null && f39484c != null) {
            return true;
        }
        return false;
    }

    @CanIgnoreReturnValue
    @GwtIncompatible
    @Deprecated
    public static RuntimeException propagate(Throwable th) {
        throwIfUnchecked(th);
        throw new RuntimeException(th);
    }

    @GwtIncompatible
    @Deprecated
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
        if (th != null) {
            throwIfInstanceOf(th, cls);
        }
    }

    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(Throwable th) {
        if (th != null) {
            throwIfUnchecked(th);
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th);
        if (!cls.isInstance(th)) {
            return;
        }
        throw cls.cast(th);
    }

    public static void throwIfUnchecked(Throwable th) {
        Preconditions.checkNotNull(th);
        if (!(th instanceof RuntimeException)) {
            if (!(th instanceof Error)) {
                return;
            }
            throw ((Error) th);
        }
        throw ((RuntimeException) th);
    }

    @GwtIncompatible
    public static <X extends Throwable> void propagateIfPossible(Throwable th, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th);
    }

    @GwtIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th, Class<X1> cls, Class<X2> cls2) throws Throwable, Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th, cls);
        propagateIfPossible(th, cls2);
    }
}
