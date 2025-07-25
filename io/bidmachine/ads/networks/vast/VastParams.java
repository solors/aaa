package io.bidmachine.ads.networks.vast;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;
import p678g1.EnumC33181a;

/* renamed from: io.bidmachine.ads.networks.vast.d */
/* loaded from: classes9.dex */
class VastParams extends UnifiedParams {
    @NonNull
    final EnumC33181a cacheControl;
    final int companionSkipOffset;
    @Nullable
    final String creativeAdm;
    final boolean omsdkEnabled;
    final float placeholderTimeoutSec;
    final int skipOffset;
    final boolean useNativeClose;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.creativeAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CREATIVE_ADM);
        this.cacheControl = IabUtils.toCacheControl(unifiedMediationParams.getObjectOrNull(UnifiedMediationParams.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(UnifiedMediationParams.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_SKIP_OFFSET);
        this.companionSkipOffset = unifiedMediationParams.getInteger(UnifiedMediationParams.KEY_COMPANION_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBoolean(UnifiedMediationParams.KEY_OM_SDK_ENABLED, true);
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.creativeAdm)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_CREATIVE_ADM));
            return false;
        }
        return true;
    }
}
