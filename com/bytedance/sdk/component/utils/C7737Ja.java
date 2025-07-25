package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.utils.Ja */
/* loaded from: classes3.dex */
public class C7737Ja {

    /* renamed from: IL */
    private static Map<String, Method> f16913IL = new HashMap();

    /* renamed from: bX */
    private static final HashMap<Class<?>, Class<?>> f16914bX;

    /* renamed from: bg */
    public static final Class<?>[] f16915bg;

    static {
        HashMap<Class<?>, Class<?>> hashMap = new HashMap<>();
        f16914bX = hashMap;
        hashMap.put(Boolean.TYPE, Boolean.class);
        hashMap.put(Byte.TYPE, Byte.class);
        hashMap.put(Character.TYPE, Character.class);
        hashMap.put(Short.TYPE, Short.class);
        hashMap.put(Integer.TYPE, Integer.class);
        hashMap.put(Long.TYPE, Long.class);
        hashMap.put(Double.TYPE, Double.class);
        hashMap.put(Float.TYPE, Float.class);
        hashMap.put(Void.TYPE, Void.class);
        f16915bg = new Class[0];
    }

    /* renamed from: IL */
    private static String m87904IL(Class<?> cls, String str, Class<?>... clsArr) {
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cls.toString());
        sb2.append("#");
        sb2.append(str);
        sb2.append("#");
        if (cls.getClassLoader() != null) {
            obj = Integer.valueOf(cls.getClassLoader().hashCode());
        } else {
            obj = "";
        }
        sb2.append(obj);
        if (clsArr != null && clsArr.length > 0) {
            for (Class<?> cls2 : clsArr) {
                sb2.append(cls2.toString());
                sb2.append("#");
            }
        } else {
            sb2.append(Void.class.toString());
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    public static int m87902bg(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: bg */
    public static Method m87900bg(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Method[] declaredMethods;
        String m87904IL = m87904IL(cls, str, clsArr);
        synchronized (f16913IL) {
            method = f16913IL.get(m87904IL);
        }
        if (method != null) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            return method;
        }
        while (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
            }
            if (method == null) {
                try {
                    for (Method method2 : cls.getDeclaredMethods()) {
                        if (method2 != null && TextUtils.equals(method2.getName(), str)) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            if (clsArr != null && parameterTypes != null && clsArr.length == parameterTypes.length) {
                                boolean z = true;
                                for (int i = 0; i < clsArr.length; i++) {
                                    if (!m87901bg(clsArr[i], parameterTypes[i])) {
                                        z = false;
                                    }
                                }
                                if (z) {
                                    method = method2;
                                }
                            }
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (method != null) {
                method.setAccessible(true);
                synchronized (f16913IL) {
                    f16913IL.put(m87904IL, method);
                }
                return method;
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* renamed from: bg */
    public static boolean m87901bg(Class<?> cls, Class<?> cls2) {
        if (cls2 == null) {
            return false;
        }
        if (cls == null) {
            return !cls2.isPrimitive();
        }
        if (cls.isPrimitive() && !cls2.isPrimitive()) {
            cls = f16914bX.get(cls);
        }
        if (cls2.isPrimitive() && !cls.isPrimitive()) {
            cls2 = f16914bX.get(cls2);
        }
        return cls2.isAssignableFrom(cls);
    }

    /* renamed from: bg */
    public static Object m87899bg(Object obj, String str, Object... objArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return m87898bg(obj, str, objArr, m87897bg(objArr));
    }

    /* renamed from: bg */
    public static Object m87898bg(Object obj, String str, Object[] objArr, Class<?>[] clsArr) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method m87900bg = m87900bg(obj.getClass(), str, clsArr);
        if (m87900bg != null) {
            return m87900bg.invoke(obj, objArr);
        }
        throw new NoSuchMethodException(str);
    }

    /* renamed from: bg */
    public static Class<?>[] m87897bg(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                clsArr[i] = obj == null ? null : obj.getClass();
            }
            return clsArr;
        }
        return f16915bg;
    }

    /* renamed from: bg */
    public static int m87903bg(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
