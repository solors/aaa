package io.bidmachine.rendering.p730ad.view;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.p730ad.AdListener;

/* renamed from: io.bidmachine.rendering.ad.view.AdViewListener */
/* loaded from: classes9.dex */
public interface AdViewListener extends AdListener<AdView> {
    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdAppeared(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdClicked(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdDisappeared(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdExpired(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFailToLoad(@NonNull AdView adView, @NonNull Error error);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFailToShow(@NonNull AdView adView, @NonNull Error error);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdFinished(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdLoaded(@NonNull AdView adView);

    @Override // io.bidmachine.rendering.p730ad.AdListener
    /* synthetic */ void onAdShown(@NonNull AdView adView);
}
