package com.pgl.ssdk;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.pgl.ssdk.s0 */
/* loaded from: classes7.dex */
public final class C26661s0 {

    /* renamed from: a */
    private static Method f69951a;

    /* renamed from: b */
    private static Method f69952b;

    /* renamed from: c */
    private static Method f69953c;

    static {
        try {
            f69951a = Class.class.getDeclaredMethod("forName", String.class);
            f69952b = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
            f69953c = Class.class.getDeclaredMethod("getDeclaredField", String.class);
        } catch (NoSuchMethodException | NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static Object m40775a(Object obj, Class cls, String str, Object obj2) {
        try {
            Field m40777a = m40777a(cls, str);
            if (m40777a == null) {
                return obj2;
            }
            m40777a.setAccessible(true);
            return m40777a.get(obj);
        } catch (Throwable unused) {
            return obj2;
        }
    }

    /* renamed from: a */
    public static Field m40777a(Class cls, String str) {
        if (m40778a()) {
            try {
                Field field = (Field) f69953c.invoke(cls, str);
                try {
                    field.setAccessible(true);
                } catch (Throwable unused) {
                }
                return field;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Method m40776a(Class cls, String str, Class[] clsArr) {
        if (m40778a()) {
            try {
                Method method = (Method) f69952b.invoke(cls, str, clsArr);
                try {
                    method.setAccessible(true);
                } catch (Throwable unused) {
                }
                return method;
            } catch (Throwable unused2) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m40774a(Object obj, Class cls, String str, Class[] clsArr, Object... objArr) {
        try {
            Method m40776a = m40776a(cls, str, clsArr);
            if (m40776a != null) {
                return m40776a.invoke(obj, objArr);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m40778a() {
        return (f69951a == null || f69952b == null || f69953c == null) ? false : true;
    }
}
