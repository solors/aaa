package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ip0 {
    @NotNull

    /* renamed from: a */
    private final lv1 f80578a;
    @NotNull

    /* renamed from: b */
    private final C30149d8<String> f80579b;

    public ip0(@NotNull lv1 sliderAd, @NotNull C30149d8<String> adResponse) {
        Intrinsics.checkNotNullParameter(sliderAd, "sliderAd");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f80578a = sliderAd;
        this.f80579b = adResponse;
    }

    @NotNull
    /* renamed from: a */
    public final C30149d8<String> m33155a() {
        return this.f80579b;
    }

    @NotNull
    /* renamed from: b */
    public final lv1 m33154b() {
        return this.f80578a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip0)) {
            return false;
        }
        ip0 ip0Var = (ip0) obj;
        if (Intrinsics.m17075f(this.f80578a, ip0Var.f80578a) && Intrinsics.m17075f(this.f80579b, ip0Var.f80579b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f80579b.hashCode() + (this.f80578a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        lv1 lv1Var = this.f80578a;
        C30149d8<String> c30149d8 = this.f80579b;
        return "LoadedFeedItem(sliderAd=" + lv1Var + ", adResponse=" + c30149d8 + ")";
    }
}
