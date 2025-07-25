package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.DummyTrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.source.SampleQueue;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.util.Log;

/* loaded from: classes4.dex */
public final class BaseMediaChunkOutput implements ChunkExtractor.TrackOutputProvider {

    /* renamed from: a */
    private final int[] f34572a;

    /* renamed from: b */
    private final SampleQueue[] f34573b;

    public BaseMediaChunkOutput(int[] iArr, SampleQueue[] sampleQueueArr) {
        this.f34572a = iArr;
        this.f34573b = sampleQueueArr;
    }

    public int[] getWriteIndices() {
        int[] iArr = new int[this.f34573b.length];
        int i = 0;
        while (true) {
            SampleQueue[] sampleQueueArr = this.f34573b;
            if (i < sampleQueueArr.length) {
                iArr[i] = sampleQueueArr[i].getWriteIndex();
                i++;
            } else {
                return iArr;
            }
        }
    }

    public void setSampleOffsetUs(long j) {
        for (SampleQueue sampleQueue : this.f34573b) {
            sampleQueue.setSampleOffsetUs(j);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkExtractor.TrackOutputProvider
    public TrackOutput track(int i, int i2) {
        int i3 = 0;
        while (true) {
            int[] iArr = this.f34572a;
            if (i3 < iArr.length) {
                if (i2 == iArr[i3]) {
                    return this.f34573b[i3];
                }
                i3++;
            } else {
                Log.m72606e("BaseMediaChunkOutput", "Unmatched track of type: " + i2);
                return new DummyTrackOutput();
            }
        }
    }
}
