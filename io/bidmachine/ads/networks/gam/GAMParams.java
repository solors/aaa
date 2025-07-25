package io.bidmachine.ads.networks.gam;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;

/* renamed from: io.bidmachine.ads.networks.gam.o */
/* loaded from: classes9.dex */
class GAMParams extends UnifiedParams {
    @Nullable
    final String adUnitId;
    @Nullable
    final String price;
    @Nullable
    final String score;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GAMParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.adUnitId = unifiedMediationParams.getStringOrNull("ad_unit_id");
        this.score = unifiedMediationParams.getStringOrNull("score");
        this.price = unifiedMediationParams.getStringOrNull("price");
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("ad_unit_id"));
            return false;
        } else if (TextUtils.isEmpty(this.score)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("score"));
            return false;
        } else if (TextUtils.isEmpty(this.price)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("price"));
            return false;
        } else {
            return true;
        }
    }
}
