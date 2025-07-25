package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cl0 implements a72 {
    @NotNull

    /* renamed from: a */
    private final C32011zr f77663a;
    @NotNull

    /* renamed from: b */
    private final String f77664b;

    /* renamed from: c */
    private final int f77665c;

    /* renamed from: d */
    private final int f77666d;
    @Nullable

    /* renamed from: e */
    private final String f77667e;
    @Nullable

    /* renamed from: f */
    private final Integer f77668f;
    @Nullable

    /* renamed from: g */
    private final String f77669g;

    public cl0(@NotNull C32011zr adBreakPosition, @NotNull String url, int i, int i2, @Nullable String str, @Nullable Integer num, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f77663a = adBreakPosition;
        this.f77664b = url;
        this.f77665c = i;
        this.f77666d = i2;
        this.f77667e = str;
        this.f77668f = num;
        this.f77669g = str2;
    }

    @NotNull
    /* renamed from: a */
    public final C32011zr m35222a() {
        return this.f77663a;
    }

    public final int getAdHeight() {
        return this.f77666d;
    }

    public final int getAdWidth() {
        return this.f77665c;
    }

    @Nullable
    public final String getApiFramework() {
        return this.f77669g;
    }

    @Nullable
    public final Integer getBitrate() {
        return this.f77668f;
    }

    @Nullable
    public final String getMediaType() {
        return this.f77667e;
    }

    @Override // com.yandex.mobile.ads.impl.a72
    @NotNull
    public final String getUrl() {
        return this.f77664b;
    }
}
