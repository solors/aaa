package com.meevii.adsdk.core;

import androidx.annotation.Keep;
import com.meevii.adsdk.common.util.AdError;

@Keep
/* loaded from: classes6.dex */
public interface AdListener {
    void onAdClicked(String str);

    void onAdClose(String str);

    void onAdUnitError(String str, AdError adError);

    void onAdUnitLoaded(String str);

    void onImpression(String str);

    void onRewardedVideoCompleted(String str);
}
