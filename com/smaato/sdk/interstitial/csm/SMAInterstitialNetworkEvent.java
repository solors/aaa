package com.smaato.sdk.interstitial.csm;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes7.dex */
public interface SMAInterstitialNetworkEvent {
    @NonNull
    String getNetworkName();

    boolean isValid();

    void onDestroy();

    void requestInterstitial(@NonNull Context context, @NonNull SMAInterstitialNetworkEventListener sMAInterstitialNetworkEventListener, @NonNull Map<String, String> map, @NonNull Map<String, Object> map2);

    void showAd();
}
