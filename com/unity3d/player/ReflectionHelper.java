package com.unity3d.player;

import androidx.exifinterface.media.ExifInterface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p552ot.pubsub.p553a.C26485b;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;

    /* renamed from: a */
    private static C28733b[] f74710a = new C28733b[4096];

    /* renamed from: b */
    private static long f74711b = 0;

    /* renamed from: c */
    private static long f74712c = 0;

    /* renamed from: d */
    private static boolean f74713d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.unity3d.player.ReflectionHelper$a */
    /* loaded from: classes7.dex */
    public class C28732a implements InterfaceC28735d {

        /* renamed from: a */
        private Runnable f74714a;

        /* renamed from: b */
        private UnityPlayer f74715b;

        /* renamed from: c */
        private long f74716c;

        /* renamed from: d */
        private long f74717d;

        /* renamed from: e */
        private boolean f74718e;

        /* renamed from: f */
        final /* synthetic */ long f74719f;

        C28732a(long j, UnityPlayer unityPlayer, Class[] clsArr) {
            this.f74719f = j;
            long j2 = ReflectionHelper.f74711b;
            this.f74714a = new RunnableC28734c(j2, j);
            this.f74715b = unityPlayer;
            this.f74716c = j2;
        }

        protected void finalize() {
            this.f74715b.queueGLThreadEvent(this.f74714a);
            super.finalize();
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
            if (r6 != 0) goto L16;
         */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) {
            /*
                r5 = this;
                long r0 = r5.f74716c
                boolean r0 = com.unity3d.player.ReflectionHelper.beginProxyCall(r0)
                if (r0 != 0) goto L10
                r6 = 6
                java.lang.String r7 = "Scripting proxy object was destroyed, because Unity player was unloaded."
                com.unity3d.player.AbstractC28798u.Log(r6, r7)
                r6 = 0
                return r6
            L10:
                r0 = 0
                r5.f74717d = r0     // Catch: java.lang.Throwable -> L46
                r2 = 0
                r5.f74718e = r2     // Catch: java.lang.Throwable -> L46
                long r2 = r5.f74719f     // Catch: java.lang.Throwable -> L46
                java.lang.String r4 = r7.getName()     // Catch: java.lang.Throwable -> L46
                java.lang.Object r2 = com.unity3d.player.ReflectionHelper.m37703c(r2, r4, r8)     // Catch: java.lang.Throwable -> L46
                boolean r3 = r5.f74718e     // Catch: java.lang.Throwable -> L46
                if (r3 == 0) goto L3b
                int r0 = r7.getModifiers()     // Catch: java.lang.Throwable -> L46
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 != 0) goto L35
                java.lang.Object r6 = r5.m37700a(r6, r7, r8)     // Catch: java.lang.Throwable -> L46
                com.unity3d.player.ReflectionHelper.endProxyCall()
                return r6
            L35:
                long r6 = r5.f74717d     // Catch: java.lang.Throwable -> L46
            L37:
                com.unity3d.player.ReflectionHelper.m37702d(r6)     // Catch: java.lang.Throwable -> L46
                goto L42
            L3b:
                long r6 = r5.f74717d     // Catch: java.lang.Throwable -> L46
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 == 0) goto L42
                goto L37
            L42:
                com.unity3d.player.ReflectionHelper.endProxyCall()
                return r2
            L46:
                r6 = move-exception
                com.unity3d.player.ReflectionHelper.endProxyCall()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.ReflectionHelper.C28732a.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        /* renamed from: a */
        private Object m37700a(Object obj, Method method, Object[] objArr) {
            MethodHandles.Lookup in;
            MethodHandle unreflectSpecial;
            MethodHandle bindTo;
            Object invokeWithArguments;
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC28798u.Log(6, String.format("Java interface default methods are only supported since Android Oreo", new Object[0]));
                    ReflectionHelper.nativeProxyLogJNIInvokeException(this.f74717d);
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            in = ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass);
            unreflectSpecial = in.unreflectSpecial(method, declaringClass);
            bindTo = unreflectSpecial.bindTo(obj);
            invokeWithArguments = bindTo.invokeWithArguments(objArr);
            return invokeWithArguments;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.unity3d.player.ReflectionHelper$b */
    /* loaded from: classes7.dex */
    public static class C28733b {

        /* renamed from: a */
        private final Class f74720a;

        /* renamed from: b */
        private final String f74721b;

        /* renamed from: c */
        private final String f74722c;

        /* renamed from: d */
        private final int f74723d;

        /* renamed from: e */
        public volatile Member f74724e;

        C28733b(Class cls, String str, String str2) {
            this.f74720a = cls;
            this.f74721b = str;
            this.f74722c = str2;
            this.f74723d = ((((cls.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + str.hashCode()) * 31) + str2.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C28733b)) {
                return false;
            }
            C28733b c28733b = (C28733b) obj;
            if (this.f74723d == c28733b.f74723d && this.f74722c.equals(c28733b.f74722c) && this.f74721b.equals(c28733b.f74721b) && this.f74720a.equals(c28733b.f74720a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f74723d;
        }
    }

    /* renamed from: com.unity3d.player.ReflectionHelper$c */
    /* loaded from: classes7.dex */
    private static class RunnableC28734c implements Runnable {

        /* renamed from: a */
        final long f74725a;

        /* renamed from: b */
        final long f74726b;

        public RunnableC28734c(long j, long j2) {
            this.f74725a = j;
            this.f74726b = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ReflectionHelper.beginProxyCall(this.f74725a)) {
                try {
                    ReflectionHelper.nativeProxyFinalize(this.f74726b);
                } finally {
                    ReflectionHelper.endProxyCall();
                }
            }
        }
    }

    /* renamed from: com.unity3d.player.ReflectionHelper$d */
    /* loaded from: classes7.dex */
    protected interface InterfaceC28735d extends InvocationHandler {
    }

    protected static synchronized boolean beginProxyCall(long j) {
        synchronized (ReflectionHelper.class) {
            if (j == f74711b) {
                f74712c++;
                return true;
            }
            return false;
        }
    }

    protected static synchronized void endProxyCall() {
        synchronized (ReflectionHelper.class) {
            long j = f74712c - 1;
            f74712c = j;
            if (0 == j && f74713d) {
                ReflectionHelper.class.notifyAll();
            }
        }
    }

    protected static synchronized void endUnityLaunch() {
        synchronized (ReflectionHelper.class) {
            try {
                f74711b++;
                f74713d = true;
                while (f74712c > 0) {
                    ReflectionHelper.class.wait();
                }
            } catch (InterruptedException unused) {
                AbstractC28798u.Log(6, "Interrupted while waiting for all proxies to exit.");
            }
            f74713d = false;
        }
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        C28733b c28733b = new C28733b(cls, "", str);
        if (m37710a(c28733b)) {
            constructor = (Constructor) c28733b.f74724e;
        } else {
            Class[] m37706a = m37706a(str);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor2 = null;
            float f = 0.0f;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor3 = constructors[i];
                float m37707a = m37707a(Void.TYPE, constructor3.getParameterTypes(), m37706a);
                if (m37707a > f) {
                    if (m37707a == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = m37707a;
                }
                i++;
            }
            m37709a(c28733b, constructor2);
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z) {
        Field field;
        String str3;
        Class cls2 = cls;
        C28733b c28733b = new C28733b(cls2, str, str2);
        if (m37710a(c28733b)) {
            field = (Field) c28733b.f74724e;
        } else {
            Class[] m37706a = m37706a(str2);
            float f = 0.0f;
            Field field2 = null;
            while (cls2 != null) {
                Field[] declaredFields = cls2.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i];
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float m37707a = m37707a(field3.getType(), null, m37706a);
                        if (m37707a > f) {
                            field2 = field3;
                            if (m37707a == 1.0f) {
                                f = m37707a;
                                break;
                            }
                            f = m37707a;
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || cls2.isPrimitive() || cls2.isInterface() || cls2.equals(Object.class) || cls2.equals(Void.TYPE)) {
                    break;
                }
                cls2 = cls2.getSuperclass();
            }
            m37709a(c28733b, field2);
            field = field2;
        }
        if (field == null) {
            Object[] objArr = new Object[4];
            if (z) {
                str3 = "static";
            } else {
                str3 = "non-static";
            }
            objArr[0] = str3;
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = cls2.getName();
            throw new NoSuchFieldError(String.format("no %s field with name='%s' signature='%s' in class L%s;", objArr));
        }
        return field;
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            if ("boolean".equals(name)) {
                return "Z";
            }
            if ("byte".equals(name)) {
                return C26485b.f69244a;
            }
            if ("char".equals(name)) {
                return "C";
            }
            if ("double".equals(name)) {
                return "D";
            }
            if ("float".equals(name)) {
                return "F";
            }
            if ("int".equals(name)) {
                return "I";
            }
            if ("long".equals(name)) {
                return "J";
            }
            if ("short".equals(name)) {
                return ExifInterface.LATITUDE_SOUTH;
            }
            return name;
        } else if (type.isArray()) {
            return type.getName().replace('.', '/');
        } else {
            return "L" + type.getName().replace('.', '/') + ";";
        }
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z) {
        Method method;
        String str3;
        C28733b c28733b = new C28733b(cls, str, str2);
        if (m37710a(c28733b)) {
            method = (Method) c28733b.f74724e;
        } else {
            Class[] m37706a = m37706a(str2);
            Method method2 = null;
            float f = 0.0f;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float m37707a = m37707a(method3.getReturnType(), method3.getParameterTypes(), m37706a);
                        if (m37707a <= f) {
                            continue;
                        } else if (m37707a == 1.0f) {
                            method2 = method3;
                            f = m37707a;
                            break;
                        } else {
                            method2 = method3;
                            f = m37707a;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            m37709a(c28733b, method2);
            method = method2;
        }
        if (method == null) {
            Object[] objArr = new Object[4];
            if (z) {
                str3 = "static";
            } else {
                str3 = "non-static";
            }
            objArr[0] = str3;
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = cls.getName();
            throw new NoSuchMethodError(String.format("no %s method with name='%s' signature='%s' in class L%s;", objArr));
        }
        return method;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyFinalize(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeProxyLogJNIInvokeException(long j);

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    protected static void setNativeExceptionOnProxy(Object obj, long j, boolean z) {
        C28732a c28732a = (C28732a) ((InterfaceC28735d) Proxy.getInvocationHandler(obj));
        c28732a.f74717d = j;
        c28732a.f74718e = z;
    }

    /* renamed from: a */
    private static float m37708a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new C28732a(j, unityPlayer, clsArr));
    }

    /* renamed from: a */
    private static float m37707a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float f2 = 1.0f;
            int i2 = 0;
            while (i < length) {
                f2 *= m37708a(clsArr[i], clsArr2[i2]);
                i++;
                i2++;
            }
            f = f2;
        }
        return f * m37708a(cls, clsArr2[clsArr2.length - 1]);
    }

    /* renamed from: a */
    private static Class m37705a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                if (charAt == 'L') {
                    int indexOf = str.indexOf(59, iArr[0]);
                    if (indexOf == -1) {
                        return null;
                    }
                    String substring = str.substring(iArr[0], indexOf);
                    iArr[0] = indexOf + 1;
                    try {
                        return Class.forName(substring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                } else if (charAt == 'Z') {
                    return Boolean.TYPE;
                } else {
                    if (charAt == 'I') {
                        return Integer.TYPE;
                    }
                    if (charAt == 'F') {
                        return Float.TYPE;
                    }
                    if (charAt == 'V') {
                        return Void.TYPE;
                    }
                    if (charAt == 'B') {
                        return Byte.TYPE;
                    }
                    if (charAt == 'C') {
                        return Character.TYPE;
                    }
                    if (charAt == 'S') {
                        return Short.TYPE;
                    }
                    if (charAt == 'J') {
                        return Long.TYPE;
                    }
                    if (charAt == 'D') {
                        return Double.TYPE;
                    }
                    if (charAt == '[') {
                        return Array.newInstance(m37705a(str, iArr), 0).getClass();
                    }
                    AbstractC28798u.Log(5, "! parseType; " + charAt + " is not known!");
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static Class[] m37706a(String str) {
        Class m37705a;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (m37705a = m37705a(str, iArr)) != null) {
            arrayList.add(m37705a);
        }
        Class[] clsArr = new Class[arrayList.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            clsArr[i] = (Class) it.next();
            i++;
        }
        return clsArr;
    }

    /* renamed from: a */
    private static synchronized boolean m37710a(C28733b c28733b) {
        synchronized (ReflectionHelper.class) {
            C28733b[] c28733bArr = f74710a;
            C28733b c28733b2 = c28733bArr[c28733b.f74723d & (c28733bArr.length - 1)];
            if (c28733b.equals(c28733b2)) {
                c28733b.f74724e = c28733b2.f74724e;
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static synchronized void m37709a(C28733b c28733b, Member member) {
        synchronized (ReflectionHelper.class) {
            c28733b.f74724e = member;
            C28733b[] c28733bArr = f74710a;
            c28733bArr[c28733b.f74723d & (c28733bArr.length - 1)] = c28733b;
        }
    }
}
