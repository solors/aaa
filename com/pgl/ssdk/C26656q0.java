package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pgl.ssdk.q0 */
/* loaded from: classes7.dex */
public class C26656q0 {

    /* renamed from: a */
    private static final Map<Class<?>, Class<?>> f69942a;

    /* renamed from: com.pgl.ssdk.q0$a */
    /* loaded from: classes7.dex */
    public static class C26657a<T> {

        /* renamed from: a */
        public final Class<? extends T> f69943a;

        /* renamed from: b */
        public final T f69944b;
    }

    static {
        HashMap hashMap = new HashMap();
        f69942a = hashMap;
        Class cls = Boolean.TYPE;
        hashMap.put(Boolean.class, cls);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        hashMap.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        hashMap.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        hashMap.put(Long.class, cls4);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(cls, cls);
        Class cls5 = Byte.TYPE;
        hashMap.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        hashMap.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        hashMap.put(cls7, cls7);
        hashMap.put(cls2, cls2);
        hashMap.put(cls3, cls3);
        hashMap.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        hashMap.put(cls8, cls8);
    }

    /* renamed from: a */
    public static void m40791a(String str, String str2, Object... objArr) {
        try {
            m40792a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private static Object[] m40787b(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            Object[] objArr2 = new Object[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null && (obj instanceof C26657a)) {
                    objArr2[i] = ((C26657a) obj).f69944b;
                } else {
                    objArr2[i] = obj;
                }
            }
            return objArr2;
        }
        return null;
    }

    /* renamed from: a */
    private static Method m40793a(Class<?> cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method m40788a = m40788a(cls.getDeclaredMethods(), str, clsArr);
        if (m40788a == null) {
            if (cls.getSuperclass() != null) {
                return m40793a((Class<?>) cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
        m40788a.setAccessible(true);
        return m40788a;
    }

    /* renamed from: a */
    private static Method m40788a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && m40790a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    /* renamed from: a */
    private static boolean m40790a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        } else if (clsArr2 == null) {
            return clsArr.length == 0;
        } else if (clsArr.length != clsArr2.length) {
            return false;
        } else {
            for (int i = 0; i < clsArr.length; i++) {
                if (!clsArr[i].isAssignableFrom(clsArr2[i])) {
                    Map<Class<?>, Class<?>> map = f69942a;
                    if (!map.containsKey(clsArr[i]) || !map.get(clsArr[i]).equals(map.get(clsArr2[i]))) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m40792a(Class<?> cls, String str, Object... objArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
        m40793a(cls, str, (Class[]) m40789a(objArr)).invoke(null, m40787b(objArr));
    }

    /* renamed from: a */
    private static Class<?>[] m40789a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj != null && (obj instanceof C26657a)) {
                clsArr[i] = ((C26657a) obj).f69943a;
            } else {
                clsArr[i] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }
}
