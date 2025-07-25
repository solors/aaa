package com.applovin.impl;

import android.text.TextUtils;

/* renamed from: com.applovin.impl.b1 */
/* loaded from: classes2.dex */
public abstract class AbstractC4100b1 {
    /* renamed from: a */
    public static void m100580a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m100577b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public static void m100579a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: b */
    public static void m100576b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: a */
    public static int m100584a(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    /* renamed from: b */
    public static Object m100578b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public static String m100581a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    /* renamed from: a */
    public static Object m100583a(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: a */
    public static Object m100582a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException(String.valueOf(obj2));
    }
}
