package com.google.android.exoplayer2.extractor.mp3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes4.dex */
final class VbriSeeker implements Seeker {

    /* renamed from: a */
    private final long[] f33159a;

    /* renamed from: b */
    private final long[] f33160b;

    /* renamed from: c */
    private final long f33161c;

    /* renamed from: d */
    private final long f33162d;

    private VbriSeeker(long[] jArr, long[] jArr2, long j, long j2) {
        this.f33159a = jArr;
        this.f33160b = jArr2;
        this.f33161c = j;
        this.f33162d = j2;
    }

    @Nullable
    public static VbriSeeker create(long j, long j2, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int i;
        int readUnsignedByte;
        parsableByteArray.skipBytes(10);
        int readInt = parsableByteArray.readInt();
        if (readInt <= 0) {
            return null;
        }
        int i2 = header.sampleRate;
        long j3 = readInt;
        if (i2 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j3, i * 1000000, i2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long j4 = j2 + header.frameSize;
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i3 = 0;
        long j5 = j2;
        while (i3 < readUnsignedShort) {
            int i4 = readUnsignedShort2;
            long j6 = j4;
            jArr[i3] = (i3 * scaleLargeTimestamp) / readUnsignedShort;
            jArr2[i3] = Math.max(j5, j6);
            if (readUnsignedShort3 != 1) {
                if (readUnsignedShort3 != 2) {
                    if (readUnsignedShort3 != 3) {
                        if (readUnsignedShort3 != 4) {
                            return null;
                        }
                        readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
                    } else {
                        readUnsignedByte = parsableByteArray.readUnsignedInt24();
                    }
                } else {
                    readUnsignedByte = parsableByteArray.readUnsignedShort();
                }
            } else {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            }
            j5 += readUnsignedByte * i4;
            i3++;
            jArr = jArr;
            readUnsignedShort2 = i4;
            j4 = j6;
        }
        long[] jArr3 = jArr;
        if (j != -1 && j != j5) {
            Log.m72602w("VbriSeeker", "VBRI data size mismatch: " + j + ", " + j5);
        }
        return new VbriSeeker(jArr3, jArr2, scaleLargeTimestamp, j5);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.f33162d;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.f33161c;
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j) {
        int binarySearchFloor = Util.binarySearchFloor(this.f33159a, j, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f33159a[binarySearchFloor], this.f33160b[binarySearchFloor]);
        if (seekPoint.timeUs < j && binarySearchFloor != this.f33159a.length - 1) {
            int i = binarySearchFloor + 1;
            return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.f33159a[i], this.f33160b[i]));
        }
        return new SeekMap.SeekPoints(seekPoint);
    }

    @Override // com.google.android.exoplayer2.extractor.mp3.Seeker
    public long getTimeUs(long j) {
        return this.f33159a[Util.binarySearchFloor(this.f33160b, j, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
