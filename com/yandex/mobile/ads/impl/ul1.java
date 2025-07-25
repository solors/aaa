package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ul1 {
    @NotNull
    /* renamed from: a */
    public static String m28733a(@NotNull nf0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String m31563c = url.m31563c();
        String m31561e = url.m31561e();
        if (m31561e != null) {
            return m31563c + "?" + m31561e;
        }
        return m31563c;
    }
}
