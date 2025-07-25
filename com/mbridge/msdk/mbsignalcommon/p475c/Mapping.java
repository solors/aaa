package com.mbridge.msdk.mbsignalcommon.p475c;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.mbsignalcommon.c.a */
/* loaded from: classes6.dex */
public final class Mapping {

    /* renamed from: a */
    private static InterfaceC22203a f57640a;

    /* compiled from: Mapping.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22203a {
        /* renamed from: a */
        boolean m51160a(AbstractC22204b.C22205a c22205a);
    }

    /* compiled from: Mapping.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC22204b {

        /* compiled from: Mapping.java */
        /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$b$a */
        /* loaded from: classes6.dex */
        public static class C22205a extends Throwable {

            /* renamed from: a */
            private Class<?> f57641a;

            /* renamed from: b */
            private String f57642b;

            public C22205a(String str) {
                super(str);
            }

            /* renamed from: a */
            public final void m51159a(Class<?> cls) {
                this.f57641a = cls;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                if (getCause() != null) {
                    return C22205a.class.getName() + ": " + getCause();
                }
                return super.toString();
            }

            public C22205a(Exception exc) {
                super(exc);
            }

            /* renamed from: a */
            public final void m51158a(String str) {
                this.f57642b = str;
            }
        }
    }

    /* compiled from: Mapping.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$c */
    /* loaded from: classes6.dex */
    public static class C22206c<C> {

        /* renamed from: a */
        protected Class<C> f57643a;

        public C22206c(Class<C> cls) {
            this.f57643a = cls;
        }

        /* renamed from: a */
        public final C22207d m51157a(String str, Class<?>... clsArr) throws AbstractC22204b.C22205a {
            return new C22207d(this.f57643a, str, clsArr, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m51161b(AbstractC22204b.C22205a c22205a) throws AbstractC22204b.C22205a {
        InterfaceC22203a interfaceC22203a = f57640a;
        if (interfaceC22203a != null && interfaceC22203a.m51160a(c22205a)) {
            return;
        }
        throw c22205a;
    }

    /* renamed from: a */
    public static <T> C22206c<T> m51162a(ClassLoader classLoader, String str) throws AbstractC22204b.C22205a {
        try {
            return new C22206c<>(classLoader.loadClass(str));
        } catch (Exception e) {
            m51161b(new AbstractC22204b.C22205a(e));
            return new C22206c<>(null);
        }
    }

    /* compiled from: Mapping.java */
    /* renamed from: com.mbridge.msdk.mbsignalcommon.c.a$d */
    /* loaded from: classes6.dex */
    public static class C22207d {

        /* renamed from: a */
        protected final Method f57644a;

        C22207d(Class<?> cls, String str, Class<?>[] clsArr, int i) throws AbstractC22204b.C22205a {
            Method method = null;
            if (cls == null) {
                return;
            }
            while (true) {
                if (cls == Object.class || cls == null) {
                    break;
                }
                try {
                    method = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e.printStackTrace();
                    }
                } catch (SecurityException e2) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e2.printStackTrace();
                            }
                        } catch (Exception e3) {
                            AbstractC22204b.C22205a c22205a = new AbstractC22204b.C22205a(e3);
                            c22205a.m51159a(cls);
                            c22205a.m51158a(str);
                            Mapping.m51161b(c22205a);
                        }
                    } finally {
                        this.f57644a = method;
                    }
                }
                cls = cls.getSuperclass();
            }
            if (method != null) {
                if (i > 0 && (method.getModifiers() & i) != i) {
                    Mapping.m51161b(new AbstractC22204b.C22205a(method + " does not match modifiers: " + i));
                }
                method.setAccessible(true);
            }
        }

        /* renamed from: a */
        public final Object m51155a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f57644a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                SameLogTool.m51827a("MappingedMethod", "invoke error:" + e.getMessage());
                return null;
            }
        }

        /* renamed from: a */
        public final Method m51156a() {
            return this.f57644a;
        }
    }
}
