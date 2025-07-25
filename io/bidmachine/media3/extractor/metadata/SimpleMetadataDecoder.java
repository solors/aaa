package io.bidmachine.media3.extractor.metadata;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes9.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // io.bidmachine.media3.extractor.metadata.MetadataDecoder
    @Nullable
    public final Metadata decode(MetadataInputBuffer metadataInputBuffer) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(metadataInputBuffer.data);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (metadataInputBuffer.isDecodeOnly()) {
            return null;
        }
        return decode(metadataInputBuffer, byteBuffer);
    }

    @Nullable
    protected abstract Metadata decode(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
