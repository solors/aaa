package io.bidmachine.media3.extractor.mp3;

import io.bidmachine.media3.extractor.SeekMap;

/* loaded from: classes9.dex */
interface Seeker extends SeekMap {

    /* loaded from: classes9.dex */
    public static class UnseekableSeeker extends SeekMap.Unseekable implements Seeker {
        public UnseekableSeeker() {
            super(-9223372036854775807L);
        }

        @Override // io.bidmachine.media3.extractor.mp3.Seeker
        public long getDataEndPosition() {
            return -1L;
        }

        @Override // io.bidmachine.media3.extractor.mp3.Seeker
        public long getTimeUs(long j) {
            return 0L;
        }
    }

    long getDataEndPosition();

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ long getDurationUs();

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ SeekMap.SeekPoints getSeekPoints(long j);

    long getTimeUs(long j);

    @Override // io.bidmachine.media3.extractor.SeekMap
    /* synthetic */ boolean isSeekable();
}
