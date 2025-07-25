package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes2.dex */
public class AppLovinRewardedInterstitialAd {

    /* renamed from: a */
    private final AppLovinIncentivizedInterstitial f4569a;

    /* renamed from: b */
    private AppLovinAdDisplayListener f4570b;

    /* renamed from: c */
    private AppLovinAdClickListener f4571c;

    /* renamed from: d */
    private AppLovinAdVideoPlaybackListener f4572d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f4569a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f4571c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f4570b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f4572d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f4569a.show(appLovinAd, context, appLovinAdRewardListener, this.f4572d, this.f4570b, this.f4571c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
