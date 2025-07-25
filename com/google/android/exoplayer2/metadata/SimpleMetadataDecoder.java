package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Nullable
    /* renamed from: a */
    protected abstract Metadata mo74054a(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);

    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
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
        return mo74054a(metadataInputBuffer, byteBuffer);
    }
}
