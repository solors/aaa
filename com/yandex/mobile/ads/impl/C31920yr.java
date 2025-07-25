package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yr */
/* loaded from: classes8.dex */
public final class C31920yr {
    @NotNull

    /* renamed from: a */
    private final pq1 f88489a;
    @NotNull

    /* renamed from: b */
    private final List<m62<kl0>> f88490b;
    @NotNull

    /* renamed from: c */
    private final List<kl0> f88491c;
    @NotNull

    /* renamed from: d */
    private final String f88492d;
    @NotNull

    /* renamed from: e */
    private final C30530i2 f88493e;
    @NotNull

    /* renamed from: f */
    private final C32011zr f88494f;

    /* renamed from: g */
    private final long f88495g;

    public C31920yr(@NotNull pq1 sdkEnvironmentModule, @NotNull ArrayList videoAdInfoList, @NotNull ArrayList videoAds, @NotNull String type, @NotNull C30530i2 adBreak, @NotNull C32011zr adBreakPosition, long j) {
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(videoAdInfoList, "videoAdInfoList");
        Intrinsics.checkNotNullParameter(videoAds, "videoAds");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        Intrinsics.checkNotNullParameter(adBreakPosition, "adBreakPosition");
        this.f88489a = sdkEnvironmentModule;
        this.f88490b = videoAdInfoList;
        this.f88491c = videoAds;
        this.f88492d = type;
        this.f88493e = adBreak;
        this.f88494f = adBreakPosition;
        this.f88495g = j;
    }

    /* renamed from: a */
    public final void m26634a(@Nullable C30814ly c30814ly) {
    }

    @NotNull
    /* renamed from: b */
    public final C32011zr m26633b() {
        return this.f88494f;
    }

    @Nullable
    /* renamed from: c */
    public final C30814ly m26632c() {
        return null;
    }

    @NotNull
    /* renamed from: d */
    public final pq1 m26631d() {
        return this.f88489a;
    }

    @NotNull
    /* renamed from: e */
    public final String m26630e() {
        return this.f88492d;
    }

    @NotNull
    /* renamed from: f */
    public final List<m62<kl0>> m26629f() {
        return this.f88490b;
    }

    @NotNull
    /* renamed from: g */
    public final List<kl0> m26628g() {
        return this.f88491c;
    }

    @NotNull
    public final String toString() {
        long j = this.f88495g;
        return "ad_break_#" + j;
    }

    @NotNull
    /* renamed from: a */
    public final C30530i2 m26635a() {
        return this.f88493e;
    }
}
