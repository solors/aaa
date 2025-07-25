package com.moloco.sdk.publisher;

import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
final class InterstitialAdActivitySample extends Activity {
    private InterstitialAd interstitialAd;

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle, @Nullable PersistableBundle persistableBundle) {
        super.onCreate(bundle, persistableBundle);
        Moloco.createInterstitial$default("MOLOCO_ADUNIT_ID", null, new InterstitialAdActivitySample$onCreate$1(this), 2, null);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterstitialAd interstitialAd = this.interstitialAd;
        if (interstitialAd == null) {
            Intrinsics.m17056y("interstitialAd");
            interstitialAd = null;
        }
        interstitialAd.destroy();
    }
}
