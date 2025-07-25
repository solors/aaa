package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MolocoSamplesKt$MolocoCreateInterstitialAd$1 extends Lambda implements Function2<InterstitialAd, MolocoAdError.AdCreateError, Unit> {
    public static final MolocoSamplesKt$MolocoCreateInterstitialAd$1 INSTANCE = new MolocoSamplesKt$MolocoCreateInterstitialAd$1();

    public MolocoSamplesKt$MolocoCreateInterstitialAd$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(InterstitialAd interstitialAd, MolocoAdError.AdCreateError adCreateError) {
        invoke2(interstitialAd, adCreateError);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable InterstitialAd interstitialAd, @Nullable MolocoAdError.AdCreateError adCreateError) {
        if (interstitialAd != null) {
            interstitialAd.load("bid_response", null);
            interstitialAd.show(null);
            interstitialAd.destroy();
        }
    }
}
