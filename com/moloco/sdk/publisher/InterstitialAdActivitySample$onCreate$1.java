package com.moloco.sdk.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Standard;

@Metadata
/* loaded from: classes7.dex */
public final class InterstitialAdActivitySample$onCreate$1 extends Lambda implements Function2<InterstitialAd, MolocoAdError.AdCreateError, Unit> {
    final /* synthetic */ InterstitialAdActivitySample this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterstitialAdActivitySample$onCreate$1(InterstitialAdActivitySample interstitialAdActivitySample) {
        super(2);
        this.this$0 = interstitialAdActivitySample;
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
            this.this$0.interstitialAd = interstitialAd;
            interstitialAd.load("bid response", new AdLoad.Listener() { // from class: com.moloco.sdk.publisher.InterstitialAdActivitySample$onCreate$1.1
                @Override // com.moloco.sdk.publisher.AdLoad.Listener
                public void onAdLoadFailed(@NotNull MolocoAdError molocoAdError) {
                    Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdLoad.Listener
                public void onAdLoadSuccess(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }
            });
            interstitialAd.isLoaded();
            interstitialAd.show(new InterstitialAdShowListener() { // from class: com.moloco.sdk.publisher.InterstitialAdActivitySample$onCreate$1.2
                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdClicked(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdHidden(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdShowFailed(@NotNull MolocoAdError molocoAdError) {
                    Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }

                @Override // com.moloco.sdk.publisher.AdShowListener
                public void onAdShowSuccess(@NotNull MolocoAd molocoAd) {
                    Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
                    throw new Standard("An operation is not implemented: Not yet implemented");
                }
            });
            interstitialAd.load("an_another_bid_response", null);
            return;
        }
        this.this$0.finish();
    }
}
