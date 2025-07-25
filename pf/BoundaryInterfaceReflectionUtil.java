package pf;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Collection;

/* renamed from: pf.a */
/* loaded from: classes10.dex */
public class BoundaryInterfaceReflectionUtil {

    /* compiled from: BoundaryInterfaceReflectionUtil.java */
    @RequiresApi(19)
    /* renamed from: pf.a$a */
    /* loaded from: classes10.dex */
    private static class C39301a implements InvocationHandler {

        /* renamed from: a */
        private final Object f103220a;

        public C39301a(@NonNull Object obj) {
            this.f103220a = obj;
        }

        @NonNull
        /* renamed from: a */
        public Object m13142a() {
            return this.f103220a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                return BoundaryInterfaceReflectionUtil.m13145d(method, this.f103220a.getClass().getClassLoader()).invoke(this.f103220a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getTargetException();
            } catch (ReflectiveOperationException e2) {
                throw new RuntimeException("Reflection failed for method " + method, e2);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m13148a(@NonNull Class<T> cls, @Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(BoundaryInterfaceReflectionUtil.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* renamed from: b */
    public static boolean m13147b(Collection<String> collection, String str) {
        if (!collection.contains(str)) {
            if (m13143f()) {
                if (collection.contains(str + ":dev")) {
                }
            }
            return false;
        }
        return true;
    }

    @Nullable
    @RequiresApi(19)
    /* renamed from: c */
    public static InvocationHandler m13146c(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return new C39301a(obj);
    }

    /* renamed from: d */
    public static Method m13145d(Method method, ClassLoader classLoader) throws ClassNotFoundException, NoSuchMethodException {
        return Class.forName(method.getDeclaringClass().getName(), true, classLoader).getDeclaredMethod(method.getName(), method.getParameterTypes());
    }

    @Nullable
    @RequiresApi(19)
    /* renamed from: e */
    public static Object m13144e(@Nullable InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return ((C39301a) invocationHandler).m13142a();
    }

    /* renamed from: f */
    private static boolean m13143f() {
        String str = Build.TYPE;
        if (!"eng".equals(str) && !"userdebug".equals(str)) {
            return false;
        }
        return true;
    }
}
