package com.unity3d.ironsourceads.rewarded;

import android.app.Activity;
import com.ironsource.C21326zo;
import com.ironsource.InterfaceC19594ap;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class RewardedAd implements InterfaceC19594ap {
    @NotNull

    /* renamed from: a */
    private final C21326zo f74462a;
    @Nullable

    /* renamed from: b */
    private RewardedAdListener f74463b;

    public RewardedAd(@NotNull C21326zo rewardedAdInternal) {
        Intrinsics.checkNotNullParameter(rewardedAdInternal, "rewardedAdInternal");
        this.f74462a = rewardedAdInternal;
        rewardedAdInternal.m53764a(this);
    }

    @NotNull
    public final RewardedAdInfo getAdInfo() {
        return this.f74462a.m53758b();
    }

    @Nullable
    public final RewardedAdListener getListener() {
        return this.f74463b;
    }

    public final boolean isReadyToShow() {
        return this.f74462a.m53753d();
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onAdInstanceDidBecomeVisible() {
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onRewardedAdClicked() {
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onRewardedAdDismissed() {
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdDismissed(this);
        }
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onRewardedAdFailedToShow(@NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdFailedToShow(this, error);
        }
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onRewardedAdShown() {
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onRewardedAdShown(this);
        }
    }

    @Override // com.ironsource.InterfaceC19594ap
    public void onUserEarnedReward() {
        RewardedAdListener rewardedAdListener = this.f74463b;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(this);
        }
    }

    public final void setListener(@Nullable RewardedAdListener rewardedAdListener) {
        this.f74463b = rewardedAdListener;
    }

    public final void show(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f74462a.m53765a(activity);
    }
}
