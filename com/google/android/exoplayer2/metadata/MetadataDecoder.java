package com.google.android.exoplayer2.metadata;

import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public interface MetadataDecoder {
    @Nullable
    Metadata decode(MetadataInputBuffer metadataInputBuffer);
}
