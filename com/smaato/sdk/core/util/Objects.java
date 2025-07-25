package com.smaato.sdk.core.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.p574fi.CheckedRunnable;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Function;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes7.dex */
public final class Objects {
    private Objects() {
    }

    public static void doSilently(@Nullable CheckedRunnable checkedRunnable) {
        if (checkedRunnable != null) {
            try {
                checkedRunnable.run();
            } catch (Exception unused) {
            }
        }
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public static int getIntValueFromMap(@NonNull Map<String, Integer> map, @NonNull String str) {
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static int hash(Object... objArr) {
        if (objArr.length == 1) {
            Object obj = objArr[0];
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }
        return Arrays.hashCode(objArr);
    }

    public static boolean isNull(@Nullable Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static boolean notEquals(Object obj, Object obj2) {
        return !equals(obj, obj2);
    }

    @NonNull
    public static <T> T notNull(@Nullable T t, @NonNull T t2) {
        if (t == null) {
            return t2;
        }
        return t;
    }

    public static <T> void onNotNull(@Nullable T t, @NonNull Consumer<T> consumer) {
        requireNonNull(consumer);
        if (t != null) {
            consumer.accept(t);
        }
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t) {
        return (T) requireNonNull(t, null);
    }

    @Nullable
    public static <T, R> R transformOrNull(@Nullable T t, @NonNull Function<T, R> function) {
        requireNonNull(function);
        if (t != null) {
            return function.apply(t);
        }
        return null;
    }

    @NonNull
    public static <T> T requireNonNull(@Nullable T t, @Nullable String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
