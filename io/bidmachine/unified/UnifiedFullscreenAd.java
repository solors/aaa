package io.bidmachine.unified;

import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;

/* loaded from: classes9.dex */
public abstract class UnifiedFullscreenAd extends UnifiedAd<UnifiedFullscreenAdCallback, UnifiedFullscreenAdRequestParams> {
    public abstract void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable;

    public void onFinished() {
    }

    public void onClosed(boolean z) {
    }
}
