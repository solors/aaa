package io.bidmachine.media3.common.util;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@UnstableApi
/* loaded from: classes9.dex */
public final class BundleUtil {
    private static final String TAG = "BundleUtil";
    @Nullable
    private static Method getIBinderMethod;
    @Nullable
    private static Method putIBinderMethod;

    private BundleUtil() {
    }

    @Nullable
    public static IBinder getBinder(Bundle bundle, @Nullable String str) {
        if (Util.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return getBinderByReflection(bundle, str);
    }

    @Nullable
    private static IBinder getBinderByReflection(Bundle bundle, @Nullable String str) {
        Method method = getIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                getIBinderMethod = method2;
                method2.setAccessible(true);
                method = getIBinderMethod;
            } catch (NoSuchMethodException e) {
                Log.m19946i(TAG, "Failed to retrieve getIBinder method", e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m19946i(TAG, "Failed to invoke getIBinder via reflection", e2);
            return null;
        }
    }

    public static void putBinder(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Util.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            putBinderByReflection(bundle, str, iBinder);
        }
    }

    private static void putBinderByReflection(Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        Method method = putIBinderMethod;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                putIBinderMethod = method2;
                method2.setAccessible(true);
                method = putIBinderMethod;
            } catch (NoSuchMethodException e) {
                Log.m19946i(TAG, "Failed to retrieve putIBinder method", e);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.m19946i(TAG, "Failed to invoke putIBinder via reflection", e2);
        }
    }
}
