package io.bidmachine.models;

import androidx.annotation.NonNull;
import io.bidmachine.MediaAssetType;
import io.bidmachine.models.INativeRequestBuilder;

/* loaded from: classes9.dex */
public interface INativeRequestBuilder<SelfType extends INativeRequestBuilder> {
    SelfType setMediaAssetTypes(@NonNull MediaAssetType... mediaAssetTypeArr);
}
