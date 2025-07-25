package com.mobilefuse.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mobilefuse.sdk.config.ObservableConfig;
import com.mobilefuse.sdk.utils.AdErrorHelper;

/* loaded from: classes7.dex */
public class StabilityHelper {
    public static void logAdErrorException(@NonNull Object obj, @NonNull Throwable th, @Nullable ObservableConfig observableConfig, @NonNull AdError adError) {
        logException(obj.getClass(), th);
        try {
            AdErrorHelper.onAdError(adError, observableConfig);
        } catch (Throwable unused) {
        }
    }

    public static void logAdRenderingException(@NonNull Object obj, @NonNull Throwable th, @Nullable ObservableConfig observableConfig) {
        logException(obj.getClass(), th);
        try {
            AdErrorHelper.onAdRenderingError(observableConfig);
        } catch (Throwable unused) {
        }
    }

    public static void logException(@NonNull Object obj, @NonNull Throwable th) {
        logException(obj.getClass(), th);
    }

    public static void logException(@NonNull Class<?> cls, @NonNull Throwable th) {
        StabilityHelperBridge.logException(cls, th);
    }
}
