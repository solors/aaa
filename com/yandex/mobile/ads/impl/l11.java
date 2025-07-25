package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class l11 {
    @NotNull

    /* renamed from: a */
    private final n31 f81666a;
    @NotNull

    /* renamed from: b */
    private final C30149d8<?> f81667b;
    @NotNull

    /* renamed from: c */
    private final C30359g3 f81668c;

    public l11(@NotNull C30149d8 adResponse, @NotNull C30359g3 adConfiguration, @NotNull n31 nativeAdResponse) {
        Intrinsics.checkNotNullParameter(nativeAdResponse, "nativeAdResponse");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        this.f81666a = nativeAdResponse;
        this.f81667b = adResponse;
        this.f81668c = adConfiguration;
    }

    @NotNull
    /* renamed from: a */
    public final C30359g3 m32375a() {
        return this.f81668c;
    }

    @NotNull
    /* renamed from: b */
    public final C30149d8<?> m32374b() {
        return this.f81667b;
    }

    @NotNull
    /* renamed from: c */
    public final n31 m32373c() {
        return this.f81666a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l11)) {
            return false;
        }
        l11 l11Var = (l11) obj;
        if (Intrinsics.m17075f(this.f81666a, l11Var.f81666a) && Intrinsics.m17075f(this.f81667b, l11Var.f81667b) && Intrinsics.m17075f(this.f81668c, l11Var.f81668c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f81667b.hashCode();
        return this.f81668c.hashCode() + ((hashCode + (this.f81666a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        n31 n31Var = this.f81666a;
        C30149d8<?> c30149d8 = this.f81667b;
        C30359g3 c30359g3 = this.f81668c;
        return "NativeAdBlock(nativeAdResponse=" + n31Var + ", adResponse=" + c30149d8 + ", adConfiguration=" + c30359g3 + ")";
    }
}
