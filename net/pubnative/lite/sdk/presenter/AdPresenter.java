package net.pubnative.lite.sdk.presenter;

import android.view.View;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.mraid.MRAIDViewListener;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface AdPresenter {

    /* loaded from: classes10.dex */
    public interface ImpressionListener {
        void onImpression();
    }

    /* loaded from: classes10.dex */
    public interface Listener {
        void onAdClicked(AdPresenter adPresenter);

        void onAdError(AdPresenter adPresenter);

        void onAdLoaded(AdPresenter adPresenter, View view);
    }

    void destroy();

    C38595Ad getAd();

    JSONObject getPlacementParams();

    void load();

    void setImpressionListener(ImpressionListener impressionListener);

    void setListener(Listener listener);

    void setMRaidListener(MRAIDViewListener mRAIDViewListener);

    void setVideoListener(VideoListener videoListener);

    void startTracking();

    void stopTracking();
}
