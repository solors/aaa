package io.bidmachine.media3.extractor.text;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderInputBuffer;

@UnstableApi
/* loaded from: classes9.dex */
public class SubtitleInputBuffer extends DecoderInputBuffer {
    public long subsampleOffsetUs;

    public SubtitleInputBuffer() {
        super(1);
    }
}
