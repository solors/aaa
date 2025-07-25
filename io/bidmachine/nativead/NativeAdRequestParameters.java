package io.bidmachine.nativead;

import androidx.annotation.NonNull;
import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsFormat;
import io.bidmachine.MediaAssetType;
import io.bidmachine.utils.ProtoUtils;
import java.util.List;

/* loaded from: classes9.dex */
public class NativeAdRequestParameters extends AdRequestParameters {
    @NonNull
    private final List<MediaAssetType> mediaAssetTypes;
    private boolean validateAssets;

    public NativeAdRequestParameters(@NonNull List<MediaAssetType> list) {
        super(AdsFormat.Native);
        this.validateAssets = true;
        this.mediaAssetTypes = list;
    }

    private boolean isParametersMatchedInternal(@NonNull NativeAdRequestParameters nativeAdRequestParameters) {
        if (!MediaAssetType.isAll(nativeAdRequestParameters.mediaAssetTypes) && !nativeAdRequestParameters.mediaAssetTypes.containsAll(this.mediaAssetTypes)) {
            return false;
        }
        return true;
    }

    public boolean containsAssetType(@NonNull MediaAssetType mediaAssetType) {
        if (!this.mediaAssetTypes.isEmpty() && !this.mediaAssetTypes.contains(mediaAssetType) && !this.mediaAssetTypes.contains(MediaAssetType.All)) {
            return false;
        }
        return true;
    }

    @NonNull
    public List<MediaAssetType> getMediaAssetTypes() {
        return this.mediaAssetTypes;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isParametersMatched(@NonNull AdRequestParameters adRequestParameters) {
        if (super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof NativeAdRequestParameters) && isParametersMatchedInternal((NativeAdRequestParameters) adRequestParameters)) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.AdRequestParameters
    public boolean isPlacementObjectValid(@NonNull Placement placement) throws Throwable {
        return ProtoUtils.isNativePlacement(placement);
    }

    public boolean isValidateAssets() {
        return this.validateAssets;
    }

    public void setValidateAssets(boolean z) {
        this.validateAssets = z;
    }
}
