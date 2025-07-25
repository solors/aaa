package io.bidmachine.media3.extractor.p728ts;

import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.p728ts.TsPayloadReader;

@UnstableApi
/* renamed from: io.bidmachine.media3.extractor.ts.SectionPayloadReader */
/* loaded from: classes9.dex */
public interface SectionPayloadReader {
    void consume(ParsableByteArray parsableByteArray);

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);
}
