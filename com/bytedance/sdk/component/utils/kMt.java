package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
public class kMt {
    /* renamed from: bg */
    public static Method m87828bg(String str, String str2, Class<?>... clsArr) {
        Class<?> m87829bg;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                m87829bg = m87829bg(str);
                if (m87829bg == null) {
                    return null;
                }
            } catch (Throwable unused) {
                return null;
            }
        }
        return m87829bg.getMethod(str2, clsArr);
    }

    /* renamed from: bg */
    public static Class<?> m87829bg(String str) {
        try {
            try {
                try {
                    return Class.forName(str, true, m87830bg());
                } catch (ClassNotFoundException unused) {
                    return Class.forName(str, true, kMt.class.getClassLoader());
                }
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return Class.forName(str);
        }
    }

    /* renamed from: bg */
    private static ClassLoader m87830bg() {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        return contextClassLoader == null ? kMt.class.getClassLoader() : contextClassLoader;
    }
}
