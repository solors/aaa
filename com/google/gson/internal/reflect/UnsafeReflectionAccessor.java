package com.google.gson.internal.reflect;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* renamed from: d */
    private static Class f44102d;

    /* renamed from: b */
    private final Object f44103b = m66160b();

    /* renamed from: c */
    private final Field f44104c = m66161a();

    /* renamed from: a */
    private static Field m66161a() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static Object m66160b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f44102d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    boolean m66159c(AccessibleObject accessibleObject) {
        if (this.f44103b != null && this.f44104c != null) {
            try {
                f44102d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f44103b, accessibleObject, Long.valueOf(((Long) f44102d.getMethod("objectFieldOffset", Field.class).invoke(this.f44103b, this.f44104c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.google.gson.internal.reflect.ReflectionAccessor
    public void makeAccessible(AccessibleObject accessibleObject) {
        if (!m66159c(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }
}
