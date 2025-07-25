package com.yandex.mobile.ads.impl;

import com.vungle.ads.C29551o0;
import com.vungle.ads.internal.Constants;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class jw0 {
    @NotNull

    /* renamed from: c */
    private static final String f81164c = "com.yandex.mobile.ads.mediation";

    /* renamed from: d */
    public static final /* synthetic */ int f81165d = 0;
    @NotNull

    /* renamed from: a */
    private final String f81166a;
    @NotNull

    /* renamed from: b */
    private final List<C30677b> f81167b;

    /* renamed from: com.yandex.mobile.ads.impl.jw0$b */
    /* loaded from: classes8.dex */
    public static final class C30677b {
        @NotNull

        /* renamed from: a */
        private final String f81168a;
        @NotNull

        /* renamed from: b */
        private final String f81169b;

        public C30677b(@NotNull String format, @NotNull String className) {
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(className, "className");
            this.f81168a = format;
            this.f81169b = className;
        }

        @NotNull
        /* renamed from: a */
        public final String m32719a() {
            return this.f81169b;
        }

        @NotNull
        /* renamed from: b */
        public final String m32718b() {
            return this.f81168a;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C30677b)) {
                return false;
            }
            C30677b c30677b = (C30677b) obj;
            if (Intrinsics.m17075f(this.f81168a, c30677b.f81168a) && Intrinsics.m17075f(this.f81169b, c30677b.f81169b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f81169b.hashCode() + (this.f81168a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            String str = this.f81168a;
            String str2 = this.f81169b;
            return "MediationAdapterSignature(format=" + str + ", className=" + str2 + ")";
        }
    }

    public jw0(@NotNull String name, @NotNull List<C30677b> adapters) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        this.f81166a = name;
        this.f81167b = adapters;
    }

    @NotNull
    /* renamed from: b */
    public final List<C30677b> m32723b() {
        return this.f81167b;
    }

    @NotNull
    /* renamed from: c */
    public final String m32722c() {
        return this.f81166a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw0)) {
            return false;
        }
        jw0 jw0Var = (jw0) obj;
        if (Intrinsics.m17075f(this.f81166a, jw0Var.f81166a) && Intrinsics.m17075f(this.f81167b, jw0Var.f81167b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f81167b.hashCode() + (this.f81166a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f81166a;
        List<C30677b> list = this.f81167b;
        return "MediationNetwork(name=" + str + ", adapters=" + list + ")";
    }

    /* renamed from: com.yandex.mobile.ads.impl.jw0$a */
    /* loaded from: classes8.dex */
    public static final class C30676a {
        @NotNull
        /* renamed from: a */
        public static List m32721a() {
            List m17163p;
            List m17163p2;
            List m17163p3;
            List m17163p4;
            List m17163p5;
            List m17163p6;
            List m17163p7;
            List m17163p8;
            List m17163p9;
            List m17163p10;
            List m17163p11;
            List m17163p12;
            List m17163p13;
            List m17163p14;
            List m17163p15;
            List m17163p16;
            List m17163p17;
            m17163p = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "AdColonyBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "AdColonyInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "AdColonyRewardedAdapter")));
            jw0 jw0Var = new jw0("AdColony", m17163p);
            m17163p2 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "AppLovinBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "AppLovinInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "AppLovinRewardedAdapter")));
            jw0 jw0Var2 = new jw0("AppLovin", m17163p2);
            m17163p3 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "AppNextBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "AppNextInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "AppNextNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "AppNextRewardedAdapter")));
            jw0 jw0Var3 = new jw0("Appnext", m17163p3);
            m17163p4 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "BigoAdsBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "BigoAdsInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "BigoAdsNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "BigoAdsRewardedAdapter")));
            jw0 jw0Var4 = new jw0("BigoAds", m17163p4);
            m17163p5 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "ChartboostBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "ChartboostInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "ChartboostRewardedAdapter")));
            jw0 jw0Var5 = new jw0("Chartboost", m17163p5);
            m17163p6 = C37563v.m17163p(new C30677b("AppOpen", m32720a(Constants.PLACEMENT_TYPE_APP_OPEN, "AdMobAppOpenAdAdapter")), new C30677b("Banner", m32720a("banner", "AdMobBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "AdMobInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "AdMobNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "AdMobRewardedAdapter")));
            jw0 jw0Var6 = new jw0("AdMob", m17163p6);
            m17163p7 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "AdManagerBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "AdManagerInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "AdManagerNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "AdManagerRewardedAdapter")));
            jw0 jw0Var7 = new jw0("AdManager", m17163p7);
            m17163p8 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "InMobiBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "InMobiInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "InMobiRewardedAdapter")));
            jw0 jw0Var8 = new jw0("InMobi", m17163p8);
            m17163p9 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "IronSourceBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "IronSourceInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "IronSourceRewardedAdapter")));
            jw0 jw0Var9 = new jw0("IronSource", m17163p9);
            m17163p10 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "MintegralBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "MintegralInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "MintegralNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "MintegralRewardedAdapter")));
            jw0 jw0Var10 = new jw0("Mintegral", m17163p10);
            m17163p11 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "MyTargetBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "MyTargetInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "MyTargetNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "MyTargetRewardedAdapter")));
            jw0 jw0Var11 = new jw0("MyTarget", m17163p11);
            m17163p12 = C37563v.m17163p(new C30677b("Interstitial", m32720a("interstitial", "PangleInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "PangleRewardedAdapter")));
            jw0 jw0Var12 = new jw0("Pangle", m17163p12);
            m17163p13 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "StartAppBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "StartAppInterstitialAdapter")), new C30677b("Native", m32720a("nativeads", "StartAppNativeAdapter")), new C30677b("Rewarded", m32720a("rewarded", "StartAppRewardedAdapter")));
            jw0 jw0Var13 = new jw0("StartApp", m17163p13);
            m17163p14 = C37563v.m17163p(new C30677b("Interstitial", m32720a("interstitial", "TapJoyInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "TapJoyRewardedAdapter")));
            jw0 jw0Var14 = new jw0("TapJoy", m17163p14);
            m17163p15 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "UnityAdsBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "UnityAdsInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "UnityAdsRewardedAdapter")));
            jw0 jw0Var15 = new jw0("UnityAds", m17163p15);
            m17163p16 = C37563v.m17163p(new C30677b("Banner", m32720a("banner", "VungleBannerAdapter")), new C30677b("Interstitial", m32720a("interstitial", "VungleInterstitialAdapter")), new C30677b("Rewarded", m32720a("rewarded", "VungleRewardedAdapter")));
            m17163p17 = C37563v.m17163p(jw0Var, jw0Var2, jw0Var3, jw0Var4, jw0Var5, jw0Var6, jw0Var7, jw0Var8, jw0Var9, jw0Var10, jw0Var11, jw0Var12, jw0Var13, jw0Var14, jw0Var15, new jw0(C29551o0.OMSDK_PARTNER_NAME, m17163p16));
            return m17163p17;
        }

        /* renamed from: a */
        private static String m32720a(String str, String str2) {
            String str3 = jw0.f81164c;
            return str3 + "." + str + "." + str2;
        }
    }
}
