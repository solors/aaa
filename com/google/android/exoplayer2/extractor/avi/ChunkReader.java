package com.google.android.exoplayer2.extractor.avi;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ChunkReader {

    /* renamed from: a */
    protected final TrackOutput f32974a;

    /* renamed from: b */
    private final int f32975b;

    /* renamed from: c */
    private final int f32976c;

    /* renamed from: d */
    private final long f32977d;

    /* renamed from: e */
    private final int f32978e;

    /* renamed from: f */
    private int f32979f;

    /* renamed from: g */
    private int f32980g;

    /* renamed from: h */
    private int f32981h;

    /* renamed from: i */
    private int f32982i;

    /* renamed from: j */
    private int f32983j;

    /* renamed from: k */
    private long[] f32984k;

    /* renamed from: l */
    private int[] f32985l;

    public ChunkReader(int i, int i2, long j, int i3, TrackOutput trackOutput) {
        int i4;
        int i5;
        boolean z = true;
        if (i2 != 1 && i2 != 2) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f32977d = j;
        this.f32978e = i3;
        this.f32974a = trackOutput;
        if (i2 == 2) {
            i4 = 1667497984;
        } else {
            i4 = 1651965952;
        }
        this.f32975b = m74676a(i, i4);
        if (i2 == 2) {
            i5 = m74676a(i, 1650720768);
        } else {
            i5 = -1;
        }
        this.f32976c = i5;
        this.f32984k = new long[512];
        this.f32985l = new int[512];
    }

    /* renamed from: a */
    private static int m74676a(int i, int i2) {
        return (((i % 10) + 48) << 8) | ((i / 10) + 48) | i2;
    }

    /* renamed from: b */
    private long m74675b(int i) {
        return (this.f32977d * i) / this.f32978e;
    }

    /* renamed from: c */
    private SeekPoint m74674c(int i) {
        return new SeekPoint(this.f32985l[i] * getFrameDurationUs(), this.f32984k[i]);
    }

    public void advanceCurrentChunk() {
        this.f32981h++;
    }

    public void appendKeyFrameToIndex(long j) {
        if (this.f32983j == this.f32985l.length) {
            long[] jArr = this.f32984k;
            this.f32984k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f32985l;
            this.f32985l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f32984k;
        int i = this.f32983j;
        jArr2[i] = j;
        this.f32985l[i] = this.f32982i;
        this.f32983j = i + 1;
    }

    public void compactIndex() {
        this.f32984k = Arrays.copyOf(this.f32984k, this.f32983j);
        this.f32985l = Arrays.copyOf(this.f32985l, this.f32983j);
    }

    public long getCurrentChunkTimestampUs() {
        return m74675b(this.f32981h);
    }

    public long getFrameDurationUs() {
        return m74675b(1);
    }

    public SeekMap.SeekPoints getSeekPoints(long j) {
        int frameDurationUs = (int) (j / getFrameDurationUs());
        int binarySearchFloor = Util.binarySearchFloor(this.f32985l, frameDurationUs, true, true);
        if (this.f32985l[binarySearchFloor] == frameDurationUs) {
            return new SeekMap.SeekPoints(m74674c(binarySearchFloor));
        }
        SeekPoint m74674c = m74674c(binarySearchFloor);
        int i = binarySearchFloor + 1;
        if (i < this.f32984k.length) {
            return new SeekMap.SeekPoints(m74674c, m74674c(i));
        }
        return new SeekMap.SeekPoints(m74674c);
    }

    public boolean handlesChunkId(int i) {
        if (this.f32975b != i && this.f32976c != i) {
            return false;
        }
        return true;
    }

    public void incrementIndexChunkCount() {
        this.f32982i++;
    }

    public boolean isAudio() {
        if ((this.f32975b & 1651965952) == 1651965952) {
            return true;
        }
        return false;
    }

    public boolean isCurrentFrameAKeyFrame() {
        if (Arrays.binarySearch(this.f32985l, this.f32981h) >= 0) {
            return true;
        }
        return false;
    }

    public boolean isVideo() {
        if ((this.f32975b & 1667497984) == 1667497984) {
            return true;
        }
        return false;
    }

    public boolean onChunkData(ExtractorInput extractorInput) throws IOException {
        int i = this.f32980g;
        boolean z = false;
        int sampleData = i - this.f32974a.sampleData((DataReader) extractorInput, i, false);
        this.f32980g = sampleData;
        if (sampleData == 0) {
            z = true;
        }
        if (z) {
            if (this.f32979f > 0) {
                TrackOutput trackOutput = this.f32974a;
                long currentChunkTimestampUs = getCurrentChunkTimestampUs();
                boolean isCurrentFrameAKeyFrame = isCurrentFrameAKeyFrame();
                trackOutput.sampleMetadata(currentChunkTimestampUs, isCurrentFrameAKeyFrame ? 1 : 0, this.f32979f, 0, null);
            }
            advanceCurrentChunk();
        }
        return z;
    }

    public void onChunkStart(int i) {
        this.f32979f = i;
        this.f32980g = i;
    }

    public void seekToPosition(long j) {
        if (this.f32983j == 0) {
            this.f32981h = 0;
            return;
        }
        this.f32981h = this.f32985l[Util.binarySearchFloor(this.f32984k, j, true, true)];
    }
}
