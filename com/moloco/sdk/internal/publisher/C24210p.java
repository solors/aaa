package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.InterfaceC24408u;
import com.moloco.sdk.internal.ortb.model.C24049o;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.publisher.p */
/* loaded from: classes7.dex */
public final class C24210p implements RewardedInterstitialAdShowListener, AdShowListener {
    @Nullable

    /* renamed from: a */
    public final RewardedInterstitialAdShowListener f62703a;
    @NotNull

    /* renamed from: b */
    public final Functions<C24049o> f62704b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC24408u f62705c;

    /* renamed from: d */
    public final /* synthetic */ AdShowListener f62706d;

    public C24210p(@Nullable RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, @NotNull Functions<C24049o> provideSdkEvents, @NotNull InterfaceC24408u sdkEventUrlTracker) {
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        Intrinsics.checkNotNullParameter(sdkEventUrlTracker, "sdkEventUrlTracker");
        this.f62703a = rewardedInterstitialAdShowListener;
        this.f62704b = provideSdkEvents;
        this.f62705c = sdkEventUrlTracker;
        this.f62706d = C24212r.m46781a(rewardedInterstitialAdShowListener);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdClicked(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62706d.onAdClicked(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdHidden(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62706d.onAdHidden(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f62703a;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onAdShowFailed(molocoAdError);
        }
    }

    @Override // com.moloco.sdk.publisher.AdShowListener
    public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        this.f62706d.onAdShowSuccess(molocoAd);
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoCompleted(@NotNull MolocoAd molocoAd) {
        String m47102i;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        C24049o invoke = this.f62704b.invoke();
        if (invoke != null && (m47102i = invoke.m47102i()) != null) {
            InterfaceC24408u.C24409a.m46485a(this.f62705c, m47102i, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f62703a;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoCompleted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onRewardedVideoStarted(@NotNull MolocoAd molocoAd) {
        String m47101j;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        C24049o invoke = this.f62704b.invoke();
        if (invoke != null && (m47101j = invoke.m47101j()) != null) {
            InterfaceC24408u.C24409a.m46485a(this.f62705c, m47101j, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f62703a;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onRewardedVideoStarted(molocoAd);
        }
    }

    @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
    public void onUserRewarded(@NotNull MolocoAd molocoAd) {
        String m47100k;
        Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
        C24049o invoke = this.f62704b.invoke();
        if (invoke != null && (m47100k = invoke.m47100k()) != null) {
            InterfaceC24408u.C24409a.m46485a(this.f62705c, m47100k, System.currentTimeMillis(), null, 4, null);
        }
        RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener = this.f62703a;
        if (rewardedInterstitialAdShowListener != null) {
            rewardedInterstitialAdShowListener.onUserRewarded(molocoAd);
        }
    }
}
