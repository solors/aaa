package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class af1 {
    @NotNull

    /* renamed from: a */
    private final C30909n4 f76777a;
    @NotNull

    /* renamed from: b */
    private final kl0 f76778b;

    public af1(@NotNull C30909n4 playingAdInfo, @NotNull kl0 playingVideoAd) {
        Intrinsics.checkNotNullParameter(playingAdInfo, "playingAdInfo");
        Intrinsics.checkNotNullParameter(playingVideoAd, "playingVideoAd");
        this.f76777a = playingAdInfo;
        this.f76778b = playingVideoAd;
    }

    @NotNull
    /* renamed from: a */
    public final C30909n4 m35908a() {
        return this.f76777a;
    }

    @NotNull
    /* renamed from: b */
    public final kl0 m35907b() {
        return this.f76778b;
    }

    @NotNull
    /* renamed from: c */
    public final C30909n4 m35906c() {
        return this.f76777a;
    }

    @NotNull
    /* renamed from: d */
    public final kl0 m35905d() {
        return this.f76778b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        if (Intrinsics.m17075f(this.f76777a, af1Var.f76777a) && Intrinsics.m17075f(this.f76778b, af1Var.f76778b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f76778b.hashCode() + (this.f76777a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        C30909n4 c30909n4 = this.f76777a;
        kl0 kl0Var = this.f76778b;
        return "PlayingAdData(playingAdInfo=" + c30909n4 + ", playingVideoAd=" + kl0Var + ")";
    }
}
