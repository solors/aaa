package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i50 {
    @NotNull

    /* renamed from: a */
    private final String f80320a;
    @NotNull

    /* renamed from: b */
    private final String f80321b;

    public i50(@NotNull String type, @NotNull String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f80320a = type;
        this.f80321b = value;
    }

    @NotNull
    /* renamed from: a */
    public final String m33365a() {
        return this.f80320a;
    }

    @NotNull
    /* renamed from: b */
    public final String m33364b() {
        return this.f80321b;
    }
}
