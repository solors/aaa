package io.bidmachine.media3.extractor.metadata;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderInputBuffer;

@UnstableApi
/* loaded from: classes9.dex */
public final class MetadataInputBuffer extends DecoderInputBuffer {
    public long subsampleOffsetUs;

    public MetadataInputBuffer() {
        super(1);
    }
}
