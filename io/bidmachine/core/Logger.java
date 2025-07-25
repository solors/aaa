package io.bidmachine.core;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.utils.lazy.LazyValue;
import io.bidmachine.utils.log.DefaultLoggerInstance;
import io.bidmachine.utils.log.EmptyLoggerInstance;
import io.bidmachine.utils.log.LoggerInstance;

/* loaded from: classes9.dex */
public class Logger {
    private static boolean isLoggingEnabled = false;
    @NonNull
    private static volatile LoggerInstance enabledInstance = new DefaultLoggerInstance("BidMachineLog");
    @NonNull
    private static volatile LoggerInstance disabledInstance = new EmptyLoggerInstance();
    @NonNull
    @VisibleForTesting
    static volatile LoggerInstance instance = disabledInstance;

    /* renamed from: d */
    public static void m20094d(@NonNull Object obj, @NonNull String str) {
        instance.mo18984d(obj, str);
    }

    /* renamed from: e */
    public static void m20090e(@NonNull Object obj, @NonNull String str) {
        instance.mo18980e(obj, str);
    }

    public static boolean isLoggingEnabled() {
        return isLoggingEnabled;
    }

    public static void setDisabledInstance(@NonNull LoggerInstance loggerInstance) {
        disabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setEnabledInstance(@NonNull LoggerInstance loggerInstance) {
        enabledInstance = loggerInstance;
        setLoggingEnabled(isLoggingEnabled);
    }

    public static void setLoggingEnabled(boolean z) {
        LoggerInstance loggerInstance;
        isLoggingEnabled = z;
        if (z) {
            loggerInstance = enabledInstance;
        } else {
            loggerInstance = disabledInstance;
        }
        instance = loggerInstance;
    }

    /* renamed from: w */
    public static void m20088w(@NonNull Object obj, @NonNull String str) {
        instance.mo18976w(obj, str);
    }

    /* renamed from: d */
    public static void m20093d(@NonNull String str) {
        instance.mo18983d(str);
    }

    /* renamed from: e */
    public static void m20089e(@NonNull String str) {
        instance.mo18979e(str);
    }

    /* renamed from: w */
    public static void m20087w(@NonNull String str) {
        instance.mo18975w(str);
    }

    /* renamed from: d */
    public static void m20095d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.mo18985d(obj, lazyValue);
    }

    /* renamed from: e */
    public static void m20091e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        instance.mo18981e(obj, lazyValue);
    }

    /* renamed from: w */
    public static void m20086w(@NonNull Throwable th) {
        instance.mo18974w(th);
    }

    /* renamed from: d */
    public static void m20096d(@NonNull LazyValue<String> lazyValue) {
        instance.mo18986d(lazyValue);
    }

    /* renamed from: e */
    public static void m20092e(@NonNull LazyValue<String> lazyValue) {
        instance.mo18982e(lazyValue);
    }
}
