package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return new DummyTrackOutput();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }
}
