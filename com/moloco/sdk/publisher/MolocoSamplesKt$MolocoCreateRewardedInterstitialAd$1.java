package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoSamplesKt$MolocoCreateRewardedInterstitialAd$1 extends Lambda implements Function2<RewardedInterstitialAd, MolocoAdError.AdCreateError, Unit> {
    public static final MolocoSamplesKt$MolocoCreateRewardedInterstitialAd$1 INSTANCE = new MolocoSamplesKt$MolocoCreateRewardedInterstitialAd$1();

    public MolocoSamplesKt$MolocoCreateRewardedInterstitialAd$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(RewardedInterstitialAd rewardedInterstitialAd, MolocoAdError.AdCreateError adCreateError) {
        invoke2(rewardedInterstitialAd, adCreateError);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable RewardedInterstitialAd rewardedInterstitialAd, @Nullable MolocoAdError.AdCreateError adCreateError) {
        if (rewardedInterstitialAd != null) {
            rewardedInterstitialAd.load("bid_response", null);
            rewardedInterstitialAd.show(null);
            rewardedInterstitialAd.destroy();
        }
    }
}
