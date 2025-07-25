package com.google.android.exoplayer2.extractor.flac;

import com.google.android.exoplayer2.extractor.BinarySearchSeeker;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.FlacFrameReader;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes4.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* loaded from: classes4.dex */
    private static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a */
        private final FlacStreamMetadata f32987a;

        /* renamed from: b */
        private final int f32988b;

        /* renamed from: c */
        private final FlacFrameReader.SampleNumberHolder f32989c;

        /* renamed from: a */
        private long m74668a(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.f32987a, this.f32988b, this.f32989c)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
                extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
                return this.f32987a.totalSamples;
            }
            return this.f32989c.sampleNumber;
        }

        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
            long position = extractorInput.getPosition();
            long m74668a = m74668a(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.f32987a.minFrameSize));
            long m74668a2 = m74668a(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (m74668a <= j && m74668a2 > j) {
                return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
            }
            if (m74668a2 <= j) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(m74668a2, peekPosition2);
            }
            return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(m74668a, position);
        }

        private FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i) {
            this.f32987a = flacStreamMetadata;
            this.f32988b = i;
            this.f32989c = new FlacFrameReader.SampleNumberHolder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(final FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: com.google.android.exoplayer2.extractor.flac.a
            @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j3) {
                return flacStreamMetadata.getSampleNumber(j3);
            }
        }, new FlacTimestampSeeker(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
