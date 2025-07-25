package net.pubnative.lite.sdk.interstitial;

import android.app.Activity;
import net.pubnative.lite.sdk.interstitial.HyBidInterstitialAd;

/* loaded from: classes10.dex */
public class PNInterstitialAd extends HyBidInterstitialAd {

    /* loaded from: classes10.dex */
    public interface Listener extends HyBidInterstitialAd.Listener {
    }

    public PNInterstitialAd(Activity activity, String str, Listener listener) {
        super(activity, str, (HyBidInterstitialAd.Listener) listener);
    }
}
