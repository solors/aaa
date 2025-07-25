package com.yandex.mobile.ads.impl;

import android.media.AudioManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nf */
/* loaded from: classes8.dex */
public final class C30937nf {
    /* renamed from: a */
    public static void m31568a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: b */
    public static void m31566b(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static void m31567a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m31572a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static String m31569a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: a */
    public static <T> T m31570a(@Nullable T t) {
        t.getClass();
        return t;
    }

    /* renamed from: a */
    public static Object m31571a(@Nullable AudioManager audioManager) {
        if (audioManager != null) {
            return audioManager;
        }
        throw new IllegalStateException();
    }
}
