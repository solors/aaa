package com.yandex.mobile.ads.impl;

import java.util.HashSet;

/* loaded from: classes8.dex */
public final class i40 {

    /* renamed from: a */
    private static final HashSet<String> f80315a = new HashSet<>();

    /* renamed from: b */
    private static String f80316b = "goog.exo.core";

    /* renamed from: a */
    public static synchronized String m33372a() {
        String str;
        synchronized (i40.class) {
            str = f80316b;
        }
        return str;
    }

    /* renamed from: a */
    public static synchronized void m33371a(String str) {
        synchronized (i40.class) {
            if (f80315a.add(str)) {
                f80316b += ", " + str;
            }
        }
    }
}
