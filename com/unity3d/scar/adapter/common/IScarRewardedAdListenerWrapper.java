package com.unity3d.scar.adapter.common;

/* renamed from: com.unity3d.scar.adapter.common.i */
/* loaded from: classes7.dex */
public interface IScarRewardedAdListenerWrapper extends IScarAdListenerWrapper {
    void onAdFailedToShow(int i, String str);

    void onAdImpression();

    void onUserEarnedReward();
}
