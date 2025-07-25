package com.ironsource;

import androidx.compose.runtime.ComposeVersion;
import com.facebook.ads.AdError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.df */
/* loaded from: classes6.dex */
public enum EnumC19767df {
    ISErrorInitNetworkFailed(7001, "Initialization failed due to network failure."),
    ISErrorInitDecryptionFailure(AdError.LOAD_CALLED_WHILE_SHOWING_AD, "Initialization failed due to decryption failure."),
    ISErrorInitHttpRequestFailed(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, "Initialization failed due to HTTP request failure."),
    ISErrorInitInvalidResponse(AdError.INCORRECT_STATE_ERROR, "Initialization failed due to invalid response."),
    ISErrorLoadNetworkFailed(7101, "Loading failed due to network failure."),
    ISErrorLoadADMDecryptionFailure(7102, "Loading failed due to ADM decryption failure."),
    ISErrorLoadADMEmptyServerData(7103, "Loading failed due to empty server data."),
    ISErrorLoadADMEmptyWaterfall(ComposeVersion.version, "Loading failed due to empty waterfall."),
    ISErrorLoadADMInvalidJSON(7105, "Loading failed due to invalid ADM JSON."),
    ISErrorLoadADMNoAuctionID(7106, "Loading failed due to missing auction ID."),
    ISErrorLoadADMNoConfigurationForRequestedNetwork(7107, "Loading failed due to no configuration for requested network."),
    ISErrorLoadADMInvalidConfigurationForRequestedNetwork(7108, "Loading failed due to invalid configuration for requested network."),
    ISErrorLoadBiddingInNonBidding(7109, "Loading failed due to non-bidding in bidding context."),
    ISErrorLoadNullADM(7110, "Loading failed due to null ADM."),
    ISErrorLoadInstanceNotInInitResponse(7111, "Loading failed due to instance not being in init response."),
    ISErrorLoadNoAdFormatConfigurations(7112, "Loading failed due to no ad format configurations."),
    ISErrorLoadTimedOut(7113, "Loading failed due to timeout."),
    ISErrorLoadSDKNotInitialized(7115, "Loading failed due to SDK not being initialized."),
    ISErrorLoadBannerNetworkViewIsNull(7116, "Loading failed due to null network banner view."),
    ISErrorLoadBannerSizeIsNull(7117, "Loading failed because the banner size is null."),
    ISErrorLoadBannerNotSupportedSize(7118, "Loading failed due to banner size not supported."),
    ISErrorShowNetworkFailed(7201, "Showing ad failed due to network failure."),
    ISErrorShowNotReadyToShowAd(7202, "Showing ad failed because the ad is not ready to show."),
    ISErrorInterstitialLoadNoConfig(10000, "Load failed due to no config"),
    ISErrorBannerLoadNoConfig(10001, "Load failed due to no config"),
    ISErrorRewardedLoadNoConfig(Sdk$SDKError.EnumC29425b.AD_LOAD_TOO_FREQUENTLY_VALUE, "Load failed due to no config");
    

    /* renamed from: a */
    private final int f49773a;
    @NotNull

    /* renamed from: b */
    private final String f49774b;

    EnumC19767df(int i, String str) {
        this.f49773a = i;
        this.f49774b = str;
    }

    /* renamed from: b */
    public final int m58945b() {
        return this.f49773a;
    }

    @NotNull
    /* renamed from: c */
    public final String m58944c() {
        return this.f49774b;
    }
}
