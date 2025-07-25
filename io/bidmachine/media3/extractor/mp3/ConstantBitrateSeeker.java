package io.bidmachine.media3.extractor.mp3;

import io.bidmachine.media3.extractor.ConstantBitrateSeekMap;
import io.bidmachine.media3.extractor.MpegAudioUtil;

/* renamed from: io.bidmachine.media3.extractor.mp3.a */
/* loaded from: classes9.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    public ConstantBitrateSeeker(long j, long j2, MpegAudioUtil.Header header, boolean z) {
        super(j, j2, header.bitrate, header.frameSize, z);
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // io.bidmachine.media3.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return getTimeUsAtPosition(j);
    }
}
