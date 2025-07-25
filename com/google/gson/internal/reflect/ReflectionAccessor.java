package com.google.gson.internal.reflect;

import com.google.gson.internal.JavaVersion;
import java.lang.reflect.AccessibleObject;

/* loaded from: classes5.dex */
public abstract class ReflectionAccessor {

    /* renamed from: a */
    private static final ReflectionAccessor f44101a;

    static {
        ReflectionAccessor unsafeReflectionAccessor;
        if (JavaVersion.getMajorJavaVersion() < 9) {
            unsafeReflectionAccessor = new PreJava9ReflectionAccessor();
        } else {
            unsafeReflectionAccessor = new UnsafeReflectionAccessor();
        }
        f44101a = unsafeReflectionAccessor;
    }

    public static ReflectionAccessor getInstance() {
        return f44101a;
    }

    public abstract void makeAccessible(AccessibleObject accessibleObject);
}
