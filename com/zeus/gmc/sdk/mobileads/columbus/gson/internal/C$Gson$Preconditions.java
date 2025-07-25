package com.zeus.gmc.sdk.mobileads.columbus.gson.internal;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.gson.internal.$Gson$Preconditions  reason: invalid class name */
/* loaded from: classes8.dex */
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
