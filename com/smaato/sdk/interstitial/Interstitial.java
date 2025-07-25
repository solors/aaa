package com.smaato.sdk.interstitial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.SmaatoSdk;
import com.smaato.sdk.core.p568ad.AdRequestParams;
import com.smaato.sdk.core.util.LogUtil;
import com.smaato.sdk.interstitial.view.InterstitialAdDelegate;

/* loaded from: classes7.dex */
public final class Interstitial extends InterstitialBase {
    private Interstitial() {
    }

    public static void loadAd(@NonNull String str, @NonNull EventListener eventListener) {
        loadAd(str, eventListener, null);
    }

    public static void loadAd(@NonNull String str, @NonNull EventListener eventListener, @Nullable AdRequestParams adRequestParams) {
        loadAd(str, eventListener, adRequestParams, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadAd(@NonNull String str, @NonNull EventListener eventListener, @Nullable AdRequestParams adRequestParams, boolean z) {
        if (!SmaatoSdk.isSmaatoSdkInitialised()) {
            LogUtil.logSmaatoInitMissing();
            if (eventListener != null) {
                eventListener.onAdFailedToLoad(new InterstitialRequestError(InterstitialError.SDK_INITIALISATION_ERROR, str, SmaatoSdk.getPublisherId()));
                return;
            }
            return;
        }
        new InterstitialAdDelegate().loadAd(str, eventListener, InterstitialBase.mediationNetworkName, InterstitialBase.mediationNetworkSDKVersion, InterstitialBase.mediationAdapterVersion, adRequestParams, InterstitialBase.keyValuePairs, InterstitialBase.objectExtras, z);
    }
}
