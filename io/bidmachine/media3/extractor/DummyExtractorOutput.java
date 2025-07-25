package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return new DummyTrackOutput();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }
}
