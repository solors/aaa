package com.bykv.p135vk.openvk.preload.p155a.p157b;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* renamed from: com.bykv.vk.openvk.preload.a.b.i */
/* loaded from: classes3.dex */
public abstract class UnsafeAllocator {
    /* renamed from: a */
    public static UnsafeAllocator m91573a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new UnsafeAllocator() { // from class: com.bykv.vk.openvk.preload.a.b.i.1
                @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.UnsafeAllocator
                /* renamed from: a */
                public final <T> T mo91571a(Class<T> cls2) throws Exception {
                    UnsafeAllocator.m91572b(cls2);
                    return (T) method.invoke(obj, cls2);
                }
            };
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new UnsafeAllocator() { // from class: com.bykv.vk.openvk.preload.a.b.i.2
                        @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.UnsafeAllocator
                        /* renamed from: a */
                        public final <T> T mo91571a(Class<T> cls2) throws Exception {
                            UnsafeAllocator.m91572b(cls2);
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(intValue));
                        }
                    };
                } catch (Exception unused2) {
                    return new UnsafeAllocator() { // from class: com.bykv.vk.openvk.preload.a.b.i.4
                        @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.UnsafeAllocator
                        /* renamed from: a */
                        public final <T> T mo91571a(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate ".concat(String.valueOf(cls2)));
                        }
                    };
                }
            } catch (Exception unused3) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.bykv.vk.openvk.preload.a.b.i.3
                    @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.UnsafeAllocator
                    /* renamed from: a */
                    public final <T> T mo91571a(Class<T> cls2) throws Exception {
                        UnsafeAllocator.m91572b(cls2);
                        return (T) declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        }
    }

    /* renamed from: b */
    static void m91572b(Class<?> cls) {
        int modifiers = cls.getModifiers();
        if (!Modifier.isInterface(modifiers)) {
            if (!Modifier.isAbstract(modifiers)) {
                return;
            }
            throw new UnsupportedOperationException("Abstract class can't be instantiated! Class name: " + cls.getName());
        }
        throw new UnsupportedOperationException("Interface can't be instantiated! Interface name: " + cls.getName());
    }

    /* renamed from: a */
    public abstract <T> T mo91571a(Class<T> cls) throws Exception;
}
