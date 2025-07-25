package com.google.android.exoplayer2.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public final class BundleUtil {
    @Nullable

    /* renamed from: a */
    private static Method f36044a;
    @Nullable

    /* renamed from: b */
    private static Method f36045b;

    private BundleUtil() {
    }

    @Nullable
    /* renamed from: a */
    private static IBinder m72671a(Bundle bundle, @Nullable String str) {
        Method method = f36044a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f36044a = method2;
                method2.setAccessible(true);
                method = f36044a;
            } catch (NoSuchMethodException e) {
                Log.m72603i("BundleUtil", "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m72603i("BundleUtil", "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    /* renamed from: b */
    private static void m72670b(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Method method = f36045b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f36045b = method2;
                method2.setAccessible(true);
                method = f36045b;
            } catch (NoSuchMethodException e) {
                Log.m72603i("BundleUtil", "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m72603i("BundleUtil", "Failed to invoke putIBinder via reflection", e2);
        }
    }

    @Nullable
    public static IBinder getBinder(Bundle bundle, @Nullable String str) {
        if (Util.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return m72671a(bundle, str);
    }

    public static void putBinder(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            m72670b(bundle, str, iBinder);
        }
    }
}
