package com.ironsource.adapters.ironsource;

import android.text.TextUtils;
import com.ironsource.C20473mi;
import com.ironsource.InterfaceC19780dn;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class IronSourceRewardedVideoListener implements InterfaceC19780dn {
    public final String AD_VISIBLE_EVENT_NAME = "impressions";
    private final String mDemandSourceName;
    boolean mIsRvDemandOnly;
    RewardedVideoSmashListener mListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IronSourceRewardedVideoListener(RewardedVideoSmashListener rewardedVideoSmashListener, String str, boolean z) {
        this.mDemandSourceName = str;
        this.mListener = rewardedVideoSmashListener;
        this.mIsRvDemandOnly = z;
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialAdRewarded(String str, int i) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener demandSourceId=" + str + " amount=" + i);
        this.mListener.onRewardedVideoAdRewarded();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClick() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClicked();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialClose() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdClosed();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str)) {
            IronLog ironLog = IronLog.ADAPTER_CALLBACK;
            ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener eventName = " + str);
            if ("impressions".equals(str)) {
                this.mListener.onRewardedVideoAdVisible();
            }
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialInitSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener " + str);
        this.mListener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(str));
        if (!this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialLoadSuccess(C20473mi c20473mi) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        if (this.mIsRvDemandOnly) {
            this.mListener.onRewardedVideoLoadSuccess();
        } else {
            this.mListener.onRewardedVideoAvailabilityChanged(true);
        }
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialOpen() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
        this.mListener.onRewardedVideoAdOpened();
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowFailed(String str) {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + "rewardedVideoListener " + str);
        this.mListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str));
    }

    @Override // com.ironsource.InterfaceC19780dn
    public void onInterstitialShowSuccess() {
        IronLog ironLog = IronLog.ADAPTER_CALLBACK;
        ironLog.verbose(this.mDemandSourceName + " rewardedVideoListener");
    }
}
