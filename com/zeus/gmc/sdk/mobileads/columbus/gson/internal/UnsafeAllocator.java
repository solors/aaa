package com.zeus.gmc.sdk.mobileads.columbus.gson.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public abstract class UnsafeAllocator {
    public static UnsafeAllocator create() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            final Object obj = declaredField.get(null);
            final Method method = cls.getMethod("allocateInstance", Class.class);
            return new UnsafeAllocator() { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator.1
                @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator
                public <T> T newInstance(Class<T> cls2) throws Exception {
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
                    return new UnsafeAllocator() { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator.2
                        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) throws Exception {
                            return (T) declaredMethod2.invoke(null, cls2, Integer.valueOf(intValue));
                        }
                    };
                } catch (Exception unused2) {
                    return new UnsafeAllocator() { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator.4
                        @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator
                        public <T> T newInstance(Class<T> cls2) {
                            throw new UnsupportedOperationException("Cannot allocate " + cls2);
                        }
                    };
                }
            } catch (Exception unused3) {
                final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                return new UnsafeAllocator() { // from class: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator.3
                    @Override // com.zeus.gmc.sdk.mobileads.columbus.gson.internal.UnsafeAllocator
                    public <T> T newInstance(Class<T> cls2) throws Exception {
                        return (T) declaredMethod3.invoke(null, cls2, Object.class);
                    }
                };
            }
        }
    }

    public abstract <T> T newInstance(Class<T> cls) throws Exception;
}
