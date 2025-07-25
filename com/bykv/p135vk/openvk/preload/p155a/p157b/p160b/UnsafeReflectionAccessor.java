package com.bykv.p135vk.openvk.preload.p155a.p157b.p160b;

import com.bykv.p135vk.openvk.preload.p155a.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.bykv.vk.openvk.preload.a.b.b.c */
/* loaded from: classes3.dex */
final class UnsafeReflectionAccessor extends ReflectionAccessor {

    /* renamed from: a */
    private static Class f13759a;

    /* renamed from: b */
    private final Object f13760b = m91603b();

    /* renamed from: c */
    private final Field f13761c = m91601c();

    /* renamed from: b */
    private boolean m91602b(AccessibleObject accessibleObject) {
        if (this.f13760b != null && this.f13761c != null) {
            try {
                f13759a.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f13760b, accessibleObject, Long.valueOf(((Long) f13759a.getMethod("objectFieldOffset", Field.class).invoke(this.f13760b, this.f13761c)).longValue()), Boolean.TRUE);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: c */
    private static Field m91601c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.p160b.ReflectionAccessor
    /* renamed from: a */
    public final void mo91604a(AccessibleObject accessibleObject) {
        if (!m91602b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* renamed from: b */
    private static Object m91603b() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f13759a = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
