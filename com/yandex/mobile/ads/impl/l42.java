package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l42 {
    @NotNull

    /* renamed from: a */
    private final String f81688a;
    @NotNull

    /* renamed from: b */
    private final List<z52> f81689b;

    public l42(@NotNull String version, @NotNull List<z52> videoAds) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        this.f81688a = version;
        this.f81689b = videoAds;
    }

    @NotNull
    /* renamed from: a */
    public final String m32346a() {
        return this.f81688a;
    }

    @NotNull
    /* renamed from: b */
    public final List<z52> m32345b() {
        return this.f81689b;
    }
}
