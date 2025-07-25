package io.bidmachine.media3.extractor.ogg;

import androidx.annotation.Nullable;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.SeekMap;
import java.io.IOException;

/* renamed from: io.bidmachine.media3.extractor.ogg.f */
/* loaded from: classes9.dex */
interface OggSeeker {
    @Nullable
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput) throws IOException;

    void startSeek(long j);
}
