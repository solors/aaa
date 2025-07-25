package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.MediaAssetType;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;

/* loaded from: classes9.dex */
public class NastParams extends UnifiedParams {
    @Nullable
    final String callToAction;
    @Nullable
    final String clickUrl;
    @Nullable
    final String description;
    @Nullable
    final String iconUrl;
    @Nullable
    final String imageUrl;
    @Nullable
    final Float rating;
    @Nullable
    final String title;
    @Nullable
    final String videoAdm;
    @Nullable
    final String videoUrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public NastParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.title = unifiedMediationParams.getStringOrNull("title");
        this.description = unifiedMediationParams.getStringOrNull("description");
        this.callToAction = unifiedMediationParams.getStringOrNull("cta");
        this.rating = unifiedMediationParams.getFloatOrNull("rating");
        this.iconUrl = unifiedMediationParams.getStringOrNull("iconUrl");
        this.imageUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_IMAGE_URL);
        this.videoUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_URL);
        this.videoAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_ADM);
        this.clickUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_CLICK_URL);
    }

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.title)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("title"));
            return false;
        } else if (TextUtils.isEmpty(this.callToAction)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("cta"));
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isValid(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull UnifiedAdCallback unifiedAdCallback) {
        if (isValid(unifiedAdCallback)) {
            NativeAdRequestParameters adRequestParameters = unifiedNativeAdRequestParams.getAdRequestParameters();
            if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Icon) && TextUtils.isEmpty(this.iconUrl)) {
                unifiedAdCallback.onAdLoadFailed(BMError.notFound("iconUrl"));
                return false;
            } else if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Image) && TextUtils.isEmpty(this.imageUrl)) {
                unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_IMAGE_URL));
                return false;
            } else if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Video) && TextUtils.isEmpty(this.videoAdm) && TextUtils.isEmpty(this.videoUrl)) {
                unifiedAdCallback.onAdLoadFailed(BMError.notFound("videoAdm or videoUrl"));
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
