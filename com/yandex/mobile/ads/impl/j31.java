package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class j31 {
    @NotNull

    /* renamed from: a */
    private final C30705k7 f80734a;
    @NotNull

    /* renamed from: b */
    private final o61 f80735b;
    @NotNull

    /* renamed from: c */
    private final r61 f80736c;
    @NotNull

    /* renamed from: d */
    private final zl1<n31> f80737d;

    /* renamed from: e */
    private final int f80738e;

    public j31(@NotNull C30705k7 adRequestData, @NotNull o61 nativeResponseType, @NotNull r61 sourceType, @NotNull zl1<n31> requestPolicy, int i) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        Intrinsics.checkNotNullParameter(nativeResponseType, "nativeResponseType");
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f80734a = adRequestData;
        this.f80735b = nativeResponseType;
        this.f80736c = sourceType;
        this.f80737d = requestPolicy;
        this.f80738e = i;
    }

    @NotNull
    /* renamed from: a */
    public final C30705k7 m33052a() {
        return this.f80734a;
    }

    /* renamed from: b */
    public final int m33051b() {
        return this.f80738e;
    }

    @NotNull
    /* renamed from: c */
    public final o61 m33050c() {
        return this.f80735b;
    }

    @NotNull
    /* renamed from: d */
    public final zl1<n31> m33049d() {
        return this.f80737d;
    }

    @NotNull
    /* renamed from: e */
    public final r61 m33048e() {
        return this.f80736c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j31)) {
            return false;
        }
        j31 j31Var = (j31) obj;
        if (Intrinsics.m17075f(this.f80734a, j31Var.f80734a) && this.f80735b == j31Var.f80735b && this.f80736c == j31Var.f80736c && Intrinsics.m17075f(this.f80737d, j31Var.f80737d) && this.f80738e == j31Var.f80738e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f80735b.hashCode();
        int hashCode2 = this.f80736c.hashCode();
        int hashCode3 = this.f80737d.hashCode();
        return Integer.hashCode(this.f80738e) + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f80734a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        C30705k7 c30705k7 = this.f80734a;
        o61 o61Var = this.f80735b;
        r61 r61Var = this.f80736c;
        zl1<n31> zl1Var = this.f80737d;
        int i = this.f80738e;
        return "NativeAdRequestData(adRequestData=" + c30705k7 + ", nativeResponseType=" + o61Var + ", sourceType=" + r61Var + ", requestPolicy=" + zl1Var + ", adsCount=" + i + ")";
    }
}
