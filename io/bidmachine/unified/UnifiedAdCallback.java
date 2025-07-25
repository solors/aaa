package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public interface UnifiedAdCallback {
    void onAdClicked();

    void onAdExpired();

    void onAdLoadFailed(@NonNull BMError bMError);

    void onAdShowFailed(@NonNull BMError bMError);

    void onAdShown();

    void setVisibilitySource(@NonNull VisibilitySource visibilitySource);
}
