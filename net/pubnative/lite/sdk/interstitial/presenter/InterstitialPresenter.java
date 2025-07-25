package net.pubnative.lite.sdk.interstitial.presenter;

import net.pubnative.lite.sdk.CustomEndCardListener;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.models.C38595Ad;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface InterstitialPresenter {

    /* loaded from: classes10.dex */
    public interface Listener {
        void onInterstitialClicked(InterstitialPresenter interstitialPresenter);

        void onInterstitialDismissed(InterstitialPresenter interstitialPresenter);

        void onInterstitialError(InterstitialPresenter interstitialPresenter);

        void onInterstitialLoaded(InterstitialPresenter interstitialPresenter);

        void onInterstitialShown(InterstitialPresenter interstitialPresenter);
    }

    void destroy();

    C38595Ad getAd();

    JSONObject getPlacementParams();

    boolean isReady();

    void load();

    void setCustomEndCardListener(CustomEndCardListener customEndCardListener);

    void setListener(Listener listener);

    void setVideoListener(VideoListener videoListener);

    void show();
}
