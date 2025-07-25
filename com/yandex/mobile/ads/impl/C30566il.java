package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.yandex.mobile.ads.impl.il */
/* loaded from: classes8.dex */
public final class C30566il {
    @Nullable

    /* renamed from: a */
    private static Method f80521a;

    @Nullable
    /* renamed from: a */
    public static IBinder m33214a(Bundle bundle, @Nullable String str) {
        if (y32.f88010a >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f80521a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f80521a = method2;
                method2.setAccessible(true);
                method = f80521a;
            } catch (NoSuchMethodException e) {
                gq0.m33799a("Failed to retrieve getIBinder method", (Exception) e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            gq0.m33799a("Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }
}
