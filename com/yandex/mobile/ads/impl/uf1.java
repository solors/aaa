package com.yandex.mobile.ads.impl;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.analytics.FirebaseAnalytics;

/* loaded from: classes8.dex */
public final class uf1 {
    /* renamed from: a */
    private static String m28794a(int i, int i2, String str) {
        if (i < 0) {
            return jy1.m32697a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return jy1.m32697a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(C31736wd.m27978a("negative size: ", i2));
    }

    @CanIgnoreReturnValue
    /* renamed from: b */
    public static void m28791b(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException(m28794a(i, i2, FirebaseAnalytics.Param.INDEX));
    }

    /* renamed from: a */
    public static void m28792a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static void m28796a(int i, int i2) {
        String m32697a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                m32697a = jy1.m32697a("%s (%s) must not be negative", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
            } else if (i2 >= 0) {
                m32697a = jy1.m32697a("%s (%s) must be less than size (%s)", FirebaseAnalytics.Param.INDEX, Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(C31736wd.m27978a("negative size: ", i2));
            }
            throw new IndexOutOfBoundsException(m32697a);
        }
    }

    @CanIgnoreReturnValue
    /* renamed from: a */
    public static <T> T m28793a(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: a */
    public static void m28795a(int i, int i2, int i3) {
        String m28794a;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                m28794a = m28794a(i, i3, "start index");
            } else if (i2 >= 0 && i2 <= i3) {
                m28794a = jy1.m32697a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m28794a = m28794a(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(m28794a);
        }
    }
}
