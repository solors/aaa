package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
final class RewardedInterstitialAdSample extends Activity {
    private RewardedInterstitialAd rewardedInterstitialAd;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        Moloco.createRewardedInterstitial("MOLOCO_ADUNIT_ID", null, new RewardedInterstitialAdSample$onCreate$1(this));
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RewardedInterstitialAd rewardedInterstitialAd = this.rewardedInterstitialAd;
        if (rewardedInterstitialAd == null) {
            Intrinsics.m17056y("rewardedInterstitialAd");
            rewardedInterstitialAd = null;
        }
        rewardedInterstitialAd.destroy();
    }
}
