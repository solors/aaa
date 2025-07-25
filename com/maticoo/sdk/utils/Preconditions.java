package com.maticoo.sdk.utils;

import java.util.IllegalFormatException;

/* loaded from: classes6.dex */
public final class Preconditions {
    public static final String EMPTY_ARGUMENTS = "";

    public static boolean checkNotNull(Object obj) {
        return obj != null;
    }

    private static boolean checkNotNullInternal(Object obj, boolean z, String str, Object... objArr) {
        if (obj != null) {
            return true;
        }
        String format = format(str, objArr);
        if (!z) {
            return false;
        }
        throw new NullPointerException(format);
    }

    private static String format(String str, Object... objArr) {
        String valueOf = String.valueOf(str);
        try {
            return String.format(valueOf, objArr);
        } catch (IllegalFormatException unused) {
            return valueOf;
        }
    }

    public static void checkNotNull(Object obj, boolean z) {
        checkNotNullInternal(obj, z, "Object can not be null.", "");
    }
}
