package com.smaato.sdk.banner.csm;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes7.dex */
public interface SMABannerNetworkEventListener {
    void onAdClicked();

    void onAdFailedToLoad();

    void onAdLoaded(@NonNull View view);

    void onAdTTLExpired();
}
