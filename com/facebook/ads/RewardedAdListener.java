package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public interface RewardedAdListener {
    void onRewardedAdCompleted();

    void onRewardedAdServerFailed();

    void onRewardedAdServerSucceeded();
}
