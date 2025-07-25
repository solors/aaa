package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class lj1 {
    @NotNull

    /* renamed from: a */
    private final Map<String, String> f81837a;
    @NotNull

    /* renamed from: b */
    private final String f81838b;

    public lj1(@NotNull String body, @NotNull HashMap headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f81837a = headers;
        this.f81838b = body;
    }

    @NotNull
    /* renamed from: a */
    public final String m32245a() {
        return this.f81838b;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m32244b() {
        return this.f81837a;
    }
}
