package io.bidmachine.rewarded;

import android.content.Context;
import androidx.annotation.NonNull;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedFullscreenAd;

/* loaded from: classes9.dex */
public final class RewardedAd extends FullScreenAd<RewardedAd, RewardedRequest, FullScreenAdObject<RewardedRequest>, RewardedListener> {
    public RewardedAd(@NonNull Context context) {
        super(context, AdsType.Rewarded);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.BidMachineAd
    public FullScreenAdObject<RewardedRequest> createAdObject(@NonNull ContextProvider contextProvider, @NonNull RewardedRequest rewardedRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedFullscreenAd createRewarded = networkAdapter.createRewarded();
        if (createRewarded == null) {
            return null;
        }
        return new FullScreenAdObject<>(contextProvider, adProcessCallback, rewardedRequest, adObjectParams, createRewarded);
    }
}
