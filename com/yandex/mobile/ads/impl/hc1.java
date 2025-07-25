package com.yandex.mobile.ads.impl;

import android.text.TextUtils;

/* loaded from: classes8.dex */
public final class hc1 {

    /* renamed from: a */
    private final String f80034a = "Yandex";

    /* renamed from: b */
    private final String f80035b = "7.9.0";

    private hc1() {
    }

    /* renamed from: a */
    public static hc1 m33577a() {
        if (!TextUtils.isEmpty("Yandex")) {
            if (!TextUtils.isEmpty("7.9.0")) {
                return new hc1();
            }
            throw new IllegalArgumentException("Version is null or empty");
        }
        throw new IllegalArgumentException("Name is null or empty");
    }

    /* renamed from: b */
    public final String m33576b() {
        return this.f80034a;
    }

    /* renamed from: c */
    public final String m33575c() {
        return this.f80035b;
    }
}
