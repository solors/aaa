package com.smaato.sdk.core.util.reflection;

import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public final class Reflections {
    private Reflections() {
    }

    public static boolean isClassInClasspath(@NonNull String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
