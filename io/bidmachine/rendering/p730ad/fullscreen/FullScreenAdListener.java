package io.bidmachine.rendering.p730ad.fullscreen;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.p730ad.AdListener;

/* renamed from: io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener */
/* loaded from: classes9.dex */
public interface FullScreenAdListener extends AdListener<FullScreenAd> {
    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdAppeared(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdClicked(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdDisappeared(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdExpired(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFailToLoad(@NonNull FullScreenAd fullScreenAd, @NonNull Error error);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFailToShow(@NonNull FullScreenAd fullScreenAd, @NonNull Error error);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFinished(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdLoaded(@NonNull FullScreenAd fullScreenAd);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdShown(@NonNull FullScreenAd fullScreenAd);
}
