package net.pubnative.lite.sdk.api;

import net.pubnative.lite.sdk.models.AdSize;

/* loaded from: classes10.dex */
public class InterstitialRequestManager extends RequestManager {
    @Override // net.pubnative.lite.sdk.api.RequestManager
    public AdSize getAdSize() {
        return AdSize.SIZE_INTERSTITIAL;
    }
}
