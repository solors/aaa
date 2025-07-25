package io.bidmachine.media3.extractor.flac;

import io.bidmachine.media3.extractor.BinarySearchSeeker;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.FlacFrameReader;
import io.bidmachine.media3.extractor.FlacStreamMetadata;
import java.io.IOException;
import java.util.Objects;

/* renamed from: io.bidmachine.media3.extractor.flac.b */
/* loaded from: classes9.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* compiled from: FlacBinarySearchSeeker.java */
    /* renamed from: io.bidmachine.media3.extractor.flac.b$b */
    /* loaded from: classes9.dex */
    private static final class C36539b implements BinarySearchSeeker.TimestampSeeker {
        private final FlacStreamMetadata flacStreamMetadata;
        private final int frameStartMarker;
        private final FlacFrameReader.SampleNumberHolder sampleNumberHolder;

        private long findNextFrame(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.getPeekPosition() < extractorInput.getLength() - 6 && !FlacFrameReader.checkFrameHeaderFromPeek(extractorInput, this.flacStreamMetadata, this.frameStartMarker, this.sampleNumberHolder)) {
                extractorInput.advancePeekPosition(1);
            }
            if (extractorInput.getPeekPosition() >= extractorInput.getLength() - 6) {
                extractorInput.advancePeekPosition((int) (extractorInput.getLength() - extractorInput.getPeekPosition()));
                return this.flacStreamMetadata.totalSamples;
            }
            return this.sampleNumberHolder.sampleNumber;
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public /* bridge */ /* synthetic */ void onSeekFinished() {
            super.onSeekFinished();
        }

        @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public BinarySearchSeeker.TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException {
            long position = extractorInput.getPosition();
            long findNextFrame = findNextFrame(extractorInput);
            long peekPosition = extractorInput.getPeekPosition();
            extractorInput.advancePeekPosition(Math.max(6, this.flacStreamMetadata.minFrameSize));
            long findNextFrame2 = findNextFrame(extractorInput);
            long peekPosition2 = extractorInput.getPeekPosition();
            if (findNextFrame <= j && findNextFrame2 > j) {
                return BinarySearchSeeker.TimestampSearchResult.targetFoundResult(peekPosition);
            }
            if (findNextFrame2 <= j) {
                return BinarySearchSeeker.TimestampSearchResult.underestimatedResult(findNextFrame2, peekPosition2);
            }
            return BinarySearchSeeker.TimestampSearchResult.overestimatedResult(findNextFrame, position);
        }

        private C36539b(FlacStreamMetadata flacStreamMetadata, int i) {
            this.flacStreamMetadata = flacStreamMetadata;
            this.frameStartMarker = i;
            this.sampleNumberHolder = new FlacFrameReader.SampleNumberHolder();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlacBinarySearchSeeker(final FlacStreamMetadata flacStreamMetadata, int i, long j, long j2) {
        super(new BinarySearchSeeker.SeekTimestampConverter() { // from class: io.bidmachine.media3.extractor.flac.a
            @Override // io.bidmachine.media3.extractor.BinarySearchSeeker.SeekTimestampConverter
            public final long timeUsToTargetTime(long j3) {
                return flacStreamMetadata.getSampleNumber(j3);
            }
        }, new C36539b(flacStreamMetadata, i), flacStreamMetadata.getDurationUs(), 0L, flacStreamMetadata.totalSamples, j, j2, flacStreamMetadata.getApproxBytesPerFrame(), Math.max(6, flacStreamMetadata.minFrameSize));
        Objects.requireNonNull(flacStreamMetadata);
    }
}
