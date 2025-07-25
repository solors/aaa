package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class nm1 {

    /* renamed from: a */
    private final int f82832a;
    @NotNull

    /* renamed from: b */
    private final rm1 f82833b;
    @NotNull

    /* renamed from: c */
    private final Map<String, String> f82834c;

    public nm1(int i, @NotNull rm1 body, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f82832a = i;
        this.f82833b = body;
        this.f82834c = headers;
    }

    @NotNull
    /* renamed from: a */
    public final rm1 m31465a() {
        return this.f82833b;
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m31464b() {
        return this.f82834c;
    }

    /* renamed from: c */
    public final int m31463c() {
        return this.f82832a;
    }
}
