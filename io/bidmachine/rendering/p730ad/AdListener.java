package io.bidmachine.rendering.p730ad;

import androidx.annotation.NonNull;
import io.bidmachine.rendering.model.Error;

/* renamed from: io.bidmachine.rendering.ad.AdListener */
/* loaded from: classes9.dex */
public interface AdListener<Ad> {
    void onAdAppeared(@NonNull Ad ad2);

    void onAdClicked(@NonNull Ad ad2);

    void onAdDisappeared(@NonNull Ad ad2);

    void onAdExpired(@NonNull Ad ad2);

    void onAdFailToLoad(@NonNull Ad ad2, @NonNull Error error);

    void onAdFailToShow(@NonNull Ad ad2, @NonNull Error error);

    void onAdFinished(@NonNull Ad ad2);

    void onAdLoaded(@NonNull Ad ad2);

    void onAdShown(@NonNull Ad ad2);
}
