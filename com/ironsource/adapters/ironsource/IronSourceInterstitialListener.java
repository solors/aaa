package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.C20473mi;
import com.ironsource.InterfaceC19780dn;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceInterstitialListener implements InterfaceC19780dn {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    private final InterstitialSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceInterstitialListener(InterstitialSmashListener interstitialSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = interstitialSmashListener;
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener demandSourceId=" + str + " amount=" + i);
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClicked();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClose() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdClosed();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " interstitialListener eventName = " + str);
            if ("impressions".equals(str)) {
                this.mListener.onInterstitialAdVisible();
            }
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError(str));
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadSuccess(C20473mi c20473mi) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdReady();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialOpen() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdOpened();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener " + str);
        this.mListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", str));
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " interstitialListener");
        this.mListener.onInterstitialAdShowSucceeded();
    }
}
