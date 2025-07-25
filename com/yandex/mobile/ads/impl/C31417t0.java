package com.yandex.mobile.ads.impl;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.t0 */
/* loaded from: classes8.dex */
public final class C31417t0 {
    @Nullable
    /* renamed from: a */
    public static String m29334a() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, ky0.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentActivityThread", new Class[0]);
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = cls.getDeclaredMethod("getProcessName", new Class[0]);
            declaredMethod2.setAccessible(true);
            Object invoke = declaredMethod2.invoke(declaredMethod.invoke(null, new Object[0]), new Object[0]);
            Intrinsics.m17073h(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public static String m29333b() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread", false, ky0.class.getClassLoader());
            Intrinsics.checkNotNullExpressionValue(cls, "forName(...)");
            Method declaredMethod = cls.getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            Intrinsics.m17073h(invoke, "null cannot be cast to non-null type kotlin.String");
            return (String) invoke;
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            return null;
        }
    }
}
