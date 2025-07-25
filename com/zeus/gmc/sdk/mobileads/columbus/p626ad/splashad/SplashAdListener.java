package com.zeus.gmc.sdk.mobileads.columbus.p626ad.splashad;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.splashad.SplashAdListener */
/* loaded from: classes8.dex */
public interface SplashAdListener {
    void onAdClicked();

    void onAdError(SplashAdError splashAdError);

    void onAdFinish();

    void onAdLoaded();

    void onAdTick(long j);

    void onLoggingImpression();
}
