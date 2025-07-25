package com.pubmatic.sdk.nativead;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.POBError;

@MainThread
/* loaded from: classes7.dex */
public interface POBNativeAdLoaderListener {
    void onAdReceived(@NonNull POBNativeAdLoader pOBNativeAdLoader, @NonNull POBNativeAd pOBNativeAd);

    void onFailedToLoad(@NonNull POBNativeAdLoader pOBNativeAdLoader, @NonNull POBError pOBError);
}
