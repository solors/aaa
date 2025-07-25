package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class SystemServiceUtils {
    @NotNull
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    @Nullable
    public static final <T, S> S accessSystemServiceByNameSafely(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, S s, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s, functionWithThrowable);
        } catch (Throwable unused) {
            return s;
        }
    }

    @Nullable
    public static final <T, S> S accessSystemServiceSafely(@Nullable T t, @NotNull String str, @NotNull String str2, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t != null) {
            try {
                return functionWithThrowable.apply(t);
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(@Nullable T t, @NotNull String str, @NotNull String str2, S s, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        S s2 = (S) accessSystemServiceSafely(t, str, str2, functionWithThrowable);
        if (s2 != null) {
            return s2;
        }
        return s;
    }
}
