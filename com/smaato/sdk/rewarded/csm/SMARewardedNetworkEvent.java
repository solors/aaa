package com.smaato.sdk.rewarded.csm;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes7.dex */
public interface SMARewardedNetworkEvent {
    @NonNull
    String getNetworkName();

    boolean isValid();

    void onDestroy();

    void requestRewardedInterstitial(@NonNull Context context, @NonNull SMARewardedNetworkEventListener sMARewardedNetworkEventListener, @NonNull Map<String, String> map, @NonNull Map<String, Object> map2);

    void showAd();
}
