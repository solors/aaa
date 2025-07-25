package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jw1 {
    @NotNull

    /* renamed from: a */
    private final bh0 f81170a;
    @NotNull

    /* renamed from: b */
    private final String f81171b;

    public jw1(@NotNull bh0 imageValue, @NotNull String title) {
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f81170a = imageValue;
        this.f81171b = title;
    }

    @NotNull
    /* renamed from: a */
    public final bh0 m32717a() {
        return this.f81170a;
    }

    @NotNull
    /* renamed from: b */
    public final String m32716b() {
        return this.f81171b;
    }
}
