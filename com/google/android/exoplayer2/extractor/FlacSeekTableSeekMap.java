package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* renamed from: a */
    private final FlacStreamMetadata f32915a;

    /* renamed from: b */
    private final long f32916b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j) {
        this.f32915a = flacStreamMetadata;
        this.f32916b = j;
    }

    /* renamed from: a */
    private SeekPoint m74712a(long j, long j2) {
        return new SeekPoint((j * 1000000) / this.f32915a.sampleRate, this.f32916b + j2);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f32915a.getDurationUs();
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        long j2;
        Assertions.checkStateNotNull(this.f32915a.seekTable);
        FlacStreamMetadata flacStreamMetadata = this.f32915a;
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.seekTable;
        long[] jArr = seekTable.pointSampleNumbers;
        long[] jArr2 = seekTable.pointOffsets;
        int binarySearchFloor = Util.binarySearchFloor(jArr, flacStreamMetadata.getSampleNumber(j), true, false);
        long j3 = 0;
        if (binarySearchFloor == -1) {
            j2 = 0;
        } else {
            j2 = jArr[binarySearchFloor];
        }
        if (binarySearchFloor != -1) {
            j3 = jArr2[binarySearchFloor];
        }
        SeekPoint m74712a = m74712a(j2, j3);
        if (m74712a.timeUs != j && binarySearchFloor != jArr.length - 1) {
            int i = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(m74712a, m74712a(jArr[i], jArr2[i]));
        }
        return new SeekMap.SeekPoints(m74712a);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
