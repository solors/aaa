package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@FunctionalInterface
/* loaded from: classes9.dex */
public interface Executable<T> {
    void execute(@NonNull T t);

    default boolean safeExecute(@Nullable T t) {
        if (t != null) {
            execute(t);
            return true;
        }
        return false;
    }
}
