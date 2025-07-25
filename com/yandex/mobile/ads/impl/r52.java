package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.net.URL;

/* loaded from: classes8.dex */
public final class r52 {

    /* renamed from: a */
    private final String f84638a;

    /* renamed from: b */
    private final URL f84639b;

    /* renamed from: c */
    private final String f84640c;

    private r52(String str, URL url, String str2) {
        this.f84638a = str;
        this.f84639b = url;
        this.f84640c = str2;
    }

    /* renamed from: a */
    public static r52 m30144a(String str, URL url, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                return new r52(str, url, str2);
            }
            throw new IllegalArgumentException("VerificationParameters is null or empty");
        }
        throw new IllegalArgumentException("VendorKey is null or empty");
    }

    /* renamed from: b */
    public final String m30142b() {
        return this.f84638a;
    }

    /* renamed from: c */
    public final String m30141c() {
        return this.f84640c;
    }

    /* renamed from: a */
    public static r52 m30143a(URL url) {
        return new r52(null, url, null);
    }

    /* renamed from: a */
    public final URL m30145a() {
        return this.f84639b;
    }
}
