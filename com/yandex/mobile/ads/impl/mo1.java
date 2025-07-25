package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38497f;

/* loaded from: classes8.dex */
public final class mo1 extends RuntimeException {
    @NotNull

    /* renamed from: b */
    private final IOException f82327b;
    @NotNull

    /* renamed from: c */
    private IOException f82328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo1(@NotNull IOException firstConnectException) {
        super(firstConnectException);
        Intrinsics.checkNotNullParameter(firstConnectException, "firstConnectException");
        this.f82327b = firstConnectException;
        this.f82328c = firstConnectException;
    }

    /* renamed from: a */
    public final void m31886a(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        C38497f.m14566a(this.f82327b, e);
        this.f82328c = e;
    }

    @NotNull
    /* renamed from: b */
    public final IOException m31885b() {
        return this.f82328c;
    }

    @NotNull
    /* renamed from: a */
    public final IOException m31887a() {
        return this.f82327b;
    }
}
