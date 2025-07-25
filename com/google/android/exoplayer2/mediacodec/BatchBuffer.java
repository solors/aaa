package com.google.android.exoplayer2.mediacodec;

import androidx.annotation.IntRange;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
final class BatchBuffer extends DecoderInputBuffer {
    public static final int DEFAULT_MAX_SAMPLE_COUNT = 32;

    /* renamed from: f */
    private long f33798f;

    /* renamed from: g */
    private int f33799g;

    /* renamed from: h */
    private int f33800h;

    public BatchBuffer() {
        super(2);
        this.f33800h = 32;
    }

    /* renamed from: d */
    private boolean m74227d(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        if (!hasSamples()) {
            return true;
        }
        if (this.f33799g >= this.f33800h || decoderInputBuffer.isDecodeOnly() != isDecodeOnly()) {
            return false;
        }
        ByteBuffer byteBuffer2 = decoderInputBuffer.data;
        if (byteBuffer2 == null || (byteBuffer = this.data) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000) {
            return true;
        }
        return false;
    }

    public boolean append(DecoderInputBuffer decoderInputBuffer) {
        Assertions.checkArgument(!decoderInputBuffer.isEncrypted());
        Assertions.checkArgument(!decoderInputBuffer.hasSupplementalData());
        Assertions.checkArgument(!decoderInputBuffer.isEndOfStream());
        if (!m74227d(decoderInputBuffer)) {
            return false;
        }
        int i = this.f33799g;
        this.f33799g = i + 1;
        if (i == 0) {
            this.timeUs = decoderInputBuffer.timeUs;
            if (decoderInputBuffer.isKeyFrame()) {
                setFlags(1);
            }
        }
        if (decoderInputBuffer.isDecodeOnly()) {
            setFlags(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer = decoderInputBuffer.data;
        if (byteBuffer != null) {
            ensureSpaceForWrite(byteBuffer.remaining());
            this.data.put(byteBuffer);
        }
        this.f33798f = decoderInputBuffer.timeUs;
        return true;
    }

    @Override // com.google.android.exoplayer2.decoder.DecoderInputBuffer, com.google.android.exoplayer2.decoder.Buffer
    public void clear() {
        super.clear();
        this.f33799g = 0;
    }

    public long getFirstSampleTimeUs() {
        return this.timeUs;
    }

    public long getLastSampleTimeUs() {
        return this.f33798f;
    }

    public int getSampleCount() {
        return this.f33799g;
    }

    public boolean hasSamples() {
        if (this.f33799g > 0) {
            return true;
        }
        return false;
    }

    public void setMaxSampleCount(@IntRange(from = 1) int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f33800h = i;
    }
}
