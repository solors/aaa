package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class IronSource {

    /* loaded from: classes6.dex */
    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        BANNER("banner"),
        NATIVE_AD("nativeAd");
        

        /* renamed from: a */
        private String f51244a;

        AD_UNIT(String str) {
            this.f51244a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f51244a;
        }
    }

    public static void addImpressionDataListener(@NotNull ImpressionDataListener impressionDataListener) {
        C20423p.m56615m().mo54798b(impressionDataListener);
    }

    public static void clearRewardedVideoServerParameters() {
        C20423p.m56615m().mo54643b();
    }

    @Deprecated
    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        return C20423p.m56615m().m56660b(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        return C20423p.m56615m().mo56717a(activity, iSBannerSize);
    }

    @Deprecated
    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C20423p.m56615m().m56696a(ironSourceBannerLayout);
    }

    public static void destroyISDemandOnlyBanner(String str) {
        C20423p.m56615m().mo56641c(str);
    }

    public static String getAdvertiserId(Context context) {
        return C20423p.m56615m().mo54642b(context);
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String mo56712a;
        synchronized (IronSource.class) {
            mo56712a = C20423p.m56615m().mo56712a(context);
        }
        return mo56712a;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C20423p.m56615m().mo54638g(str);
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C20423p.m56615m().mo54636i(str);
    }

    public static void init(Context context, String str) {
        init(context, str, (AD_UNIT[]) null);
    }

    @Deprecated
    public static void initISDemandOnly(@NotNull Context context, String str, AD_UNIT... ad_unitArr) {
        C20423p.m56615m().mo56706a(context, str, ad_unitArr);
    }

    @Deprecated
    public static boolean isBannerPlacementCapped(String str) {
        return C20423p.m56615m().m56606q(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C20423p.m56615m().mo56628f(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C20423p.m56615m().mo56620j(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C20423p.m56615m().m56604r(str);
    }

    public static boolean isInterstitialReady() {
        return C20423p.m56615m().m56741F();
    }

    public static boolean isRewardedVideoAvailable() {
        return C20423p.m56615m().m56736K();
    }

    public static boolean isRewardedVideoPlacementCapped(String str) {
        return C20423p.m56615m().m56602s(str);
    }

    public static void launchTestSuite(@NotNull Context context) {
        C20423p.m56615m().m56642c(context);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C20423p.m56615m().m56652b(ironSourceBannerLayout);
    }

    public static void loadISDemandOnlyBanner(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C20423p.m56615m().mo56716a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(@NotNull Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C20423p.m56615m().mo56715a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(@NotNull Activity activity, String str) {
        C20423p.m56615m().mo56714a(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(@NotNull Activity activity, String str, String str2) {
        C20423p.m56615m().mo56658b(activity, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(@NotNull Activity activity, String str) {
        C20423p.m56615m().mo56659b(activity, str);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(@NotNull Activity activity, String str, String str2) {
        C20423p.m56615m().mo56713a(activity, str, str2);
    }

    public static void loadInterstitial() {
        C20423p.m56615m().m56731P();
    }

    public static void loadRewardedVideo() {
        C20423p.m56615m().m56730Q();
    }

    public static void onPause(Activity activity) {
        C20423p.m56615m().m56718a(activity);
    }

    public static void onResume(Activity activity) {
        C20423p.m56615m().m56661b(activity);
    }

    public static void removeImpressionDataListener(@NotNull ImpressionDataListener impressionDataListener) {
        C20423p.m56615m().mo54799a(impressionDataListener);
    }

    public static void removeInterstitialListener() {
        C20423p.m56615m().mo54640d();
    }

    public static void removeRewardedVideoListener() {
        C20423p.m56615m().mo54641c();
    }

    public static void setAdRevenueData(@NotNull String str, @NotNull JSONObject jSONObject) {
        C20423p.m56615m().m56671a(str, jSONObject);
    }

    public static void setAdaptersDebug(boolean z) {
        C20423p.m56615m().mo54644a(z);
    }

    public static void setConsent(boolean z) {
        C20423p.m56615m().m56646b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C20423p.m56615m().mo54639e(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C20423p.m56615m().mo56693a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C20423p.m56615m().mo56692a(iSDemandOnlyRewardedVideoListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C20423p.m56615m().m56684a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        C20423p.m56615m().m56683a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        C20423p.m56615m().m56682a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        C20423p.m56615m().mo56688a(logListener);
    }

    public static void setMediationType(String str) {
        C20423p.m56615m().mo54637h(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C20423p.m56615m().m56672a(str, arrayList);
    }

    public static void setNetworkData(@NotNull String str, @NotNull JSONObject jSONObject) {
        C20423p.m56615m().m56649b(str, jSONObject);
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C20423p.m56615m().mo54645a(map);
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C20423p.m56615m().m56694a(ironSourceSegment);
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C20423p.m56615m().m56681a(segmentListener);
    }

    public static void setUserId(String str) {
        C20423p.m56615m().m56600t(str);
    }

    public static void setWaterfallConfiguration(@NotNull WaterfallConfiguration waterfallConfiguration, @NotNull AD_UNIT ad_unit) {
        C20423p.m56615m().m56699a(ad_unit, waterfallConfiguration);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C20423p.m56615m().mo54646a(context, z);
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C20423p.m56615m().mo56650b(str);
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C20423p.m56615m().mo56678a(str);
    }

    public static void showInterstitial() {
        C20423p.m56615m().m56644c((Activity) null);
    }

    public static void showRewardedVideo() {
        C20423p.m56615m().m56638d((Activity) null);
    }

    public static void init(Context context, String str, InitializationListener initializationListener) {
        init(context, str, initializationListener, null);
    }

    @Deprecated
    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C20423p.m56615m().m56695a(ironSourceBannerLayout, str);
    }

    public static void setMetaData(String str, List<String> list) {
        C20423p.m56615m().m56672a(str, list);
    }

    public static void showInterstitial(@NotNull Activity activity) {
        C20423p.m56615m().m56644c(activity);
    }

    public static void showRewardedVideo(@NotNull Activity activity) {
        C20423p.m56615m().m56638d(activity);
    }

    public static void init(Context context, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        C20423p.m56615m().m56708a(context, str, false, initializationListener, ad_unitArr);
    }

    public static void showInterstitial(@NotNull Activity activity, String str) {
        C20423p.m56615m().m56643c(activity, str);
    }

    public static void showRewardedVideo(@NotNull Activity activity, String str) {
        C20423p.m56615m().m56629f(activity, str);
    }

    public static void init(Context context, String str, AD_UNIT... ad_unitArr) {
        C20423p.m56615m().m56708a(context, str, false, (InitializationListener) null, ad_unitArr);
    }

    public static void showInterstitial(String str) {
        C20423p.m56615m().m56643c(null, str);
    }

    public static void showRewardedVideo(String str) {
        C20423p.m56615m().m56629f(null, str);
    }
}
