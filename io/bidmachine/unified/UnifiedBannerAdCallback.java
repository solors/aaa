package io.bidmachine.unified;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface UnifiedBannerAdCallback extends UnifiedAdCallback {
    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdExpired();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    void onAdLoaded(@Nullable View view);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void onAdShown();

    @Override // io.bidmachine.unified.UnifiedAdCallback
    /* synthetic */ void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
