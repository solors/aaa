package com.maticoo.sdk.core;

import android.view.View;
import com.maticoo.sdk.p405ad.banner.BannerAdListener;
import com.maticoo.sdk.p405ad.interact.InteractAdListener;
import com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener;
import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.nativead.NativeAdListener;
import com.maticoo.sdk.p405ad.splash.SplashAdListener;
import com.maticoo.sdk.p405ad.utils.error.Error;
import com.maticoo.sdk.p405ad.video.RewardedVideoListener;
import com.maticoo.sdk.utils.HandlerUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class ListenerWrapper {
    private static final String INFO = "ListenerWrapperInvoker";
    private BannerAdListener mBannerListener;
    private InteractAdListener mInteractListener;
    private InterstitialAdListener mInterstitialAdListener;
    private NativeAdListener mNativeAdListener;
    private RewardedVideoListener mVideoListener;
    private SplashAdListener splashAdListener;

    /* loaded from: classes6.dex */
    public static class ProxyBannerAdListener extends BannerAdListener {
        private final BannerAdListener mListener;

        public ProxyBannerAdListener(BannerAdListener bannerAdListener) {
            this.mListener = bannerAdListener;
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdClicked(String str) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdClicked(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdClosed(String str) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdClosed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdFailed(String str, Error error) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdReady(String str, View view) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdReady(str, view);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdShow(String str) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdShow(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.banner.BannerAdListener
        public void onBannerAdShowFailed(String str, Error error) {
            BannerAdListener bannerAdListener = this.mListener;
            if (bannerAdListener != null) {
                try {
                    bannerAdListener.onBannerAdShowFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyInteractAdListener extends InteractAdListener {
        private final InteractAdListener mListener;

        public ProxyInteractAdListener(InteractAdListener interactAdListener) {
            this.mListener = interactAdListener;
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdEntranceClick(String str) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdEntranceClick(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdEntranceShowFailed(String str, Error error) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdEntranceShowFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdEntranceShowed(String str) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdEntranceShowed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdFailed(String str, Error error) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdFullScreenClose(String str) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdFullScreenClose(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdFullScreenOpenFailed(String str, Error error) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdFullScreenOpenFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdFullScreenOpened(String str) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdFullScreenOpened(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interact.InteractAdListener
        public void onInteractAdReady(String str, View view) {
            InteractAdListener interactAdListener = this.mListener;
            if (interactAdListener != null) {
                try {
                    interactAdListener.onInteractAdReady(str, view);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyInterstitialAdListener extends InterstitialAdListener {
        private final InterstitialAdListener mListener;

        public ProxyInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
            this.mListener = interstitialAdListener;
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdClicked(String str) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdClicked(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdClosed(String str) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdClosed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdDisplayFailed(String str, Error error) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdDisplayFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdDisplayed(String str) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdDisplayed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdLoadFailed(String str, Error error) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdLoadFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.interstitial.InterstitialAdListener
        public void onAdLoadSuccess(String str) {
            InterstitialAdListener interstitialAdListener = this.mListener;
            if (interstitialAdListener != null) {
                try {
                    interstitialAdListener.onAdLoadSuccess(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyNativeAdListener extends NativeAdListener {
        private final NativeAdListener mListener;

        public ProxyNativeAdListener(NativeAdListener nativeAdListener) {
            this.mListener = nativeAdListener;
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdClicked(String str) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdClicked(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdClosed(String str) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdClosed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdDisplayFailed(String str, Error error) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdDisplayFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdDisplayed(String str) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdDisplayed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdLoadFailed(String str, Error error) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdLoadFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.nativead.NativeAdListener
        public void onAdLoadSuccess(String str, NativeAd nativeAd) {
            NativeAdListener nativeAdListener = this.mListener;
            if (nativeAdListener != null) {
                try {
                    nativeAdListener.onAdLoadSuccess(str, nativeAd);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxyRewardedVideoListener extends RewardedVideoListener {
        private final RewardedVideoListener mListener;

        public ProxyRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
            this.mListener = rewardedVideoListener;
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdClicked(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdClicked(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdClosed(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdClosed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdCompleted(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdCompleted(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdLoadFailed(String str, Error error) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdLoadFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdLoadSuccess(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdLoadSuccess(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdRewarded(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdRewarded(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdShowFailed(String str, Error error) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdShowFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdShowed(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdShowed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.video.RewardedVideoListener
        public void onRewardedVideoAdStarted(String str) {
            RewardedVideoListener rewardedVideoListener = this.mListener;
            if (rewardedVideoListener != null) {
                try {
                    rewardedVideoListener.onRewardedVideoAdStarted(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public static class ProxySplashAdListener extends SplashAdListener {
        private final SplashAdListener mListener;

        public ProxySplashAdListener(SplashAdListener splashAdListener) {
            this.mListener = splashAdListener;
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdClicked(String str) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdClicked(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdClosed(String str) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdClosed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdDisplayFailed(String str, Error error) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdDisplayFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdDisplayed(String str) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdDisplayed(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdLoadFailed(String str, Error error) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdLoadFailed(str, error);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }

        @Override // com.maticoo.sdk.p405ad.splash.SplashAdListener
        public void onAdLoadSuccess(String str) {
            SplashAdListener splashAdListener = this.mListener;
            if (splashAdListener != null) {
                try {
                    splashAdListener.onAdLoadSuccess(str);
                } catch (Throwable th) {
                    DeveloperLog.LogE(ListenerWrapper.INFO, th);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean canSendCallback(Object obj) {
        if (obj != null) {
            return true;
        }
        return false;
    }

    private void sendCallback(Runnable runnable) {
        if (runnable != null) {
            HandlerUtil.runOnUiThread(runnable);
        }
    }

    public void onAdClicked(final String str) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.25
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        ListenerWrapper.this.mBannerListener.onBannerAdClicked(str);
                    }
                }
            });
        } else if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.26
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        ListenerWrapper.this.mNativeAdListener.onAdClicked(str);
                    }
                }
            });
        } else if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.27
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdClicked(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.28
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdEntranceClick(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.29
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        ListenerWrapper.this.mInterstitialAdListener.onAdClicked(str);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.30
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        ListenerWrapper.this.splashAdListener.onAdClicked(str);
                    }
                }
            });
        }
    }

    public void onAdClosed(final String str) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.31
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        BannerAdListener bannerAdListener = ListenerWrapper.this.mBannerListener;
                        ListenerWrapper.this.mBannerListener = null;
                        bannerAdListener.onBannerAdClosed(str);
                    }
                }
            });
        } else if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.32
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        NativeAdListener nativeAdListener = ListenerWrapper.this.mNativeAdListener;
                        ListenerWrapper.this.mNativeAdListener = null;
                        nativeAdListener.onAdClosed(str);
                    }
                }
            });
        } else if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.33
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        RewardedVideoListener rewardedVideoListener = ListenerWrapper.this.mVideoListener;
                        ListenerWrapper.this.mVideoListener = null;
                        rewardedVideoListener.onRewardedVideoAdClosed(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.34
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        InteractAdListener interactAdListener = ListenerWrapper.this.mInteractListener;
                        ListenerWrapper.this.mInteractListener = null;
                        interactAdListener.onInteractAdFullScreenClose(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.35
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        InterstitialAdListener interstitialAdListener = ListenerWrapper.this.mInterstitialAdListener;
                        ListenerWrapper.this.mInterstitialAdListener = null;
                        interstitialAdListener.onAdClosed(str);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.36
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        SplashAdListener splashAdListener = ListenerWrapper.this.splashAdListener;
                        ListenerWrapper.this.splashAdListener = null;
                        splashAdListener.onAdClosed(str);
                    }
                }
            });
        }
    }

    public void onAdOpenFailed(final String str, final Error error) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.19
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        ListenerWrapper.this.mBannerListener.onBannerAdShowFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.20
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        ListenerWrapper.this.mNativeAdListener.onAdDisplayFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.21
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdShowFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.22
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdFullScreenOpenFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.23
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        ListenerWrapper.this.mInterstitialAdListener.onAdDisplayFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.24
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        ListenerWrapper.this.splashAdListener.onAdDisplayFailed(str, error);
                    }
                }
            });
        }
    }

    public void onAdOpened(final String str) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.13
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        ListenerWrapper.this.mBannerListener.onBannerAdShow(str);
                    }
                }
            });
        } else if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.14
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        ListenerWrapper.this.mNativeAdListener.onAdDisplayed(str);
                    }
                }
            });
        } else if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.15
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdShowed(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.16
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdFullScreenOpened(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.17
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        ListenerWrapper.this.mInterstitialAdListener.onAdDisplayed(str);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.18
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        ListenerWrapper.this.splashAdListener.onAdDisplayed(str);
                    }
                }
            });
        }
    }

    public void onAdRewarded(final String str) {
        if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.39
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdRewarded(str);
                    }
                }
            });
        }
    }

    public void onAdVideoEnded(final String str) {
        if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.38
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdCompleted(str);
                    }
                }
            });
        }
    }

    public void onAdVideoStarted(final String str) {
        if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.37
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdStarted(str);
                    }
                }
            });
        }
    }

    public void onAdsLoadFailed(final String str, final Error error) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.7
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        ListenerWrapper.this.mBannerListener.onBannerAdFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.8
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        ListenerWrapper.this.mNativeAdListener.onAdLoadFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.9
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.10
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdLoadFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.11
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        ListenerWrapper.this.mInterstitialAdListener.onAdLoadFailed(str, error);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.12
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        ListenerWrapper.this.splashAdListener.onAdLoadFailed(str, error);
                    }
                }
            });
        }
    }

    public void onAdsLoadSuccess(final String str) {
        if (canSendCallback(this.mVideoListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.4
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mVideoListener)) {
                        ListenerWrapper.this.mVideoListener.onRewardedVideoAdLoadSuccess(str);
                    }
                }
            });
        } else if (canSendCallback(this.mInterstitialAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.5
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInterstitialAdListener)) {
                        ListenerWrapper.this.mInterstitialAdListener.onAdLoadSuccess(str);
                    }
                }
            });
        } else if (canSendCallback(this.splashAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.6
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.splashAdListener)) {
                        ListenerWrapper.this.splashAdListener.onAdLoadSuccess(str);
                    }
                }
            });
        }
    }

    public void onAdsReady(final String str, final View view) {
        if (canSendCallback(this.mBannerListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mBannerListener)) {
                        ListenerWrapper.this.mBannerListener.onBannerAdReady(str, view);
                    }
                }
            });
        } else if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdReady(str, view);
                    }
                }
            });
        }
    }

    public void onInteractAdEntranceShowFailed(final String str, final Error error) {
        if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.41
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdEntranceShowFailed(str, error);
                    }
                }
            });
        }
    }

    public void onInteractAdEntranceShowed(final String str) {
        if (canSendCallback(this.mInteractListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.40
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mInteractListener)) {
                        ListenerWrapper.this.mInteractListener.onInteractAdEntranceShowed(str);
                    }
                }
            });
        }
    }

    public void onNativeAdReady(final String str, final NativeAd nativeAd) {
        if (canSendCallback(this.mNativeAdListener)) {
            sendCallback(new Runnable() { // from class: com.maticoo.sdk.core.ListenerWrapper.3
                @Override // java.lang.Runnable
                public void run() {
                    ListenerWrapper listenerWrapper = ListenerWrapper.this;
                    if (listenerWrapper.canSendCallback(listenerWrapper.mNativeAdListener)) {
                        ListenerWrapper.this.mNativeAdListener.onAdLoadSuccess(str, nativeAd);
                    }
                }
            });
        }
    }

    public void setBannerListener(BannerAdListener bannerAdListener) {
        this.mBannerListener = new ProxyBannerAdListener(bannerAdListener);
    }

    public void setInteractAdListener(InteractAdListener interactAdListener) {
        this.mInteractListener = new ProxyInteractAdListener(interactAdListener);
    }

    public void setInterstitialAdListener(InterstitialAdListener interstitialAdListener) {
        this.mInterstitialAdListener = new ProxyInterstitialAdListener(interstitialAdListener);
    }

    public void setNativeAdLoadListener(NativeAdListener nativeAdListener) {
        this.mNativeAdListener = new ProxyNativeAdListener(nativeAdListener);
    }

    public void setSplashAdListener(SplashAdListener splashAdListener) {
        this.splashAdListener = new ProxySplashAdListener(splashAdListener);
    }

    public void setVideoListener(RewardedVideoListener rewardedVideoListener) {
        this.mVideoListener = new ProxyRewardedVideoListener(rewardedVideoListener);
    }
}
