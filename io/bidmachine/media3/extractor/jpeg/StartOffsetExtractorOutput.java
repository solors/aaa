package io.bidmachine.media3.extractor.jpeg;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes9.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    /* renamed from: io.bidmachine.media3.extractor.jpeg.StartOffsetExtractorOutput$a */
    /* loaded from: classes9.dex */
    class C36542a implements SeekMap {
        final /* synthetic */ SeekMap val$seekMap;

        C36542a(SeekMap seekMap) {
            this.val$seekMap = seekMap;
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.val$seekMap.getDurationUs();
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            SeekMap.SeekPoints seekPoints = this.val$seekMap.getSeekPoints(j);
            SeekPoint seekPoint = seekPoints.first;
            SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
            SeekPoint seekPoint3 = seekPoints.second;
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public boolean isSeekable() {
            return this.val$seekMap.isSeekable();
        }
    }

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.startOffset = j;
        this.extractorOutput = extractorOutput;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.extractorOutput.seekMap(new C36542a(seekMap));
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return this.extractorOutput.track(i, i2);
    }
}
