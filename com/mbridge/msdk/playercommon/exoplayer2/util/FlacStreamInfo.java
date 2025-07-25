package com.mbridge.msdk.playercommon.exoplayer2.util;

/* loaded from: classes6.dex */
public final class FlacStreamInfo {
    public final int bitsPerSample;
    public final int channels;
    public final int maxBlockSize;
    public final int maxFrameSize;
    public final int minBlockSize;
    public final int minFrameSize;
    public final int sampleRate;
    public final long totalSamples;

    public FlacStreamInfo(byte[] bArr, int i) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i * 8);
        this.minBlockSize = parsableBitArray.readBits(16);
        this.maxBlockSize = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        this.sampleRate = parsableBitArray.readBits(20);
        this.channels = parsableBitArray.readBits(3) + 1;
        this.bitsPerSample = parsableBitArray.readBits(5) + 1;
        this.totalSamples = ((parsableBitArray.readBits(4) & 15) << 32) | (parsableBitArray.readBits(32) & 4294967295L);
    }

    public final int bitRate() {
        return this.bitsPerSample * this.sampleRate;
    }

    public final long durationUs() {
        return (this.totalSamples * 1000000) / this.sampleRate;
    }

    public final long getApproxBytesPerFrame() {
        long j;
        long j2;
        long j3;
        int i = this.maxFrameSize;
        if (i > 0) {
            j2 = (i + this.minFrameSize) / 2;
            j3 = 1;
        } else {
            int i2 = this.minBlockSize;
            if (i2 == this.maxBlockSize && i2 > 0) {
                j = i2;
            } else {
                j = 4096;
            }
            j2 = ((j * this.channels) * this.bitsPerSample) / 8;
            j3 = 64;
        }
        return j2 + j3;
    }

    public final long getSampleIndex(long j) {
        return Util.constrainValue((j * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public final int maxDecodedFrameSize() {
        return this.maxBlockSize * this.channels * (this.bitsPerSample / 8);
    }

    public FlacStreamInfo(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.minBlockSize = i;
        this.maxBlockSize = i2;
        this.minFrameSize = i3;
        this.maxFrameSize = i4;
        this.sampleRate = i5;
        this.channels = i6;
        this.bitsPerSample = i7;
        this.totalSamples = j;
    }
}
