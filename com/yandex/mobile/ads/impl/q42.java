package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class q42 {
    @NotNull

    /* renamed from: a */
    private final l42 f84227a;
    @Nullable

    /* renamed from: b */
    private final String f84228b;

    public q42(@NotNull l42 vast, @Nullable String str) {
        Intrinsics.checkNotNullParameter(vast, "vast");
        this.f84227a = vast;
        this.f84228b = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m30475a() {
        return this.f84228b;
    }

    @NotNull
    /* renamed from: b */
    public final l42 m30474b() {
        return this.f84227a;
    }
}
