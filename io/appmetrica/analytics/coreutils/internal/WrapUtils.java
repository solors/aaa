package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d, double d2) {
        if (!Double.isFinite(d)) {
            return d2;
        }
        return d;
    }

    public static long getMillisOrDefault(@Nullable Long l, @NonNull TimeUnit timeUnit, long j) {
        if (l != null) {
            return timeUnit.toMillis(l.longValue());
        }
        return j;
    }

    @NonNull
    public static <T> T getOrDefault(@Nullable T t, @NonNull T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    @NonNull
    public static String getOrDefaultIfEmpty(@Nullable String str, @NonNull String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    @Nullable
    public static <T> T getOrDefaultNullable(@Nullable T t, @Nullable T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    @Nullable
    public static String getOrDefaultNullableIfEmpty(@Nullable String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        return str;
    }

    @NonNull
    public static <T> String wrapToTag(@Nullable T t) {
        if (t == null) {
            return "<null>";
        }
        if (t.toString().isEmpty()) {
            return "<empty>";
        }
        return t.toString();
    }
}
