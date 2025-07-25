package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.at */
/* loaded from: classes6.dex */
public final class C19598at {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20984ss f49188a;

    @Metadata
    /* renamed from: com.ironsource.at$a */
    /* loaded from: classes6.dex */
    public static final class C19599a implements LevelPlayInterstitialListener {
        C19599a() {
            C19598at.this = r1;
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClicked(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdClicked", IronSource.AD_UNIT.INTERSTITIAL, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdClosed(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdClosed", IronSource.AD_UNIT.INTERSTITIAL, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            String str;
            C19598at c19598at = C19598at.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            C19853et c19853et = C19853et.f49957a;
            Object[] objArr = new Object[1];
            if (ironSourceError != null) {
                str = ironSourceError.getErrorMessage();
            } else {
                str = null;
            }
            objArr[0] = str;
            c19598at.m59394a(C19658bt.f49339b, ad_unit, c19853et.m58746a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdOpened(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49340c, IronSource.AD_UNIT.INTERSTITIAL, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdReady(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49338a, IronSource.AD_UNIT.INTERSTITIAL, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowFailed(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            String str;
            C19598at c19598at = C19598at.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
            C19853et c19853et = C19853et.f49957a;
            Object[] objArr = new Object[2];
            if (ironSourceError != null) {
                str = ironSourceError.getErrorMessage();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = adInfo;
            c19598at.m59394a(C19658bt.f49342e, ad_unit, c19853et.m58746a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener
        public void onAdShowSucceeded(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49341d, IronSource.AD_UNIT.INTERSTITIAL, C19853et.f49957a.m58746a(adInfo));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.at$b */
    /* loaded from: classes6.dex */
    public static final class C19600b implements LevelPlayRewardedVideoManualListener, LevelPlayRewardedVideoListener {
        C19600b() {
            C19598at.this = r1;
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdAvailable(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49345h, IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClicked(@Nullable Placement placement, @Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdClicked", IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(C21333zs.f54830a.m53728a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdClosed(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdClosed", IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            String str;
            C19598at c19598at = C19598at.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            C19853et c19853et = C19853et.f49957a;
            Object[] objArr = new Object[1];
            if (ironSourceError != null) {
                str = ironSourceError.getErrorMessage();
            } else {
                str = null;
            }
            objArr[0] = str;
            c19598at.m59394a(C19658bt.f49339b, ad_unit, c19853et.m58746a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdOpened(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49340c, IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener
        public void onAdReady(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49338a, IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdRewarded(@Nullable Placement placement, @Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49346i, IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(C21333zs.f54830a.m53728a(placement), adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener
        public void onAdShowFailed(@Nullable IronSourceError ironSourceError, @Nullable AdInfo adInfo) {
            String str;
            C19598at c19598at = C19598at.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.REWARDED_VIDEO;
            C19853et c19853et = C19853et.f49957a;
            Object[] objArr = new Object[2];
            if (ironSourceError != null) {
                str = ironSourceError.getErrorMessage();
            } else {
                str = null;
            }
            objArr[0] = str;
            objArr[1] = adInfo;
            c19598at.m59394a(C19658bt.f49342e, ad_unit, c19853et.m58746a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener
        public void onAdUnavailable() {
            C19598at.this.m59394a(C19658bt.f49351n, IronSource.AD_UNIT.REWARDED_VIDEO, C19853et.f49957a.m58746a(new Object[0]));
        }
    }

    @Metadata
    /* renamed from: com.ironsource.at$c */
    /* loaded from: classes6.dex */
    public static final class C19601c implements LevelPlayBannerListener {
        C19601c() {
            C19598at.this = r1;
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdClicked(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdClicked", IronSource.AD_UNIT.BANNER, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLeftApplication(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49348k, IronSource.AD_UNIT.BANNER, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoadFailed(@Nullable IronSourceError ironSourceError) {
            String str;
            C19598at c19598at = C19598at.this;
            IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.BANNER;
            C19853et c19853et = C19853et.f49957a;
            Object[] objArr = new Object[1];
            if (ironSourceError != null) {
                str = ironSourceError.getErrorMessage();
            } else {
                str = null;
            }
            objArr[0] = str;
            c19598at.m59394a(C19658bt.f49339b, ad_unit, c19853et.m58746a(objArr));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdLoaded(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a("onAdLoaded", IronSource.AD_UNIT.BANNER, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenDismissed(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49350m, IronSource.AD_UNIT.BANNER, C19853et.f49957a.m58746a(adInfo));
        }

        @Override // com.ironsource.mediationsdk.sdk.LevelPlayBannerListener
        public void onAdScreenPresented(@Nullable AdInfo adInfo) {
            C19598at.this.m59394a(C19658bt.f49349l, IronSource.AD_UNIT.BANNER, C19853et.f49957a.m58746a(adInfo));
        }
    }

    public C19598at(@NotNull InterfaceC20984ss javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f49188a = javaScriptEvaluator;
    }

    /* renamed from: b */
    private final void m59393b() {
        C21333zs c21333zs = C21333zs.f54830a;
        c21333zs.m53726a((LevelPlayInterstitialListener) null);
        c21333zs.m53725a((LevelPlayRewardedVideoBaseListener) null);
        c21333zs.m53727a((LevelPlayBannerListener) null);
    }

    /* renamed from: c */
    private final void m59392c() {
        C21333zs.f54830a.m53708i();
    }

    /* renamed from: a */
    public final void m59396a() {
        m59393b();
        m59392c();
    }

    /* renamed from: d */
    public final void m59391d() {
        C21333zs c21333zs = C21333zs.f54830a;
        c21333zs.m53726a(new C19599a());
        c21333zs.m53725a(new C19600b());
        c21333zs.m53727a(new C19601c());
    }

    /* renamed from: a */
    public final void m59394a(String str, IronSource.AD_UNIT ad_unit, List<? extends Object> list) {
        this.f49188a.mo54892a(str, ad_unit, list);
    }
}
