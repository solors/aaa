package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.l9 */
/* loaded from: classes6.dex */
public final class C20255l9 {
    @NotNull

    /* renamed from: a */
    private final String f50968a;
    @NotNull

    /* renamed from: b */
    private final String f50969b;
    @NotNull

    /* renamed from: c */
    private final String f50970c;
    @NotNull

    /* renamed from: d */
    private final String f50971d;

    public C20255l9() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C20255l9 m57522a(C20255l9 c20255l9, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20255l9.f50968a;
        }
        if ((i & 2) != 0) {
            str2 = c20255l9.f50969b;
        }
        if ((i & 4) != 0) {
            str3 = c20255l9.f50970c;
        }
        if ((i & 8) != 0) {
            str4 = c20255l9.f50971d;
        }
        return c20255l9.m57521a(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: b */
    public final String m57520b() {
        return this.f50969b;
    }

    @NotNull
    /* renamed from: c */
    public final String m57519c() {
        return this.f50970c;
    }

    @NotNull
    /* renamed from: d */
    public final String m57518d() {
        return this.f50971d;
    }

    @NotNull
    /* renamed from: e */
    public final String m57517e() {
        return this.f50971d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20255l9)) {
            return false;
        }
        C20255l9 c20255l9 = (C20255l9) obj;
        if (Intrinsics.m17075f(this.f50968a, c20255l9.f50968a) && Intrinsics.m17075f(this.f50969b, c20255l9.f50969b) && Intrinsics.m17075f(this.f50970c, c20255l9.f50970c) && Intrinsics.m17075f(this.f50971d, c20255l9.f50971d)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m57516f() {
        return this.f50970c;
    }

    @NotNull
    /* renamed from: g */
    public final String m57515g() {
        return this.f50968a;
    }

    @NotNull
    /* renamed from: h */
    public final String m57514h() {
        return this.f50969b;
    }

    public int hashCode() {
        return (((((this.f50968a.hashCode() * 31) + this.f50969b.hashCode()) * 31) + this.f50970c.hashCode()) * 31) + this.f50971d.hashCode();
    }

    @NotNull
    public String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.f50968a + ", customRewardedVideoAdapterName=" + this.f50969b + ", customInterstitialAdapterName=" + this.f50970c + ", customBannerAdapterName=" + this.f50971d + ')';
    }

    public C20255l9(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.f50968a = customNetworkAdapterName;
        this.f50969b = customRewardedVideoAdapterName;
        this.f50970c = customInterstitialAdapterName;
        this.f50971d = customBannerAdapterName;
    }

    @NotNull
    /* renamed from: a */
    public final C20255l9 m57521a(@NotNull String customNetworkAdapterName, @NotNull String customRewardedVideoAdapterName, @NotNull String customInterstitialAdapterName, @NotNull String customBannerAdapterName) {
        Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new C20255l9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    public /* synthetic */ C20255l9(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    @NotNull
    /* renamed from: a */
    public final String m57523a() {
        return this.f50968a;
    }
}
