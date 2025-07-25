package io.bidmachine.media3.exoplayer.source.chunk;

import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.SampleQueue;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor;
import io.bidmachine.media3.extractor.DummyTrackOutput;
import io.bidmachine.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes9.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {
    private static final String TAG = "BaseMediaChunkOutput";
    private final SampleQueue[] sampleQueues;
    private final int[] trackTypes;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.trackTypes = iArr;
        this.sampleQueues = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.sampleQueues.length];
        int i = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.sampleQueues;
            if (i < sampleQueueArr.length) {
                iArr[i] = sampleQueueArr[i].getWriteIndex();
                i++;
            } else {
                return iArr;
            }
        }
    }

    public void setSampleOffsetUs(long j) {
        for (SampleQueue sampleQueue : this.sampleQueues) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.trackTypes;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.sampleQueues[i3];
                }
                i3++;
            } else {
                Log.m19949e(TAG, "Unmatched track of type: " + i2);
                return new DummyTrackOutput();
            }
        }
    }
}
