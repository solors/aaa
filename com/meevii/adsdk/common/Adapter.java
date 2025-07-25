package com.meevii.adsdk.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Looper;
import android.view.ViewGroup;
import com.meevii.adsdk.common.AppStatus;
import com.meevii.adsdk.common.util.AdError;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class Adapter implements UnProguard, AppStatus.AppStatusListener {

    /* loaded from: classes6.dex */
    public interface IAdLoadListener {
        void onLoadError(String str, String str2, AdError adError);

        void onLoadSuccess(String str, String str2, Bundle bundle);

        void onNetworkRequest(String str, String str2);
    }

    /* loaded from: classes6.dex */
    public interface IAdShowListener {
        void onADAction(int i, String str, String str2, Bundle bundle);

        void onADClick(String str, String str2, Bundle bundle);

        void onADClose(String str, String str2, Bundle bundle);

        void onADShow(String str, String str2, boolean z);

        void onADShowReceived(String str, String str2, boolean z, Bundle bundle);

        void onRewardedVideoCompleted(String str, String str2, Bundle bundle);

        void onShowError(String str, String str2, AdError adError, Bundle bundle);
    }

    public boolean canLoad(String str) {
        return true;
    }

    public abstract String getPlatform();

    public abstract String getPlatformVersion();

    public abstract boolean isValid(String str);

    protected boolean mainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onBackToForeground() {
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onBackground() {
    }

    public void destroyCacheAd(String str) {
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onActivityCreated(Activity activity) {
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.meevii.adsdk.common.AppStatus.AppStatusListener
    public void onActivityResumed(Activity activity) {
    }

    public void pauseBanner(String str) {
    }

    public void resumeBanner(String str) {
    }

    public void setConsent(boolean z) {
    }

    public void loadAppOpenAd(RequestAd requestAd, IAdLoadListener iAdLoadListener) {
    }

    public void loadInterstitialAd(RequestAd requestAd, IAdLoadListener iAdLoadListener) {
    }

    public void loadNativeAd(RequestAd requestAd, IAdLoadListener iAdLoadListener) {
    }

    public void loadRewardedVideoAd(RequestAd requestAd, IAdLoadListener iAdLoadListener) {
    }

    public void showAppOpenAd(String str, IAdShowListener iAdShowListener) {
    }

    public void showInterstitialAd(String str, IAdShowListener iAdShowListener) {
    }

    public void showRewardedVideoAd(String str, IAdShowListener iAdShowListener) {
    }

    public void loadBannerAd(RequestAd requestAd, BannerSize bannerSize, IAdLoadListener iAdLoadListener) {
    }

    public void showBannerAd(String str, ViewGroup viewGroup, IAdShowListener iAdShowListener) {
    }

    public void init(Application application, String str, Map<String, Object> map, IInitListener iInitListener) {
    }

    public void setBiddingResult(String str, boolean z, Platform platform, double d) {
    }

    public void showNativeAd(String str, ViewGroup viewGroup, int i, IAdShowListener iAdShowListener) {
    }
}
