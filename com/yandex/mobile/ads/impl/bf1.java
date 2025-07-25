package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class bf1 {
    @NotNull

    /* renamed from: a */
    private final C31015o4 f77281a;
    @NotNull

    /* renamed from: b */
    private final kl0 f77282b;

    public bf1(@NotNull C31015o4 playingAdInfo, @NotNull kl0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f77281a = playingAdInfo;
        this.f77282b = playingVideoAd;
    }

    @NotNull
    /* renamed from: a */
    public final C31015o4 m35484a() {
        return this.f77281a;
    }

    @NotNull
    /* renamed from: b */
    public final kl0 m35483b() {
        return this.f77282b;
    }

    @NotNull
    /* renamed from: c */
    public final C31015o4 m35482c() {
        return this.f77281a;
    }

    @NotNull
    /* renamed from: d */
    public final kl0 m35481d() {
        return this.f77282b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf1)) {
            return false;
        }
        bf1 bf1Var = (bf1) obj;
        if (Intrinsics.m17075f(this.f77281a, bf1Var.f77281a) && Intrinsics.m17075f(this.f77282b, bf1Var.f77282b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77282b.hashCode() + (this.f77281a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        C31015o4 c31015o4 = this.f77281a;
        kl0 kl0Var = this.f77282b;
        return "PlayingAdData(playingAdInfo=" + c31015o4 + ", playingVideoAd=" + kl0Var + ")";
    }
}
