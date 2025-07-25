package com.five_corp.p372ad;

import androidx.annotation.NonNull;

/* renamed from: com.five_corp.ad.FiveAdVideoRewardEventListener */
/* loaded from: classes4.dex */
public interface FiveAdVideoRewardEventListener {
    void onReward(@NonNull FiveAdVideoReward fiveAdVideoReward);

    void onViewError(@NonNull FiveAdVideoReward fiveAdVideoReward, @NonNull FiveAdErrorCode fiveAdErrorCode);

    default void onClick(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenClose(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onFullScreenOpen(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onImpression(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPause(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onPlay(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }

    default void onViewThrough(@NonNull FiveAdVideoReward fiveAdVideoReward) {
    }
}
