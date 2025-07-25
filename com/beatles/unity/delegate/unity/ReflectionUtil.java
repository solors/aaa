package com.beatles.unity.delegate.unity;

import android.util.Log;
import java.lang.reflect.Field;

/* loaded from: classes3.dex */
public class ReflectionUtil {
    private static Field getField(Class cls, String str) throws NoSuchFieldException {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                return getField(superclass, str);
            }
            throw e;
        }
    }

    public static Object getPrivateFieldValue(Object obj, String str) {
        try {
            Field field = getField(obj.getClass(), str);
            field.setAccessible(true);
            return field.get(obj);
        } catch (IllegalAccessException unused) {
            Log.e("ReflectionUtil", obj + " IllegalAccessException: " + str);
            return null;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionUtil", obj + " NoSuchFieldException: " + str);
            return null;
        }
    }

    public static Field setFieldValue(Object obj, String str, Object obj2) {
        try {
            Field field = getField(obj.getClass(), str);
            field.setAccessible(true);
            field.set(obj, obj2);
            return field;
        } catch (IllegalAccessException unused) {
            Log.e("ReflectionUtil", obj + " IllegalAccessException: " + str);
            return null;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionUtil", obj + " NoSuchFieldException: " + str);
            return null;
        }
    }
}
