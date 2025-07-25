package io.bidmachine.unified;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public abstract class UnifiedParams {
    @NonNull
    private final UnifiedMediationParams mediationParams;

    public UnifiedParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        this.mediationParams = unifiedMediationParams;
    }

    @NonNull
    public UnifiedMediationParams getMediationParams() {
        return this.mediationParams;
    }

    public abstract boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback);
}
