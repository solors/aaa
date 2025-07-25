package io.bidmachine.media3.extractor.mkv;

import io.bidmachine.media3.extractor.ExtractorInput;
import java.io.IOException;

/* renamed from: io.bidmachine.media3.extractor.mkv.b */
/* loaded from: classes9.dex */
interface EbmlReader {
    void init(EbmlProcessor ebmlProcessor);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void reset();
}
