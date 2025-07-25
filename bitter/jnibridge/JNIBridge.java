package bitter.jnibridge;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public class JNIBridge {

    /* renamed from: bitter.jnibridge.JNIBridge$a */
    /* loaded from: classes2.dex */
    private static class C3398a implements InvocationHandler {

        /* renamed from: a */
        private Object f1706a = new Object[0];

        /* renamed from: b */
        private long f1707b;

        /* renamed from: c */
        private Constructor f1708c;

        public C3398a(long j) {
            this.f1707b = j;
            try {
                Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                this.f1708c = declaredConstructor;
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
                this.f1708c = null;
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            MethodHandles.Lookup in;
            MethodHandle unreflectSpecial;
            MethodHandle bindTo;
            Object invokeWithArguments;
            synchronized (this.f1706a) {
                long j = this.f1707b;
                if (j == 0) {
                    return null;
                }
                try {
                    return JNIBridge.invoke(j, method.getDeclaringClass(), method, objArr);
                } catch (NoSuchMethodError e) {
                    if (this.f1708c != null) {
                        if ((method.getModifiers() & 1024) == 0) {
                            if (objArr == null) {
                                objArr = new Object[0];
                            }
                            Class<?> declaringClass = method.getDeclaringClass();
                            in = ((MethodHandles.Lookup) this.f1708c.newInstance(declaringClass, 2)).in(declaringClass);
                            unreflectSpecial = in.unreflectSpecial(method, declaringClass);
                            bindTo = unreflectSpecial.bindTo(obj);
                            invokeWithArguments = bindTo.invokeWithArguments(objArr);
                            return invokeWithArguments;
                        }
                        throw e;
                    }
                    System.err.println("JNIBridge error: Java interface default methods are only supported since Android Oreo");
                    throw e;
                }
            }
        }
    }

    static void disableInterfaceProxy(Object obj) {
        if (obj != null) {
            C3398a c3398a = (C3398a) Proxy.getInvocationHandler(obj);
            synchronized (c3398a.f1706a) {
                c3398a.f1707b = 0L;
            }
        }
    }

    static native Object invoke(long j, Class cls, Method method, Object[] objArr);

    static Object newInterfaceProxy(long j, Class[] clsArr) {
        return Proxy.newProxyInstance(JNIBridge.class.getClassLoader(), clsArr, new C3398a(j));
    }
}
