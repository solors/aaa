package net.pubnative.lite.sdk.rewarded.presenter;

import net.pubnative.lite.sdk.CustomEndCardListener;
import net.pubnative.lite.sdk.VideoListener;
import net.pubnative.lite.sdk.models.C38595Ad;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface RewardedPresenter {

    /* loaded from: classes10.dex */
    public interface Listener {
        void onRewardedClicked(RewardedPresenter rewardedPresenter);

        void onRewardedClosed(RewardedPresenter rewardedPresenter);

        void onRewardedError(RewardedPresenter rewardedPresenter);

        void onRewardedFinished(RewardedPresenter rewardedPresenter);

        void onRewardedLoaded(RewardedPresenter rewardedPresenter);

        void onRewardedOpened(RewardedPresenter rewardedPresenter);
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
