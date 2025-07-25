package io.bidmachine.media3.extractor.metadata;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface MetadataDecoder {
    @Nullable
    Metadata decode(MetadataInputBuffer metadataInputBuffer);
}
