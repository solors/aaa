package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zu */
/* loaded from: classes8.dex */
public final class C32017zu {
    @NotNull

    /* renamed from: a */
    private final String f89116a;
    @NotNull

    /* renamed from: b */
    private final String f89117b;
    @NotNull

    /* renamed from: c */
    private final String f89118c;

    public C32017zu(@NotNull String name, @NotNull String format, @NotNull String adUnitId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f89116a = name;
        this.f89117b = format;
        this.f89118c = adUnitId;
    }

    @NotNull
    /* renamed from: a */
    public final String m25992a() {
        return this.f89118c;
    }

    @NotNull
    /* renamed from: b */
    public final String m25991b() {
        return this.f89117b;
    }

    @NotNull
    /* renamed from: c */
    public final String m25990c() {
        return this.f89116a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32017zu)) {
            return false;
        }
        C32017zu c32017zu = (C32017zu) obj;
        if (Intrinsics.m17075f(this.f89116a, c32017zu.f89116a) && Intrinsics.m17075f(this.f89117b, c32017zu.f89117b) && Intrinsics.m17075f(this.f89118c, c32017zu.f89118c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f89118c.hashCode() + C31014o3.m31189a(this.f89117b, this.f89116a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f89116a;
        String str2 = this.f89117b;
        String str3 = this.f89118c;
        return "DebugPanelAdUnitData(name=" + str + ", format=" + str2 + ", adUnitId=" + str3 + ")";
    }
}
