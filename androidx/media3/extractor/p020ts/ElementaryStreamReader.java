package androidx.media3.extractor.p020ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.p020ts.TsPayloadReader;

@UnstableApi
/* renamed from: androidx.media3.extractor.ts.ElementaryStreamReader */
/* loaded from: classes2.dex */
public interface ElementaryStreamReader {
    void consume(ParsableByteArray parsableByteArray) throws ParserException;

    void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void packetFinished(boolean z);

    void packetStarted(long j, int i);

    void seek();
}
