package com.ironsource;

import org.json.JSONObject;

/* renamed from: com.ironsource.dn */
/* loaded from: classes6.dex */
public interface InterfaceC19780dn extends InterfaceC19592an {
    void onInterstitialAdRewarded(String str, int i);

    void onInterstitialClick();

    void onInterstitialClose();

    void onInterstitialEventNotificationReceived(String str, JSONObject jSONObject);

    void onInterstitialInitFailed(String str);

    void onInterstitialInitSuccess();

    void onInterstitialLoadFailed(String str);

    void onInterstitialLoadSuccess(C20473mi c20473mi);

    void onInterstitialOpen();

    void onInterstitialShowFailed(String str);

    void onInterstitialShowSuccess();
}
