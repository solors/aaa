package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.RewardEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public interface RewardedCallback extends DismissibleAdCallback {
    void onRewardEarned(@NotNull RewardEvent rewardEvent);
}
