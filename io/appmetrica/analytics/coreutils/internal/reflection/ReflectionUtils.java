package io.appmetrica.analytics.coreutils.internal.reflection;

import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class ReflectionUtils {
    @NotNull
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean detectClassExists(@NotNull String str) {
        if (findClass(str) != null) {
            return true;
        }
        return false;
    }

    @Nullable
    public static final Class<?> findClass(@NotNull String str) {
        try {
            return Class.forName(str, false, ReflectionUtils.class.getClassLoader());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final boolean isArgumentsOfClasses(@NotNull Object[] objArr, @NotNull Class<?>... clsArr) {
        if (objArr.length != clsArr.length) {
            return false;
        }
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj = objArr[i];
            int i3 = i2 + 1;
            if (obj == null || !clsArr[i2].isAssignableFrom(obj.getClass())) {
                return false;
            }
            i++;
            i2 = i3;
        }
        return true;
    }

    @Nullable
    public static final <T> T loadAndInstantiateClassWithDefaultConstructor(@NotNull String str, @NotNull Class<T> cls) {
        Constructor<T> constructor;
        try {
            Class loadClass = loadClass(str, cls);
            if (loadClass != null && (constructor = loadClass.getConstructor(new Class[0])) != null) {
                return constructor.newInstance(new Object[0]);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Nullable
    public static final <T> Class<T> loadClass(@NotNull String str, @NotNull Class<T> cls) {
        try {
            Class<T> cls2 = (Class<T>) Class.forName(str);
            if (cls.isAssignableFrom(cls2)) {
                return cls2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final /* synthetic */ <T> T loadAndInstantiateClassWithDefaultConstructor(String str) {
        Intrinsics.m17067n(4, "T");
        return (T) loadAndInstantiateClassWithDefaultConstructor(str, Object.class);
    }
}
