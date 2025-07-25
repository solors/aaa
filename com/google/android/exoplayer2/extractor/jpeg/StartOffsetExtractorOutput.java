package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;

/* loaded from: classes4.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {

    /* renamed from: b */
    private final long f33046b;

    /* renamed from: c */
    private final ExtractorOutput f33047c;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.f33046b = j;
        this.f33047c = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void endTracks() {
        this.f33047c.endTracks();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public void seekMap(final SeekMap seekMap) {
        this.f33047c.seekMap(new SeekMap() { // from class: com.google.android.exoplayer2.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public long getDurationUs() {
                return seekMap.getDurationUs();
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public SeekMap.SeekPoints getSeekPoints(long j) {
                SeekMap.SeekPoints seekPoints = seekMap.getSeekPoints(j);
                SeekPoint seekPoint = seekPoints.first;
                SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.f33046b);
                SeekPoint seekPoint3 = seekPoints.second;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.f33046b));
            }

            @Override // com.google.android.exoplayer2.extractor.SeekMap
            public boolean isSeekable() {
                return seekMap.isSeekable();
            }
        });
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public TrackOutput track(int i, int i2) {
        return this.f33047c.track(i, i2);
    }
}
