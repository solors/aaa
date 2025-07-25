package com.google.firebase.components;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes4.dex */
public final class Preconditions {
    public static void checkArgument(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(str);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z, String str) {
        if (z) {
            return;
        }
        throw new IllegalStateException(str);
    }

    @CanIgnoreReturnValue
    public static <T> T checkNotNull(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
