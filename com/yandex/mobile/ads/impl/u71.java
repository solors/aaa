package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class u71 implements a72 {
    @NotNull

    /* renamed from: a */
    private final String f86142a;

    /* renamed from: b */
    private final int f86143b;

    /* renamed from: c */
    private final int f86144c;

    public u71(@NotNull String url, int i, int i2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f86142a = url;
        this.f86143b = i;
        this.f86144c = i2;
    }

    public final int getAdHeight() {
        return this.f86144c;
    }

    public final int getAdWidth() {
        return this.f86143b;
    }

    @Override // com.yandex.mobile.ads.impl.a72
    @NotNull
    public final String getUrl() {
        return this.f86142a;
    }
}
