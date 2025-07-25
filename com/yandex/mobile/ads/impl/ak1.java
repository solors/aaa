package com.yandex.mobile.ads.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ak1 {

    /* renamed from: com.yandex.mobile.ads.impl.ak1$a */
    /* loaded from: classes8.dex */
    public static final class C29944a {
        private C29944a() {
        }

        /* renamed from: a */
        public static final Class[] m35837a(Object... objArr) {
            ArrayList arrayList = new ArrayList();
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Class<?> cls = obj != null ? obj.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return (Class[]) arrayList.toArray(new Class[0]);
        }

        public /* synthetic */ C29944a(int i) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public static Object m35840a(@Nullable Object obj, @NotNull Class clazz, @NotNull String methodName, @NotNull Class[] argumentsTypes, @NotNull Object... arguments) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(argumentsTypes, "argumentsTypes");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object obj2 = null;
            try {
                Method m35841a = m35841a(clazz, methodName, argumentsTypes);
                if (m35841a != null) {
                    m35841a.setAccessible(true);
                    obj2 = m35841a.invoke(obj, Arrays.copyOf(arguments, arguments.length));
                    m35841a.setAccessible(false);
                    return obj2;
                }
                return null;
            } catch (Throwable unused) {
                Object[] args = {methodName};
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
                return obj2;
            }
        }

        @Nullable
        /* renamed from: a */
        public static Object m35839a(@NotNull Object obj, @NotNull String methodName, @NotNull Object... arguments) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            Intrinsics.checkNotNullParameter(methodName, "methodName");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList();
            int length = copyOf.length;
            for (int i = 0; i < length; i++) {
                Object obj2 = copyOf[i];
                Class<?> cls = obj2 != null ? obj2.getClass() : null;
                if (cls != null) {
                    arrayList.add(cls);
                }
            }
            return m35840a(obj, obj.getClass(), methodName, (Class[]) arrayList.toArray(new Class[0]), Arrays.copyOf(arguments, arguments.length));
        }

        /* renamed from: a */
        private static Method m35841a(Class cls, String str, Class[] clsArr) {
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                Intrinsics.m17074g(declaredMethods);
                for (Method method : declaredMethods) {
                    Intrinsics.m17074g(method);
                    Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                    if (Intrinsics.m17075f(str, method.getName())) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == clsArr2.length) {
                            int length = parameterTypes.length;
                            for (int i = 0; i < length; i++) {
                                if (!parameterTypes[i].isAssignableFrom(clsArr2[i])) {
                                    break;
                                }
                            }
                            return method;
                        }
                        continue;
                    }
                }
                cls = cls.getSuperclass();
            }
            return null;
        }

        @Nullable
        /* renamed from: a */
        public static Object m35838a(@NotNull String className, @NotNull Object... arguments) throws Throwable {
            Intrinsics.checkNotNullParameter(className, "className");
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            Class<?> cls = Class.forName(className);
            Intrinsics.m17074g(cls);
            Object[] copyOf = Arrays.copyOf(arguments, arguments.length);
            ArrayList arrayList = new ArrayList(copyOf.length);
            for (Object obj : copyOf) {
                arrayList.add(obj.getClass());
            }
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            try {
                Constructor<?> declaredConstructor = cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                boolean isAccessible = declaredConstructor.isAccessible();
                if (!isAccessible) {
                    declaredConstructor.setAccessible(true);
                }
                Object newInstance = declaredConstructor.newInstance(Arrays.copyOf(copyOf, copyOf.length));
                if (isAccessible) {
                    return newInstance;
                }
                declaredConstructor.setAccessible(false);
                return newInstance;
            } catch (Throwable unused) {
                Object[] args = {cls.getCanonicalName(), Arrays.toString(copyOf)};
                int i = um0.f86330b;
                Intrinsics.checkNotNullParameter(args, "args");
                return null;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public static Object m35842a(@NotNull Class clazz, @NotNull String methodName, @NotNull Object... arguments) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return C29944a.m35840a(null, clazz, methodName, C29944a.m35837a(Arrays.copyOf(arguments, arguments.length)), Arrays.copyOf(arguments, arguments.length));
    }
}
