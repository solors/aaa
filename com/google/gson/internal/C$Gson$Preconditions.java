package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions  reason: invalid class name */
/* loaded from: classes5.dex */
public final class C$Gson$Preconditions {
    private C$Gson$Preconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
