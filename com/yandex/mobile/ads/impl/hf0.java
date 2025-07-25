package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class hf0 {
    /* renamed from: a */
    public static final boolean m33567a(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.m17075f(method, "GET") && !Intrinsics.m17075f(method, "HEAD")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m33566b(@NotNull String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (!Intrinsics.m17075f(method, "POST") && !Intrinsics.m17075f(method, "PUT") && !Intrinsics.m17075f(method, "PATCH") && !Intrinsics.m17075f(method, "PROPPATCH") && !Intrinsics.m17075f(method, "REPORT")) {
            return false;
        }
        return true;
    }
}
