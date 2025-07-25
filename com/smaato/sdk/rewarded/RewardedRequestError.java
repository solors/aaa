package com.smaato.sdk.rewarded;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class RewardedRequestError {
    @Nullable
    private final String adSpaceId;
    @Nullable
    private final String publisherId;
    @NonNull
    private final RewardedError rewardedError;

    public RewardedRequestError(@NonNull RewardedError rewardedError, @Nullable String str, @Nullable String str2) {
        this.rewardedError = (RewardedError) Objects.requireNonNull(rewardedError);
        this.publisherId = str;
        this.adSpaceId = str2;
    }

    @Nullable
    public String getAdSpaceId() {
        return this.adSpaceId;
    }

    @Nullable
    public String getPublisherId() {
        return this.publisherId;
    }

    @NonNull
    public RewardedError getRewardedError() {
        return this.rewardedError;
    }
}
